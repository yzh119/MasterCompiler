/**
 * Created by expye(Zihao Ye) on 2016/3/22.
 */
grammar Master;

import LexerRules;

program : component
        | program component
        ;

component: class_def
         | function_def
         | variable_decl
         ;

function_def : function_head LBRACE variable_decl_list stmt_list RBRACE
             | function_head LBRACE                    stmt_list RBRACE
             ;

//function_def : type_specifier ID LPAREN type_specifier ID RPAREN LBRACE stmt_list RBRACE;

class_def : CLASS ID LBRACE variable_decl_list RBRACE;

variable_decl_list : variable_decl
                   | variable_decl_list variable_decl
                   ;

function_head : type_specifier ID LPAREN parameter_list RPAREN
              | type_specifier ID LPAREN                RPAREN
              | VOID ID LPAREN parameter_list   RPAREN
              | VOID ID LPAREN                  RPAREN
              ;

parameter_list : parameter_decl
               | parameter_list COMMA parameter_decl
               ;

parameter_decl : type_specifier ID;

variable_decl : type_specifier ID SEMICOLON;

type_specifier : INTEGER
               | STRING
               | BOOLEAN
               | ID
               | type_specifier LRBRACKET
               ;

stmt_list : stmt
          | stmt_list stmt
          ;

stmt : compound_stmt
     | expr_stmt
     | selection_stmt
     | iteration_stmt
     | jump_stmt
     ;

compound_stmt : LBRACE stmt_list RBRACE
              | LBRACE           RBRACE
              ;

expr_stmt : expr SEMICOLON;

selection_stmt : IF LPAREN expr RPAREN stmt
               | IF LPAREN expr RPAREN stmt ELSE stmt
               ;

iteration_stmt : WHILE LPAREN expr RPAREN stmt
               | FOR LPAREN expr_stmt expr_stmt expr RPAREN stmt
               | FOR LPAREN expr_stmt expr_stmt      RPAREN stmt
               | FOR LPAREN expr_stmt SEMICOLON expr RPAREN stmt
               | FOR LPAREN expr_stmt SEMICOLON      RPAREN stmt
               | FOR LPAREN SEMICOLON expr_stmt expr RPAREN stmt
               | FOR LPAREN SEMICOLON expr_stmt      RPAREN stmt
               | FOR LPAREN SEMICOLON SEMICOLON expr RPAREN stmt
               | FOR LPAREN SEMICOLON SEMICOLON      RPAREN stmt
               ;

jump_stmt : RETURN expr SEMICOLON
          | BREAK SEMICOLON
          | CONTINUE SEMICOLON
          ;

expr : assignment_expr;

assignment_expr : logical_or_expr
                | unary_expr ASSIGN assignment_expr
                ;

logical_or_expr : logical_and_expr
                | logical_or_expr LOR logical_and_expr
                ;

logical_and_expr : equality_expr
                 | logical_and_expr LAND equality_expr
                 ;

equality_expr : relational_expr
              | equality_expr EQ  relational_expr
              | equality_expr NEQ relational_expr
              ;

relational_expr : additive_expr
                | relational_expr LESS       additive_expr
                | relational_expr LESS_EQ    additive_expr
                | relational_expr GREATER    additive_expr
                | relational_expr GREATER_EQ additive_expr
                ;

additive_expr : mult_expr
              | additive_expr PLUS  mult_expr
              | additive_expr MINUS mult_expr
              ;

mult_expr : unary_expr
          | mult_expr MULTIPLY unary_expr
          | mult_expr  DIVIDE  unary_expr
          | mult_expr  MODULO  unary_expr
          ;

unary_expr : postfix
           | PLUS  unary_expr
           | MINUS unary_expr
           | NOT   unary_expr
           ;

postfix : primary
        | postfix LBRACKET expr RBRACKET
        | postfix LPAREN expr RPAREN
        | postfix LPAREN      RPAREN
        | postfix DOT ID
        ;

primary : ID
        | NULL
        | INT_LITERAL
        | STRING_LITERAL
        | LPAREN expr RPAREN
        | NEW type_specifier LBRACKET expr RBRACKET
        | NEW ID
        ;

constant    : NULL
            | PREDICATE
            | INT_LITERAL
            | STRING_LITERAL
            ;