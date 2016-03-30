/**
 * Created by expye(Zihao Ye) on 2016/3/22.
 */
grammar Master;

import LexerRules;

program
    : decl
    | program decl
    ;

decl
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
    : RETURN expr SEMICOLON                                     #returnJump
    | BREAK SEMICOLON                                           #breakJump
    | CONTINUE SEMICOLON                                        #continueJump
    ;

expr
    : LPAREN expr RPAREN                                        #parenExpr
    | expr LBRACKET expr LBRACKET                               #subsExpr
    | expr LPAREN param_list RPAREN                             #withParaFuncExpr
    | expr LRPAREN                                              #noParaFuncExpr
    | expr DOT expr                                             #fieldExpr
    | op = (INC | DEC | ADD | SUB | BIT_NOT | LOG_NOT ) expr    #preUnaryExpr
    | expr op = (INC | DEC)                                     #posUnaryExpr
    | expr op = (MUL | DIV | MOD) expr                          #mulDivModExpr
    | expr op = (ADD | SUB) expr                                #addSubExpr
    | expr op = (LSHIFT | RSHIFT) expr                          #shiftExpr
    | expr op = (LESS | LESS_EQ | GREATER | GREATER_EQ) expr    #compExpr
    | expr op = (EQ | NEQ) expr                                 #eqNeqExpr
    | expr op = BIT_AND expr                                    #bitAndExpr
    | expr op = XOR expr                                        #xorExpr
    | expr op = BIT_OR expr                                     #bitOrExpr
    | expr op = LOG_AND expr                                    #logAndExpr
    | expr op = LOG_OR expr                                     #logOrExpr
    | <assoc = right>expr op = ASSIGN expr                      #assignExpr
    | NEW type_specifier dim_expr?                              #newExpr
    | constant                                                  #constExpr
    | ID                                                        #identifierExpr
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
