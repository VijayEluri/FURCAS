lexer grammar InternalOCLinEcore;
@header {
package org.eclipse.ocl.examples.xtext.oclinecore.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T13 : '*' ;
T14 : '+' ;
T15 : '?' ;
T16 : ';' ;
T17 : 'reference' ;
T18 : 'e' ;
T19 : 'E' ;
T20 : '-' ;
T21 : '=' ;
T22 : '<>' ;
T23 : '>' ;
T24 : '<' ;
T25 : '>=' ;
T26 : '<=' ;
T27 : '/' ;
T28 : 'not' ;
T29 : '.' ;
T30 : ':' ;
T31 : '@' ;
T32 : '(' ;
T33 : ')' ;
T34 : ',' ;
T35 : 'attribute' ;
T36 : '[' ;
T37 : ']' ;
T38 : '..' ;
T39 : '{' ;
T40 : '}' ;
T41 : 'class' ;
T42 : 'extends' ;
T43 : 'datatype' ;
T44 : '::' ;
T45 : 'enum' ;
T46 : 'import' ;
T47 : 'operation' ;
T48 : 'package' ;
T49 : '#' ;
T50 : '&&' ;
T51 : 'super' ;
T52 : 'Tuple' ;
T53 : 'invalid' ;
T54 : 'null' ;
T55 : '->' ;
T56 : '|' ;
T57 : 'if' ;
T58 : 'then' ;
T59 : 'else' ;
T60 : 'endif' ;
T61 : 'let' ;
T62 : 'in' ;
T63 : 'body' ;
T64 : 'derivation' ;
T65 : 'initial' ;
T66 : 'invariant' ;
T67 : 'postcondition' ;
T68 : 'precondition' ;
T69 : 'derived' ;
T70 : '!derived' ;
T71 : 'id' ;
T72 : '!id' ;
T73 : 'ordered' ;
T74 : '!ordered' ;
T75 : 'readonly' ;
T76 : '!readonly' ;
T77 : 'transient' ;
T78 : '!transient' ;
T79 : 'unique' ;
T80 : '!unique' ;
T81 : 'unsettable' ;
T82 : '!unsettable' ;
T83 : 'volatile' ;
T84 : '!volatile' ;
T85 : 'abstract' ;
T86 : '!abstract' ;
T87 : 'interface' ;
T88 : '!interface' ;
T89 : 'resolve' ;
T90 : '!resolve' ;
T91 : 'property' ;
T92 : 'self' ;
T93 : 'Boolean' ;
T94 : 'Integer' ;
T95 : 'Real' ;
T96 : 'String' ;
T97 : 'UnlimitedNatural' ;
T98 : 'OclAny' ;
T99 : 'OclInvalid' ;
T100 : 'OclVoid' ;
T101 : 'Set' ;
T102 : 'Bag' ;
T103 : 'Sequence' ;
T104 : 'Collection' ;
T105 : 'OrderedSet' ;
T106 : 'true' ;
T107 : 'false' ;
T108 : 'implies' ;
T109 : 'xor' ;
T110 : 'or' ;
T111 : 'and' ;
T112 : '@pre' ;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore.ui/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/ui/contentassist/antlr/internal/InternalOCLinEcore.g" 17709
RULE_URL : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore.ui/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/ui/contentassist/antlr/internal/InternalOCLinEcore.g" 17711
RULE_OCL : '\u00A3' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '\u00A3';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore.ui/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/ui/contentassist/antlr/internal/InternalOCLinEcore.g" 17713
RULE_STRING_LITERAL : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore.ui/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/ui/contentassist/antlr/internal/InternalOCLinEcore.g" 17715
RULE_ID : (('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*|'_' RULE_STRING_LITERAL);

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore.ui/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/ui/contentassist/antlr/internal/InternalOCLinEcore.g" 17717
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore.ui/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/ui/contentassist/antlr/internal/InternalOCLinEcore.g" 17719
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore.ui/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/ui/contentassist/antlr/internal/InternalOCLinEcore.g" 17721
RULE_SL_COMMENT : '--' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore.ui/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/ui/contentassist/antlr/internal/InternalOCLinEcore.g" 17723
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.eclipse.ocl.examples.xtext.oclinecore.ui/src-gen/org/eclipse/ocl/examples/xtext/oclinecore/ui/contentassist/antlr/internal/InternalOCLinEcore.g" 17725
RULE_ANY_OTHER : .;

