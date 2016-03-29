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

class_def
    : CLASS ID LBRACE variable_decl_list RBRACE;

variable_decl_list
    : variable_decl
    | variable_decl_list variable_decl
    ;

function_head
    : type_specifier ID LRPAREN
    | type_specifier ID LPAREN parameter_list RPAREN
    | VOID ID LRPAREN
    | VOID ID LPAREN parameter_list? RPAREN
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
    : block
    | expr_stmt
    | selection_stmt
    | iteration_stmt
    | jump_stmt
    | variable_decl
    | SEMICOLON
    ;

block
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
    : LPAREN expr RPAREN
    | op = (INC | DEC | ADD | SUB | BIT_NOT | LOG_NOT ) expr
    | expr op = (INC | DEC)
    | expr op = (MUL | DIV | MOD) expr
    | expr op = (ADD | SUB) expr
    | expr op = (LSHIFT | RSHIFT) expr
    | expr op = (LESS | LESS_EQ | GREATER | GREATER_EQ) expr
    | expr op = (EQ | NEQ) expr
    | expr op = BIT_AND expr
    | expr op = XOR expr
    | expr op = BIT_OR expr
    | expr op = LOG_AND expr
    | expr op = LOG_OR expr
    | expr op = ASSIGN expr
    | constant
    | NEW type_specifier dim_expr?
    | prefix
    ;

prefix
    : ID
    | prefix LBRACKET expr RBRACKET
    | prefix LPAREN param_list RPAREN
    | prefix LRPAREN
    | prefix DOT ID
    | prefix DOT SIZE LRPAREN
    ;

constant
    : NULL
    | INT_LITERAL
    | PREDICATE
    | STRING_LITERAL
    ;

dim_expr
    : LBRACKET expr RBRACKET
    | dim_expr LBRACKET expr RBRACKET
    ;

param_list
    : expr
    | param_list COMMA expr
    ;
