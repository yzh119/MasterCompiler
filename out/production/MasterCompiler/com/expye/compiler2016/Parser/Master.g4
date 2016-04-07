/**
 * Created by expye(Zihao Ye) on 2016/3/22.
 */
grammar Master;

import LexerRules;

program: (class_def | function_def | variable_decl )*;
class_body: (class_def | function_def | variable_decl)*;

function_def: type_specifier ID LPAREN parameter_list? RPAREN LBRACE stmt_list RBRACE;
class_def: CLASS ID LBRACE class_body RBRACE;

parameter_list: (parameter_decl COMMA)* parameter_decl ;

parameter_decl: type_specifier ID;

expr
    : LPAREN expr RPAREN                                        #parenExpr
    | expr (LBRACKET expr RBRACKET)+                            #subsExpr
    | ID LPAREN param_list? RPAREN                              #funcExpr
    | expr DOT ID (LPAREN param_list? RPAREN)?                  #fieldExpr
    | op = (INC | DEC | ADD | SUB | BIT_NOT | LOG_NOT ) expr    #preUnaryExpr
    | expr op = (INC | DEC)                                     #posUnaryExpr
    | expr op = (MUL | DIV | MOD) expr                          #mulDivModExpr
    | expr op = (ADD | SUB) expr                                #addSubExpr
    | expr op = (LSHIFT | RSHIFT) expr                          #shiftExpr
    | expr op = (LESS | LESS_EQ | GREATER | GREATER_EQ) expr    #compExpr
    | expr op = (EQ | NEQ) expr                                 #eqNeqExpr
    | expr op = BIT_AND expr                                    #bitAndExpr
    | expr op = BIT_XOR expr                                    #bitXorExpr
    | expr op = BIT_OR expr                                     #bitOrExpr
    | expr op = LOG_AND expr                                    #logAndExpr
    | expr op = LOG_OR expr                                     #logOrExpr
    | <assoc = right>expr op = ASSIGN expr                      #assignExpr
    | NEW type_specifier dim_expr?                              #newExpr
    | constant                                                  #constExpr
    | ID                                                        #identifierExpr
    ;

dim_expr: (LBRACKET expr RBRACKET)+ (LBRACKET RBRACKET)*;

variable_decl: type_specifier ID (ASSIGN expr)? SEMICOLON;

type_specifier
    : INTEGER                                                           #integerType
    | STRING                                                            #stringType
    | BOOLEAN                                                           #boolType
    | ID                                                                #classType
    | type_specifier (LBRACKET RBRACKET)+                               #arrayType
    | VOID                                                              #nullType
    ;

stmt_list: stmt*;

stmt
    : block
    | expr_stmt
    | selection_stmt
    | iteration_stmt
    | jump_stmt
    | variable_decl
    | SEMICOLON
    ;


block: LBRACE stmt_list RBRACE;

expr_stmt: expr SEMICOLON;

selection_stmt: IF LPAREN expr RPAREN stmt (ELSE stmt)?;

iteration_stmt
    : WHILE LPAREN expr RPAREN stmt                                                                   #whileIteration
    | FOR LPAREN (expr1 = expr)? SEMICOLON (expr2 = expr)? SEMICOLON (expr3 = expr)? RPAREN stmt      #forIteration
    ;

jump_stmt
    : RETURN expr? SEMICOLON                                    #returnJump
    | BREAK SEMICOLON                                           #breakJump
    | CONTINUE SEMICOLON                                        #continueJump
    ;

constant
    : NULL                                                      #nullConst
    | INT_LITERAL                                               #intConst
    | PREDICATE                                                 #boolConst
    | String_Literal                                            #stringConst
    ;

param_list: (expr COMMA)* expr;

String_Literal
    : '"' SCHARSEQ? '"';