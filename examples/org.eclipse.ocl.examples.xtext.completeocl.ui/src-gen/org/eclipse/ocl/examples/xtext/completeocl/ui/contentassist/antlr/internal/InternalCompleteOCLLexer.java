/**
 * <copyright>
 *
 * Copyright (c) 2010 E.D.Willink and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *
 * </copyright>
 *
 * $Id: InternalCompleteOCLLexer.java,v 1.1 2010/04/13 06:36:42 ewillink Exp $
 */
package org.eclipse.ocl.examples.xtext.completeocl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.antlr.runtime.CharStream;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;

public class InternalCompleteOCLLexer extends Lexer {
    public static final int T79=79;
    public static final int T14=14;
    public static final int T29=29;
    public static final int T36=36;
    public static final int T58=58;
    public static final int T70=70;
    public static final int T74=74;
    public static final int T35=35;
    public static final int T61=61;
    public static final int T45=45;
    public static final int T20=20;
    public static final int T34=34;
    public static final int T64=64;
    public static final int T25=25;
    public static final int T18=18;
    public static final int T37=37;
    public static final int T26=26;
    public static final int RULE_INT=4;
    public static final int T32=32;
    public static final int T81=81;
    public static final int T17=17;
    public static final int T51=51;
    public static final int T46=46;
    public static final int T77=77;
    public static final int T16=16;
    public static final int T38=38;
    public static final int T41=41;
    public static final int T24=24;
    public static final int T19=19;
    public static final int T69=69;
    public static final int T39=39;
    public static final int T21=21;
    public static final int T62=62;
    public static final int T44=44;
    public static final int T55=55;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_ID=5;
    public static final int T73=73;
    public static final int T68=68;
    public static final int T33=33;
    public static final int T11=11;
    public static final int T22=22;
    public static final int T50=50;
    public static final int T78=78;
    public static final int RULE_STRING_LITERAL=6;
    public static final int T43=43;
    public static final int T12=12;
    public static final int T23=23;
    public static final int T28=28;
    public static final int T42=42;
    public static final int T66=66;
    public static final int T40=40;
    public static final int T71=71;
    public static final int T63=63;
    public static final int T57=57;
    public static final int T72=72;
    public static final int T13=13;
    public static final int T65=65;
    public static final int T56=56;
    public static final int T76=76;
    public static final int T80=80;
    public static final int T75=75;
    public static final int T59=59;
    public static final int RULE_WS=9;
    public static final int T48=48;
    public static final int T15=15;
    public static final int T54=54;
    public static final int EOF=-1;
    public static final int T67=67;
    public static final int T47=47;
    public static final int Tokens=83;
    public static final int T53=53;
    public static final int T60=60;
    public static final int RULE_ANY_OTHER=10;
    public static final int T31=31;
    public static final int T82=82;
    public static final int T49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int T27=27;
    public static final int T52=52;
    public static final int T30=30;
    public InternalCompleteOCLLexer() {;} 
    public InternalCompleteOCLLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:10:5: ( '^^' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:10:7: '^^'
            {
            match("^^"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:11:5: ( '^' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:11:7: '^'
            {
            match('^'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:12:5: ( 'e' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:12:7: 'e'
            {
            match('e'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:13:5: ( 'E' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:13:7: 'E'
            {
            match('E'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:14:5: ( '+' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:14:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:15:5: ( '-' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:15:7: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:16:5: ( '=' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:16:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:17:5: ( '<>' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:17:7: '<>'
            {
            match("<>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:18:5: ( '>' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:18:7: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:19:5: ( '<' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:19:7: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:20:5: ( '>=' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:20:7: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:21:5: ( '<=' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:21:7: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:22:5: ( '*' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:22:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:23:5: ( '/' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:23:7: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:24:5: ( 'not' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:24:7: 'not'
            {
            match("not"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:25:5: ( '.' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:25:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:26:5: ( 'import' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:26:7: 'import'
            {
            match("import"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:27:5: ( 'package' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:27:7: 'package'
            {
            match("package"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:28:5: ( 'endpackage' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:28:7: 'endpackage'
            {
            match("endpackage"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:29:5: ( 'context' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:29:7: 'context'
            {
            match("context"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:30:5: ( ':' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:30:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:31:5: ( 'init' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:31:7: 'init'
            {
            match("init"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:32:5: ( 'derive' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:32:7: 'derive'
            {
            match("derive"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:33:5: ( 'inv' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:33:7: 'inv'
            {
            match("inv"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:34:5: ( 'def' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:34:7: 'def'
            {
            match("def"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:35:5: ( '(' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:35:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:36:5: ( ')' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:36:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:37:5: ( ',' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:37:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:38:5: ( 'pre' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:38:7: 'pre'
            {
            match("pre"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:39:5: ( 'post' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:39:7: 'post'
            {
            match("post"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:40:5: ( 'body' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:40:7: 'body'
            {
            match("body"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:41:5: ( '?' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:41:7: '?'
            {
            match('?'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:42:5: ( '::' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:42:7: '::'
            {
            match("::"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:43:5: ( '{' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:43:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:44:5: ( '}' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:44:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:45:5: ( '..' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:45:7: '..'
            {
            match(".."); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:46:5: ( 'Tuple' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:46:7: 'Tuple'
            {
            match("Tuple"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:47:5: ( 'invalid' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:47:7: 'invalid'
            {
            match("invalid"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:48:5: ( 'null' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:48:7: 'null'
            {
            match("null"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:49:5: ( '->' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:49:7: '->'
            {
            match("->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public final void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:50:5: ( '|' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:50:7: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public final void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:51:5: ( ';' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:51:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public final void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:52:5: ( '[' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:52:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start T54
    public final void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:53:5: ( ']' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:53:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start T55
    public final void mT55() throws RecognitionException {
        try {
            int _type = T55;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:54:5: ( 'if' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:54:7: 'if'
            {
            match("if"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T55

    // $ANTLR start T56
    public final void mT56() throws RecognitionException {
        try {
            int _type = T56;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:55:5: ( 'then' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:55:7: 'then'
            {
            match("then"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T56

    // $ANTLR start T57
    public final void mT57() throws RecognitionException {
        try {
            int _type = T57;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:56:5: ( 'else' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:56:7: 'else'
            {
            match("else"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T57

    // $ANTLR start T58
    public final void mT58() throws RecognitionException {
        try {
            int _type = T58;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:57:5: ( 'endif' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:57:7: 'endif'
            {
            match("endif"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T58

    // $ANTLR start T59
    public final void mT59() throws RecognitionException {
        try {
            int _type = T59;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:58:5: ( 'let' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:58:7: 'let'
            {
            match("let"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T59

    // $ANTLR start T60
    public final void mT60() throws RecognitionException {
        try {
            int _type = T60;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:59:5: ( 'in' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:59:7: 'in'
            {
            match("in"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T60

    // $ANTLR start T61
    public final void mT61() throws RecognitionException {
        try {
            int _type = T61;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:60:5: ( 'static' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:60:7: 'static'
            {
            match("static"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T61

    // $ANTLR start T62
    public final void mT62() throws RecognitionException {
        try {
            int _type = T62;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:61:5: ( 'self' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:61:7: 'self'
            {
            match("self"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T62

    // $ANTLR start T63
    public final void mT63() throws RecognitionException {
        try {
            int _type = T63;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:62:5: ( 'Boolean' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:62:7: 'Boolean'
            {
            match("Boolean"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T63

    // $ANTLR start T64
    public final void mT64() throws RecognitionException {
        try {
            int _type = T64;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:63:5: ( 'Integer' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:63:7: 'Integer'
            {
            match("Integer"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T64

    // $ANTLR start T65
    public final void mT65() throws RecognitionException {
        try {
            int _type = T65;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:64:5: ( 'Real' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:64:7: 'Real'
            {
            match("Real"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T65

    // $ANTLR start T66
    public final void mT66() throws RecognitionException {
        try {
            int _type = T66;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:65:5: ( 'String' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:65:7: 'String'
            {
            match("String"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T66

    // $ANTLR start T67
    public final void mT67() throws RecognitionException {
        try {
            int _type = T67;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:66:5: ( 'UnlimitedNatural' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:66:7: 'UnlimitedNatural'
            {
            match("UnlimitedNatural"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T67

    // $ANTLR start T68
    public final void mT68() throws RecognitionException {
        try {
            int _type = T68;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:67:5: ( 'OclAny' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:67:7: 'OclAny'
            {
            match("OclAny"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T68

    // $ANTLR start T69
    public final void mT69() throws RecognitionException {
        try {
            int _type = T69;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:68:5: ( 'OclInvalid' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:68:7: 'OclInvalid'
            {
            match("OclInvalid"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T69

    // $ANTLR start T70
    public final void mT70() throws RecognitionException {
        try {
            int _type = T70;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:69:5: ( 'OclVoid' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:69:7: 'OclVoid'
            {
            match("OclVoid"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T70

    // $ANTLR start T71
    public final void mT71() throws RecognitionException {
        try {
            int _type = T71;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:70:5: ( 'Set' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:70:7: 'Set'
            {
            match("Set"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T71

    // $ANTLR start T72
    public final void mT72() throws RecognitionException {
        try {
            int _type = T72;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:71:5: ( 'Bag' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:71:7: 'Bag'
            {
            match("Bag"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T72

    // $ANTLR start T73
    public final void mT73() throws RecognitionException {
        try {
            int _type = T73;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:72:5: ( 'Sequence' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:72:7: 'Sequence'
            {
            match("Sequence"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T73

    // $ANTLR start T74
    public final void mT74() throws RecognitionException {
        try {
            int _type = T74;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:73:5: ( 'Collection' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:73:7: 'Collection'
            {
            match("Collection"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T74

    // $ANTLR start T75
    public final void mT75() throws RecognitionException {
        try {
            int _type = T75;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:74:5: ( 'OrderedSet' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:74:7: 'OrderedSet'
            {
            match("OrderedSet"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T75

    // $ANTLR start T76
    public final void mT76() throws RecognitionException {
        try {
            int _type = T76;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:75:5: ( 'true' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:75:7: 'true'
            {
            match("true"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T76

    // $ANTLR start T77
    public final void mT77() throws RecognitionException {
        try {
            int _type = T77;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:76:5: ( 'false' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:76:7: 'false'
            {
            match("false"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T77

    // $ANTLR start T78
    public final void mT78() throws RecognitionException {
        try {
            int _type = T78;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:77:5: ( 'implies' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:77:7: 'implies'
            {
            match("implies"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T78

    // $ANTLR start T79
    public final void mT79() throws RecognitionException {
        try {
            int _type = T79;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:78:5: ( 'xor' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:78:7: 'xor'
            {
            match("xor"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T79

    // $ANTLR start T80
    public final void mT80() throws RecognitionException {
        try {
            int _type = T80;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:79:5: ( 'or' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:79:7: 'or'
            {
            match("or"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T80

    // $ANTLR start T81
    public final void mT81() throws RecognitionException {
        try {
            int _type = T81;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:80:5: ( 'and' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:80:7: 'and'
            {
            match("and"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T81

    // $ANTLR start T82
    public final void mT82() throws RecognitionException {
        try {
            int _type = T82;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:81:5: ( '@pre' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:81:7: '@pre'
            {
            match("@pre"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T82

    // $ANTLR start RULE_STRING_LITERAL
    public final void mRULE_STRING_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_STRING_LITERAL;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:10939:21: ( '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:10939:23: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:10939:28: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\\') ) {
                    alt1=1;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='&')||(LA1_0>='(' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFE')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:10939:29: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:10939:70: ~ ( ( '\\\\' | '\\'' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('\''); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING_LITERAL

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:10941:9: ( ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* | '_' RULE_STRING_LITERAL ) )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:10941:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* | '_' RULE_STRING_LITERAL )
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:10941:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* | '_' RULE_STRING_LITERAL )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='_') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='\'') ) {
                    alt3=2;
                }
                else {
                    alt3=1;}
            }
            else if ( ((LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                alt3=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("10941:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* | '_' RULE_STRING_LITERAL )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:10941:12: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    {
                    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }

                    // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:10941:36: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:10941:70: '_' RULE_STRING_LITERAL
                    {
                    match('_'); 
                    mRULE_STRING_LITERAL(); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:10943:10: ( ( '0' .. '9' )+ )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:10943:12: ( '0' .. '9' )+
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:10943:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:10943:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:10945:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:10945:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:10945:24: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='/') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<='.')||(LA5_1>='0' && LA5_1<='\uFFFE')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFE')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:10945:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:10947:17: ( '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:10947:19: '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("--"); 

            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:10947:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFE')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:10947:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:10947:40: ( ( '\\r' )? '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:10947:41: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:10947:41: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:10947:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:10949:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:10949:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:10949:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\t' && LA9_0<='\n')||LA9_0=='\r'||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:10951:16: ( . )
            // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:10951:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | RULE_STRING_LITERAL | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt10=79;
        int LA10_0 = input.LA(1);

        if ( (LA10_0=='^') ) {
            int LA10_1 = input.LA(2);

            if ( (LA10_1=='^') ) {
                alt10=1;
            }
            else {
                alt10=2;}
        }
        else if ( (LA10_0=='e') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA10_53 = input.LA(3);

                if ( (LA10_53=='d') ) {
                    switch ( input.LA(4) ) {
                    case 'p':
                        {
                        int LA10_157 = input.LA(5);

                        if ( (LA10_157=='a') ) {
                            int LA10_196 = input.LA(6);

                            if ( (LA10_196=='c') ) {
                                int LA10_226 = input.LA(7);

                                if ( (LA10_226=='k') ) {
                                    int LA10_247 = input.LA(8);

                                    if ( (LA10_247=='a') ) {
                                        int LA10_265 = input.LA(9);

                                        if ( (LA10_265=='g') ) {
                                            int LA10_278 = input.LA(10);

                                            if ( (LA10_278=='e') ) {
                                                int LA10_284 = input.LA(11);

                                                if ( ((LA10_284>='0' && LA10_284<='9')||(LA10_284>='A' && LA10_284<='Z')||LA10_284=='_'||(LA10_284>='a' && LA10_284<='z')) ) {
                                                    alt10=74;
                                                }
                                                else {
                                                    alt10=19;}
                                            }
                                            else {
                                                alt10=74;}
                                        }
                                        else {
                                            alt10=74;}
                                    }
                                    else {
                                        alt10=74;}
                                }
                                else {
                                    alt10=74;}
                            }
                            else {
                                alt10=74;}
                        }
                        else {
                            alt10=74;}
                        }
                        break;
                    case 'i':
                        {
                        int LA10_158 = input.LA(5);

                        if ( (LA10_158=='f') ) {
                            int LA10_197 = input.LA(6);

                            if ( ((LA10_197>='0' && LA10_197<='9')||(LA10_197>='A' && LA10_197<='Z')||LA10_197=='_'||(LA10_197>='a' && LA10_197<='z')) ) {
                                alt10=74;
                            }
                            else {
                                alt10=48;}
                        }
                        else {
                            alt10=74;}
                        }
                        break;
                    default:
                        alt10=74;}

                }
                else {
                    alt10=74;}
                }
                break;
            case 'l':
                {
                int LA10_54 = input.LA(3);

                if ( (LA10_54=='s') ) {
                    int LA10_121 = input.LA(4);

                    if ( (LA10_121=='e') ) {
                        int LA10_159 = input.LA(5);

                        if ( ((LA10_159>='0' && LA10_159<='9')||(LA10_159>='A' && LA10_159<='Z')||LA10_159=='_'||(LA10_159>='a' && LA10_159<='z')) ) {
                            alt10=74;
                        }
                        else {
                            alt10=47;}
                    }
                    else {
                        alt10=74;}
                }
                else {
                    alt10=74;}
                }
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '_':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'm':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt10=74;
                }
                break;
            default:
                alt10=3;}

        }
        else if ( (LA10_0=='E') ) {
            int LA10_3 = input.LA(2);

            if ( ((LA10_3>='0' && LA10_3<='9')||(LA10_3>='A' && LA10_3<='Z')||LA10_3=='_'||(LA10_3>='a' && LA10_3<='z')) ) {
                alt10=74;
            }
            else {
                alt10=4;}
        }
        else if ( (LA10_0=='+') ) {
            alt10=5;
        }
        else if ( (LA10_0=='-') ) {
            switch ( input.LA(2) ) {
            case '>':
                {
                alt10=40;
                }
                break;
            case '-':
                {
                alt10=77;
                }
                break;
            default:
                alt10=6;}

        }
        else if ( (LA10_0=='=') ) {
            alt10=7;
        }
        else if ( (LA10_0=='<') ) {
            switch ( input.LA(2) ) {
            case '>':
                {
                alt10=8;
                }
                break;
            case '=':
                {
                alt10=12;
                }
                break;
            default:
                alt10=10;}

        }
        else if ( (LA10_0=='>') ) {
            int LA10_8 = input.LA(2);

            if ( (LA10_8=='=') ) {
                alt10=11;
            }
            else {
                alt10=9;}
        }
        else if ( (LA10_0=='*') ) {
            alt10=13;
        }
        else if ( (LA10_0=='/') ) {
            int LA10_10 = input.LA(2);

            if ( (LA10_10=='*') ) {
                alt10=76;
            }
            else {
                alt10=14;}
        }
        else if ( (LA10_0=='n') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA10_71 = input.LA(3);

                if ( (LA10_71=='t') ) {
                    int LA10_122 = input.LA(4);

                    if ( ((LA10_122>='0' && LA10_122<='9')||(LA10_122>='A' && LA10_122<='Z')||LA10_122=='_'||(LA10_122>='a' && LA10_122<='z')) ) {
                        alt10=74;
                    }
                    else {
                        alt10=15;}
                }
                else {
                    alt10=74;}
                }
                break;
            case 'u':
                {
                int LA10_72 = input.LA(3);

                if ( (LA10_72=='l') ) {
                    int LA10_123 = input.LA(4);

                    if ( (LA10_123=='l') ) {
                        int LA10_161 = input.LA(5);

                        if ( ((LA10_161>='0' && LA10_161<='9')||(LA10_161>='A' && LA10_161<='Z')||LA10_161=='_'||(LA10_161>='a' && LA10_161<='z')) ) {
                            alt10=74;
                        }
                        else {
                            alt10=39;}
                    }
                    else {
                        alt10=74;}
                }
                else {
                    alt10=74;}
                }
                break;
            default:
                alt10=74;}

        }
        else if ( (LA10_0=='.') ) {
            int LA10_12 = input.LA(2);

            if ( (LA10_12=='.') ) {
                alt10=36;
            }
            else {
                alt10=16;}
        }
        else if ( (LA10_0=='i') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                switch ( input.LA(3) ) {
                case 'v':
                    {
                    switch ( input.LA(4) ) {
                    case 'a':
                        {
                        int LA10_162 = input.LA(5);

                        if ( (LA10_162=='l') ) {
                            int LA10_200 = input.LA(6);

                            if ( (LA10_200=='i') ) {
                                int LA10_228 = input.LA(7);

                                if ( (LA10_228=='d') ) {
                                    int LA10_248 = input.LA(8);

                                    if ( ((LA10_248>='0' && LA10_248<='9')||(LA10_248>='A' && LA10_248<='Z')||LA10_248=='_'||(LA10_248>='a' && LA10_248<='z')) ) {
                                        alt10=74;
                                    }
                                    else {
                                        alt10=38;}
                                }
                                else {
                                    alt10=74;}
                            }
                            else {
                                alt10=74;}
                        }
                        else {
                            alt10=74;}
                        }
                        break;
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '_':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                        {
                        alt10=74;
                        }
                        break;
                    default:
                        alt10=24;}

                    }
                    break;
                case 'i':
                    {
                    int LA10_125 = input.LA(4);

                    if ( (LA10_125=='t') ) {
                        int LA10_164 = input.LA(5);

                        if ( ((LA10_164>='0' && LA10_164<='9')||(LA10_164>='A' && LA10_164<='Z')||LA10_164=='_'||(LA10_164>='a' && LA10_164<='z')) ) {
                            alt10=74;
                        }
                        else {
                            alt10=22;}
                    }
                    else {
                        alt10=74;}
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt10=74;
                    }
                    break;
                default:
                    alt10=50;}

                }
                break;
            case 'm':
                {
                int LA10_76 = input.LA(3);

                if ( (LA10_76=='p') ) {
                    switch ( input.LA(4) ) {
                    case 'o':
                        {
                        int LA10_165 = input.LA(5);

                        if ( (LA10_165=='r') ) {
                            int LA10_202 = input.LA(6);

                            if ( (LA10_202=='t') ) {
                                int LA10_229 = input.LA(7);

                                if ( ((LA10_229>='0' && LA10_229<='9')||(LA10_229>='A' && LA10_229<='Z')||LA10_229=='_'||(LA10_229>='a' && LA10_229<='z')) ) {
                                    alt10=74;
                                }
                                else {
                                    alt10=17;}
                            }
                            else {
                                alt10=74;}
                        }
                        else {
                            alt10=74;}
                        }
                        break;
                    case 'l':
                        {
                        int LA10_166 = input.LA(5);

                        if ( (LA10_166=='i') ) {
                            int LA10_203 = input.LA(6);

                            if ( (LA10_203=='e') ) {
                                int LA10_230 = input.LA(7);

                                if ( (LA10_230=='s') ) {
                                    int LA10_250 = input.LA(8);

                                    if ( ((LA10_250>='0' && LA10_250<='9')||(LA10_250>='A' && LA10_250<='Z')||LA10_250=='_'||(LA10_250>='a' && LA10_250<='z')) ) {
                                        alt10=74;
                                    }
                                    else {
                                        alt10=68;}
                                }
                                else {
                                    alt10=74;}
                            }
                            else {
                                alt10=74;}
                        }
                        else {
                            alt10=74;}
                        }
                        break;
                    default:
                        alt10=74;}

                }
                else {
                    alt10=74;}
                }
                break;
            case 'f':
                {
                int LA10_77 = input.LA(3);

                if ( ((LA10_77>='0' && LA10_77<='9')||(LA10_77>='A' && LA10_77<='Z')||LA10_77=='_'||(LA10_77>='a' && LA10_77<='z')) ) {
                    alt10=74;
                }
                else {
                    alt10=45;}
                }
                break;
            default:
                alt10=74;}

        }
        else if ( (LA10_0=='p') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA10_78 = input.LA(3);

                if ( (LA10_78=='s') ) {
                    int LA10_129 = input.LA(4);

                    if ( (LA10_129=='t') ) {
                        int LA10_167 = input.LA(5);

                        if ( ((LA10_167>='0' && LA10_167<='9')||(LA10_167>='A' && LA10_167<='Z')||LA10_167=='_'||(LA10_167>='a' && LA10_167<='z')) ) {
                            alt10=74;
                        }
                        else {
                            alt10=30;}
                    }
                    else {
                        alt10=74;}
                }
                else {
                    alt10=74;}
                }
                break;
            case 'a':
                {
                int LA10_79 = input.LA(3);

                if ( (LA10_79=='c') ) {
                    int LA10_130 = input.LA(4);

                    if ( (LA10_130=='k') ) {
                        int LA10_168 = input.LA(5);

                        if ( (LA10_168=='a') ) {
                            int LA10_205 = input.LA(6);

                            if ( (LA10_205=='g') ) {
                                int LA10_231 = input.LA(7);

                                if ( (LA10_231=='e') ) {
                                    int LA10_251 = input.LA(8);

                                    if ( ((LA10_251>='0' && LA10_251<='9')||(LA10_251>='A' && LA10_251<='Z')||LA10_251=='_'||(LA10_251>='a' && LA10_251<='z')) ) {
                                        alt10=74;
                                    }
                                    else {
                                        alt10=18;}
                                }
                                else {
                                    alt10=74;}
                            }
                            else {
                                alt10=74;}
                        }
                        else {
                            alt10=74;}
                    }
                    else {
                        alt10=74;}
                }
                else {
                    alt10=74;}
                }
                break;
            case 'r':
                {
                int LA10_80 = input.LA(3);

                if ( (LA10_80=='e') ) {
                    int LA10_131 = input.LA(4);

                    if ( ((LA10_131>='0' && LA10_131<='9')||(LA10_131>='A' && LA10_131<='Z')||LA10_131=='_'||(LA10_131>='a' && LA10_131<='z')) ) {
                        alt10=74;
                    }
                    else {
                        alt10=29;}
                }
                else {
                    alt10=74;}
                }
                break;
            default:
                alt10=74;}

        }
        else if ( (LA10_0=='c') ) {
            int LA10_15 = input.LA(2);

            if ( (LA10_15=='o') ) {
                int LA10_81 = input.LA(3);

                if ( (LA10_81=='n') ) {
                    int LA10_132 = input.LA(4);

                    if ( (LA10_132=='t') ) {
                        int LA10_170 = input.LA(5);

                        if ( (LA10_170=='e') ) {
                            int LA10_206 = input.LA(6);

                            if ( (LA10_206=='x') ) {
                                int LA10_232 = input.LA(7);

                                if ( (LA10_232=='t') ) {
                                    int LA10_252 = input.LA(8);

                                    if ( ((LA10_252>='0' && LA10_252<='9')||(LA10_252>='A' && LA10_252<='Z')||LA10_252=='_'||(LA10_252>='a' && LA10_252<='z')) ) {
                                        alt10=74;
                                    }
                                    else {
                                        alt10=20;}
                                }
                                else {
                                    alt10=74;}
                            }
                            else {
                                alt10=74;}
                        }
                        else {
                            alt10=74;}
                    }
                    else {
                        alt10=74;}
                }
                else {
                    alt10=74;}
            }
            else {
                alt10=74;}
        }
        else if ( (LA10_0==':') ) {
            int LA10_16 = input.LA(2);

            if ( (LA10_16==':') ) {
                alt10=33;
            }
            else {
                alt10=21;}
        }
        else if ( (LA10_0=='d') ) {
            int LA10_17 = input.LA(2);

            if ( (LA10_17=='e') ) {
                switch ( input.LA(3) ) {
                case 'f':
                    {
                    int LA10_133 = input.LA(4);

                    if ( ((LA10_133>='0' && LA10_133<='9')||(LA10_133>='A' && LA10_133<='Z')||LA10_133=='_'||(LA10_133>='a' && LA10_133<='z')) ) {
                        alt10=74;
                    }
                    else {
                        alt10=25;}
                    }
                    break;
                case 'r':
                    {
                    int LA10_134 = input.LA(4);

                    if ( (LA10_134=='i') ) {
                        int LA10_172 = input.LA(5);

                        if ( (LA10_172=='v') ) {
                            int LA10_207 = input.LA(6);

                            if ( (LA10_207=='e') ) {
                                int LA10_233 = input.LA(7);

                                if ( ((LA10_233>='0' && LA10_233<='9')||(LA10_233>='A' && LA10_233<='Z')||LA10_233=='_'||(LA10_233>='a' && LA10_233<='z')) ) {
                                    alt10=74;
                                }
                                else {
                                    alt10=23;}
                            }
                            else {
                                alt10=74;}
                        }
                        else {
                            alt10=74;}
                    }
                    else {
                        alt10=74;}
                    }
                    break;
                default:
                    alt10=74;}

            }
            else {
                alt10=74;}
        }
        else if ( (LA10_0=='(') ) {
            alt10=26;
        }
        else if ( (LA10_0==')') ) {
            alt10=27;
        }
        else if ( (LA10_0==',') ) {
            alt10=28;
        }
        else if ( (LA10_0=='b') ) {
            int LA10_21 = input.LA(2);

            if ( (LA10_21=='o') ) {
                int LA10_88 = input.LA(3);

                if ( (LA10_88=='d') ) {
                    int LA10_135 = input.LA(4);

                    if ( (LA10_135=='y') ) {
                        int LA10_173 = input.LA(5);

                        if ( ((LA10_173>='0' && LA10_173<='9')||(LA10_173>='A' && LA10_173<='Z')||LA10_173=='_'||(LA10_173>='a' && LA10_173<='z')) ) {
                            alt10=74;
                        }
                        else {
                            alt10=31;}
                    }
                    else {
                        alt10=74;}
                }
                else {
                    alt10=74;}
            }
            else {
                alt10=74;}
        }
        else if ( (LA10_0=='?') ) {
            alt10=32;
        }
        else if ( (LA10_0=='{') ) {
            alt10=34;
        }
        else if ( (LA10_0=='}') ) {
            alt10=35;
        }
        else if ( (LA10_0=='T') ) {
            int LA10_25 = input.LA(2);

            if ( (LA10_25=='u') ) {
                int LA10_92 = input.LA(3);

                if ( (LA10_92=='p') ) {
                    int LA10_136 = input.LA(4);

                    if ( (LA10_136=='l') ) {
                        int LA10_174 = input.LA(5);

                        if ( (LA10_174=='e') ) {
                            int LA10_209 = input.LA(6);

                            if ( ((LA10_209>='0' && LA10_209<='9')||(LA10_209>='A' && LA10_209<='Z')||LA10_209=='_'||(LA10_209>='a' && LA10_209<='z')) ) {
                                alt10=74;
                            }
                            else {
                                alt10=37;}
                        }
                        else {
                            alt10=74;}
                    }
                    else {
                        alt10=74;}
                }
                else {
                    alt10=74;}
            }
            else {
                alt10=74;}
        }
        else if ( (LA10_0=='|') ) {
            alt10=41;
        }
        else if ( (LA10_0==';') ) {
            alt10=42;
        }
        else if ( (LA10_0=='[') ) {
            alt10=43;
        }
        else if ( (LA10_0==']') ) {
            alt10=44;
        }
        else if ( (LA10_0=='t') ) {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA10_97 = input.LA(3);

                if ( (LA10_97=='u') ) {
                    int LA10_137 = input.LA(4);

                    if ( (LA10_137=='e') ) {
                        int LA10_175 = input.LA(5);

                        if ( ((LA10_175>='0' && LA10_175<='9')||(LA10_175>='A' && LA10_175<='Z')||LA10_175=='_'||(LA10_175>='a' && LA10_175<='z')) ) {
                            alt10=74;
                        }
                        else {
                            alt10=66;}
                    }
                    else {
                        alt10=74;}
                }
                else {
                    alt10=74;}
                }
                break;
            case 'h':
                {
                int LA10_98 = input.LA(3);

                if ( (LA10_98=='e') ) {
                    int LA10_138 = input.LA(4);

                    if ( (LA10_138=='n') ) {
                        int LA10_176 = input.LA(5);

                        if ( ((LA10_176>='0' && LA10_176<='9')||(LA10_176>='A' && LA10_176<='Z')||LA10_176=='_'||(LA10_176>='a' && LA10_176<='z')) ) {
                            alt10=74;
                        }
                        else {
                            alt10=46;}
                    }
                    else {
                        alt10=74;}
                }
                else {
                    alt10=74;}
                }
                break;
            default:
                alt10=74;}

        }
        else if ( (LA10_0=='l') ) {
            int LA10_31 = input.LA(2);

            if ( (LA10_31=='e') ) {
                int LA10_99 = input.LA(3);

                if ( (LA10_99=='t') ) {
                    int LA10_139 = input.LA(4);

                    if ( ((LA10_139>='0' && LA10_139<='9')||(LA10_139>='A' && LA10_139<='Z')||LA10_139=='_'||(LA10_139>='a' && LA10_139<='z')) ) {
                        alt10=74;
                    }
                    else {
                        alt10=49;}
                }
                else {
                    alt10=74;}
            }
            else {
                alt10=74;}
        }
        else if ( (LA10_0=='s') ) {
            switch ( input.LA(2) ) {
            case 't':
                {
                int LA10_100 = input.LA(3);

                if ( (LA10_100=='a') ) {
                    int LA10_140 = input.LA(4);

                    if ( (LA10_140=='t') ) {
                        int LA10_178 = input.LA(5);

                        if ( (LA10_178=='i') ) {
                            int LA10_212 = input.LA(6);

                            if ( (LA10_212=='c') ) {
                                int LA10_235 = input.LA(7);

                                if ( ((LA10_235>='0' && LA10_235<='9')||(LA10_235>='A' && LA10_235<='Z')||LA10_235=='_'||(LA10_235>='a' && LA10_235<='z')) ) {
                                    alt10=74;
                                }
                                else {
                                    alt10=51;}
                            }
                            else {
                                alt10=74;}
                        }
                        else {
                            alt10=74;}
                    }
                    else {
                        alt10=74;}
                }
                else {
                    alt10=74;}
                }
                break;
            case 'e':
                {
                int LA10_101 = input.LA(3);

                if ( (LA10_101=='l') ) {
                    int LA10_141 = input.LA(4);

                    if ( (LA10_141=='f') ) {
                        int LA10_179 = input.LA(5);

                        if ( ((LA10_179>='0' && LA10_179<='9')||(LA10_179>='A' && LA10_179<='Z')||LA10_179=='_'||(LA10_179>='a' && LA10_179<='z')) ) {
                            alt10=74;
                        }
                        else {
                            alt10=52;}
                    }
                    else {
                        alt10=74;}
                }
                else {
                    alt10=74;}
                }
                break;
            default:
                alt10=74;}

        }
        else if ( (LA10_0=='B') ) {
            switch ( input.LA(2) ) {
            case 'o':
                {
                int LA10_102 = input.LA(3);

                if ( (LA10_102=='o') ) {
                    int LA10_142 = input.LA(4);

                    if ( (LA10_142=='l') ) {
                        int LA10_180 = input.LA(5);

                        if ( (LA10_180=='e') ) {
                            int LA10_214 = input.LA(6);

                            if ( (LA10_214=='a') ) {
                                int LA10_236 = input.LA(7);

                                if ( (LA10_236=='n') ) {
                                    int LA10_255 = input.LA(8);

                                    if ( ((LA10_255>='0' && LA10_255<='9')||(LA10_255>='A' && LA10_255<='Z')||LA10_255=='_'||(LA10_255>='a' && LA10_255<='z')) ) {
                                        alt10=74;
                                    }
                                    else {
                                        alt10=53;}
                                }
                                else {
                                    alt10=74;}
                            }
                            else {
                                alt10=74;}
                        }
                        else {
                            alt10=74;}
                    }
                    else {
                        alt10=74;}
                }
                else {
                    alt10=74;}
                }
                break;
            case 'a':
                {
                int LA10_103 = input.LA(3);

                if ( (LA10_103=='g') ) {
                    int LA10_143 = input.LA(4);

                    if ( ((LA10_143>='0' && LA10_143<='9')||(LA10_143>='A' && LA10_143<='Z')||LA10_143=='_'||(LA10_143>='a' && LA10_143<='z')) ) {
                        alt10=74;
                    }
                    else {
                        alt10=62;}
                }
                else {
                    alt10=74;}
                }
                break;
            default:
                alt10=74;}

        }
        else if ( (LA10_0=='I') ) {
            int LA10_34 = input.LA(2);

            if ( (LA10_34=='n') ) {
                int LA10_104 = input.LA(3);

                if ( (LA10_104=='t') ) {
                    int LA10_144 = input.LA(4);

                    if ( (LA10_144=='e') ) {
                        int LA10_182 = input.LA(5);

                        if ( (LA10_182=='g') ) {
                            int LA10_215 = input.LA(6);

                            if ( (LA10_215=='e') ) {
                                int LA10_237 = input.LA(7);

                                if ( (LA10_237=='r') ) {
                                    int LA10_256 = input.LA(8);

                                    if ( ((LA10_256>='0' && LA10_256<='9')||(LA10_256>='A' && LA10_256<='Z')||LA10_256=='_'||(LA10_256>='a' && LA10_256<='z')) ) {
                                        alt10=74;
                                    }
                                    else {
                                        alt10=54;}
                                }
                                else {
                                    alt10=74;}
                            }
                            else {
                                alt10=74;}
                        }
                        else {
                            alt10=74;}
                    }
                    else {
                        alt10=74;}
                }
                else {
                    alt10=74;}
            }
            else {
                alt10=74;}
        }
        else if ( (LA10_0=='R') ) {
            int LA10_35 = input.LA(2);

            if ( (LA10_35=='e') ) {
                int LA10_105 = input.LA(3);

                if ( (LA10_105=='a') ) {
                    int LA10_145 = input.LA(4);

                    if ( (LA10_145=='l') ) {
                        int LA10_183 = input.LA(5);

                        if ( ((LA10_183>='0' && LA10_183<='9')||(LA10_183>='A' && LA10_183<='Z')||LA10_183=='_'||(LA10_183>='a' && LA10_183<='z')) ) {
                            alt10=74;
                        }
                        else {
                            alt10=55;}
                    }
                    else {
                        alt10=74;}
                }
                else {
                    alt10=74;}
            }
            else {
                alt10=74;}
        }
        else if ( (LA10_0=='S') ) {
            switch ( input.LA(2) ) {
            case 't':
                {
                int LA10_106 = input.LA(3);

                if ( (LA10_106=='r') ) {
                    int LA10_146 = input.LA(4);

                    if ( (LA10_146=='i') ) {
                        int LA10_184 = input.LA(5);

                        if ( (LA10_184=='n') ) {
                            int LA10_217 = input.LA(6);

                            if ( (LA10_217=='g') ) {
                                int LA10_238 = input.LA(7);

                                if ( ((LA10_238>='0' && LA10_238<='9')||(LA10_238>='A' && LA10_238<='Z')||LA10_238=='_'||(LA10_238>='a' && LA10_238<='z')) ) {
                                    alt10=74;
                                }
                                else {
                                    alt10=56;}
                            }
                            else {
                                alt10=74;}
                        }
                        else {
                            alt10=74;}
                    }
                    else {
                        alt10=74;}
                }
                else {
                    alt10=74;}
                }
                break;
            case 'e':
                {
                switch ( input.LA(3) ) {
                case 'q':
                    {
                    int LA10_147 = input.LA(4);

                    if ( (LA10_147=='u') ) {
                        int LA10_185 = input.LA(5);

                        if ( (LA10_185=='e') ) {
                            int LA10_218 = input.LA(6);

                            if ( (LA10_218=='n') ) {
                                int LA10_239 = input.LA(7);

                                if ( (LA10_239=='c') ) {
                                    int LA10_258 = input.LA(8);

                                    if ( (LA10_258=='e') ) {
                                        int LA10_272 = input.LA(9);

                                        if ( ((LA10_272>='0' && LA10_272<='9')||(LA10_272>='A' && LA10_272<='Z')||LA10_272=='_'||(LA10_272>='a' && LA10_272<='z')) ) {
                                            alt10=74;
                                        }
                                        else {
                                            alt10=63;}
                                    }
                                    else {
                                        alt10=74;}
                                }
                                else {
                                    alt10=74;}
                            }
                            else {
                                alt10=74;}
                        }
                        else {
                            alt10=74;}
                    }
                    else {
                        alt10=74;}
                    }
                    break;
                case 't':
                    {
                    int LA10_148 = input.LA(4);

                    if ( ((LA10_148>='0' && LA10_148<='9')||(LA10_148>='A' && LA10_148<='Z')||LA10_148=='_'||(LA10_148>='a' && LA10_148<='z')) ) {
                        alt10=74;
                    }
                    else {
                        alt10=61;}
                    }
                    break;
                default:
                    alt10=74;}

                }
                break;
            default:
                alt10=74;}

        }
        else if ( (LA10_0=='U') ) {
            int LA10_37 = input.LA(2);

            if ( (LA10_37=='n') ) {
                int LA10_108 = input.LA(3);

                if ( (LA10_108=='l') ) {
                    int LA10_149 = input.LA(4);

                    if ( (LA10_149=='i') ) {
                        int LA10_187 = input.LA(5);

                        if ( (LA10_187=='m') ) {
                            int LA10_219 = input.LA(6);

                            if ( (LA10_219=='i') ) {
                                int LA10_240 = input.LA(7);

                                if ( (LA10_240=='t') ) {
                                    int LA10_259 = input.LA(8);

                                    if ( (LA10_259=='e') ) {
                                        int LA10_273 = input.LA(9);

                                        if ( (LA10_273=='d') ) {
                                            int LA10_280 = input.LA(10);

                                            if ( (LA10_280=='N') ) {
                                                int LA10_285 = input.LA(11);

                                                if ( (LA10_285=='a') ) {
                                                    int LA10_290 = input.LA(12);

                                                    if ( (LA10_290=='t') ) {
                                                        int LA10_294 = input.LA(13);

                                                        if ( (LA10_294=='u') ) {
                                                            int LA10_295 = input.LA(14);

                                                            if ( (LA10_295=='r') ) {
                                                                int LA10_296 = input.LA(15);

                                                                if ( (LA10_296=='a') ) {
                                                                    int LA10_297 = input.LA(16);

                                                                    if ( (LA10_297=='l') ) {
                                                                        int LA10_298 = input.LA(17);

                                                                        if ( ((LA10_298>='0' && LA10_298<='9')||(LA10_298>='A' && LA10_298<='Z')||LA10_298=='_'||(LA10_298>='a' && LA10_298<='z')) ) {
                                                                            alt10=74;
                                                                        }
                                                                        else {
                                                                            alt10=57;}
                                                                    }
                                                                    else {
                                                                        alt10=74;}
                                                                }
                                                                else {
                                                                    alt10=74;}
                                                            }
                                                            else {
                                                                alt10=74;}
                                                        }
                                                        else {
                                                            alt10=74;}
                                                    }
                                                    else {
                                                        alt10=74;}
                                                }
                                                else {
                                                    alt10=74;}
                                            }
                                            else {
                                                alt10=74;}
                                        }
                                        else {
                                            alt10=74;}
                                    }
                                    else {
                                        alt10=74;}
                                }
                                else {
                                    alt10=74;}
                            }
                            else {
                                alt10=74;}
                        }
                        else {
                            alt10=74;}
                    }
                    else {
                        alt10=74;}
                }
                else {
                    alt10=74;}
            }
            else {
                alt10=74;}
        }
        else if ( (LA10_0=='O') ) {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA10_109 = input.LA(3);

                if ( (LA10_109=='d') ) {
                    int LA10_150 = input.LA(4);

                    if ( (LA10_150=='e') ) {
                        int LA10_188 = input.LA(5);

                        if ( (LA10_188=='r') ) {
                            int LA10_220 = input.LA(6);

                            if ( (LA10_220=='e') ) {
                                int LA10_241 = input.LA(7);

                                if ( (LA10_241=='d') ) {
                                    int LA10_260 = input.LA(8);

                                    if ( (LA10_260=='S') ) {
                                        int LA10_274 = input.LA(9);

                                        if ( (LA10_274=='e') ) {
                                            int LA10_281 = input.LA(10);

                                            if ( (LA10_281=='t') ) {
                                                int LA10_286 = input.LA(11);

                                                if ( ((LA10_286>='0' && LA10_286<='9')||(LA10_286>='A' && LA10_286<='Z')||LA10_286=='_'||(LA10_286>='a' && LA10_286<='z')) ) {
                                                    alt10=74;
                                                }
                                                else {
                                                    alt10=65;}
                                            }
                                            else {
                                                alt10=74;}
                                        }
                                        else {
                                            alt10=74;}
                                    }
                                    else {
                                        alt10=74;}
                                }
                                else {
                                    alt10=74;}
                            }
                            else {
                                alt10=74;}
                        }
                        else {
                            alt10=74;}
                    }
                    else {
                        alt10=74;}
                }
                else {
                    alt10=74;}
                }
                break;
            case 'c':
                {
                int LA10_110 = input.LA(3);

                if ( (LA10_110=='l') ) {
                    switch ( input.LA(4) ) {
                    case 'I':
                        {
                        int LA10_189 = input.LA(5);

                        if ( (LA10_189=='n') ) {
                            int LA10_221 = input.LA(6);

                            if ( (LA10_221=='v') ) {
                                int LA10_242 = input.LA(7);

                                if ( (LA10_242=='a') ) {
                                    int LA10_261 = input.LA(8);

                                    if ( (LA10_261=='l') ) {
                                        int LA10_275 = input.LA(9);

                                        if ( (LA10_275=='i') ) {
                                            int LA10_282 = input.LA(10);

                                            if ( (LA10_282=='d') ) {
                                                int LA10_287 = input.LA(11);

                                                if ( ((LA10_287>='0' && LA10_287<='9')||(LA10_287>='A' && LA10_287<='Z')||LA10_287=='_'||(LA10_287>='a' && LA10_287<='z')) ) {
                                                    alt10=74;
                                                }
                                                else {
                                                    alt10=59;}
                                            }
                                            else {
                                                alt10=74;}
                                        }
                                        else {
                                            alt10=74;}
                                    }
                                    else {
                                        alt10=74;}
                                }
                                else {
                                    alt10=74;}
                            }
                            else {
                                alt10=74;}
                        }
                        else {
                            alt10=74;}
                        }
                        break;
                    case 'V':
                        {
                        int LA10_190 = input.LA(5);

                        if ( (LA10_190=='o') ) {
                            int LA10_222 = input.LA(6);

                            if ( (LA10_222=='i') ) {
                                int LA10_243 = input.LA(7);

                                if ( (LA10_243=='d') ) {
                                    int LA10_262 = input.LA(8);

                                    if ( ((LA10_262>='0' && LA10_262<='9')||(LA10_262>='A' && LA10_262<='Z')||LA10_262=='_'||(LA10_262>='a' && LA10_262<='z')) ) {
                                        alt10=74;
                                    }
                                    else {
                                        alt10=60;}
                                }
                                else {
                                    alt10=74;}
                            }
                            else {
                                alt10=74;}
                        }
                        else {
                            alt10=74;}
                        }
                        break;
                    case 'A':
                        {
                        int LA10_191 = input.LA(5);

                        if ( (LA10_191=='n') ) {
                            int LA10_223 = input.LA(6);

                            if ( (LA10_223=='y') ) {
                                int LA10_244 = input.LA(7);

                                if ( ((LA10_244>='0' && LA10_244<='9')||(LA10_244>='A' && LA10_244<='Z')||LA10_244=='_'||(LA10_244>='a' && LA10_244<='z')) ) {
                                    alt10=74;
                                }
                                else {
                                    alt10=58;}
                            }
                            else {
                                alt10=74;}
                        }
                        else {
                            alt10=74;}
                        }
                        break;
                    default:
                        alt10=74;}

                }
                else {
                    alt10=74;}
                }
                break;
            default:
                alt10=74;}

        }
        else if ( (LA10_0=='C') ) {
            int LA10_39 = input.LA(2);

            if ( (LA10_39=='o') ) {
                int LA10_111 = input.LA(3);

                if ( (LA10_111=='l') ) {
                    int LA10_152 = input.LA(4);

                    if ( (LA10_152=='l') ) {
                        int LA10_192 = input.LA(5);

                        if ( (LA10_192=='e') ) {
                            int LA10_224 = input.LA(6);

                            if ( (LA10_224=='c') ) {
                                int LA10_245 = input.LA(7);

                                if ( (LA10_245=='t') ) {
                                    int LA10_264 = input.LA(8);

                                    if ( (LA10_264=='i') ) {
                                        int LA10_277 = input.LA(9);

                                        if ( (LA10_277=='o') ) {
                                            int LA10_283 = input.LA(10);

                                            if ( (LA10_283=='n') ) {
                                                int LA10_288 = input.LA(11);

                                                if ( ((LA10_288>='0' && LA10_288<='9')||(LA10_288>='A' && LA10_288<='Z')||LA10_288=='_'||(LA10_288>='a' && LA10_288<='z')) ) {
                                                    alt10=74;
                                                }
                                                else {
                                                    alt10=64;}
                                            }
                                            else {
                                                alt10=74;}
                                        }
                                        else {
                                            alt10=74;}
                                    }
                                    else {
                                        alt10=74;}
                                }
                                else {
                                    alt10=74;}
                            }
                            else {
                                alt10=74;}
                        }
                        else {
                            alt10=74;}
                    }
                    else {
                        alt10=74;}
                }
                else {
                    alt10=74;}
            }
            else {
                alt10=74;}
        }
        else if ( (LA10_0=='f') ) {
            int LA10_40 = input.LA(2);

            if ( (LA10_40=='a') ) {
                int LA10_112 = input.LA(3);

                if ( (LA10_112=='l') ) {
                    int LA10_153 = input.LA(4);

                    if ( (LA10_153=='s') ) {
                        int LA10_193 = input.LA(5);

                        if ( (LA10_193=='e') ) {
                            int LA10_225 = input.LA(6);

                            if ( ((LA10_225>='0' && LA10_225<='9')||(LA10_225>='A' && LA10_225<='Z')||LA10_225=='_'||(LA10_225>='a' && LA10_225<='z')) ) {
                                alt10=74;
                            }
                            else {
                                alt10=67;}
                        }
                        else {
                            alt10=74;}
                    }
                    else {
                        alt10=74;}
                }
                else {
                    alt10=74;}
            }
            else {
                alt10=74;}
        }
        else if ( (LA10_0=='x') ) {
            int LA10_41 = input.LA(2);

            if ( (LA10_41=='o') ) {
                int LA10_113 = input.LA(3);

                if ( (LA10_113=='r') ) {
                    int LA10_154 = input.LA(4);

                    if ( ((LA10_154>='0' && LA10_154<='9')||(LA10_154>='A' && LA10_154<='Z')||LA10_154=='_'||(LA10_154>='a' && LA10_154<='z')) ) {
                        alt10=74;
                    }
                    else {
                        alt10=69;}
                }
                else {
                    alt10=74;}
            }
            else {
                alt10=74;}
        }
        else if ( (LA10_0=='o') ) {
            int LA10_42 = input.LA(2);

            if ( (LA10_42=='r') ) {
                int LA10_114 = input.LA(3);

                if ( ((LA10_114>='0' && LA10_114<='9')||(LA10_114>='A' && LA10_114<='Z')||LA10_114=='_'||(LA10_114>='a' && LA10_114<='z')) ) {
                    alt10=74;
                }
                else {
                    alt10=70;}
            }
            else {
                alt10=74;}
        }
        else if ( (LA10_0=='a') ) {
            int LA10_43 = input.LA(2);

            if ( (LA10_43=='n') ) {
                int LA10_115 = input.LA(3);

                if ( (LA10_115=='d') ) {
                    int LA10_156 = input.LA(4);

                    if ( ((LA10_156>='0' && LA10_156<='9')||(LA10_156>='A' && LA10_156<='Z')||LA10_156=='_'||(LA10_156>='a' && LA10_156<='z')) ) {
                        alt10=74;
                    }
                    else {
                        alt10=71;}
                }
                else {
                    alt10=74;}
            }
            else {
                alt10=74;}
        }
        else if ( (LA10_0=='@') ) {
            int LA10_44 = input.LA(2);

            if ( (LA10_44=='p') ) {
                alt10=72;
            }
            else {
                alt10=79;}
        }
        else if ( (LA10_0=='\'') ) {
            int LA10_45 = input.LA(2);

            if ( ((LA10_45>='\u0000' && LA10_45<='\uFFFE')) ) {
                alt10=73;
            }
            else {
                alt10=79;}
        }
        else if ( (LA10_0=='_') ) {
            alt10=74;
        }
        else if ( (LA10_0=='A'||LA10_0=='D'||(LA10_0>='F' && LA10_0<='H')||(LA10_0>='J' && LA10_0<='N')||(LA10_0>='P' && LA10_0<='Q')||(LA10_0>='V' && LA10_0<='Z')||(LA10_0>='g' && LA10_0<='h')||(LA10_0>='j' && LA10_0<='k')||LA10_0=='m'||(LA10_0>='q' && LA10_0<='r')||(LA10_0>='u' && LA10_0<='w')||(LA10_0>='y' && LA10_0<='z')) ) {
            alt10=74;
        }
        else if ( ((LA10_0>='0' && LA10_0<='9')) ) {
            alt10=75;
        }
        else if ( ((LA10_0>='\t' && LA10_0<='\n')||LA10_0=='\r'||LA10_0==' ') ) {
            alt10=78;
        }
        else if ( ((LA10_0>='\u0000' && LA10_0<='\b')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\u001F')||(LA10_0>='!' && LA10_0<='&')||LA10_0=='\\'||LA10_0=='`'||(LA10_0>='~' && LA10_0<='\uFFFE')) ) {
            alt10=79;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | RULE_STRING_LITERAL | RULE_ID | RULE_INT | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 10, 0, input);

            throw nvae;
        }
        switch (alt10) {
            case 1 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:78: T28
                {
                mT28(); 

                }
                break;
            case 19 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:82: T29
                {
                mT29(); 

                }
                break;
            case 20 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:86: T30
                {
                mT30(); 

                }
                break;
            case 21 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:90: T31
                {
                mT31(); 

                }
                break;
            case 22 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:94: T32
                {
                mT32(); 

                }
                break;
            case 23 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:98: T33
                {
                mT33(); 

                }
                break;
            case 24 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:102: T34
                {
                mT34(); 

                }
                break;
            case 25 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:106: T35
                {
                mT35(); 

                }
                break;
            case 26 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:110: T36
                {
                mT36(); 

                }
                break;
            case 27 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:114: T37
                {
                mT37(); 

                }
                break;
            case 28 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:118: T38
                {
                mT38(); 

                }
                break;
            case 29 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:122: T39
                {
                mT39(); 

                }
                break;
            case 30 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:126: T40
                {
                mT40(); 

                }
                break;
            case 31 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:130: T41
                {
                mT41(); 

                }
                break;
            case 32 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:134: T42
                {
                mT42(); 

                }
                break;
            case 33 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:138: T43
                {
                mT43(); 

                }
                break;
            case 34 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:142: T44
                {
                mT44(); 

                }
                break;
            case 35 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:146: T45
                {
                mT45(); 

                }
                break;
            case 36 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:150: T46
                {
                mT46(); 

                }
                break;
            case 37 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:154: T47
                {
                mT47(); 

                }
                break;
            case 38 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:158: T48
                {
                mT48(); 

                }
                break;
            case 39 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:162: T49
                {
                mT49(); 

                }
                break;
            case 40 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:166: T50
                {
                mT50(); 

                }
                break;
            case 41 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:170: T51
                {
                mT51(); 

                }
                break;
            case 42 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:174: T52
                {
                mT52(); 

                }
                break;
            case 43 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:178: T53
                {
                mT53(); 

                }
                break;
            case 44 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:182: T54
                {
                mT54(); 

                }
                break;
            case 45 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:186: T55
                {
                mT55(); 

                }
                break;
            case 46 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:190: T56
                {
                mT56(); 

                }
                break;
            case 47 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:194: T57
                {
                mT57(); 

                }
                break;
            case 48 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:198: T58
                {
                mT58(); 

                }
                break;
            case 49 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:202: T59
                {
                mT59(); 

                }
                break;
            case 50 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:206: T60
                {
                mT60(); 

                }
                break;
            case 51 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:210: T61
                {
                mT61(); 

                }
                break;
            case 52 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:214: T62
                {
                mT62(); 

                }
                break;
            case 53 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:218: T63
                {
                mT63(); 

                }
                break;
            case 54 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:222: T64
                {
                mT64(); 

                }
                break;
            case 55 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:226: T65
                {
                mT65(); 

                }
                break;
            case 56 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:230: T66
                {
                mT66(); 

                }
                break;
            case 57 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:234: T67
                {
                mT67(); 

                }
                break;
            case 58 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:238: T68
                {
                mT68(); 

                }
                break;
            case 59 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:242: T69
                {
                mT69(); 

                }
                break;
            case 60 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:246: T70
                {
                mT70(); 

                }
                break;
            case 61 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:250: T71
                {
                mT71(); 

                }
                break;
            case 62 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:254: T72
                {
                mT72(); 

                }
                break;
            case 63 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:258: T73
                {
                mT73(); 

                }
                break;
            case 64 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:262: T74
                {
                mT74(); 

                }
                break;
            case 65 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:266: T75
                {
                mT75(); 

                }
                break;
            case 66 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:270: T76
                {
                mT76(); 

                }
                break;
            case 67 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:274: T77
                {
                mT77(); 

                }
                break;
            case 68 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:278: T78
                {
                mT78(); 

                }
                break;
            case 69 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:282: T79
                {
                mT79(); 

                }
                break;
            case 70 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:286: T80
                {
                mT80(); 

                }
                break;
            case 71 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:290: T81
                {
                mT81(); 

                }
                break;
            case 72 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:294: T82
                {
                mT82(); 

                }
                break;
            case 73 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:298: RULE_STRING_LITERAL
                {
                mRULE_STRING_LITERAL(); 

                }
                break;
            case 74 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:318: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 75 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:326: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 76 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:335: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 77 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:351: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 78 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:367: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 79 :
                // ../org.eclipse.ocl.examples.xtext.completeocl.ui/src-gen/org/eclipse/ocl/examples/xtext/completeocl/ui/contentassist/antlr/internal/InternalCompleteOCL.g:1:375: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}