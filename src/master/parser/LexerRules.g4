lexer grammar LexerRules;

IF:         'if';
ELSE:       'else';
BREAK:      'break';
RETURN:     'return';
CONTINUE:   'continue';
WHILE:      'while';
FOR:        'for';
NEW:        'new';
EXTENDS:    'extends';
THIS:       'this';

INTEGER:    'int';
STRING:     'string';
BOOLEAN:    'bool';

VOID:       'void';
CLASS:      'class';

PREDICATE
    : 'true'
    | 'false'
    ;

ADD:        '+';
SUB:        '-';
MUL:        '*';
DIV:        '/';
MOD:        '%';
INC:        '++';
DEC:        '--';

GREATER:    '>';
GREATER_EQ: '>=';
LESS:       '<';
LESS_EQ:    '<=';
EQ:         '==';
NEQ:        '!=';

LOG_AND:       '&&';
LOG_OR:        '||';
LOG_NOT:       '!';

LSHIFT:     '<<';
RSHIFT:     '>>';
BIT_NOT:    '~';
BIT_AND:    '&';
BIT_OR:     '|';
BIT_XOR:    '^';

ASSIGN:     '=';

NULL:       'null';

COMMA:      ',';
SEMICOLON:  ';';
LBRACKET:   '[';
RBRACKET:   ']';
LBRACE:     '{';
RBRACE:     '}';
LPAREN:     '(';
RPAREN:     ')';
DOT:        '.';

INT_LITERAL
    : [0-9]+;

STRING_LITERAL
    : '"' SCHARSEQ? '"';

fragment
SCHARSEQ
    : SCHAR+;

fragment
SCHAR
    : ~['\\\r\n]
    | ESCSEQ
    ;

fragment
ESCSEQ
    : '\\'  ['"?abfnrtv\\]
    ;

ID
    : [a-zA-Z] [a-zA-Z0-9_]* ;

NEWLINE
    :   '\r'? '\n' -> skip;

LINE_COMMENT
    :   '//' .*? '\r'? '\n' -> skip
    ;

WS
    :   [ \t] -> skip;