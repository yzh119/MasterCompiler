# Built by Ficos 16/5/2
# All rights reserved.
#
#
# All test passed.
#
# Attention:
# 1. to use the built-in functions, you need to call "_buffer_init" function without any args before entering the source main function
# 	(jal _buffer_init)
# 2. just paste all of this in front of your MIPS code
#
# All supported functions:
# 		FunctionName			args
# 1.	func_print 				$a0: the string
# 2.	func_println			$a0: the string
# 3.	func_getString			---
# 4.	func_getInt				---
# 5.	func_toString			$a0: the integer
# 6.	func_length 		$a0: the string
# 7.	func_substring   $a0: the string,  $a1: left pos(int), $a2: right pos(int)
# 8.	func_parseInt 	$a0: the string
# 9.	func_ord 		$a0: the string,  $a1: pos(int)
# 10.	func_size 		$a0: the array
# 11.	func_stringConcatenate 	$a0: left string, $a1: right string
# 12.	func_stringIsEqual 		$a0: left string, $a1: right string
# 13.	func_stringLess 		$a0: left string, $a1: right string
#
# Calling Conventions:
# 1. args placed in $a0, $a1, $a2
# 2. return in $v0
# 3. follow the MIPS calling convention, be careful on regs when calling these functions
# 4. all used regs are presented in the front of the function
#
# Conventions in using string:
# 1. string object is simply a register contains the initial address of the string
# 2. front of every initial address of a string are a word containing the length of the string
#    e.g.
#    .data
#  		  .word 6
# 	 str: .asciiz "hello\n"
# 		  .align 2
# 3. every string ends with '\0', which is not counted in the length
#
# Conventions in using array:
# 1. front of every initial address of a array are a word containing the size of the array

.data
_end: .asciiz "\n"
	.align 2
_buffer: .space 256

.text

# copy the string in $a0 to buffer in $a1, with putting '\0' in the end of the buffer
###### Checked ######
# used $v0, $a0, $a1
_string_copy:
	_begin_string_copy:
	lb $v0, 0($a0)
	beqz $v0, _exit_string_copy
	sb $v0, 0($a1)
	add $a0, $a0, 1
	add $a1, $a1, 1
	j _begin_string_copy
	_exit_string_copy:
	sb $zero, 0($a1)
	jr $ra

# string arg in $a0
###### Checked ######
func_print:
	li $v0, 4
	syscall
	jr $ra

# string arg in $a0
###### Checked ######
func_println:
	li $v0, 4
	syscall
	la $a0, _end
	syscall
	jr $ra

# count the length of given string in $a0
###### Checked ######
# used $v0, $v1, $a0
_count_string_length:
	move $v0, $a0

	_begin_count_string_length:
	lb $v1, 0($a0)
	beqz $v1, _exit_count_string_length
	add $a0, $a0, 1
	j _begin_count_string_length

	_exit_count_string_length:
	sub $v0, $a0, $v0
	jr $ra

# non arg, string in $v0
###### Checked ######
# used $a0, $a1, $v0, $t0
func_getString:
	subu $sp, $sp, 8
	sw $ra, 0($sp)
    sw $t0, 4($sp)

	la $a0, _buffer
	li $a1, 255
	li $v0, 8
	syscall

	jal _count_string_length

	move $a1, $v0			# now $a1 contains the length of the string
	add $a0, $v0, 5			# total required space = length + 1('\0') + 1 word(record the length of the string)
	li $v0, 9
	syscall
	sw $a1, 0($v0)
	add $v0, $v0, 4
	la $a0, _buffer
	move $a1, $v0
	move $t0, $v0
	jal _string_copy
	move $v0, $t0

    lw $t0, 4($sp)
	lw $ra, 0($sp)
	addu $sp, $sp, 8
	jr $ra

# non arg, int in $v0
###### Checked ######
func_getInt:
	li $v0, 5
	syscall
	jr $ra

func_toString:
Label12_ToString:
	move $a1 $a0
	li $a0 16
	li $v0 9
	syscall
	bnez $a1 Label12_NotZero
	lb $0 5($v0)
	li $a0 48
	sb $a0 4($v0)
	li $a0 1
	sb $a0 ($v0)
	j Label12_EndToString
Label12_NotZero:
	slt $v1 $a1 0
	add $a2 $v0 15
	sb $0 ($a2)
Label12_Cond:
	beqz $a1 Label12_EndLoop
	rem $a0 $a1 10
	div $a1 $a1 10
	beqz $v1 Label12_LoadChar
	ble $a0 0 Label12_ToNeg
	add $a0 $a0 -10
Label12_ToNeg:
	neg $a0 $a0
Label12_LoadChar:
	add $a0 $a0 48
	add $a2 $a2 -1
	sb $a0 ($a2)
	j Label12_Cond
Label12_EndLoop:
	beqz $v1 Label12_Copy
	li $a0 45
	add $a2 $a2 -1
	sb $a0 ($a2)
Label12_Copy:
	sub $v1 $v0 $a2
	add $v1 $v1 15
	sw $v1 ($v0)
	add $v1 $v0 4
Label12_CopyCond:
	lb $a0 ($a2)
	sb $a0 ($v1)
	add $a2 $a2 1
	add $v1 $v1 1
	bnez $a0 Label12_CopyCond
Label12_EndToString:
	add $v0 $v0 4
	jr $ra


# string arg in $a0
# the zero in the end of the string will not be counted
###### Checked ######
func_length:
	lw $v0, -4($a0)
	jr $ra

# string arg in $a0, left in $a1, right in $a2
###### Checked ######
# used $a0, $a1, $t0, $t1, $t2, $t3, $t4, $v0,
func_substring:
	subu $sp, $sp, 24
	sw $ra, 0($sp)
    sw $t0, 4($sp)
    sw $t1, 8($sp)
    sw $t2, 12($sp)
    sw $t3, 16($sp)
    sw $t4, 20($sp)

	move $t0, $a0

	sub $t1, $a2, $a1
	add $t1, $t1, 1		# $t1 is the length of the substring
	add $a0, $t1, 5
	li $v0, 9
	syscall
	sw $t1, 0($v0)
	add $v0, $v0, 4

	add $a0, $t0, $a1
	add $t2, $t0, $a2
	lb $t3, 1($t2)		# store the ori_begin + right + 1 char in $t3
	sb $zero, 1($t2)	# change it to 0 for the convenience of copying
	move $a1, $v0
	move $t4, $v0
	jal _string_copy
	move $v0, $t4
	sb $t3, 1($t2)

	lw $ra, 0($sp)
    lw $t0, 4($sp)
    lw $t1, 8($sp)
    lw $t2, 12($sp)
    lw $t3, 16($sp)
    lw $t4, 20($sp)
	addu $sp, $sp, 24
	jr $ra

# string arg in $a0
###### Checked ######
# used $t0, $t1, $t2, $v0
func_parseInt:
    subu $sp, $sp, 12
    sw $t0, 0($sp)
    sw $t1, 4($sp)
    sw $t2, 8($sp)

	li $v0, 0
	move $t0, $a0
	li $t2, 1

	_count_number_pos:
	lb $t1, 0($t0)
	bgt $t1, 57, _begin_parse_int
	blt $t1, 48, _begin_parse_int
	add $t0, $t0, 1
	j _count_number_pos

	_begin_parse_int:
	sub $t0, $t0, 1

	_parsing_int:
	blt $t0, $a0, _finish_parse_int
	lb $t1, 0($t0)
	sub $t1, $t1, 48
	mul $t1, $t1, $t2
	add $v0, $v0, $t1
	mul $t2, $t2, 10
	sub $t0, $t0, 1
	j _parsing_int

	_finish_parse_int:
    lw $t0, 0($sp)
    lw $t1, 4($sp)
    lw $t2, 8($sp)
    addu $sp, $sp, 12
	jr $ra

# string arg in $a0, pos in $a1
###### Checked ######
# used $a0, $v0
func_ord:
	add $a0, $a0, $a1
	lb $v0, 0($a0)
	jr $ra

# array arg in $a0
# used $v0
func_size:
	lw $v0, -4($a0)
	jr $ra

func_stringConcatenate:
	move $v1 $a0
	lw $v0 -4($a0)
	lw $a0 -4($a1)
	add $a0 $a0 $v0
	move $a2 $a0
	add $a0 $a0 5
	li $v0 9
	syscall
	sw $a2 ($v0)
	add $v0 $v0 4
	move $a0 $v0
Label5_CopyFirst:
	lb $a2 ($v1)
	beqz $a2 Label5_CopySecond
	sb $a2 ($a0)
	add $a0 $a0 1
	add $v1 $v1 1
	j Label5_CopyFirst
Label5_CopySecond:
	lb $v1 ($a1)
	beqz $v1 Label5_End
	sb $v1 ($a0)
	add $a0 $a0 1
	add $a1 $a1 1
	j Label5_CopySecond
Label5_End:
	sb $0 ($a0)
	jr $ra

# string1 in $a0, string2 in $a1
###### Checked ######
# used $a0, $a1, $t0, $t1, $v0
func_stringIsEqual:
    subu $sp, $sp, 8
    sw $t0, 0($sp)
    sw $t1, 4($sp)

	lw $t0, -4($a0)
	lw $t1, -4($a1)
	bne $t0, $t1, _not_equal

	_continue_compare_equal:
	lb $t0, 0($a0)
	lb $t1, 0($a1)
	beqz $t0, _equal
	bne $t0, $t1, _not_equal
	add $a0, $a0, 1
	add $a1, $a1, 1
	j _continue_compare_equal

	_not_equal:
	li $v0, 0
	j _compare_final

	_equal:
	li $v0, 1

	_compare_final:
	lw $t0, 0($sp)
	lw $t1, 4($sp)
	addu $sp, $sp, 8
	jr $ra


# string1 in $a0, string2 in $a1
###### Checked ######
# used $a0, $a1, $t0, $t1, $v0
func_stringLess:
    subu $sp, $sp, 8
    sw $t0, 0($sp)
    sw $t1, 4($sp)

	_begin_compare_less:
	lb $t0, 0($a0)
	lb $t1, 0($a1)
	blt $t0, $t1, _less_correct
	bgt $t0, $t1, _less_false
	beqz $t0, _less_false
	add $a0, $a0, 1
	add $a1, $a1, 1
	j _begin_compare_less

	_less_correct:
	li $v0, 1
	j _less_compare_final

	_less_false:
	li $v0, 0

	_less_compare_final:
	lw $t0, 0($sp)
	lw $t1, 4($sp)
	addu $sp, $sp, 8
	jr $ra