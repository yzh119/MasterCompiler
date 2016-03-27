lexer grammar LexerRules;


IF:         'if';
ELSE:       'else';
BREAK:      'break';
RETURN:     'return';
CONTINUE:   'continue';
WHILE:      'while';
FOR:        'for';
NEW:        'new';

INTEGER:    'int';
STRING:     'string';
BOOLEAN:    'bool';

VOID:       'void';
CLASS:      'class';

PLUS:       '+';
MINUS:      '-';
MULTIPLY:   '*';
DIVIDE:     '/';
MODULO:     '%';
INC:        '++';
DEC:        '--';

GREATER:    '>';
GREATER_EQ: '>=';
LESS:       '<';
LESS_EQ:    '<=';
EQ:         '==';
NEQ:        '!=';

LAND:    '&&';
LOR:     '||';
NOT:        '!';

LSHIFT:     '<<';
RSHIFT:     '>>';
ANTI:        '~';
AND:        '&';
BOR:        '|';
XOR:        '^';

ASSIGN:     '=';

NULL:       'null';

COMMA:      ',';
SEMICOLON:  ';';
LBRACKET:   '[';
RBRACKET:   ']';
LRBRACKET:  '[]';
LBRACE:     '{';
RBRACE:     '}';
LPAREN:     '(';
RPAREN:     ')';
DOT:        '.';

ID:             [a-zA-Z] [a-zA-Z0-9_]* ;
INT_LITERAL:    [0-9]+;
STRING_LITERAL: '"' [a-zA-Z]* '"';
PREDICATE:      'true'
         |      'false'
         ;

NEWLINE: '\r'? '\n' -> skip;

LINE_COMMENT:   '//' .*? '\r'? '\n' -> skip;

WS: [ \t] -> skip;