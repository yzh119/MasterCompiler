package com.expye.compiler2016.Allocator;

import javax.crypto.Mac;
import java.util.ArrayList;

/**
 * Created by expye(Zihao Ye) on 2016/4/28.
 */

/* 0    $0
 * 1    $at
 * 2    $v0
 * 3    $v1
 * 4    $a0
 * 5    $a1
 * 6    $a2
 * 7    $a3
 * 8    $t0
 * 9    $t1
 * 10   $t2
 * 11   $t3
 * 12   $t4
 * 13   $t5
 * 14   $t6
 * 15   $t7
 * 16   $s0
 * 17   $s1
 * 18   $s2
 * 19   $s3
 * 20   $s4
 * 21   $s5
 * 22   $s6
 * 23   $s7
 * 24   $t8
 * 25   $t9
 * 26   $k0
 * 27   $k1
 * 28   $gp
 * 29   $sp
 * 30   $fp
 * 31   $ra
 */
public class MachineRegister {
    public static MachineRegister[] virginRegister = new MachineRegister[]{
            new MachineRegister(4, "$a0"),
            new MachineRegister(5, "$a1"),
            new MachineRegister(6, "$a2"),
            new MachineRegister(7, "$a3"),
            new MachineRegister(8, "$t0"),
            new MachineRegister(9, "$t1"),
            new MachineRegister(10, "$t2"),
            new MachineRegister(11, "$t3"),
            new MachineRegister(12, "$t4"),
            new MachineRegister(13, "$t5"),
            new MachineRegister(14, "$t6"),
            new MachineRegister(15, "$t7"),
            new MachineRegister(16, "$s0"),
            new MachineRegister(17, "$s1"),
            new MachineRegister(18, "$s2"),
            new MachineRegister(19, "$s3"),
            new MachineRegister(20, "$s4"),
            new MachineRegister(21, "$s5"),
            new MachineRegister(22, "$s6"),
            new MachineRegister(23, "$s7"),
            new MachineRegister(24, "$t8"),
            new MachineRegister(25, "$t9"),
            new MachineRegister(26, "$k0"),
            new MachineRegister(27, "$k1"),
            new MachineRegister(30, "$fp")
    };

    String name;
    int iD;
    private MachineRegister(int iD, String name) {
        this.iD = iD;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
