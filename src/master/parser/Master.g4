/**
 * Created by expye(Zihao Ye) on 2016/3/22.
 */
grammar Master;

import LexerRules;

program
    : component
    | program component
    ;

component
    : class_def
    | function_def
    | variable_decl
    ;

function_def
    : function_head block
    ;

block: compound_stmt;

class_def
    : CLASS ID LBRACE variable_decl_list RBRACE;

variable_decl_list
    : variable_decl
    | variable_decl_list variable_decl
    ;

function_head
    : type_specifier ID LPAREN parameter_list RPAREN
    | type_specifier ID LRPAREN
    | VOID ID LPAREN parameter_list RPAREN
    | VOID ID LRPAREN
    ;

parameter_list
    : parameter_decl
    | parameter_list COMMA parameter_decl
    ;

parameter_decl
    : type_specifier ID;

variable_decl
    : type_specifier ID SEMICOLON
    | type_specifier ID ASSIGN expr SEMICOLON
    ;

type_specifier
    : INTEGER
    | STRING
    | BOOLEAN
    | ID
    | type_specifier LRBRACKET
    ;

stmt_list
    : stmt
    | stmt stmt_list
    ;

stmt
    : compound_stmt
    | expr_stmt
    | selection_stmt
    | iteration_stmt
    | jump_stmt
    | variable_decl
    | SEMICOLON
    ;

compound_stmt
    : LBRACE stmt_list? RBRACE
    ;

expr_stmt
    : expr SEMICOLON;

selection_stmt
    : IF LPAREN expr RPAREN stmt
    | IF LPAREN expr RPAREN stmt ELSE stmt
    ;

iteration_stmt
    : WHILE LPAREN expr RPAREN stmt
    | FOR LPAREN expr? SEMICOLON expr? SEMICOLON expr? RPAREN stmt
    ;

jump_stmt
    : RETURN expr SEMICOLON
    | BREAK SEMICOLON
    | CONTINUE SEMICOLON
    ;

expr
    : assignment_expr;

assignment_expr
    : logical_or_expr
    | lvalue ASSIGN assignment_expr
    ;

logical_or_expr
    : logical_and_expr
    | logical_or_expr OR logical_and_expr
    ;

logical_and_expr
    : bit_or_expr
    | logical_and_expr AND bit_or_expr
    ;

bit_or_expr
    : bit_xor_expr
    | bit_or_expr BOR bit_xor_expr
    ;

bit_xor_expr
    : bit_and_expr
    | bit_xor_expr XOR bit_and_expr
    ;

bit_and_expr
    : equality_expr
    | bit_and_expr BAND equality_expr
    ;

equality_expr
    : relational_expr
    | equality_expr EQ  relational_expr
    | equality_expr NEQ relational_expr
    ;

relational_expr
    : rshift_expr
    | relational_expr LESS       rshift_expr
    | relational_expr LESS_EQ    rshift_expr
    | relational_expr GREATER    rshift_expr
    | relational_expr GREATER_EQ rshift_expr
    ;

rshift_expr
    : lshift_expr
    | rshift_expr RSHIFT lshift_expr
    ;

lshift_expr
    : additive_expr
    | lshift_expr LSHIFT additive_expr
    ;

additive_expr
    : mult_expr
    | additive_expr PLUS  mult_expr
    | additive_expr MINUS mult_expr
    ;

mult_expr
    : unary_expr
    | mult_expr MULTIPLY unary_expr
    | mult_expr  DIVIDE  unary_expr
    | mult_expr  MODULO  unary_expr
    ;

unary_expr
    : primary
    | lvalue
    | ANTI  unary_expr
    | PLUS  unary_expr
    | MINUS unary_expr
    | NOT   unary_expr
    ;

primary
    : constant
    | LPAREN expr RPAREN
    | ID LPAREN param_list? RPAREN
    | NEW type_specifier dim_expr?
    | ID DOT SIZE LRPAREN
    ;

constant
    : NULL
    | INT_LITERAL
    | PREDICATE
    | STRING_LITERAL
    ;

lvalue
    : ID
    | lvalue LBRACKET expr RBRACKET
    | lvalue DOT ID
    | INC   lvalue
    | DEC   lvalue
    | lvalue   INC
    | lvalue   DEC
    | LPAREN lvalue RPAREN
    ;

dim_expr
    : LBRACKET expr RBRACKET
    | dim_expr LBRACKET expr RBRACKET
    ;

param_list
    : expr
    | param_list COMMA expr
    ;