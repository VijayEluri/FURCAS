// $ANTLR 3.1.1 C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g 2010-03-19 11:54:32

package generated;
import com.sap.mi.textual.grammar.antlr3.ANTLR3LocationToken;
import com.sap.mi.textual.common.interfaces.IModelElementProxy;
import com.sap.mi.textual.grammar.impl.PredicateSemantic;
import com.sap.mi.textual.moinlookup.util.RuleNameFinder;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import com.sap.mi.textual.grammar.impl.ObservableInjectingParser;
import org.antlr.runtime.Token;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class MofClassParser extends ObservableInjectingParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NAME", "STRING", "QNAME", "MULTI_LINE_COMMENT", "INT", "FLOAT", "BOOL", "LCURL", "RCURL", "LPAREN", "RPAREN", "DDOT", "STAR", "LBRACKET", "RBRACKET", "LBRACK_LCURL", "RCURL_RBRACK", "LCURL_LBRACK", "RBRACK_RCURL", "COLON", "DCOLON", "COMMENT", "NL", "WS", "DIGIT", "ALPHA", "SNAME", "RANGE_OR_INT", "'let'", "'OrderedSet'", "'referencedEnd'", "'Sequence'", "'static'", "'private'", "'Collection'", "'ref'", "','", "'iterate'", "'='", "'extends'", "'public'", "'Bag'", "'Set'", "'->'", "'protected'", "';'", "'readonly'", "'invariants'", "'if'", "'self'", "'in'", "'else'", "'abstract'", "'.'", "'endif'", "'class'", "'|'", "'then'"
    };
    public static final int STAR=16;
    public static final int RBRACK_RCURL=22;
    public static final int FLOAT=9;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int LPAREN=13;
    public static final int LBRACKET=17;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int RPAREN=14;
    public static final int T__57=57;
    public static final int DCOLON=24;
    public static final int T__58=58;
    public static final int NAME=4;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int LBRACK_LCURL=19;
    public static final int DIGIT=28;
    public static final int NL=26;
    public static final int RANGE_OR_INT=31;
    public static final int RBRACKET=18;
    public static final int COMMENT=25;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int RCURL_RBRACK=20;
    public static final int T__43=43;
    public static final int LCURL_LBRACK=21;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int DDOT=15;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int BOOL=10;
    public static final int INT=8;
    public static final int MULTI_LINE_COMMENT=7;
    public static final int ALPHA=29;
    public static final int COLON=23;
    public static final int T__32=32;
    public static final int LCURL=11;
    public static final int WS=27;
    public static final int T__33=33;
    public static final int QNAME=6;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int SNAME=30;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RCURL=12;
    public static final int STRING=5;

    // delegates
    // delegators


        public MofClassParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public MofClassParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return MofClassParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g"; }


       private static final String syntaxUUID = "E009322EC90F0910334511DFAAC7EC660A0001C5";
       public String getSyntaxUUID() {
            return syntaxUUID;
       }
       /**
         * Unescape string.
         * 
         * @param s the s
         * @param delimLength the delim length
         * 
         * @return the string
         */
        public String unescapeString(String s) {
            StringBuilder ret = new StringBuilder();
            // get rid of the starting and ending delimiters (e.g., '\'', '"')
           int delimLength = 1; // for delimLength > 0, the following code needs to change
           if (s.charAt(0) == '\'' && s.charAt(s.length()-delimLength) == '\'' || s.charAt(0) == '\"' && s.charAt(s.length()-delimLength) == '\"') {
                    s = s.substring(delimLength, s.length()-(delimLength * 2 - 1));
            }
            
            CharacterIterator ci = new StringCharacterIterator(s);
            char c = ci.first();
            while(c != CharacterIterator.DONE) {
                char tc = 0;
                switch(c) {
                case '\\':
                    c = ci.next();
                    switch(c) {
                    case 'n':
                        tc = '\n';
                        break;
                    case 'r':
                        tc = '\r';
                        break;
                    case 't':
                        tc = '\t';
                        break;
                    case 'b':
                        tc = '\b';
                        break;
                    case 'f':
                        tc = '\f';
                        break;
                    case '"':
                        tc = '"';
                        break;
                    case '\'':
                        tc = '\'';
                        break;
                    case '\\':
                        tc = '\\';
                        break;
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                        throw new RuntimeException("octal escape sequences not supported yet");
                    default:
                        throw new RuntimeException("unknown escape sequence: '\\" + c + "'");
                    }
                    break;
                default:
                    tc = c;
                    break;
                }
                ret.append(tc);
                c = ci.next();
            }
            return ret.toString();
        }




    // $ANTLR start "identifier"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:207:1: identifier returns [Object ret2] : (ast= NAME ) ;
    public final Object identifier() throws RecognitionException {
        Object ret2 = null;

        Token ast=null;

        java.lang.Object ret=null;
        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:208:3: ( (ast= NAME ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:209:3: (ast= NAME )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:209:3: (ast= NAME )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:209:4: ast= NAME
            {
            ast=(Token)match(input,NAME,FOLLOW_NAME_in_identifier63); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              ret = unescapeString( ast.getText());

            }

            }

            if ( state.backtracking==0 ) {

              ret2=ret;

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "identifier"


    // $ANTLR start "identifierOrKeyword"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:217:1: identifierOrKeyword returns [Object ret2] : (ast= NAME | 'let' | 'OrderedSet' | 'referencedEnd' | 'Sequence' | 'static' | 'private' | 'Collection' | 'ref' | ',' | 'iterate' | '=' | 'extends' | 'public' | 'Bag' | 'Set' | '->' | 'protected' | ';' | 'readonly' | 'invariants' | 'if' | 'self' | 'in' | 'else' | 'abstract' | '.' | 'endif' | 'class' | '|' | 'then' ) ;
    public final Object identifierOrKeyword() throws RecognitionException {
        Object ret2 = null;

        Token ast=null;

        java.lang.Object ret=null;
        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:218:3: ( (ast= NAME | 'let' | 'OrderedSet' | 'referencedEnd' | 'Sequence' | 'static' | 'private' | 'Collection' | 'ref' | ',' | 'iterate' | '=' | 'extends' | 'public' | 'Bag' | 'Set' | '->' | 'protected' | ';' | 'readonly' | 'invariants' | 'if' | 'self' | 'in' | 'else' | 'abstract' | '.' | 'endif' | 'class' | '|' | 'then' ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:219:3: (ast= NAME | 'let' | 'OrderedSet' | 'referencedEnd' | 'Sequence' | 'static' | 'private' | 'Collection' | 'ref' | ',' | 'iterate' | '=' | 'extends' | 'public' | 'Bag' | 'Set' | '->' | 'protected' | ';' | 'readonly' | 'invariants' | 'if' | 'self' | 'in' | 'else' | 'abstract' | '.' | 'endif' | 'class' | '|' | 'then' )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:219:3: (ast= NAME | 'let' | 'OrderedSet' | 'referencedEnd' | 'Sequence' | 'static' | 'private' | 'Collection' | 'ref' | ',' | 'iterate' | '=' | 'extends' | 'public' | 'Bag' | 'Set' | '->' | 'protected' | ';' | 'readonly' | 'invariants' | 'if' | 'self' | 'in' | 'else' | 'abstract' | '.' | 'endif' | 'class' | '|' | 'then' )
            int alt1=31;
            switch ( input.LA(1) ) {
            case NAME:
                {
                alt1=1;
                }
                break;
            case 32:
                {
                alt1=2;
                }
                break;
            case 33:
                {
                alt1=3;
                }
                break;
            case 34:
                {
                alt1=4;
                }
                break;
            case 35:
                {
                alt1=5;
                }
                break;
            case 36:
                {
                alt1=6;
                }
                break;
            case 37:
                {
                alt1=7;
                }
                break;
            case 38:
                {
                alt1=8;
                }
                break;
            case 39:
                {
                alt1=9;
                }
                break;
            case 40:
                {
                alt1=10;
                }
                break;
            case 41:
                {
                alt1=11;
                }
                break;
            case 42:
                {
                alt1=12;
                }
                break;
            case 43:
                {
                alt1=13;
                }
                break;
            case 44:
                {
                alt1=14;
                }
                break;
            case 45:
                {
                alt1=15;
                }
                break;
            case 46:
                {
                alt1=16;
                }
                break;
            case 47:
                {
                alt1=17;
                }
                break;
            case 48:
                {
                alt1=18;
                }
                break;
            case 49:
                {
                alt1=19;
                }
                break;
            case 50:
                {
                alt1=20;
                }
                break;
            case 51:
                {
                alt1=21;
                }
                break;
            case 52:
                {
                alt1=22;
                }
                break;
            case 53:
                {
                alt1=23;
                }
                break;
            case 54:
                {
                alt1=24;
                }
                break;
            case 55:
                {
                alt1=25;
                }
                break;
            case 56:
                {
                alt1=26;
                }
                break;
            case 57:
                {
                alt1=27;
                }
                break;
            case 58:
                {
                alt1=28;
                }
                break;
            case 59:
                {
                alt1=29;
                }
                break;
            case 60:
                {
                alt1=30;
                }
                break;
            case 61:
                {
                alt1=31;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ret2;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:219:4: ast= NAME
                    {
                    ast=(Token)match(input,NAME,FOLLOW_NAME_in_identifierOrKeyword94); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      ret = unescapeString( ast.getText());

                    }

                    }
                    break;
                case 2 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:221:5: 'let'
                    {
                    match(input,32,FOLLOW_32_in_identifierOrKeyword102); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      ret = "let";
                    }

                    }
                    break;
                case 3 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:222:5: 'OrderedSet'
                    {
                    match(input,33,FOLLOW_33_in_identifierOrKeyword110); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      ret = "OrderedSet";
                    }

                    }
                    break;
                case 4 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:223:5: 'referencedEnd'
                    {
                    match(input,34,FOLLOW_34_in_identifierOrKeyword118); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      ret = "referencedEnd";
                    }

                    }
                    break;
                case 5 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:224:5: 'Sequence'
                    {
                    match(input,35,FOLLOW_35_in_identifierOrKeyword126); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      ret = "Sequence";
                    }

                    }
                    break;
                case 6 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:225:5: 'static'
                    {
                    match(input,36,FOLLOW_36_in_identifierOrKeyword134); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      ret = "static";
                    }

                    }
                    break;
                case 7 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:226:5: 'private'
                    {
                    match(input,37,FOLLOW_37_in_identifierOrKeyword142); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      ret = "private";
                    }

                    }
                    break;
                case 8 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:227:5: 'Collection'
                    {
                    match(input,38,FOLLOW_38_in_identifierOrKeyword150); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      ret = "Collection";
                    }

                    }
                    break;
                case 9 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:228:5: 'ref'
                    {
                    match(input,39,FOLLOW_39_in_identifierOrKeyword158); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      ret = "ref";
                    }

                    }
                    break;
                case 10 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:229:5: ','
                    {
                    match(input,40,FOLLOW_40_in_identifierOrKeyword166); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      ret = ",";
                    }

                    }
                    break;
                case 11 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:230:5: 'iterate'
                    {
                    match(input,41,FOLLOW_41_in_identifierOrKeyword174); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      ret = "iterate";
                    }

                    }
                    break;
                case 12 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:231:5: '='
                    {
                    match(input,42,FOLLOW_42_in_identifierOrKeyword182); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      ret = "=";
                    }

                    }
                    break;
                case 13 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:232:5: 'extends'
                    {
                    match(input,43,FOLLOW_43_in_identifierOrKeyword190); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      ret = "extends";
                    }

                    }
                    break;
                case 14 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:233:5: 'public'
                    {
                    match(input,44,FOLLOW_44_in_identifierOrKeyword198); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      ret = "public";
                    }

                    }
                    break;
                case 15 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:234:5: 'Bag'
                    {
                    match(input,45,FOLLOW_45_in_identifierOrKeyword206); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      ret = "Bag";
                    }

                    }
                    break;
                case 16 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:235:5: 'Set'
                    {
                    match(input,46,FOLLOW_46_in_identifierOrKeyword214); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      ret = "Set";
                    }

                    }
                    break;
                case 17 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:236:5: '->'
                    {
                    match(input,47,FOLLOW_47_in_identifierOrKeyword222); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      ret = "->";
                    }

                    }
                    break;
                case 18 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:237:5: 'protected'
                    {
                    match(input,48,FOLLOW_48_in_identifierOrKeyword230); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      ret = "protected";
                    }

                    }
                    break;
                case 19 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:238:5: ';'
                    {
                    match(input,49,FOLLOW_49_in_identifierOrKeyword238); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      ret = ";";
                    }

                    }
                    break;
                case 20 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:239:5: 'readonly'
                    {
                    match(input,50,FOLLOW_50_in_identifierOrKeyword246); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      ret = "readonly";
                    }

                    }
                    break;
                case 21 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:240:5: 'invariants'
                    {
                    match(input,51,FOLLOW_51_in_identifierOrKeyword254); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      ret = "invariants";
                    }

                    }
                    break;
                case 22 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:241:5: 'if'
                    {
                    match(input,52,FOLLOW_52_in_identifierOrKeyword262); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      ret = "if";
                    }

                    }
                    break;
                case 23 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:242:5: 'self'
                    {
                    match(input,53,FOLLOW_53_in_identifierOrKeyword270); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      ret = "self";
                    }

                    }
                    break;
                case 24 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:243:5: 'in'
                    {
                    match(input,54,FOLLOW_54_in_identifierOrKeyword278); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      ret = "in";
                    }

                    }
                    break;
                case 25 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:244:5: 'else'
                    {
                    match(input,55,FOLLOW_55_in_identifierOrKeyword286); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      ret = "else";
                    }

                    }
                    break;
                case 26 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:245:5: 'abstract'
                    {
                    match(input,56,FOLLOW_56_in_identifierOrKeyword294); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      ret = "abstract";
                    }

                    }
                    break;
                case 27 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:246:5: '.'
                    {
                    match(input,57,FOLLOW_57_in_identifierOrKeyword302); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      ret = ".";
                    }

                    }
                    break;
                case 28 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:247:5: 'endif'
                    {
                    match(input,58,FOLLOW_58_in_identifierOrKeyword310); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      ret = "endif";
                    }

                    }
                    break;
                case 29 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:248:5: 'class'
                    {
                    match(input,59,FOLLOW_59_in_identifierOrKeyword318); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      ret = "class";
                    }

                    }
                    break;
                case 30 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:249:5: '|'
                    {
                    match(input,60,FOLLOW_60_in_identifierOrKeyword326); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      ret = "|";
                    }

                    }
                    break;
                case 31 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:250:5: 'then'
                    {
                    match(input,61,FOLLOW_61_in_identifierOrKeyword334); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      ret = "then";
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              ret2=ret;

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "identifierOrKeyword"


    // $ANTLR start "stringSymbol"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:257:1: stringSymbol returns [Object ret2] : (ast= STRING ) ;
    public final Object stringSymbol() throws RecognitionException {
        Object ret2 = null;

        Token ast=null;

        java.lang.Object ret=null;
        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:258:3: ( (ast= STRING ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:259:3: (ast= STRING )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:259:3: (ast= STRING )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:259:4: ast= STRING
            {
            ast=(Token)match(input,STRING,FOLLOW_STRING_in_stringSymbol365); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              ret = unescapeString( ast.getText());

            }

            }

            if ( state.backtracking==0 ) {

              ret2=ret;

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "stringSymbol"


    // $ANTLR start "qualifiedNameSymbol"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:267:1: qualifiedNameSymbol returns [Object ret2] : (ast= QNAME ) ;
    public final Object qualifiedNameSymbol() throws RecognitionException {
        Object ret2 = null;

        Token ast=null;

        java.lang.Object ret=null;
        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:268:3: ( (ast= QNAME ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:269:3: (ast= QNAME )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:269:3: (ast= QNAME )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:269:4: ast= QNAME
            {
            ast=(Token)match(input,QNAME,FOLLOW_QNAME_in_qualifiedNameSymbol396); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              ret = unescapeString( ast.getText());

            }

            }

            if ( state.backtracking==0 ) {

              ret2=ret;

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "qualifiedNameSymbol"


    // $ANTLR start "annotationSymbol"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:277:1: annotationSymbol returns [Object ret2] : (ast= MULTI_LINE_COMMENT ) ;
    public final Object annotationSymbol() throws RecognitionException {
        Object ret2 = null;

        Token ast=null;

        java.lang.Object ret=null;
        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:278:3: ( (ast= MULTI_LINE_COMMENT ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:279:3: (ast= MULTI_LINE_COMMENT )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:279:3: (ast= MULTI_LINE_COMMENT )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:279:4: ast= MULTI_LINE_COMMENT
            {
            ast=(Token)match(input,MULTI_LINE_COMMENT,FOLLOW_MULTI_LINE_COMMENT_in_annotationSymbol427); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              ret = unescapeString( ast.getText());

            }

            }

            if ( state.backtracking==0 ) {

              ret2=ret;

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "annotationSymbol"


    // $ANTLR start "integerSymbol"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:287:1: integerSymbol returns [Object ret2] : (ast= INT ) ;
    public final Object integerSymbol() throws RecognitionException {
        Object ret2 = null;

        Token ast=null;

        java.lang.Object ret=null;
        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:288:3: ( (ast= INT ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:289:3: (ast= INT )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:289:3: (ast= INT )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:289:4: ast= INT
            {
            ast=(Token)match(input,INT,FOLLOW_INT_in_integerSymbol458); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              ret = Integer.valueOf( ast.getText());

            }

            }

            if ( state.backtracking==0 ) {

              ret2=ret;

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "integerSymbol"


    // $ANTLR start "longSymbol"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:297:1: longSymbol returns [Object ret2] : (ast= INT ) ;
    public final Object longSymbol() throws RecognitionException {
        Object ret2 = null;

        Token ast=null;

        java.lang.Object ret=null;
        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:298:3: ( (ast= INT ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:299:3: (ast= INT )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:299:3: (ast= INT )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:299:4: ast= INT
            {
            ast=(Token)match(input,INT,FOLLOW_INT_in_longSymbol489); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              ret = Long.valueOf( ast.getText());

            }

            }

            if ( state.backtracking==0 ) {

              ret2=ret;

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "longSymbol"


    // $ANTLR start "integerAsString"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:307:1: integerAsString returns [Object ret2] : (ast= INT ) ;
    public final Object integerAsString() throws RecognitionException {
        Object ret2 = null;

        Token ast=null;

        java.lang.Object ret=null;
        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:308:3: ( (ast= INT ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:309:3: (ast= INT )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:309:3: (ast= INT )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:309:4: ast= INT
            {
            ast=(Token)match(input,INT,FOLLOW_INT_in_integerAsString520); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              ret = unescapeString( ast.getText());

            }

            }

            if ( state.backtracking==0 ) {

              ret2=ret;

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "integerAsString"


    // $ANTLR start "floatAsString"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:317:1: floatAsString returns [Object ret2] : (ast= FLOAT ) ;
    public final Object floatAsString() throws RecognitionException {
        Object ret2 = null;

        Token ast=null;

        java.lang.Object ret=null;
        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:318:3: ( (ast= FLOAT ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:319:3: (ast= FLOAT )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:319:3: (ast= FLOAT )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:319:4: ast= FLOAT
            {
            ast=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_floatAsString551); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              ret = unescapeString( ast.getText());

            }

            }

            if ( state.backtracking==0 ) {

              ret2=ret;

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "floatAsString"


    // $ANTLR start "booleanSymbol"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:327:1: booleanSymbol returns [Object ret2] : (ast= BOOL ) ;
    public final Object booleanSymbol() throws RecognitionException {
        Object ret2 = null;

        Token ast=null;

        java.lang.Object ret=null;
        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:328:3: ( (ast= BOOL ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:329:3: (ast= BOOL )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:329:3: (ast= BOOL )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:329:4: ast= BOOL
            {
            ast=(Token)match(input,BOOL,FOLLOW_BOOL_in_booleanSymbol582); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              ret =  ast.getText();

            }

            }

            if ( state.backtracking==0 ) {

              ret2=ret;

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "booleanSymbol"


    // $ANTLR start "booleanValueSymbol"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:337:1: booleanValueSymbol returns [Object ret2] : (ast= BOOL ) ;
    public final Object booleanValueSymbol() throws RecognitionException {
        Object ret2 = null;

        Token ast=null;

        java.lang.Object ret=null;
        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:338:3: ( (ast= BOOL ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:339:3: (ast= BOOL )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:339:3: (ast= BOOL )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:339:4: ast= BOOL
            {
            ast=(Token)match(input,BOOL,FOLLOW_BOOL_in_booleanValueSymbol613); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              ret = Boolean.valueOf( ast.getText());

            }

            }

            if ( state.backtracking==0 ) {

              ret2=ret;

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "booleanValueSymbol"


    // $ANTLR start "floatSymbol"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:347:1: floatSymbol returns [Object ret2] : (ast= FLOAT ) ;
    public final Object floatSymbol() throws RecognitionException {
        Object ret2 = null;

        Token ast=null;

        java.lang.Object ret=null;
        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:348:3: ( (ast= FLOAT ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:349:3: (ast= FLOAT )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:349:3: (ast= FLOAT )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:349:4: ast= FLOAT
            {
            ast=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_floatSymbol644); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              ret = Double.valueOf( ast.getText());

            }

            }

            if ( state.backtracking==0 ) {

              ret2=ret;

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "floatSymbol"


    // $ANTLR start "main"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:357:1: main returns [Object ret2] : ( (ret= model_class ) EOF ) ;
    public final Object main() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:358:3: ( ( (ret= model_class ) EOF ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:359:3: ( (ret= model_class ) EOF )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:359:3: ( (ret= model_class ) EOF )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:359:4: (ret= model_class ) EOF
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:359:4: (ret= model_class )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:359:5: ret= model_class
            {
            pushFollow(FOLLOW_model_class_in_main672);
            ret=model_class();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;

            }

            match(input,EOF,FOLLOW_EOF_in_main675); if (state.failed) return ret2;

            }

            if ( state.backtracking==0 ) {

              ret2=ret;

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "main"


    // $ANTLR start "model_class"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:366:1: model_class returns [Object ret2] : ( annotation[ret] visibility[ret] ( ( 'abstract' ) | ) 'class' (temp= identifier ) ( ( 'extends' ( ( (temp= qualifiedNameSymbol ( ( ',' ) temp= qualifiedNameSymbol )* ) ) | ( (temp= identifier ( ( ',' ) temp= identifier )* ) ) ) ) | ) LCURL ( ( (temp= model_modelelement (temp= model_modelelement )* )? ( ( 'invariants' LCURL (temp= model_modelelement_invariants (temp= model_modelelement_invariants )* )? RCURL ) | ) ) ) RCURL ) ;
    public final Object model_class() throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        List<String> metaType=list("Model","Class");
        onEnterTemplateRule(metaType);
        IModelElementProxy ret=(getBacktrackingLevel()==0) ? createModelElementProxy(metaType, true, false, new String[]{"class"}) : null;
        org.antlr.runtime.Token firstToken=input.LT(1);

        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:371:3: ( ( annotation[ret] visibility[ret] ( ( 'abstract' ) | ) 'class' (temp= identifier ) ( ( 'extends' ( ( (temp= qualifiedNameSymbol ( ( ',' ) temp= qualifiedNameSymbol )* ) ) | ( (temp= identifier ( ( ',' ) temp= identifier )* ) ) ) ) | ) LCURL ( ( (temp= model_modelelement (temp= model_modelelement )* )? ( ( 'invariants' LCURL (temp= model_modelelement_invariants (temp= model_modelelement_invariants )* )? RCURL ) | ) ) ) RCURL ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:372:3: ( annotation[ret] visibility[ret] ( ( 'abstract' ) | ) 'class' (temp= identifier ) ( ( 'extends' ( ( (temp= qualifiedNameSymbol ( ( ',' ) temp= qualifiedNameSymbol )* ) ) | ( (temp= identifier ( ( ',' ) temp= identifier )* ) ) ) ) | ) LCURL ( ( (temp= model_modelelement (temp= model_modelelement )* )? ( ( 'invariants' LCURL (temp= model_modelelement_invariants (temp= model_modelelement_invariants )* )? RCURL ) | ) ) ) RCURL )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:372:3: ( annotation[ret] visibility[ret] ( ( 'abstract' ) | ) 'class' (temp= identifier ) ( ( 'extends' ( ( (temp= qualifiedNameSymbol ( ( ',' ) temp= qualifiedNameSymbol )* ) ) | ( (temp= identifier ( ( ',' ) temp= identifier )* ) ) ) ) | ) LCURL ( ( (temp= model_modelelement (temp= model_modelelement )* )? ( ( 'invariants' LCURL (temp= model_modelelement_invariants (temp= model_modelelement_invariants )* )? RCURL ) | ) ) ) RCURL )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:372:4: annotation[ret] visibility[ret] ( ( 'abstract' ) | ) 'class' (temp= identifier ) ( ( 'extends' ( ( (temp= qualifiedNameSymbol ( ( ',' ) temp= qualifiedNameSymbol )* ) ) | ( (temp= identifier ( ( ',' ) temp= identifier )* ) ) ) ) | ) LCURL ( ( (temp= model_modelelement (temp= model_modelelement )* )? ( ( 'invariants' LCURL (temp= model_modelelement_invariants (temp= model_modelelement_invariants )* )? RCURL ) | ) ) ) RCURL
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D13CC0334511DF9895EC660A0001C5");
            }
            pushFollow(FOLLOW_annotation_in_model_class706);
            annotation(ret);

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D13CC1334511DF8E4AEC660A0001C5");
            }
            pushFollow(FOLLOW_visibility_in_model_class710);
            visibility(ret);

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D163D1334511DFC0F1EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:372:244: ( ( 'abstract' ) | )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==56) ) {
                alt2=1;
            }
            else if ( (LA2_0==59) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ret2;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:372:245: ( 'abstract' )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(0);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:372:261: ( 'abstract' )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:372:262: 'abstract'
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8D13CC5334511DFBAC7EC660A0001C5");
                    }
                    match(input,56,FOLLOW_56_in_model_class720); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      setProperty(ret, "isAbstract", java.lang.Boolean.TRUE);
                    }
                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 2 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:372:422: 
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(1);
                    }
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "isAbstract", java.lang.Boolean.FALSE);
                    }
                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D163D2334511DFB40BEC660A0001C5");
            }
            match(input,59,FOLLOW_59_in_model_class738); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D163D4334511DF8FE6EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:373:158: (temp= identifier )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:373:160: temp= identifier
            {
            pushFollow(FOLLOW_identifier_in_model_class745);
            temp=identifier();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              setProperty(ret, "name", temp);
            }

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D24E31334511DFB98CEC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:373:286: ( ( 'extends' ( ( (temp= qualifiedNameSymbol ( ( ',' ) temp= qualifiedNameSymbol )* ) ) | ( (temp= identifier ( ( ',' ) temp= identifier )* ) ) ) ) | )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==43) ) {
                alt6=1;
            }
            else if ( (LA6_0==LCURL) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ret2;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:373:287: ( 'extends' ( ( (temp= qualifiedNameSymbol ( ( ',' ) temp= qualifiedNameSymbol )* ) ) | ( (temp= identifier ( ( ',' ) temp= identifier )* ) ) ) )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(0);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:373:303: ( 'extends' ( ( (temp= qualifiedNameSymbol ( ( ',' ) temp= qualifiedNameSymbol )* ) ) | ( (temp= identifier ( ( ',' ) temp= identifier )* ) ) ) )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:373:304: 'extends' ( ( (temp= qualifiedNameSymbol ( ( ',' ) temp= qualifiedNameSymbol )* ) ) | ( (temp= identifier ( ( ',' ) temp= identifier )* ) ) )
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8D18AE3334511DFA1E6EC660A0001C5");
                    }
                    match(input,43,FOLLOW_43_in_model_class757); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8D22721334511DF85CEEC660A0001C5");
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:373:447: ( ( (temp= qualifiedNameSymbol ( ( ',' ) temp= qualifiedNameSymbol )* ) ) | ( (temp= identifier ( ( ',' ) temp= identifier )* ) ) )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==QNAME) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==NAME) ) {
                        alt5=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ret2;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:373:448: ( (temp= qualifiedNameSymbol ( ( ',' ) temp= qualifiedNameSymbol )* ) )
                            {
                            if ( state.backtracking==0 ) {
                              _enterAlt(0);
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:373:464: ( (temp= qualifiedNameSymbol ( ( ',' ) temp= qualifiedNameSymbol )* ) )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:373:465: (temp= qualifiedNameSymbol ( ( ',' ) temp= qualifiedNameSymbol )* )
                            {
                            if ( state.backtracking==0 ) {
                              _beforeSeqEl("E009322EC8D1B1F3334511DF9C0CEC660A0001C5");
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:373:524: (temp= qualifiedNameSymbol ( ( ',' ) temp= qualifiedNameSymbol )* )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:373:526: temp= qualifiedNameSymbol ( ( ',' ) temp= qualifiedNameSymbol )*
                            {
                            pushFollow(FOLLOW_qualifiedNameSymbol_in_model_class769);
                            temp=qualifiedNameSymbol();

                            checkFollows();
                            state._fsp--;
                            if (state.failed) return ret2;
                            if ( state.backtracking==0 ) {
                              setOclRef(ret, "supertypes", null, temp, "OCL:"+"			let t=Sequence{1..?.size()}->select(j|?.subString(j, j+1) = '::')->iterate("+"  				i; acc:Tuple(pos:Integer, ns:Set(Namespace), qn:String)=Tuple{pos=1, ns=null, qn=''} |"+"    				let namePart=?.subString(acc.pos, -1+i) in"+"      				Tuple{pos=i+2,"+"      				      ns=if acc.ns=null then"+"            			  	Namespace.allInstances()->select("+"              					ns2 | ns2.container->isEmpty() and ns2.name=namePart)"+"              			  else"+"              			  	acc.ns.contents->select(ns2 | ns2.name=namePart)->asSet()"+"              			  endif,"+"            			  qn=acc.qn.concat('::').concat(namePart)}) in"+"				t.ns.contents->select(c | c.name=?.subString(t.pos, ?.size()))"+"  	  		");
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:373:1306: ( ( ',' ) temp= qualifiedNameSymbol )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( (LA3_0==40) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:373:1307: ( ',' ) temp= qualifiedNameSymbol
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	      _enterSepSeq();
                            	    }
                            	    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:373:1324: ( ',' )
                            	    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:373:1325: ','
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	      _beforeSeqEl("E009322EC8D1B1F0334511DFC695EC660A0001C5");
                            	    }
                            	    match(input,40,FOLLOW_40_in_model_class777); if (state.failed) return ret2;
                            	    if ( state.backtracking==0 ) {
                            	      _afterSeqEl();
                            	    }

                            	    }

                            	    if ( state.backtracking==0 ) {
                            	      _exitSepSeq();
                            	    }
                            	    pushFollow(FOLLOW_qualifiedNameSymbol_in_model_class784);
                            	    temp=qualifiedNameSymbol();

                            	    checkFollows();
                            	    state._fsp--;
                            	    if (state.failed) return ret2;
                            	    if ( state.backtracking==0 ) {
                            	      setOclRef(ret, "supertypes", null, temp, "OCL:"+"			let t=Sequence{1..?.size()}->select(j|?.subString(j, j+1) = '::')->iterate("+"  				i; acc:Tuple(pos:Integer, ns:Set(Namespace), qn:String)=Tuple{pos=1, ns=null, qn=''} |"+"    				let namePart=?.subString(acc.pos, -1+i) in"+"      				Tuple{pos=i+2,"+"      				      ns=if acc.ns=null then"+"            			  	Namespace.allInstances()->select("+"              					ns2 | ns2.container->isEmpty() and ns2.name=namePart)"+"              			  else"+"              			  	acc.ns.contents->select(ns2 | ns2.name=namePart)->asSet()"+"              			  endif,"+"            			  qn=acc.qn.concat('::').concat(namePart)}) in"+"				t.ns.contents->select(c | c.name=?.subString(t.pos, ?.size()))"+"  	  		");
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop3;
                                }
                            } while (true);


                            }

                            if ( state.backtracking==0 ) {
                              _afterSeqEl();
                            }

                            }

                            if ( state.backtracking==0 ) {
                              _exitAlt();
                            }

                            }
                            break;
                        case 2 :
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:374:4: ( (temp= identifier ( ( ',' ) temp= identifier )* ) )
                            {
                            if ( state.backtracking==0 ) {
                              _enterAlt(1);
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:374:20: ( (temp= identifier ( ( ',' ) temp= identifier )* ) )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:374:21: (temp= identifier ( ( ',' ) temp= identifier )* )
                            {
                            if ( state.backtracking==0 ) {
                              _beforeSeqEl("E009322EC8D20015334511DF9260EC660A0001C5");
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:374:80: (temp= identifier ( ( ',' ) temp= identifier )* )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:374:82: temp= identifier ( ( ',' ) temp= identifier )*
                            {
                            pushFollow(FOLLOW_identifier_in_model_class807);
                            temp=identifier();

                            checkFollows();
                            state._fsp--;
                            if (state.failed) return ret2;
                            if ( state.backtracking==0 ) {
                              setOclRef(ret, "supertypes", null, temp, "OCL:Moin::Model::Class.allInstances()->select(c|c.name=?)");
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:374:203: ( ( ',' ) temp= identifier )*
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( (LA4_0==40) ) {
                                    alt4=1;
                                }


                                switch (alt4) {
                            	case 1 :
                            	    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:374:204: ( ',' ) temp= identifier
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	      _enterSepSeq();
                            	    }
                            	    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:374:221: ( ',' )
                            	    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:374:222: ','
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	      _beforeSeqEl("E009322EC8D20012334511DFC4BCEC660A0001C5");
                            	    }
                            	    match(input,40,FOLLOW_40_in_model_class815); if (state.failed) return ret2;
                            	    if ( state.backtracking==0 ) {
                            	      _afterSeqEl();
                            	    }

                            	    }

                            	    if ( state.backtracking==0 ) {
                            	      _exitSepSeq();
                            	    }
                            	    pushFollow(FOLLOW_identifier_in_model_class822);
                            	    temp=identifier();

                            	    checkFollows();
                            	    state._fsp--;
                            	    if (state.failed) return ret2;
                            	    if ( state.backtracking==0 ) {
                            	      setOclRef(ret, "supertypes", null, temp, "OCL:Moin::Model::Class.allInstances()->select(c|c.name=?)");
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop4;
                                }
                            } while (true);


                            }

                            if ( state.backtracking==0 ) {
                              _afterSeqEl();
                            }

                            }

                            if ( state.backtracking==0 ) {
                              _exitAlt();
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 2 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:374:508: 
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(1);
                    }
                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D24E32334511DF876EEC660A0001C5");
            }
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D27540334511DFCB17EC660A0001C5");
            }
            match(input,LCURL,FOLLOW_LCURL_in_model_class852); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D2C362334511DFC83BEC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:375:233: ( ( (temp= model_modelelement (temp= model_modelelement )* )? ( ( 'invariants' LCURL (temp= model_modelelement_invariants (temp= model_modelelement_invariants )* )? RCURL ) | ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:375:234: ( (temp= model_modelelement (temp= model_modelelement )* )? ( ( 'invariants' LCURL (temp= model_modelelement_invariants (temp= model_modelelement_invariants )* )? RCURL ) | ) )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:375:234: ( (temp= model_modelelement (temp= model_modelelement )* )? ( ( 'invariants' LCURL (temp= model_modelelement_invariants (temp= model_modelelement_invariants )* )? RCURL ) | ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:375:235: (temp= model_modelelement (temp= model_modelelement )* )? ( ( 'invariants' LCURL (temp= model_modelelement_invariants (temp= model_modelelement_invariants )* )? RCURL ) | )
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D27542334511DFAFA0EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:375:294: (temp= model_modelelement (temp= model_modelelement )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==NAME||(LA8_0>=QNAME && LA8_0<=MULTI_LINE_COMMENT)||(LA8_0>=36 && LA8_0<=37)||LA8_0==39||LA8_0==44||LA8_0==48||LA8_0==50) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:375:296: temp= model_modelelement (temp= model_modelelement )*
                    {
                    pushFollow(FOLLOW_model_modelelement_in_model_class863);
                    temp=model_modelelement();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "contents", temp);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:375:358: (temp= model_modelelement )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==NAME||(LA7_0>=QNAME && LA7_0<=MULTI_LINE_COMMENT)||(LA7_0>=36 && LA7_0<=37)||LA7_0==39||LA7_0==44||LA7_0==48||LA7_0==50) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:375:360: temp= model_modelelement
                    	    {
                    	    pushFollow(FOLLOW_model_modelelement_in_model_class871);
                    	    temp=model_modelelement();

                    	    checkFollows();
                    	    state._fsp--;
                    	    if (state.failed) return ret2;
                    	    if ( state.backtracking==0 ) {
                    	      setProperty(ret, "contents", temp);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D2C360334511DFCA2EEC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:375:503: ( ( 'invariants' LCURL (temp= model_modelelement_invariants (temp= model_modelelement_invariants )* )? RCURL ) | )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==51) ) {
                alt11=1;
            }
            else if ( (LA11_0==RCURL) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ret2;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:375:504: ( 'invariants' LCURL (temp= model_modelelement_invariants (temp= model_modelelement_invariants )* )? RCURL )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(0);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:375:520: ( 'invariants' LCURL (temp= model_modelelement_invariants (temp= model_modelelement_invariants )* )? RCURL )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:375:521: 'invariants' LCURL (temp= model_modelelement_invariants (temp= model_modelelement_invariants )* )? RCURL
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8D29C50334511DFC779EC660A0001C5");
                    }
                    match(input,51,FOLLOW_51_in_model_class888); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8D29C51334511DFC8E2EC660A0001C5");
                    }
                    match(input,LCURL,FOLLOW_LCURL_in_model_class892); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8D29C54334511DFC280EC660A0001C5");
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:375:749: (temp= model_modelelement_invariants (temp= model_modelelement_invariants )* )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==NAME) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:375:751: temp= model_modelelement_invariants (temp= model_modelelement_invariants )*
                            {
                            pushFollow(FOLLOW_model_modelelement_invariants_in_model_class900);
                            temp=model_modelelement_invariants();

                            checkFollows();
                            state._fsp--;
                            if (state.failed) return ret2;
                            if ( state.backtracking==0 ) {
                              setProperty(ret, "contents", temp);
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:375:824: (temp= model_modelelement_invariants )*
                            loop9:
                            do {
                                int alt9=2;
                                int LA9_0 = input.LA(1);

                                if ( (LA9_0==NAME) ) {
                                    alt9=1;
                                }


                                switch (alt9) {
                            	case 1 :
                            	    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:375:826: temp= model_modelelement_invariants
                            	    {
                            	    pushFollow(FOLLOW_model_modelelement_invariants_in_model_class908);
                            	    temp=model_modelelement_invariants();

                            	    checkFollows();
                            	    state._fsp--;
                            	    if (state.failed) return ret2;
                            	    if ( state.backtracking==0 ) {
                            	      setProperty(ret, "contents", temp);
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    break loop9;
                                }
                            } while (true);


                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8D29C55334511DF982FEC660A0001C5");
                    }
                    match(input,RCURL,FOLLOW_RCURL_in_model_class920); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 2 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:375:1020: 
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(1);
                    }
                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }


            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D2EA70334511DFA122EC660A0001C5");
            }
            match(input,RCURL,FOLLOW_RCURL_in_model_class941); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

              ret2 = commitCreation(ret, firstToken, true);

               
            }

            }

        }
        catch (Exception e) {
            handleExceptionInTemplateRule(e, firstToken, ret);
        }
        finally {
            onExitTemplateRule(metaType);
        }
        return ret2;
    }
    // $ANTLR end "model_class"


    // $ANTLR start "model_generalizableelement"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:384:1: model_generalizableelement returns [Object ret2] : () ;
    public final Object model_generalizableelement() throws RecognitionException {
        Object ret2 = null;

        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:385:3: ( () )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:386:3: ()
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:386:3: ()
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:386:4: 
            {
            }

            if ( state.backtracking==0 ) {


               
            }

            }

        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "model_generalizableelement"


    // $ANTLR start "model_modelelement"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:393:1: model_modelelement returns [Object ret2] : (ret= model_feature ) ;
    public final Object model_modelelement() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:394:3: ( (ret= model_feature ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:395:3: (ret= model_feature )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:395:3: (ret= model_feature )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:395:4: ret= model_feature
            {
            pushFollow(FOLLOW_model_feature_in_model_modelelement1003);
            ret=model_feature();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;

            }

            if ( state.backtracking==0 ) {

              ret2=ret;
               
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "model_modelelement"


    // $ANTLR start "model_feature"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:402:1: model_feature returns [Object ret2] : ( ( model_structuralfeature )=> (ret= model_structuralfeature ) | ( model_behavioralfeature )=> (ret= model_behavioralfeature ) ) ;
    public final Object model_feature() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:403:3: ( ( ( model_structuralfeature )=> (ret= model_structuralfeature ) | ( model_behavioralfeature )=> (ret= model_behavioralfeature ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:404:3: ( ( model_structuralfeature )=> (ret= model_structuralfeature ) | ( model_behavioralfeature )=> (ret= model_behavioralfeature ) )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:404:3: ( ( model_structuralfeature )=> (ret= model_structuralfeature ) | ( model_behavioralfeature )=> (ret= model_behavioralfeature ) )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:404:4: ( model_structuralfeature )=> (ret= model_structuralfeature )
                    {
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:404:31: (ret= model_structuralfeature )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:404:32: ret= model_structuralfeature
                    {
                    pushFollow(FOLLOW_model_structuralfeature_in_model_feature1035);
                    ret=model_structuralfeature();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;

                    }


                    }
                    break;
                case 2 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:405:5: ( model_behavioralfeature )=> (ret= model_behavioralfeature )
                    {
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:405:32: (ret= model_behavioralfeature )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:405:33: ret= model_behavioralfeature
                    {
                    pushFollow(FOLLOW_model_behavioralfeature_in_model_feature1049);
                    ret=model_behavioralfeature();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              ret2=ret;
               
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "model_feature"


    // $ANTLR start "model_structuralfeature"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:412:1: model_structuralfeature returns [Object ret2] : (ret= model_attribute | ret= model_reference ) ;
    public final Object model_structuralfeature() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:413:3: ( (ret= model_attribute | ret= model_reference ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:414:3: (ret= model_attribute | ret= model_reference )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:414:3: (ret= model_attribute | ret= model_reference )
            int alt13=2;
            switch ( input.LA(1) ) {
            case MULTI_LINE_COMMENT:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==39) ) {
                    alt13=2;
                }
                else if ( (LA13_1==NAME||LA13_1==QNAME||(LA13_1>=36 && LA13_1<=37)||LA13_1==44||LA13_1==48||LA13_1==50) ) {
                    alt13=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ret2;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
                }
                break;
            case NAME:
            case QNAME:
            case 36:
            case 37:
            case 44:
            case 48:
            case 50:
                {
                alt13=1;
                }
                break;
            case 39:
                {
                alt13=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ret2;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:414:4: ret= model_attribute
                    {
                    pushFollow(FOLLOW_model_attribute_in_model_structuralfeature1077);
                    ret=model_attribute();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;

                    }
                    break;
                case 2 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:415:5: ret= model_reference
                    {
                    pushFollow(FOLLOW_model_reference_in_model_structuralfeature1085);
                    ret=model_reference();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              ret2=ret;
               
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "model_structuralfeature"


    // $ANTLR start "scopeandvisibility"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:422:1: scopeandvisibility[Object ret] : ( ( () | ( 'public' ) | ( 'protected' ) | ( 'private' ) ) ( ( 'static' ) | ) ) ;
    public final void scopeandvisibility(Object ret) throws RecognitionException {
        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:423:3: ( ( ( () | ( 'public' ) | ( 'protected' ) | ( 'private' ) ) ( ( 'static' ) | ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:424:3: ( ( () | ( 'public' ) | ( 'protected' ) | ( 'private' ) ) ( ( 'static' ) | ) )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:424:3: ( ( () | ( 'public' ) | ( 'protected' ) | ( 'private' ) ) ( ( 'static' ) | ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:424:4: ( () | ( 'public' ) | ( 'protected' ) | ( 'private' ) ) ( ( 'static' ) | )
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D55B72334511DFCC60EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:424:63: ( () | ( 'public' ) | ( 'protected' ) | ( 'private' ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case NAME:
            case QNAME:
            case 36:
                {
                alt14=1;
                }
                break;
            case 44:
                {
                alt14=2;
                }
                break;
            case 48:
                {
                alt14=3;
                }
                break;
            case 37:
                {
                alt14=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:424:64: ()
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(0);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:424:80: ()
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:424:81: 
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8D4E641334511DFB5C0EC660A0001C5");
                    }
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "visibility", com.sap.tc.moin.repository.mmi.model.VisibilityKindEnum.PUBLIC_VIS);_exitInjectorAction();
                    }
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 2 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:425:4: ( 'public' )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(1);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:425:20: ( 'public' )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:425:21: 'public'
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8D4E643334511DFADE0EC660A0001C5");
                    }
                    match(input,44,FOLLOW_44_in_scopeandvisibility1127); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8D50D51334511DF9CDDEC660A0001C5");
                    }
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "visibility", com.sap.tc.moin.repository.mmi.model.VisibilityKindEnum.PUBLIC_VIS);_exitInjectorAction();
                    }
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 3 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:426:4: ( 'protected' )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(2);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:426:20: ( 'protected' )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:426:21: 'protected'
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8D50D53334511DFADEEEC660A0001C5");
                    }
                    match(input,48,FOLLOW_48_in_scopeandvisibility1143); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8D53460334511DFA2A5EC660A0001C5");
                    }
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "visibility", com.sap.tc.moin.repository.mmi.model.VisibilityKindEnum.PROTECTED_VIS);_exitInjectorAction();
                    }
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 4 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:427:4: ( 'private' )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(3);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:427:20: ( 'private' )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:427:21: 'private'
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8D53462334511DFB76EEC660A0001C5");
                    }
                    match(input,37,FOLLOW_37_in_scopeandvisibility1159); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8D55B70334511DF8F62EC660A0001C5");
                    }
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "visibility", com.sap.tc.moin.repository.mmi.model.VisibilityKindEnum.PRIVATE_VIS);_exitInjectorAction();
                    }
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D5A991334511DFA212EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:427:396: ( ( 'static' ) | )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            else if ( (LA15_0==NAME||LA15_0==QNAME) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:427:397: ( 'static' )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(0);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:427:413: ( 'static' )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:427:414: 'static'
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8D58284334511DFCFB0EC660A0001C5");
                    }
                    match(input,36,FOLLOW_36_in_scopeandvisibility1176); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      setProperty(ret, "scope", createEnumLiteral(list("Model","ScopeKind"),"classifier_level"));
                    }
                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 2 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:427:608: 
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(1);
                    }
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "scope", createEnumLiteral(list("Model","ScopeKind"),"instance_level"));
                    }
                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "scopeandvisibility"


    // $ANTLR start "model_attribute"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:435:1: model_attribute returns [Object ret2] : ( annotation[ret] ( () | ( 'readonly' ) ) scopeandvisibility[ret] typereference[ret] (temp= model_multiplicitytype ) (temp= identifier ) ';' ) ;
    public final Object model_attribute() throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        List<String> metaType=list("Model","Attribute");
        onEnterTemplateRule(metaType);
        IModelElementProxy ret=(getBacktrackingLevel()==0) ? createModelElementProxy(metaType, false, false) : null;
        org.antlr.runtime.Token firstToken=input.LT(1);

        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:440:3: ( ( annotation[ret] ( () | ( 'readonly' ) ) scopeandvisibility[ret] typereference[ret] (temp= model_multiplicitytype ) (temp= identifier ) ';' ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:441:3: ( annotation[ret] ( () | ( 'readonly' ) ) scopeandvisibility[ret] typereference[ret] (temp= model_multiplicitytype ) (temp= identifier ) ';' )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:441:3: ( annotation[ret] ( () | ( 'readonly' ) ) scopeandvisibility[ret] typereference[ret] (temp= model_multiplicitytype ) (temp= identifier ) ';' )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:441:4: annotation[ret] ( () | ( 'readonly' ) ) scopeandvisibility[ret] typereference[ret] (temp= model_multiplicitytype ) (temp= identifier ) ';'
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D5F7B0334511DF9DE3EC660A0001C5");
            }
            pushFollow(FOLLOW_annotation_in_model_attribute1221);
            annotation(ret);

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D61EC6334511DFB61DEC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:441:154: ( () | ( 'readonly' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==NAME||LA16_0==QNAME||(LA16_0>=36 && LA16_0<=37)||LA16_0==44||LA16_0==48) ) {
                alt16=1;
            }
            else if ( (LA16_0==50) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ret2;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:441:155: ()
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(0);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:441:171: ()
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:441:172: 
                    {
                    }

                    if ( state.backtracking==0 ) {
                      setProperty(ret, "isChangeable", java.lang.Boolean.TRUE);
                    }
                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 2 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:441:249: ( 'readonly' )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(1);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:441:265: ( 'readonly' )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:441:266: 'readonly'
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8D61EC4334511DF99EEEC660A0001C5");
                    }
                    match(input,50,FOLLOW_50_in_model_attribute1241); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      setProperty(ret, "isChangeable", java.lang.Boolean.FALSE);
                    }
                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D645D0334511DF9C03EC660A0001C5");
            }
            pushFollow(FOLLOW_scopeandvisibility_in_model_attribute1251);
            scopeandvisibility(ret);

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D645D1334511DF8D0AEC660A0001C5");
            }
            pushFollow(FOLLOW_typereference_in_model_attribute1255);
            typereference(ret);

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D645D3334511DF9BC9EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:442:267: (temp= model_multiplicitytype )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:442:269: temp= model_multiplicitytype
            {
            pushFollow(FOLLOW_model_multiplicitytype_in_model_attribute1263);
            temp=model_multiplicitytype();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              setProperty(ret, "multiplicity", temp);
            }

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D645D5334511DFC83FEC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:442:414: (temp= identifier )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:442:416: temp= identifier
            {
            pushFollow(FOLLOW_identifier_in_model_attribute1273);
            temp=identifier();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              setProperty(ret, "name", temp);
            }

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D645D6334511DFA15AEC660A0001C5");
            }
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D66CE0334511DF9A98EC660A0001C5");
            }
            match(input,49,FOLLOW_49_in_model_attribute1281); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

              ret2 = commitCreation(ret, firstToken, false);

               
            }

            }

        }
        catch (Exception e) {
            handleExceptionInTemplateRule(e, firstToken, ret);
        }
        finally {
            onExitTemplateRule(metaType);
        }
        return ret2;
    }
    // $ANTLR end "model_attribute"


    // $ANTLR start "model_reference"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:450:1: model_reference returns [Object ret2] : ( annotation[ret] 'ref' ( () | ( 'readonly' ) ) scopeandvisibility[ret] typereference[ret] (temp= model_multiplicitytype ) (temp= identifier ) ( ( 'referencedEnd' (temp= identifier ) ) | () ) ';' ) ;
    public final Object model_reference() throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        List<String> metaType=list("Model","Reference");
        onEnterTemplateRule(metaType);
        IModelElementProxy ret=(getBacktrackingLevel()==0) ? createModelElementProxy(metaType, false, false) : null;
        org.antlr.runtime.Token firstToken=input.LT(1);

        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:455:3: ( ( annotation[ret] 'ref' ( () | ( 'readonly' ) ) scopeandvisibility[ret] typereference[ret] (temp= model_multiplicitytype ) (temp= identifier ) ( ( 'referencedEnd' (temp= identifier ) ) | () ) ';' ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:456:3: ( annotation[ret] 'ref' ( () | ( 'readonly' ) ) scopeandvisibility[ret] typereference[ret] (temp= model_multiplicitytype ) (temp= identifier ) ( ( 'referencedEnd' (temp= identifier ) ) | () ) ';' )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:456:3: ( annotation[ret] 'ref' ( () | ( 'readonly' ) ) scopeandvisibility[ret] typereference[ret] (temp= model_multiplicitytype ) (temp= identifier ) ( ( 'referencedEnd' (temp= identifier ) ) | () ) ';' )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:456:4: annotation[ret] 'ref' ( () | ( 'readonly' ) ) scopeandvisibility[ret] typereference[ret] (temp= model_multiplicitytype ) (temp= identifier ) ( ( 'referencedEnd' (temp= identifier ) ) | () ) ';'
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D6E210334511DF9772EC660A0001C5");
            }
            pushFollow(FOLLOW_annotation_in_model_reference1321);
            annotation(ret);

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D6E211334511DF8B2AEC660A0001C5");
            }
            match(input,39,FOLLOW_39_in_model_reference1325); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D70921334511DFB9F4EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:456:234: ( () | ( 'readonly' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==NAME||LA17_0==QNAME||(LA17_0>=36 && LA17_0<=37)||LA17_0==44||LA17_0==48) ) {
                alt17=1;
            }
            else if ( (LA17_0==50) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ret2;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:456:235: ()
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(0);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:456:251: ()
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:456:252: 
                    {
                    }

                    if ( state.backtracking==0 ) {
                      setProperty(ret, "isChangeable", java.lang.Boolean.TRUE);
                    }
                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 2 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:456:329: ( 'readonly' )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(1);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:456:345: ( 'readonly' )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:456:346: 'readonly'
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8D6E216334511DFCB8FEC660A0001C5");
                    }
                    match(input,50,FOLLOW_50_in_model_reference1344); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      setProperty(ret, "isChangeable", java.lang.Boolean.FALSE);
                    }
                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D70922334511DFC53CEC660A0001C5");
            }
            pushFollow(FOLLOW_scopeandvisibility_in_model_reference1354);
            scopeandvisibility(ret);

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D70923334511DFBF73EC660A0001C5");
            }
            pushFollow(FOLLOW_typereference_in_model_reference1358);
            typereference(ret);

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D70925334511DF90C4EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:457:267: (temp= model_multiplicitytype )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:457:269: temp= model_multiplicitytype
            {
            pushFollow(FOLLOW_model_multiplicitytype_in_model_reference1366);
            temp=model_multiplicitytype();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              setProperty(ret, "multiplicity", temp);
            }

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D73031334511DF8B78EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:457:414: (temp= identifier )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:457:416: temp= identifier
            {
            pushFollow(FOLLOW_identifier_in_model_reference1376);
            temp=identifier();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              setProperty(ret, "name", temp);
            }

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D77E51334511DF856FEC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:457:541: ( ( 'referencedEnd' (temp= identifier ) ) | () )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            else if ( (LA18_0==49) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ret2;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:457:542: ( 'referencedEnd' (temp= identifier ) )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(0);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:457:558: ( 'referencedEnd' (temp= identifier ) )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:457:559: 'referencedEnd' (temp= identifier )
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8D73032334511DFC6EAEC660A0001C5");
                    }
                    match(input,34,FOLLOW_34_in_model_reference1387); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8D73037334511DFAC04EC660A0001C5");
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:457:708: (temp= identifier )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:457:710: temp= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_model_reference1394);
                    temp=identifier();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      setOclRef(ret, "referencedEnd", "name", temp, "self.container.oclAsType(Classifier).typedElements->select("+"  	  		e|e.oclIsTypeOf(AssociationEnd)).oclAsType(AssociationEnd).otherEnd()->select(e|e.name=?)");
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 2 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:458:4: ()
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(1);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:458:20: ()
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:458:21: 
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8D75743334511DFB217EC660A0001C5");
                    }
                    if ( state.backtracking==0 ) {
                      setOclRef(ret, "referencedEnd", null, null, "OCL:self.container.oclAsType(Classifier).typedElements->select("+"  	  		e|e.oclIsTypeOf(AssociationEnd)).oclAsType(AssociationEnd).otherEnd()->select(e|e.name=self.name)", true);_exitInjectorAction();
                    }
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D77E52334511DFAE0FEC660A0001C5");
            }
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D77E53334511DFB3D9EC660A0001C5");
            }
            match(input,49,FOLLOW_49_in_model_reference1420); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

              ret2 = commitCreation(ret, firstToken, false);

               
            }

            }

        }
        catch (Exception e) {
            handleExceptionInTemplateRule(e, firstToken, ret);
        }
        finally {
            onExitTemplateRule(metaType);
        }
        return ret2;
    }
    // $ANTLR end "model_reference"


    // $ANTLR start "typereference"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:466:1: typereference[Object ret] : ( ( ( (temp= qualifiedNameSymbol ) ) | ( (temp= identifier ) ) ) ) ;
    public final void typereference(Object ret) throws RecognitionException {
        Object temp = null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:467:3: ( ( ( ( (temp= qualifiedNameSymbol ) ) | ( (temp= identifier ) ) ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:468:3: ( ( ( (temp= qualifiedNameSymbol ) ) | ( (temp= identifier ) ) ) )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:468:3: ( ( ( (temp= qualifiedNameSymbol ) ) | ( (temp= identifier ) ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:468:4: ( ( (temp= qualifiedNameSymbol ) ) | ( (temp= identifier ) ) )
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D88FC1334511DF93AFEC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:468:63: ( ( (temp= qualifiedNameSymbol ) ) | ( (temp= identifier ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==QNAME) ) {
                alt19=1;
            }
            else if ( (LA19_0==NAME) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:468:64: ( (temp= qualifiedNameSymbol ) )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(0);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:468:80: ( (temp= qualifiedNameSymbol ) )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:468:81: (temp= qualifiedNameSymbol )
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8D81A94334511DF8F5FEC660A0001C5");
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:468:140: (temp= qualifiedNameSymbol )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:468:142: temp= qualifiedNameSymbol
                    {
                    pushFollow(FOLLOW_qualifiedNameSymbol_in_typereference1463);
                    temp=qualifiedNameSymbol();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      setOclRef(ret, "type", null, temp, "OCL:"+"			let t=Sequence{1..?.size()}->select(j|?.subString(j, j+1) = '::')->iterate("+"  				i; acc:Tuple(pos:Integer, ns:Set(Namespace), qn:String)=Tuple{pos=1, ns=null, qn=''} |"+"    				let namePart=?.subString(acc.pos, -1+i) in"+"      				Tuple{pos=i+2,"+"      				      ns=if acc.ns=null then"+"            			  	Namespace.allInstances()->select("+"              					ns2 | ns2.container->isEmpty() and ns2.name=namePart)"+"              			  else"+"              			  	acc.ns.contents->select(ns2 | ns2.name=namePart)->asSet()"+"              			  endif,"+"            			  qn=acc.qn.concat('::').concat(namePart)}) in"+"				t.ns.contents->select(c | c.name=?.subString(t.pos, ?.size()))");
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 2 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:469:4: ( (temp= identifier ) )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(1);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:469:20: ( (temp= identifier ) )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:469:21: (temp= identifier )
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8D841A5334511DFBECFEC660A0001C5");
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:469:80: (temp= identifier )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:469:82: temp= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_typereference1483);
                    temp=identifier();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      setOclRef(ret, "type", null, temp, "OCL:Model::Classifier.allInstances()->select(name=?)");
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "typereference"


    // $ANTLR start "model_behavioralfeature"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:476:1: model_behavioralfeature returns [Object ret2] : (ret= model_operation ) ;
    public final Object model_behavioralfeature() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:477:3: ( (ret= model_operation ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:478:3: (ret= model_operation )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:478:3: (ret= model_operation )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:478:4: ret= model_operation
            {
            pushFollow(FOLLOW_model_operation_in_model_behavioralfeature1518);
            ret=model_operation();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;

            }

            if ( state.backtracking==0 ) {

              ret2=ret;
               
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "model_behavioralfeature"


    // $ANTLR start "model_operation"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:485:1: model_operation returns [Object ret2] : ( annotation[ret] scopeandvisibility[ret] (temp= model_modelelement_returnType ) (temp= identifier ) LPAREN (temp= model_modelelement_parameter (temp= model_modelelement_parameter )* )? RPAREN LCURL (temp= ocl_expressions_oclexpression ) RCURL ) ;
    public final Object model_operation() throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        List<String> metaType=list("Model","Operation");
        onEnterTemplateRule(metaType);
        IModelElementProxy ret=(getBacktrackingLevel()==0) ? createModelElementProxy(metaType, true, false, new String[]{"operation"}) : null;
        org.antlr.runtime.Token firstToken=input.LT(1);

        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:490:3: ( ( annotation[ret] scopeandvisibility[ret] (temp= model_modelelement_returnType ) (temp= identifier ) LPAREN (temp= model_modelelement_parameter (temp= model_modelelement_parameter )* )? RPAREN LCURL (temp= ocl_expressions_oclexpression ) RCURL ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:491:3: ( annotation[ret] scopeandvisibility[ret] (temp= model_modelelement_returnType ) (temp= identifier ) LPAREN (temp= model_modelelement_parameter (temp= model_modelelement_parameter )* )? RPAREN LCURL (temp= ocl_expressions_oclexpression ) RCURL )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:491:3: ( annotation[ret] scopeandvisibility[ret] (temp= model_modelelement_returnType ) (temp= identifier ) LPAREN (temp= model_modelelement_parameter (temp= model_modelelement_parameter )* )? RPAREN LCURL (temp= ocl_expressions_oclexpression ) RCURL )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:491:4: annotation[ret] scopeandvisibility[ret] (temp= model_modelelement_returnType ) (temp= identifier ) LPAREN (temp= model_modelelement_parameter (temp= model_modelelement_parameter )* )? RPAREN LCURL (temp= ocl_expressions_oclexpression ) RCURL
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D95311334511DF9DB0EC660A0001C5");
            }
            pushFollow(FOLLOW_annotation_in_model_operation1548);
            annotation(ret);

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D97A20334511DFCD5CEC660A0001C5");
            }
            pushFollow(FOLLOW_scopeandvisibility_in_model_operation1552);
            scopeandvisibility(ret);

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D97A25334511DFCDC4EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:491:251: (temp= model_modelelement_returnType )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:491:253: temp= model_modelelement_returnType
            {
            pushFollow(FOLLOW_model_modelelement_returnType_in_model_operation1560);
            temp=model_modelelement_returnType();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              setProperty(ret, "contents", temp);
            }

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D9A131334511DFA174EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:491:401: (temp= identifier )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:491:403: temp= identifier
            {
            pushFollow(FOLLOW_identifier_in_model_operation1570);
            temp=identifier();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              setProperty(ret, "name", temp);
            }

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D9A132334511DFAC55EC660A0001C5");
            }
            match(input,LPAREN,FOLLOW_LPAREN_in_model_operation1577); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D9A135334511DF9149EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:491:611: (temp= model_modelelement_parameter (temp= model_modelelement_parameter )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==NAME||(LA21_0>=QNAME && LA21_0<=MULTI_LINE_COMMENT)||(LA21_0>=36 && LA21_0<=37)||LA21_0==39||LA21_0==44||LA21_0==48||LA21_0==50||LA21_0==56||LA21_0==59) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:491:613: temp= model_modelelement_parameter (temp= model_modelelement_parameter )*
                    {
                    pushFollow(FOLLOW_model_modelelement_parameter_in_model_operation1585);
                    temp=model_modelelement_parameter();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "contents", temp);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:491:685: (temp= model_modelelement_parameter )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==NAME||(LA20_0>=QNAME && LA20_0<=MULTI_LINE_COMMENT)||(LA20_0>=36 && LA20_0<=37)||LA20_0==39||LA20_0==44||LA20_0==48||LA20_0==50||LA20_0==56||LA20_0==59) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:491:687: temp= model_modelelement_parameter
                    	    {
                    	    pushFollow(FOLLOW_model_modelelement_parameter_in_model_operation1593);
                    	    temp=model_modelelement_parameter();

                    	    checkFollows();
                    	    state._fsp--;
                    	    if (state.failed) return ret2;
                    	    if ( state.backtracking==0 ) {
                    	      setProperty(ret, "contents", temp);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D9C840334511DFC9F7EC660A0001C5");
            }
            match(input,RPAREN,FOLLOW_RPAREN_in_model_operation1605); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D9C841334511DF840AEC660A0001C5");
            }
            match(input,LCURL,FOLLOW_LCURL_in_model_operation1610); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D9C844334511DFC890EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:491:1004: (temp= ocl_expressions_oclexpression )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:491:1006: temp= ocl_expressions_oclexpression
            {
            pushFollow(FOLLOW_ocl_expressions_oclexpression_in_model_operation1618);
            temp=ocl_expressions_oclexpression();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              setProperty(ret, "body", temp);
            }

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D9C845334511DFCEBDEC660A0001C5");
            }
            match(input,RCURL,FOLLOW_RCURL_in_model_operation1625); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8D9EF51334511DFA086EC660A0001C5");
            }
            if ( state.backtracking==0 ) {
              setProperty(ret, "isQuery", true);_exitInjectorAction();
            }
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

              ret2 = commitCreation(ret, firstToken, true);

               
            }

            }

        }
        catch (Exception e) {
            handleExceptionInTemplateRule(e, firstToken, ret);
        }
        finally {
            onExitTemplateRule(metaType);
        }
        return ret2;
    }
    // $ANTLR end "model_operation"


    // $ANTLR start "model_modelelement_returnType"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:499:1: model_modelelement_returnType returns [Object ret2] : (ret= model_typedelement_returnType ) ;
    public final Object model_modelelement_returnType() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:500:3: ( (ret= model_typedelement_returnType ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:501:3: (ret= model_typedelement_returnType )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:501:3: (ret= model_typedelement_returnType )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:501:4: ret= model_typedelement_returnType
            {
            pushFollow(FOLLOW_model_typedelement_returnType_in_model_modelelement_returnType1666);
            ret=model_typedelement_returnType();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;

            }

            if ( state.backtracking==0 ) {

              ret2=ret;
               
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "model_modelelement_returnType"


    // $ANTLR start "model_typedelement_returnType"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:508:1: model_typedelement_returnType returns [Object ret2] : (ret= model_parameter_returnType ) ;
    public final Object model_typedelement_returnType() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:509:3: ( (ret= model_parameter_returnType ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:510:3: (ret= model_parameter_returnType )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:510:3: (ret= model_parameter_returnType )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:510:4: ret= model_parameter_returnType
            {
            pushFollow(FOLLOW_model_parameter_returnType_in_model_typedelement_returnType1693);
            ret=model_parameter_returnType();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;

            }

            if ( state.backtracking==0 ) {

              ret2=ret;
               
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "model_typedelement_returnType"


    // $ANTLR start "model_parameter_returnType"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:517:1: model_parameter_returnType returns [Object ret2] : ( typereference[ret] (temp= model_multiplicitytype ) ) ;
    public final Object model_parameter_returnType() throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        List<String> metaType=list("Model","Parameter");
        onEnterTemplateRule(metaType,"returnType");
        IModelElementProxy ret=(getBacktrackingLevel()==0) ? createModelElementProxy(metaType, false, false) : null;
        org.antlr.runtime.Token firstToken=input.LT(1);

        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:522:3: ( ( typereference[ret] (temp= model_multiplicitytype ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:523:3: ( typereference[ret] (temp= model_multiplicitytype ) )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:523:3: ( typereference[ret] (temp= model_multiplicitytype ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:523:4: typereference[ret] (temp= model_multiplicitytype )
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8DB4EE0334511DFBB2BEC660A0001C5");
            }
            pushFollow(FOLLOW_typereference_in_model_parameter_returnType1723);
            typereference(ret);

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8DB4EE2334511DFBA9EEC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:523:156: (temp= model_multiplicitytype )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:523:158: temp= model_multiplicitytype
            {
            pushFollow(FOLLOW_model_multiplicitytype_in_model_parameter_returnType1731);
            temp=model_multiplicitytype();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              setProperty(ret, "multiplicity", temp);
            }

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8DF6D90334511DFB172EC660A0001C5");
            }
            if ( state.backtracking==0 ) {
              setProperty(ret, "direction", com.sap.tc.moin.repository.mmi.model.DirectionKindEnum.RETURN_DIR);_exitInjectorAction();setProperty(ret, "name", "result");_exitInjectorAction();
            }
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

              ret2 = commitCreation(ret, firstToken, false);

               
            }

            }

        }
        catch (Exception e) {
            handleExceptionInTemplateRule(e, firstToken, ret);
        }
        finally {
            onExitTemplateRule(metaType);
        }
        return ret2;
    }
    // $ANTLR end "model_parameter_returnType"


    // $ANTLR start "model_modelelement_parameter"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:531:1: model_modelelement_parameter returns [Object ret2] : (ret= model_typedelement_parameter ) ;
    public final Object model_modelelement_parameter() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:532:3: ( (ret= model_typedelement_parameter ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:533:3: (ret= model_typedelement_parameter )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:533:3: (ret= model_typedelement_parameter )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:533:4: ret= model_typedelement_parameter
            {
            pushFollow(FOLLOW_model_typedelement_parameter_in_model_modelelement_parameter1774);
            ret=model_typedelement_parameter();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;

            }

            if ( state.backtracking==0 ) {

              ret2=ret;
               
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "model_modelelement_parameter"


    // $ANTLR start "model_typedelement_parameter"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:540:1: model_typedelement_parameter returns [Object ret2] : (ret= model_parameter_parameter ) ;
    public final Object model_typedelement_parameter() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:541:3: ( (ret= model_parameter_parameter ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:542:3: (ret= model_parameter_parameter )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:542:3: (ret= model_parameter_parameter )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:542:4: ret= model_parameter_parameter
            {
            pushFollow(FOLLOW_model_parameter_parameter_in_model_typedelement_parameter1801);
            ret=model_parameter_parameter();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;

            }

            if ( state.backtracking==0 ) {

              ret2=ret;
               
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "model_typedelement_parameter"


    // $ANTLR start "model_parameter_parameter"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:549:1: model_parameter_parameter returns [Object ret2] : ( annotation[ret] typereference[ret] (temp= model_multiplicitytype ) (temp= identifier ) ) ;
    public final Object model_parameter_parameter() throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        List<String> metaType=list("Model","Parameter");
        onEnterTemplateRule(metaType,"parameter");
        IModelElementProxy ret=(getBacktrackingLevel()==0) ? createModelElementProxy(metaType, false, true) : null;
        org.antlr.runtime.Token firstToken=input.LT(1);

        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:554:3: ( ( annotation[ret] typereference[ret] (temp= model_multiplicitytype ) (temp= identifier ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:555:3: ( annotation[ret] typereference[ret] (temp= model_multiplicitytype ) (temp= identifier ) )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:555:3: ( annotation[ret] typereference[ret] (temp= model_multiplicitytype ) (temp= identifier ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:555:4: annotation[ret] typereference[ret] (temp= model_multiplicitytype ) (temp= identifier )
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8E0CD20334511DFBF4FEC660A0001C5");
            }
            pushFollow(FOLLOW_annotation_in_model_parameter_parameter1831);
            annotation(ret);

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8E0CD21334511DFCDFBEC660A0001C5");
            }
            pushFollow(FOLLOW_typereference_in_model_parameter_parameter1835);
            typereference(ret);

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8E0CD23334511DFA344EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:555:246: (temp= model_multiplicitytype )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:555:248: temp= model_multiplicitytype
            {
            pushFollow(FOLLOW_model_multiplicitytype_in_model_parameter_parameter1843);
            temp=model_multiplicitytype();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              setProperty(ret, "multiplicity", temp);
            }

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8E0F431334511DFA8FEEC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:555:393: (temp= identifier )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:555:395: temp= identifier
            {
            pushFollow(FOLLOW_identifier_in_model_parameter_parameter1853);
            temp=identifier();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              setProperty(ret, "name", temp);
            }

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8E0F434334511DFBB69EC660A0001C5");
            }
            if ( state.backtracking==0 ) {
              setProperty(ret, "direction", com.sap.tc.moin.repository.mmi.model.DirectionKindEnum.IN_DIR);_exitInjectorAction();
            }
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

              ret2 = commitCreation(ret, firstToken, false);

               
            }

            }

        }
        catch (Exception e) {
            handleExceptionInTemplateRule(e, firstToken, ret);
        }
        finally {
            onExitTemplateRule(metaType);
        }
        return ret2;
    }
    // $ANTLR end "model_parameter_parameter"


    // $ANTLR start "model_multiplicitytype"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:563:1: model_multiplicitytype returns [Object ret2] : ( ( ( integerSymbol DDOT STAR | integerSymbol DDOT integerSymbol )=> ( (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) ) | ( LBRACKET integerSymbol DDOT )=> ( LBRACKET (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACKET ) | ( LCURL integerSymbol DDOT )=> ( LCURL (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL ) | ( LBRACK_LCURL integerSymbol DDOT )=> ( LBRACK_LCURL (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL_RBRACK ) | ( LCURL_LBRACK integerSymbol DDOT )=> ( LCURL_LBRACK (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACK_RCURL ) | ( STAR | integerSymbol ~ DDOT )=> ( ( ( STAR ) | ( (temp= integerSymbol ) ) ) ) | ( LBRACKET integerSymbol RBRACKET | LBRACKET STAR RBRACKET )=> ( LBRACKET ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACKET ) | ( LBRACKET RBRACKET )=> ( LBRACKET RBRACKET ) | ( LCURL STAR RCURL | LCURL integerSymbol RCURL )=> ( LCURL ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL ) | ( LCURL RCURL )=> ( LCURL RCURL ) | ( LBRACK_LCURL STAR RCURL_RBRACK | LBRACK_LCURL integerSymbol RCURL_RBRACK )=> ( LBRACK_LCURL ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL_RBRACK ) | ( LCURL_LBRACK STAR RBRACK_RCURL | LCURL_LBRACK integerSymbol RBRACK_RCURL )=> ( LCURL_LBRACK ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACK_RCURL ) | ( LCURL_LBRACK RBRACK_RCURL )=> ( LCURL_LBRACK RBRACK_RCURL ) | ( LBRACK_LCURL RCURL_RBRACK )=> ( LBRACK_LCURL RCURL_RBRACK ) | () ) ) ;
    public final Object model_multiplicitytype() throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        List<String> metaType=list("Model","MultiplicityType");
        onEnterTemplateRule(metaType);
        IModelElementProxy ret=(getBacktrackingLevel()==0) ? createModelElementProxy(metaType, false, false) : null;
        org.antlr.runtime.Token firstToken=input.LT(1);

        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:568:3: ( ( ( ( integerSymbol DDOT STAR | integerSymbol DDOT integerSymbol )=> ( (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) ) | ( LBRACKET integerSymbol DDOT )=> ( LBRACKET (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACKET ) | ( LCURL integerSymbol DDOT )=> ( LCURL (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL ) | ( LBRACK_LCURL integerSymbol DDOT )=> ( LBRACK_LCURL (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL_RBRACK ) | ( LCURL_LBRACK integerSymbol DDOT )=> ( LCURL_LBRACK (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACK_RCURL ) | ( STAR | integerSymbol ~ DDOT )=> ( ( ( STAR ) | ( (temp= integerSymbol ) ) ) ) | ( LBRACKET integerSymbol RBRACKET | LBRACKET STAR RBRACKET )=> ( LBRACKET ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACKET ) | ( LBRACKET RBRACKET )=> ( LBRACKET RBRACKET ) | ( LCURL STAR RCURL | LCURL integerSymbol RCURL )=> ( LCURL ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL ) | ( LCURL RCURL )=> ( LCURL RCURL ) | ( LBRACK_LCURL STAR RCURL_RBRACK | LBRACK_LCURL integerSymbol RCURL_RBRACK )=> ( LBRACK_LCURL ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL_RBRACK ) | ( LCURL_LBRACK STAR RBRACK_RCURL | LCURL_LBRACK integerSymbol RBRACK_RCURL )=> ( LCURL_LBRACK ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACK_RCURL ) | ( LCURL_LBRACK RBRACK_RCURL )=> ( LCURL_LBRACK RBRACK_RCURL ) | ( LBRACK_LCURL RCURL_RBRACK )=> ( LBRACK_LCURL RCURL_RBRACK ) | () ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:569:3: ( ( ( integerSymbol DDOT STAR | integerSymbol DDOT integerSymbol )=> ( (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) ) | ( LBRACKET integerSymbol DDOT )=> ( LBRACKET (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACKET ) | ( LCURL integerSymbol DDOT )=> ( LCURL (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL ) | ( LBRACK_LCURL integerSymbol DDOT )=> ( LBRACK_LCURL (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL_RBRACK ) | ( LCURL_LBRACK integerSymbol DDOT )=> ( LCURL_LBRACK (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACK_RCURL ) | ( STAR | integerSymbol ~ DDOT )=> ( ( ( STAR ) | ( (temp= integerSymbol ) ) ) ) | ( LBRACKET integerSymbol RBRACKET | LBRACKET STAR RBRACKET )=> ( LBRACKET ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACKET ) | ( LBRACKET RBRACKET )=> ( LBRACKET RBRACKET ) | ( LCURL STAR RCURL | LCURL integerSymbol RCURL )=> ( LCURL ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL ) | ( LCURL RCURL )=> ( LCURL RCURL ) | ( LBRACK_LCURL STAR RCURL_RBRACK | LBRACK_LCURL integerSymbol RCURL_RBRACK )=> ( LBRACK_LCURL ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL_RBRACK ) | ( LCURL_LBRACK STAR RBRACK_RCURL | LCURL_LBRACK integerSymbol RBRACK_RCURL )=> ( LCURL_LBRACK ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACK_RCURL ) | ( LCURL_LBRACK RBRACK_RCURL )=> ( LCURL_LBRACK RBRACK_RCURL ) | ( LBRACK_LCURL RCURL_RBRACK )=> ( LBRACK_LCURL RCURL_RBRACK ) | () ) )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:569:3: ( ( ( integerSymbol DDOT STAR | integerSymbol DDOT integerSymbol )=> ( (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) ) | ( LBRACKET integerSymbol DDOT )=> ( LBRACKET (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACKET ) | ( LCURL integerSymbol DDOT )=> ( LCURL (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL ) | ( LBRACK_LCURL integerSymbol DDOT )=> ( LBRACK_LCURL (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL_RBRACK ) | ( LCURL_LBRACK integerSymbol DDOT )=> ( LCURL_LBRACK (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACK_RCURL ) | ( STAR | integerSymbol ~ DDOT )=> ( ( ( STAR ) | ( (temp= integerSymbol ) ) ) ) | ( LBRACKET integerSymbol RBRACKET | LBRACKET STAR RBRACKET )=> ( LBRACKET ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACKET ) | ( LBRACKET RBRACKET )=> ( LBRACKET RBRACKET ) | ( LCURL STAR RCURL | LCURL integerSymbol RCURL )=> ( LCURL ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL ) | ( LCURL RCURL )=> ( LCURL RCURL ) | ( LBRACK_LCURL STAR RCURL_RBRACK | LBRACK_LCURL integerSymbol RCURL_RBRACK )=> ( LBRACK_LCURL ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL_RBRACK ) | ( LCURL_LBRACK STAR RBRACK_RCURL | LCURL_LBRACK integerSymbol RBRACK_RCURL )=> ( LCURL_LBRACK ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACK_RCURL ) | ( LCURL_LBRACK RBRACK_RCURL )=> ( LCURL_LBRACK RBRACK_RCURL ) | ( LBRACK_LCURL RCURL_RBRACK )=> ( LBRACK_LCURL RCURL_RBRACK ) | () ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:569:4: ( ( integerSymbol DDOT STAR | integerSymbol DDOT integerSymbol )=> ( (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) ) | ( LBRACKET integerSymbol DDOT )=> ( LBRACKET (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACKET ) | ( LCURL integerSymbol DDOT )=> ( LCURL (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL ) | ( LBRACK_LCURL integerSymbol DDOT )=> ( LBRACK_LCURL (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL_RBRACK ) | ( LCURL_LBRACK integerSymbol DDOT )=> ( LCURL_LBRACK (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACK_RCURL ) | ( STAR | integerSymbol ~ DDOT )=> ( ( ( STAR ) | ( (temp= integerSymbol ) ) ) ) | ( LBRACKET integerSymbol RBRACKET | LBRACKET STAR RBRACKET )=> ( LBRACKET ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACKET ) | ( LBRACKET RBRACKET )=> ( LBRACKET RBRACKET ) | ( LCURL STAR RCURL | LCURL integerSymbol RCURL )=> ( LCURL ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL ) | ( LCURL RCURL )=> ( LCURL RCURL ) | ( LBRACK_LCURL STAR RCURL_RBRACK | LBRACK_LCURL integerSymbol RCURL_RBRACK )=> ( LBRACK_LCURL ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL_RBRACK ) | ( LCURL_LBRACK STAR RBRACK_RCURL | LCURL_LBRACK integerSymbol RBRACK_RCURL )=> ( LCURL_LBRACK ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACK_RCURL ) | ( LCURL_LBRACK RBRACK_RCURL )=> ( LCURL_LBRACK RBRACK_RCURL ) | ( LBRACK_LCURL RCURL_RBRACK )=> ( LBRACK_LCURL RCURL_RBRACK ) | () )
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8E9CDD1334511DFB48EEC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:569:63: ( ( integerSymbol DDOT STAR | integerSymbol DDOT integerSymbol )=> ( (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) ) | ( LBRACKET integerSymbol DDOT )=> ( LBRACKET (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACKET ) | ( LCURL integerSymbol DDOT )=> ( LCURL (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL ) | ( LBRACK_LCURL integerSymbol DDOT )=> ( LBRACK_LCURL (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL_RBRACK ) | ( LCURL_LBRACK integerSymbol DDOT )=> ( LCURL_LBRACK (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACK_RCURL ) | ( STAR | integerSymbol ~ DDOT )=> ( ( ( STAR ) | ( (temp= integerSymbol ) ) ) ) | ( LBRACKET integerSymbol RBRACKET | LBRACKET STAR RBRACKET )=> ( LBRACKET ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACKET ) | ( LBRACKET RBRACKET )=> ( LBRACKET RBRACKET ) | ( LCURL STAR RCURL | LCURL integerSymbol RCURL )=> ( LCURL ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL ) | ( LCURL RCURL )=> ( LCURL RCURL ) | ( LBRACK_LCURL STAR RCURL_RBRACK | LBRACK_LCURL integerSymbol RCURL_RBRACK )=> ( LBRACK_LCURL ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL_RBRACK ) | ( LCURL_LBRACK STAR RBRACK_RCURL | LCURL_LBRACK integerSymbol RBRACK_RCURL )=> ( LCURL_LBRACK ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACK_RCURL ) | ( LCURL_LBRACK RBRACK_RCURL )=> ( LCURL_LBRACK RBRACK_RCURL ) | ( LBRACK_LCURL RCURL_RBRACK )=> ( LBRACK_LCURL RCURL_RBRACK ) | () )
            int alt32=15;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:569:64: ( integerSymbol DDOT STAR | integerSymbol DDOT integerSymbol )=> ( (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(0);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:569:144: ( (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:569:145: (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) )
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E1B781334511DFCE21EC660A0001C5");
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:569:204: (temp= integerSymbol )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:569:206: temp= integerSymbol
                    {
                    pushFollow(FOLLOW_integerSymbol_in_model_multiplicitytype1926);
                    temp=integerSymbol();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "lower", temp);
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E1B782334511DFC95DEC660A0001C5");
                    }
                    match(input,DDOT,FOLLOW_DDOT_in_model_multiplicitytype1933); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E205A0334511DFBA0FEC660A0001C5");
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:569:417: ( ( STAR ) | ( (temp= integerSymbol ) ) )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==STAR) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==INT) ) {
                        alt22=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ret2;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:569:418: ( STAR )
                            {
                            if ( state.backtracking==0 ) {
                              _enterAlt(0);
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:569:434: ( STAR )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:569:435: STAR
                            {
                            if ( state.backtracking==0 ) {
                              _beforeSeqEl("E009322EC8E1DE91334511DFCA67EC660A0001C5");
                            }
                            match(input,STAR,FOLLOW_STAR_in_model_multiplicitytype1944); if (state.failed) return ret2;
                            if ( state.backtracking==0 ) {
                              _afterSeqEl();
                            }

                            }

                            if ( state.backtracking==0 ) {
                              setProperty(ret, "upper", new Integer(-1));
                            }
                            if ( state.backtracking==0 ) {
                              _exitAlt();
                            }

                            }
                            break;
                        case 2 :
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:569:579: ( (temp= integerSymbol ) )
                            {
                            if ( state.backtracking==0 ) {
                              _enterAlt(1);
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:569:595: ( (temp= integerSymbol ) )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:569:596: (temp= integerSymbol )
                            {
                            if ( state.backtracking==0 ) {
                              _beforeSeqEl("E009322EC8E1DE94334511DF94AFEC660A0001C5");
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:569:655: (temp= integerSymbol )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:569:657: temp= integerSymbol
                            {
                            pushFollow(FOLLOW_integerSymbol_in_model_multiplicitytype1962);
                            temp=integerSymbol();

                            checkFollows();
                            state._fsp--;
                            if (state.failed) return ret2;
                            if ( state.backtracking==0 ) {
                              setProperty(ret, "upper", temp);
                            }

                            }

                            if ( state.backtracking==0 ) {
                              _afterSeqEl();
                            }

                            }

                            if ( state.backtracking==0 ) {
                            }
                            if ( state.backtracking==0 ) {
                              _exitAlt();
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E22CB2334511DF8591EC660A0001C5");
                    }
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "isUnique", false);_exitInjectorAction();setProperty(ret, "isOrdered", false);_exitInjectorAction();
                    }
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 2 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:571:4: ( LBRACKET integerSymbol DDOT )=> ( LBRACKET (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACKET )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(1);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:571:53: ( LBRACKET (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACKET )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:571:54: LBRACKET (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACKET
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E253C0334511DF97CDEC660A0001C5");
                    }
                    match(input,LBRACKET,FOLLOW_LBRACKET_in_model_multiplicitytype1999); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E253C2334511DFBDC2EC660A0001C5");
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:571:198: (temp= integerSymbol )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:571:200: temp= integerSymbol
                    {
                    pushFollow(FOLLOW_integerSymbol_in_model_multiplicitytype2007);
                    temp=integerSymbol();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "lower", temp);
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E253C3334511DFC8A1EC660A0001C5");
                    }
                    match(input,DDOT,FOLLOW_DDOT_in_model_multiplicitytype2014); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E27AD6334511DF96F8EC660A0001C5");
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:571:411: ( ( STAR ) | ( (temp= integerSymbol ) ) )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==STAR) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==INT) ) {
                        alt23=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ret2;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:571:412: ( STAR )
                            {
                            if ( state.backtracking==0 ) {
                              _enterAlt(0);
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:571:428: ( STAR )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:571:429: STAR
                            {
                            if ( state.backtracking==0 ) {
                              _beforeSeqEl("E009322EC8E27AD1334511DF82C4EC660A0001C5");
                            }
                            match(input,STAR,FOLLOW_STAR_in_model_multiplicitytype2025); if (state.failed) return ret2;
                            if ( state.backtracking==0 ) {
                              _afterSeqEl();
                            }

                            }

                            if ( state.backtracking==0 ) {
                              setProperty(ret, "upper", new Integer(-1));
                            }
                            if ( state.backtracking==0 ) {
                              _exitAlt();
                            }

                            }
                            break;
                        case 2 :
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:571:573: ( (temp= integerSymbol ) )
                            {
                            if ( state.backtracking==0 ) {
                              _enterAlt(1);
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:571:589: ( (temp= integerSymbol ) )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:571:590: (temp= integerSymbol )
                            {
                            if ( state.backtracking==0 ) {
                              _beforeSeqEl("E009322EC8E27AD4334511DFAEEFEC660A0001C5");
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:571:649: (temp= integerSymbol )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:571:651: temp= integerSymbol
                            {
                            pushFollow(FOLLOW_integerSymbol_in_model_multiplicitytype2043);
                            temp=integerSymbol();

                            checkFollows();
                            state._fsp--;
                            if (state.failed) return ret2;
                            if ( state.backtracking==0 ) {
                              setProperty(ret, "upper", temp);
                            }

                            }

                            if ( state.backtracking==0 ) {
                              _afterSeqEl();
                            }

                            }

                            if ( state.backtracking==0 ) {
                            }
                            if ( state.backtracking==0 ) {
                              _exitAlt();
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E2C8F0334511DF97DBEC660A0001C5");
                    }
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "isUnique", false);_exitInjectorAction();setProperty(ret, "isOrdered", true);_exitInjectorAction();
                    }
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E2C8F1334511DF8D0AEC660A0001C5");
                    }
                    match(input,RBRACKET,FOLLOW_RBRACKET_in_model_multiplicitytype2060); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 3 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:573:4: ( LCURL integerSymbol DDOT )=> ( LCURL (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(2);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:573:50: ( LCURL (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:573:51: LCURL (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E2F000334511DFC8F0EC660A0001C5");
                    }
                    match(input,LCURL,FOLLOW_LCURL_in_model_multiplicitytype2085); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E2F002334511DFBCFFEC660A0001C5");
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:573:192: (temp= integerSymbol )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:573:194: temp= integerSymbol
                    {
                    pushFollow(FOLLOW_integerSymbol_in_model_multiplicitytype2093);
                    temp=integerSymbol();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "lower", temp);
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E2F003334511DFB4ACEC660A0001C5");
                    }
                    match(input,DDOT,FOLLOW_DDOT_in_model_multiplicitytype2100); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E31715334511DF855FEC660A0001C5");
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:573:405: ( ( STAR ) | ( (temp= integerSymbol ) ) )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==STAR) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==INT) ) {
                        alt24=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ret2;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:573:406: ( STAR )
                            {
                            if ( state.backtracking==0 ) {
                              _enterAlt(0);
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:573:422: ( STAR )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:573:423: STAR
                            {
                            if ( state.backtracking==0 ) {
                              _beforeSeqEl("E009322EC8E31710334511DF8FEDEC660A0001C5");
                            }
                            match(input,STAR,FOLLOW_STAR_in_model_multiplicitytype2111); if (state.failed) return ret2;
                            if ( state.backtracking==0 ) {
                              _afterSeqEl();
                            }

                            }

                            if ( state.backtracking==0 ) {
                              setProperty(ret, "upper", new Integer(-1));
                            }
                            if ( state.backtracking==0 ) {
                              _exitAlt();
                            }

                            }
                            break;
                        case 2 :
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:573:567: ( (temp= integerSymbol ) )
                            {
                            if ( state.backtracking==0 ) {
                              _enterAlt(1);
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:573:583: ( (temp= integerSymbol ) )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:573:584: (temp= integerSymbol )
                            {
                            if ( state.backtracking==0 ) {
                              _beforeSeqEl("E009322EC8E31713334511DFB05FEC660A0001C5");
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:573:643: (temp= integerSymbol )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:573:645: temp= integerSymbol
                            {
                            pushFollow(FOLLOW_integerSymbol_in_model_multiplicitytype2129);
                            temp=integerSymbol();

                            checkFollows();
                            state._fsp--;
                            if (state.failed) return ret2;
                            if ( state.backtracking==0 ) {
                              setProperty(ret, "upper", temp);
                            }

                            }

                            if ( state.backtracking==0 ) {
                              _afterSeqEl();
                            }

                            }

                            if ( state.backtracking==0 ) {
                            }
                            if ( state.backtracking==0 ) {
                              _exitAlt();
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E36530334511DFA274EC660A0001C5");
                    }
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "isUnique", true);_exitInjectorAction();setProperty(ret, "isOrdered", false);_exitInjectorAction();
                    }
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E36531334511DF8506EC660A0001C5");
                    }
                    match(input,RCURL,FOLLOW_RCURL_in_model_multiplicitytype2146); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 4 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:575:4: ( LBRACK_LCURL integerSymbol DDOT )=> ( LBRACK_LCURL (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL_RBRACK )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(3);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:575:57: ( LBRACK_LCURL (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL_RBRACK )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:575:58: LBRACK_LCURL (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL_RBRACK
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E38C40334511DF932BEC660A0001C5");
                    }
                    match(input,LBRACK_LCURL,FOLLOW_LBRACK_LCURL_in_model_multiplicitytype2171); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E38C42334511DFCAB1EC660A0001C5");
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:575:206: (temp= integerSymbol )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:575:208: temp= integerSymbol
                    {
                    pushFollow(FOLLOW_integerSymbol_in_model_multiplicitytype2179);
                    temp=integerSymbol();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "lower", temp);
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E38C43334511DFC36CEC660A0001C5");
                    }
                    match(input,DDOT,FOLLOW_DDOT_in_model_multiplicitytype2186); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E3DA60334511DF8FD7EC660A0001C5");
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:575:419: ( ( STAR ) | ( (temp= integerSymbol ) ) )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==STAR) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==INT) ) {
                        alt25=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ret2;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:575:420: ( STAR )
                            {
                            if ( state.backtracking==0 ) {
                              _enterAlt(0);
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:575:436: ( STAR )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:575:437: STAR
                            {
                            if ( state.backtracking==0 ) {
                              _beforeSeqEl("E009322EC8E3B351334511DFAD57EC660A0001C5");
                            }
                            match(input,STAR,FOLLOW_STAR_in_model_multiplicitytype2197); if (state.failed) return ret2;
                            if ( state.backtracking==0 ) {
                              _afterSeqEl();
                            }

                            }

                            if ( state.backtracking==0 ) {
                              setProperty(ret, "upper", new Integer(-1));
                            }
                            if ( state.backtracking==0 ) {
                              _exitAlt();
                            }

                            }
                            break;
                        case 2 :
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:575:581: ( (temp= integerSymbol ) )
                            {
                            if ( state.backtracking==0 ) {
                              _enterAlt(1);
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:575:597: ( (temp= integerSymbol ) )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:575:598: (temp= integerSymbol )
                            {
                            if ( state.backtracking==0 ) {
                              _beforeSeqEl("E009322EC8E3B354334511DF880DEC660A0001C5");
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:575:657: (temp= integerSymbol )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:575:659: temp= integerSymbol
                            {
                            pushFollow(FOLLOW_integerSymbol_in_model_multiplicitytype2215);
                            temp=integerSymbol();

                            checkFollows();
                            state._fsp--;
                            if (state.failed) return ret2;
                            if ( state.backtracking==0 ) {
                              setProperty(ret, "upper", temp);
                            }

                            }

                            if ( state.backtracking==0 ) {
                              _afterSeqEl();
                            }

                            }

                            if ( state.backtracking==0 ) {
                            }
                            if ( state.backtracking==0 ) {
                              _exitAlt();
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E40172334511DF9E87EC660A0001C5");
                    }
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "isUnique", true);_exitInjectorAction();setProperty(ret, "isOrdered", true);_exitInjectorAction();
                    }
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E40173334511DFC291EC660A0001C5");
                    }
                    match(input,RCURL_RBRACK,FOLLOW_RCURL_RBRACK_in_model_multiplicitytype2232); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 5 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:577:4: ( LCURL_LBRACK integerSymbol DDOT )=> ( LCURL_LBRACK (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACK_RCURL )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(4);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:577:57: ( LCURL_LBRACK (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACK_RCURL )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:577:58: LCURL_LBRACK (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACK_RCURL
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E42880334511DFCEE0EC660A0001C5");
                    }
                    match(input,LCURL_LBRACK,FOLLOW_LCURL_LBRACK_in_model_multiplicitytype2257); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E42882334511DF9570EC660A0001C5");
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:577:206: (temp= integerSymbol )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:577:208: temp= integerSymbol
                    {
                    pushFollow(FOLLOW_integerSymbol_in_model_multiplicitytype2265);
                    temp=integerSymbol();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "lower", temp);
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E42883334511DFCB34EC660A0001C5");
                    }
                    match(input,DDOT,FOLLOW_DDOT_in_model_multiplicitytype2272); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E476A3334511DF91C4EC660A0001C5");
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:577:419: ( ( STAR ) | ( (temp= integerSymbol ) ) )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==STAR) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==INT) ) {
                        alt26=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ret2;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }
                    switch (alt26) {
                        case 1 :
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:577:420: ( STAR )
                            {
                            if ( state.backtracking==0 ) {
                              _enterAlt(0);
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:577:436: ( STAR )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:577:437: STAR
                            {
                            if ( state.backtracking==0 ) {
                              _beforeSeqEl("E009322EC8E44F94334511DFB223EC660A0001C5");
                            }
                            match(input,STAR,FOLLOW_STAR_in_model_multiplicitytype2283); if (state.failed) return ret2;
                            if ( state.backtracking==0 ) {
                              _afterSeqEl();
                            }

                            }

                            if ( state.backtracking==0 ) {
                              setProperty(ret, "upper", new Integer(-1));
                            }
                            if ( state.backtracking==0 ) {
                              _exitAlt();
                            }

                            }
                            break;
                        case 2 :
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:577:581: ( (temp= integerSymbol ) )
                            {
                            if ( state.backtracking==0 ) {
                              _enterAlt(1);
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:577:597: ( (temp= integerSymbol ) )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:577:598: (temp= integerSymbol )
                            {
                            if ( state.backtracking==0 ) {
                              _beforeSeqEl("E009322EC8E476A1334511DFC5E4EC660A0001C5");
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:577:657: (temp= integerSymbol )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:577:659: temp= integerSymbol
                            {
                            pushFollow(FOLLOW_integerSymbol_in_model_multiplicitytype2301);
                            temp=integerSymbol();

                            checkFollows();
                            state._fsp--;
                            if (state.failed) return ret2;
                            if ( state.backtracking==0 ) {
                              setProperty(ret, "upper", temp);
                            }

                            }

                            if ( state.backtracking==0 ) {
                              _afterSeqEl();
                            }

                            }

                            if ( state.backtracking==0 ) {
                            }
                            if ( state.backtracking==0 ) {
                              _exitAlt();
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E49DB4334511DFB61DEC660A0001C5");
                    }
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "isUnique", true);_exitInjectorAction();setProperty(ret, "isOrdered", true);_exitInjectorAction();
                    }
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E4C4C0334511DFB5F0EC660A0001C5");
                    }
                    match(input,RBRACK_RCURL,FOLLOW_RBRACK_RCURL_in_model_multiplicitytype2318); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 6 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:579:4: ( STAR | integerSymbol ~ DDOT )=> ( ( ( STAR ) | ( (temp= integerSymbol ) ) ) )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(5);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:579:52: ( ( ( STAR ) | ( (temp= integerSymbol ) ) ) )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:579:53: ( ( STAR ) | ( (temp= integerSymbol ) ) )
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E512E1334511DFC37EEC660A0001C5");
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:579:113: ( ( STAR ) | ( (temp= integerSymbol ) ) )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==STAR) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==INT) ) {
                        alt27=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ret2;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:579:114: ( STAR )
                            {
                            if ( state.backtracking==0 ) {
                              _enterAlt(0);
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:579:130: ( STAR )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:579:131: STAR
                            {
                            if ( state.backtracking==0 ) {
                              _beforeSeqEl("E009322EC8E4EBD3334511DFA117EC660A0001C5");
                            }
                            match(input,STAR,FOLLOW_STAR_in_model_multiplicitytype2352); if (state.failed) return ret2;
                            if ( state.backtracking==0 ) {
                              _afterSeqEl();
                            }

                            }

                            if ( state.backtracking==0 ) {
                              setProperty(ret, "upper", new Integer(-1));
                            }
                            if ( state.backtracking==0 ) {
                              _exitAlt();
                            }

                            }
                            break;
                        case 2 :
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:579:275: ( (temp= integerSymbol ) )
                            {
                            if ( state.backtracking==0 ) {
                              _enterAlt(1);
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:579:291: ( (temp= integerSymbol ) )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:579:292: (temp= integerSymbol )
                            {
                            if ( state.backtracking==0 ) {
                              _beforeSeqEl("E009322EC8E4EBD6334511DF80E1EC660A0001C5");
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:579:351: (temp= integerSymbol )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:579:353: temp= integerSymbol
                            {
                            pushFollow(FOLLOW_integerSymbol_in_model_multiplicitytype2370);
                            temp=integerSymbol();

                            checkFollows();
                            state._fsp--;
                            if (state.failed) return ret2;
                            if ( state.backtracking==0 ) {
                              setProperty(ret, "upper", temp);
                            }

                            }

                            if ( state.backtracking==0 ) {
                              _afterSeqEl();
                            }

                            }

                            if ( state.backtracking==0 ) {
                            }
                            if ( state.backtracking==0 ) {
                              _exitAlt();
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E539F4334511DFAA4EEC660A0001C5");
                    }
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "lower", 0);_exitInjectorAction();setProperty(ret, "isUnique", false);_exitInjectorAction();setProperty(ret, "isOrdered", false);_exitInjectorAction();
                    }
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 7 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:581:4: ( LBRACKET integerSymbol RBRACKET | LBRACKET STAR RBRACKET )=> ( LBRACKET ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACKET )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(6);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:581:82: ( LBRACKET ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACKET )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:581:83: LBRACKET ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACKET
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E56101334511DF98EEEC660A0001C5");
                    }
                    match(input,LBRACKET,FOLLOW_LBRACKET_in_model_multiplicitytype2415); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E5AF20334511DF8992EC660A0001C5");
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:581:228: ( ( STAR ) | ( (temp= integerSymbol ) ) )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==STAR) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==INT) ) {
                        alt28=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ret2;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:581:229: ( STAR )
                            {
                            if ( state.backtracking==0 ) {
                              _enterAlt(0);
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:581:245: ( STAR )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:581:246: STAR
                            {
                            if ( state.backtracking==0 ) {
                              _beforeSeqEl("E009322EC8E58811334511DFC119EC660A0001C5");
                            }
                            match(input,STAR,FOLLOW_STAR_in_model_multiplicitytype2426); if (state.failed) return ret2;
                            if ( state.backtracking==0 ) {
                              _afterSeqEl();
                            }

                            }

                            if ( state.backtracking==0 ) {
                              setProperty(ret, "upper", new Integer(-1));
                            }
                            if ( state.backtracking==0 ) {
                              _exitAlt();
                            }

                            }
                            break;
                        case 2 :
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:581:390: ( (temp= integerSymbol ) )
                            {
                            if ( state.backtracking==0 ) {
                              _enterAlt(1);
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:581:406: ( (temp= integerSymbol ) )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:581:407: (temp= integerSymbol )
                            {
                            if ( state.backtracking==0 ) {
                              _beforeSeqEl("E009322EC8E58814334511DFA976EC660A0001C5");
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:581:466: (temp= integerSymbol )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:581:468: temp= integerSymbol
                            {
                            pushFollow(FOLLOW_integerSymbol_in_model_multiplicitytype2444);
                            temp=integerSymbol();

                            checkFollows();
                            state._fsp--;
                            if (state.failed) return ret2;
                            if ( state.backtracking==0 ) {
                              setProperty(ret, "upper", temp);
                            }

                            }

                            if ( state.backtracking==0 ) {
                              _afterSeqEl();
                            }

                            }

                            if ( state.backtracking==0 ) {
                            }
                            if ( state.backtracking==0 ) {
                              _exitAlt();
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E5D634334511DFB4A5EC660A0001C5");
                    }
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "lower", 0);_exitInjectorAction();setProperty(ret, "isUnique", false);_exitInjectorAction();setProperty(ret, "isOrdered", false);_exitInjectorAction();
                    }
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E5FD40334511DFA361EC660A0001C5");
                    }
                    match(input,RBRACKET,FOLLOW_RBRACKET_in_model_multiplicitytype2461); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 8 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:583:4: ( LBRACKET RBRACKET )=> ( LBRACKET RBRACKET )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(7);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:583:43: ( LBRACKET RBRACKET )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:583:44: LBRACKET RBRACKET
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E5FD42334511DF82B9EC660A0001C5");
                    }
                    match(input,LBRACKET,FOLLOW_LBRACKET_in_model_multiplicitytype2484); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E64B60334511DFB087EC660A0001C5");
                    }
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "upper", -1);_exitInjectorAction();setProperty(ret, "lower", 0);_exitInjectorAction();setProperty(ret, "isUnique", false);_exitInjectorAction();setProperty(ret, "isOrdered", true);_exitInjectorAction();
                    }
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E64B61334511DF9ED5EC660A0001C5");
                    }
                    match(input,RBRACKET,FOLLOW_RBRACKET_in_model_multiplicitytype2492); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 9 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:584:4: ( LCURL STAR RCURL | LCURL integerSymbol RCURL )=> ( LCURL ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(8);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:584:70: ( LCURL ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:584:71: LCURL ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E67270334511DFBEA8EC660A0001C5");
                    }
                    match(input,LCURL,FOLLOW_LCURL_in_model_multiplicitytype2525); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E69984334511DF876EEC660A0001C5");
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:584:213: ( ( STAR ) | ( (temp= integerSymbol ) ) )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==STAR) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==INT) ) {
                        alt29=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ret2;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:584:214: ( STAR )
                            {
                            if ( state.backtracking==0 ) {
                              _enterAlt(0);
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:584:230: ( STAR )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:584:231: STAR
                            {
                            if ( state.backtracking==0 ) {
                              _beforeSeqEl("E009322EC8E67275334511DF829EEC660A0001C5");
                            }
                            match(input,STAR,FOLLOW_STAR_in_model_multiplicitytype2536); if (state.failed) return ret2;
                            if ( state.backtracking==0 ) {
                              _afterSeqEl();
                            }

                            }

                            if ( state.backtracking==0 ) {
                              setProperty(ret, "upper", new Integer(-1));
                            }
                            if ( state.backtracking==0 ) {
                              _exitAlt();
                            }

                            }
                            break;
                        case 2 :
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:584:375: ( (temp= integerSymbol ) )
                            {
                            if ( state.backtracking==0 ) {
                              _enterAlt(1);
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:584:391: ( (temp= integerSymbol ) )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:584:392: (temp= integerSymbol )
                            {
                            if ( state.backtracking==0 ) {
                              _beforeSeqEl("E009322EC8E69982334511DFA05DEC660A0001C5");
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:584:451: (temp= integerSymbol )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:584:453: temp= integerSymbol
                            {
                            pushFollow(FOLLOW_integerSymbol_in_model_multiplicitytype2554);
                            temp=integerSymbol();

                            checkFollows();
                            state._fsp--;
                            if (state.failed) return ret2;
                            if ( state.backtracking==0 ) {
                              setProperty(ret, "upper", temp);
                            }

                            }

                            if ( state.backtracking==0 ) {
                              _afterSeqEl();
                            }

                            }

                            if ( state.backtracking==0 ) {
                            }
                            if ( state.backtracking==0 ) {
                              _exitAlt();
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E6E7A0334511DF9096EC660A0001C5");
                    }
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "lower", 0);_exitInjectorAction();setProperty(ret, "isUnique", true);_exitInjectorAction();setProperty(ret, "isOrdered", false);_exitInjectorAction();
                    }
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E6E7A1334511DFB2D9EC660A0001C5");
                    }
                    match(input,RCURL,FOLLOW_RCURL_in_model_multiplicitytype2571); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 10 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:586:4: ( LCURL RCURL )=> ( LCURL RCURL )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(9);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:586:37: ( LCURL RCURL )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:586:38: LCURL RCURL
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E70EB0334511DF832AEC660A0001C5");
                    }
                    match(input,LCURL,FOLLOW_LCURL_in_model_multiplicitytype2594); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E735C2334511DF9338EC660A0001C5");
                    }
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "upper", -1);_exitInjectorAction();setProperty(ret, "lower", 0);_exitInjectorAction();setProperty(ret, "isUnique", true);_exitInjectorAction();setProperty(ret, "isOrdered", false);_exitInjectorAction();
                    }
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E735C3334511DF881FEC660A0001C5");
                    }
                    match(input,RCURL,FOLLOW_RCURL_in_model_multiplicitytype2602); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 11 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:587:4: ( LBRACK_LCURL STAR RCURL_RBRACK | LBRACK_LCURL integerSymbol RCURL_RBRACK )=> ( LBRACK_LCURL ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL_RBRACK )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(10);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:587:99: ( LBRACK_LCURL ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL_RBRACK )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:587:100: LBRACK_LCURL ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL_RBRACK
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E75CD0334511DF97E9EC660A0001C5");
                    }
                    match(input,LBRACK_LCURL,FOLLOW_LBRACK_LCURL_in_model_multiplicitytype2635); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E783E5334511DF84CFEC660A0001C5");
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:587:249: ( ( STAR ) | ( (temp= integerSymbol ) ) )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==STAR) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==INT) ) {
                        alt30=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ret2;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }
                    switch (alt30) {
                        case 1 :
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:587:250: ( STAR )
                            {
                            if ( state.backtracking==0 ) {
                              _enterAlt(0);
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:587:266: ( STAR )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:587:267: STAR
                            {
                            if ( state.backtracking==0 ) {
                              _beforeSeqEl("E009322EC8E783E0334511DFCE7DEC660A0001C5");
                            }
                            match(input,STAR,FOLLOW_STAR_in_model_multiplicitytype2646); if (state.failed) return ret2;
                            if ( state.backtracking==0 ) {
                              _afterSeqEl();
                            }

                            }

                            if ( state.backtracking==0 ) {
                              setProperty(ret, "upper", new Integer(-1));
                            }
                            if ( state.backtracking==0 ) {
                              _exitAlt();
                            }

                            }
                            break;
                        case 2 :
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:587:411: ( (temp= integerSymbol ) )
                            {
                            if ( state.backtracking==0 ) {
                              _enterAlt(1);
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:587:427: ( (temp= integerSymbol ) )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:587:428: (temp= integerSymbol )
                            {
                            if ( state.backtracking==0 ) {
                              _beforeSeqEl("E009322EC8E783E3334511DFBF4FEC660A0001C5");
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:587:487: (temp= integerSymbol )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:587:489: temp= integerSymbol
                            {
                            pushFollow(FOLLOW_integerSymbol_in_model_multiplicitytype2664);
                            temp=integerSymbol();

                            checkFollows();
                            state._fsp--;
                            if (state.failed) return ret2;
                            if ( state.backtracking==0 ) {
                              setProperty(ret, "upper", temp);
                            }

                            }

                            if ( state.backtracking==0 ) {
                              _afterSeqEl();
                            }

                            }

                            if ( state.backtracking==0 ) {
                            }
                            if ( state.backtracking==0 ) {
                              _exitAlt();
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E7D200334511DFA898EC660A0001C5");
                    }
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "lower", 0);_exitInjectorAction();setProperty(ret, "isUnique", true);_exitInjectorAction();setProperty(ret, "isOrdered", true);_exitInjectorAction();
                    }
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E7D201334511DF82ACEC660A0001C5");
                    }
                    match(input,RCURL_RBRACK,FOLLOW_RCURL_RBRACK_in_model_multiplicitytype2681); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 12 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:589:4: ( LCURL_LBRACK STAR RBRACK_RCURL | LCURL_LBRACK integerSymbol RBRACK_RCURL )=> ( LCURL_LBRACK ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACK_RCURL )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(11);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:589:99: ( LCURL_LBRACK ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACK_RCURL )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:589:100: LCURL_LBRACK ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACK_RCURL
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E7F910334511DFB89FEC660A0001C5");
                    }
                    match(input,LCURL_LBRACK,FOLLOW_LCURL_LBRACK_in_model_multiplicitytype2714); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E82023334511DFA378EC660A0001C5");
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:589:249: ( ( STAR ) | ( (temp= integerSymbol ) ) )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==STAR) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==INT) ) {
                        alt31=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ret2;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:589:250: ( STAR )
                            {
                            if ( state.backtracking==0 ) {
                              _enterAlt(0);
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:589:266: ( STAR )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:589:267: STAR
                            {
                            if ( state.backtracking==0 ) {
                              _beforeSeqEl("E009322EC8E7F915334511DFA1B8EC660A0001C5");
                            }
                            match(input,STAR,FOLLOW_STAR_in_model_multiplicitytype2725); if (state.failed) return ret2;
                            if ( state.backtracking==0 ) {
                              _afterSeqEl();
                            }

                            }

                            if ( state.backtracking==0 ) {
                              setProperty(ret, "upper", new Integer(-1));
                            }
                            if ( state.backtracking==0 ) {
                              _exitAlt();
                            }

                            }
                            break;
                        case 2 :
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:589:411: ( (temp= integerSymbol ) )
                            {
                            if ( state.backtracking==0 ) {
                              _enterAlt(1);
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:589:427: ( (temp= integerSymbol ) )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:589:428: (temp= integerSymbol )
                            {
                            if ( state.backtracking==0 ) {
                              _beforeSeqEl("E009322EC8E82021334511DFA392EC660A0001C5");
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:589:487: (temp= integerSymbol )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:589:489: temp= integerSymbol
                            {
                            pushFollow(FOLLOW_integerSymbol_in_model_multiplicitytype2743);
                            temp=integerSymbol();

                            checkFollows();
                            state._fsp--;
                            if (state.failed) return ret2;
                            if ( state.backtracking==0 ) {
                              setProperty(ret, "upper", temp);
                            }

                            }

                            if ( state.backtracking==0 ) {
                              _afterSeqEl();
                            }

                            }

                            if ( state.backtracking==0 ) {
                            }
                            if ( state.backtracking==0 ) {
                              _exitAlt();
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E84736334511DF8A43EC660A0001C5");
                    }
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "lower", 0);_exitInjectorAction();setProperty(ret, "isUnique", true);_exitInjectorAction();setProperty(ret, "isOrdered", true);_exitInjectorAction();
                    }
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E86E40334511DF87F3EC660A0001C5");
                    }
                    match(input,RBRACK_RCURL,FOLLOW_RBRACK_RCURL_in_model_multiplicitytype2760); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 13 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:591:4: ( LCURL_LBRACK RBRACK_RCURL )=> ( LCURL_LBRACK RBRACK_RCURL )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(12);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:591:52: ( LCURL_LBRACK RBRACK_RCURL )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:591:53: LCURL_LBRACK RBRACK_RCURL
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E86E42334511DF9935EC660A0001C5");
                    }
                    match(input,LCURL_LBRACK,FOLLOW_LCURL_LBRACK_in_model_multiplicitytype2783); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E90A81334511DF8167EC660A0001C5");
                    }
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "lower", 0);_exitInjectorAction();setProperty(ret, "upper", -1);_exitInjectorAction();setProperty(ret, "isUnique", true);_exitInjectorAction();setProperty(ret, "isOrdered", true);_exitInjectorAction();
                    }
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E90A82334511DFB5E4EC660A0001C5");
                    }
                    match(input,RBRACK_RCURL,FOLLOW_RBRACK_RCURL_in_model_multiplicitytype2791); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 14 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:592:4: ( LBRACK_LCURL RCURL_RBRACK )=> ( LBRACK_LCURL RCURL_RBRACK )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(13);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:592:52: ( LBRACK_LCURL RCURL_RBRACK )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:592:53: LBRACK_LCURL RCURL_RBRACK
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E93190334511DFCB6AEC660A0001C5");
                    }
                    match(input,LBRACK_LCURL,FOLLOW_LBRACK_LCURL_in_model_multiplicitytype2814); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E958A2334511DFB85FEC660A0001C5");
                    }
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "lower", 0);_exitInjectorAction();setProperty(ret, "upper", -1);_exitInjectorAction();setProperty(ret, "isUnique", true);_exitInjectorAction();setProperty(ret, "isOrdered", true);_exitInjectorAction();
                    }
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E958A3334511DFC4D0EC660A0001C5");
                    }
                    match(input,RCURL_RBRACK,FOLLOW_RCURL_RBRACK_in_model_multiplicitytype2822); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 15 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:593:4: ()
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(14);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:593:21: ()
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:593:22: 
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8E9A6C4334511DFA034EC660A0001C5");
                    }
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "lower", 0);_exitInjectorAction();setProperty(ret, "upper", 1);_exitInjectorAction();setProperty(ret, "isOrdered", false);_exitInjectorAction();setProperty(ret, "isUnique", false);_exitInjectorAction();
                    }
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

              ret2 = commitCreation(ret, firstToken, false);

               
            }

            }

        }
        catch (Exception e) {
            handleExceptionInTemplateRule(e, firstToken, ret);
        }
        finally {
            onExitTemplateRule(metaType);
        }
        return ret2;
    }
    // $ANTLR end "model_multiplicitytype"


    // $ANTLR start "model_visibilitykind"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:601:1: model_visibilitykind returns [Object ret2] : ( ( 'public' ) | ( 'protected' ) | ( 'private' ) ) ;
    public final Object model_visibilitykind() throws RecognitionException {
        Object ret2 = null;

        java.lang.Object ret=null;
        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:602:3: ( ( ( 'public' ) | ( 'protected' ) | ( 'private' ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:603:3: ( ( 'public' ) | ( 'protected' ) | ( 'private' ) )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:603:3: ( ( 'public' ) | ( 'protected' ) | ( 'private' ) )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt33=1;
                }
                break;
            case 48:
                {
                alt33=2;
                }
                break;
            case 37:
                {
                alt33=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ret2;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:603:4: ( 'public' )
                    {
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:603:4: ( 'public' )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:603:5: 'public'
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8EA9121334511DFBF55EC660A0001C5");
                    }
                    match(input,44,FOLLOW_44_in_model_visibilitykind2882); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      ret = createEnumLiteral(list("Model","VisibilityKind"), "public_vis");
                    }

                    }
                    break;
                case 2 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:604:4: ( 'protected' )
                    {
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:604:4: ( 'protected' )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:604:5: 'protected'
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8EAB831334511DFB438EC660A0001C5");
                    }
                    match(input,48,FOLLOW_48_in_model_visibilitykind2892); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      ret = createEnumLiteral(list("Model","VisibilityKind"), "protected_vis");
                    }

                    }
                    break;
                case 3 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:605:4: ( 'private' )
                    {
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:605:4: ( 'private' )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:605:5: 'private'
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8EAB834334511DF9A4DEC660A0001C5");
                    }
                    match(input,37,FOLLOW_37_in_model_visibilitykind2902); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      ret = createEnumLiteral(list("Model","VisibilityKind"), "private_vis");
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                ret2=ret;

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "model_visibilitykind"


    // $ANTLR start "annotation"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:612:1: annotation[Object ret] : ( ( ( (temp= annotationSymbol ) ) | ) ) ;
    public final void annotation(Object ret) throws RecognitionException {
        Object temp = null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:613:3: ( ( ( ( (temp= annotationSymbol ) ) | ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:614:3: ( ( ( (temp= annotationSymbol ) ) | ) )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:614:3: ( ( ( (temp= annotationSymbol ) ) | ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:614:4: ( ( (temp= annotationSymbol ) ) | )
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8EB5473334511DF94D4EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:614:64: ( ( (temp= annotationSymbol ) ) | )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==MULTI_LINE_COMMENT) ) {
                alt34=1;
            }
            else if ( (LA34_0==NAME||LA34_0==QNAME||(LA34_0>=36 && LA34_0<=37)||LA34_0==39||LA34_0==44||LA34_0==48||LA34_0==50||LA34_0==56||LA34_0==59) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:614:65: ( (temp= annotationSymbol ) )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(0);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:614:81: ( (temp= annotationSymbol ) )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:614:82: (temp= annotationSymbol )
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8EB5470334511DF9B3BEC660A0001C5");
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:614:141: (temp= annotationSymbol )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:614:143: temp= annotationSymbol
                    {
                    pushFollow(FOLLOW_annotationSymbol_in_annotation2937);
                    temp=annotationSymbol();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "annotation", temp);
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8EB5471334511DFCD01EC660A0001C5");
                    }
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 2 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:614:314: 
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(1);
                    }
                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "annotation"


    // $ANTLR start "visibility"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:622:1: visibility[Object ret] : ( ( () | ( 'public' ) | ( 'protected' ) | ( 'private' ) ) ) ;
    public final void visibility(Object ret) throws RecognitionException {
        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:623:3: ( ( ( () | ( 'public' ) | ( 'protected' ) | ( 'private' ) ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:624:3: ( ( () | ( 'public' ) | ( 'protected' ) | ( 'private' ) ) )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:624:3: ( ( () | ( 'public' ) | ( 'protected' ) | ( 'private' ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:624:4: ( () | ( 'public' ) | ( 'protected' ) | ( 'private' ) )
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8EC65E0334511DFA170EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:624:63: ( () | ( 'public' ) | ( 'protected' ) | ( 'private' ) )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 56:
            case 59:
                {
                alt35=1;
                }
                break;
            case 44:
                {
                alt35=2;
                }
                break;
            case 48:
                {
                alt35=3;
                }
                break;
            case 37:
                {
                alt35=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:624:64: ()
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(0);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:624:80: ()
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:624:81: 
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8EBF0B0334511DFAA9EEC660A0001C5");
                    }
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "visibility", com.sap.tc.moin.repository.mmi.model.VisibilityKindEnum.PUBLIC_VIS);_exitInjectorAction();
                    }
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 2 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:625:4: ( 'public' )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(1);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:625:20: ( 'public' )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:625:21: 'public'
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8EBF0B2334511DFCF22EC660A0001C5");
                    }
                    match(input,44,FOLLOW_44_in_visibility2997); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8EBF0B5334511DFB423EC660A0001C5");
                    }
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "visibility", com.sap.tc.moin.repository.mmi.model.VisibilityKindEnum.PUBLIC_VIS);_exitInjectorAction();
                    }
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 3 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:626:4: ( 'protected' )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(2);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:626:20: ( 'protected' )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:626:21: 'protected'
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8EC17C1334511DFAEFEEC660A0001C5");
                    }
                    match(input,48,FOLLOW_48_in_visibility3013); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8EC17C4334511DFAD1DEC660A0001C5");
                    }
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "visibility", com.sap.tc.moin.repository.mmi.model.VisibilityKindEnum.PROTECTED_VIS);_exitInjectorAction();
                    }
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 4 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:627:4: ( 'private' )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(3);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:627:20: ( 'private' )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:627:21: 'private'
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8EC3ED0334511DF896EEC660A0001C5");
                    }
                    match(input,37,FOLLOW_37_in_visibility3029); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8EC3ED3334511DFC585EC660A0001C5");
                    }
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "visibility", com.sap.tc.moin.repository.mmi.model.VisibilityKindEnum.PRIVATE_VIS);_exitInjectorAction();
                    }
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

                
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "visibility"


    // $ANTLR start "model_modelelement_invariants"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:634:1: model_modelelement_invariants returns [Object ret2] : (ret= model_constraint_invariants ) ;
    public final Object model_modelelement_invariants() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:635:3: ( (ret= model_constraint_invariants ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:636:3: (ret= model_constraint_invariants )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:636:3: (ret= model_constraint_invariants )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:636:4: ret= model_constraint_invariants
            {
            pushFollow(FOLLOW_model_constraint_invariants_in_model_modelelement_invariants3064);
            ret=model_constraint_invariants();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;

            }

            if ( state.backtracking==0 ) {

              ret2=ret;
               
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "model_modelelement_invariants"


    // $ANTLR start "model_constraint_invariants"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:643:1: model_constraint_invariants returns [Object ret2] : (ret= ocl_attaching_oclconstraint_invariants ) ;
    public final Object model_constraint_invariants() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:644:3: ( (ret= ocl_attaching_oclconstraint_invariants ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:645:3: (ret= ocl_attaching_oclconstraint_invariants )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:645:3: (ret= ocl_attaching_oclconstraint_invariants )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:645:4: ret= ocl_attaching_oclconstraint_invariants
            {
            pushFollow(FOLLOW_ocl_attaching_oclconstraint_invariants_in_model_constraint_invariants3091);
            ret=ocl_attaching_oclconstraint_invariants();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;

            }

            if ( state.backtracking==0 ) {

              ret2=ret;
               
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "model_constraint_invariants"


    // $ANTLR start "ocl_attaching_oclconstraint_invariants"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:652:1: ocl_attaching_oclconstraint_invariants returns [Object ret2] : ( (temp= identifier ) COLON (temp= ocl_expressions_oclexpression ) ';' ) ;
    public final Object ocl_attaching_oclconstraint_invariants() throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        List<String> metaType=list("OCL","Attaching","OclConstraint");
        onEnterTemplateRule(metaType,"invariants");
        IModelElementProxy ret=(getBacktrackingLevel()==0) ? createModelElementProxy(metaType, false, false) : null;
        org.antlr.runtime.Token firstToken=input.LT(1);

        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:657:3: ( ( (temp= identifier ) COLON (temp= ocl_expressions_oclexpression ) ';' ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:658:3: ( (temp= identifier ) COLON (temp= ocl_expressions_oclexpression ) ';' )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:658:3: ( (temp= identifier ) COLON (temp= ocl_expressions_oclexpression ) ';' )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:658:4: (temp= identifier ) COLON (temp= ocl_expressions_oclexpression ) ';'
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8ED7751334511DFC9C5EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:658:63: (temp= identifier )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:658:65: temp= identifier
            {
            pushFollow(FOLLOW_identifier_in_ocl_attaching_oclconstraint_invariants3125);
            temp=identifier();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              setProperty(ret, "name", temp);
            }

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8ED7752334511DFC930EC660A0001C5");
            }
            match(input,COLON,FOLLOW_COLON_in_ocl_attaching_oclconstraint_invariants3132); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8ED7754334511DFB58DEC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:658:272: (temp= ocl_expressions_oclexpression )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:658:274: temp= ocl_expressions_oclexpression
            {
            pushFollow(FOLLOW_ocl_expressions_oclexpression_in_ocl_attaching_oclconstraint_invariants3140);
            temp=ocl_expressions_oclexpression();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              setProperty(ret, "oclExpression", temp);
            }

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8ED7755334511DFC9A2EC660A0001C5");
            }
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8ED9E60334511DF8BBBEC660A0001C5");
            }
            match(input,49,FOLLOW_49_in_ocl_attaching_oclconstraint_invariants3148); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8ED9E63334511DFADE2EC660A0001C5");
            }
            if ( state.backtracking==0 ) {
              setRef(ret, "invariantOf", list("Model","Classifier"), null, null, "#context(class)", null, null, false, null, true);_exitInjectorAction();
            }
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

              ret2 = commitCreation(ret, firstToken, false);

               
            }

            }

        }
        catch (Exception e) {
            handleExceptionInTemplateRule(e, firstToken, ret);
        }
        finally {
            onExitTemplateRule(metaType);
        }
        return ret2;
    }
    // $ANTLR end "ocl_attaching_oclconstraint_invariants"


    // $ANTLR start "primary_ocl_expressions_oclexpression"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:666:1: primary_ocl_expressions_oclexpression returns [Object ret2] : (ret= ocl_expressions_letexp | ret= ocl_expressions_ifexp | ret= ocl_expressions_literalexp | ret= ocl_expressions_variableexp | ( LPAREN ret= ocl_expressions_oclexpression RPAREN ) ) ;
    public final Object primary_ocl_expressions_oclexpression() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:667:3: ( (ret= ocl_expressions_letexp | ret= ocl_expressions_ifexp | ret= ocl_expressions_literalexp | ret= ocl_expressions_variableexp | ( LPAREN ret= ocl_expressions_oclexpression RPAREN ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:668:3: (ret= ocl_expressions_letexp | ret= ocl_expressions_ifexp | ret= ocl_expressions_literalexp | ret= ocl_expressions_variableexp | ( LPAREN ret= ocl_expressions_oclexpression RPAREN ) )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:668:3: (ret= ocl_expressions_letexp | ret= ocl_expressions_ifexp | ret= ocl_expressions_literalexp | ret= ocl_expressions_variableexp | ( LPAREN ret= ocl_expressions_oclexpression RPAREN ) )
            int alt36=5;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt36=1;
                }
                break;
            case 52:
                {
                alt36=2;
                }
                break;
            case STRING:
            case QNAME:
            case INT:
            case FLOAT:
            case BOOL:
            case 33:
            case 35:
            case 38:
            case 45:
            case 46:
                {
                alt36=3;
                }
                break;
            case NAME:
            case 53:
                {
                alt36=4;
                }
                break;
            case LPAREN:
                {
                alt36=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ret2;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:668:4: ret= ocl_expressions_letexp
                    {
                    pushFollow(FOLLOW_ocl_expressions_letexp_in_primary_ocl_expressions_oclexpression3188);
                    ret=ocl_expressions_letexp();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;

                    }
                    break;
                case 2 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:669:5: ret= ocl_expressions_ifexp
                    {
                    pushFollow(FOLLOW_ocl_expressions_ifexp_in_primary_ocl_expressions_oclexpression3196);
                    ret=ocl_expressions_ifexp();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;

                    }
                    break;
                case 3 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:670:5: ret= ocl_expressions_literalexp
                    {
                    pushFollow(FOLLOW_ocl_expressions_literalexp_in_primary_ocl_expressions_oclexpression3204);
                    ret=ocl_expressions_literalexp();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;

                    }
                    break;
                case 4 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:671:5: ret= ocl_expressions_variableexp
                    {
                    pushFollow(FOLLOW_ocl_expressions_variableexp_in_primary_ocl_expressions_oclexpression3212);
                    ret=ocl_expressions_variableexp();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;

                    }
                    break;
                case 5 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:672:5: ( LPAREN ret= ocl_expressions_oclexpression RPAREN )
                    {
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:672:5: ( LPAREN ret= ocl_expressions_oclexpression RPAREN )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:672:6: LPAREN ret= ocl_expressions_oclexpression RPAREN
                    {
                    if ( state.backtracking==0 ) {
                      _enterOpdBrackSeq();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl();
                    }
                    match(input,LPAREN,FOLLOW_LPAREN_in_primary_ocl_expressions_oclexpression3221); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl();
                    }
                    pushFollow(FOLLOW_ocl_expressions_oclexpression_in_primary_ocl_expressions_oclexpression3227);
                    ret=ocl_expressions_oclexpression();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl();
                    }
                    match(input,RPAREN,FOLLOW_RPAREN_in_primary_ocl_expressions_oclexpression3231); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitOpdBrackSeq();
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                ret2=ret;

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "primary_ocl_expressions_oclexpression"


    // $ANTLR start "oclexpressions_priority_0"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:679:1: oclexpressions_priority_0 returns [Object ret2] : ( (ret= primary_ocl_expressions_oclexpression ( ( '.' )=> ( '.' ( ( identifier ~ LPAREN )=> (ret= ocl_expressions_attributecallexp[opName, ret, firstToken] ) | (ret= ocl_expressions_operationcallexp[opName, ret, firstToken] ) ) ) | ( '->' )=> ( '->' ( (ret= ocl_expressions_iterateexp[opName, ret, firstToken] ) ) ) )* ) ) ;
    public final Object oclexpressions_priority_0() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        java.lang.String opName=null; org.antlr.runtime.Token firstToken=input.LT(1);
        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:680:3: ( ( (ret= primary_ocl_expressions_oclexpression ( ( '.' )=> ( '.' ( ( identifier ~ LPAREN )=> (ret= ocl_expressions_attributecallexp[opName, ret, firstToken] ) | (ret= ocl_expressions_operationcallexp[opName, ret, firstToken] ) ) ) | ( '->' )=> ( '->' ( (ret= ocl_expressions_iterateexp[opName, ret, firstToken] ) ) ) )* ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:681:4: ( (ret= primary_ocl_expressions_oclexpression ( ( '.' )=> ( '.' ( ( identifier ~ LPAREN )=> (ret= ocl_expressions_attributecallexp[opName, ret, firstToken] ) | (ret= ocl_expressions_operationcallexp[opName, ret, firstToken] ) ) ) | ( '->' )=> ( '->' ( (ret= ocl_expressions_iterateexp[opName, ret, firstToken] ) ) ) )* ) )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:681:4: ( (ret= primary_ocl_expressions_oclexpression ( ( '.' )=> ( '.' ( ( identifier ~ LPAREN )=> (ret= ocl_expressions_attributecallexp[opName, ret, firstToken] ) | (ret= ocl_expressions_operationcallexp[opName, ret, firstToken] ) ) ) | ( '->' )=> ( '->' ( (ret= ocl_expressions_iterateexp[opName, ret, firstToken] ) ) ) )* ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:681:6: (ret= primary_ocl_expressions_oclexpression ( ( '.' )=> ( '.' ( ( identifier ~ LPAREN )=> (ret= ocl_expressions_attributecallexp[opName, ret, firstToken] ) | (ret= ocl_expressions_operationcallexp[opName, ret, firstToken] ) ) ) | ( '->' )=> ( '->' ( (ret= ocl_expressions_iterateexp[opName, ret, firstToken] ) ) ) )* )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:681:6: (ret= primary_ocl_expressions_oclexpression ( ( '.' )=> ( '.' ( ( identifier ~ LPAREN )=> (ret= ocl_expressions_attributecallexp[opName, ret, firstToken] ) | (ret= ocl_expressions_operationcallexp[opName, ret, firstToken] ) ) ) | ( '->' )=> ( '->' ( (ret= ocl_expressions_iterateexp[opName, ret, firstToken] ) ) ) )* )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:681:8: ret= primary_ocl_expressions_oclexpression ( ( '.' )=> ( '.' ( ( identifier ~ LPAREN )=> (ret= ocl_expressions_attributecallexp[opName, ret, firstToken] ) | (ret= ocl_expressions_operationcallexp[opName, ret, firstToken] ) ) ) | ( '->' )=> ( '->' ( (ret= ocl_expressions_iterateexp[opName, ret, firstToken] ) ) ) )*
            {
            pushFollow(FOLLOW_primary_ocl_expressions_oclexpression_in_oclexpressions_priority_03269);
            ret=primary_ocl_expressions_oclexpression();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:681:49: ( ( '.' )=> ( '.' ( ( identifier ~ LPAREN )=> (ret= ocl_expressions_attributecallexp[opName, ret, firstToken] ) | (ret= ocl_expressions_operationcallexp[opName, ret, firstToken] ) ) ) | ( '->' )=> ( '->' ( (ret= ocl_expressions_iterateexp[opName, ret, firstToken] ) ) ) )*
            loop38:
            do {
                int alt38=3;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==57) ) {
                    int LA38_2 = input.LA(2);

                    if ( (synpred17_MofClass()) ) {
                        alt38=1;
                    }


                }
                else if ( (LA38_0==47) ) {
                    int LA38_3 = input.LA(2);

                    if ( (synpred19_MofClass()) ) {
                        alt38=2;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:681:50: ( '.' )=> ( '.' ( ( identifier ~ LPAREN )=> (ret= ocl_expressions_attributecallexp[opName, ret, firstToken] ) | (ret= ocl_expressions_operationcallexp[opName, ret, firstToken] ) ) )
            	    {
            	    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:681:57: ( '.' ( ( identifier ~ LPAREN )=> (ret= ocl_expressions_attributecallexp[opName, ret, firstToken] ) | (ret= ocl_expressions_operationcallexp[opName, ret, firstToken] ) ) )
            	    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:681:58: '.' ( ( identifier ~ LPAREN )=> (ret= ocl_expressions_attributecallexp[opName, ret, firstToken] ) | (ret= ocl_expressions_operationcallexp[opName, ret, firstToken] ) )
            	    {
            	    if ( state.backtracking==0 ) {
            	      _enterOpSeq(".", 2, false);
            	    }
            	    if ( state.backtracking==0 ) {
            	      _beforeSeqEl();
            	    }
            	    match(input,57,FOLLOW_57_in_oclexpressions_priority_03278); if (state.failed) return ret2;
            	    if ( state.backtracking==0 ) {
            	      opName = ".";
            	    }
            	    if ( state.backtracking==0 ) {
            	      _afterSeqEl();
            	    }
            	    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:681:138: ( ( identifier ~ LPAREN )=> (ret= ocl_expressions_attributecallexp[opName, ret, firstToken] ) | (ret= ocl_expressions_operationcallexp[opName, ret, firstToken] ) )
            	    int alt37=2;
            	    alt37 = dfa37.predict(input);
            	    switch (alt37) {
            	        case 1 :
            	            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:681:139: ( identifier ~ LPAREN )=> (ret= ocl_expressions_attributecallexp[opName, ret, firstToken] )
            	            {
            	            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:681:161: (ret= ocl_expressions_attributecallexp[opName, ret, firstToken] )
            	            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:681:162: ret= ocl_expressions_attributecallexp[opName, ret, firstToken]
            	            {
            	            pushFollow(FOLLOW_ocl_expressions_attributecallexp_in_oclexpressions_priority_03292);
            	            ret=ocl_expressions_attributecallexp(opName, ret, firstToken);

            	            checkFollows();
            	            state._fsp--;
            	            if (state.failed) return ret2;

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:682:3: (ret= ocl_expressions_operationcallexp[opName, ret, firstToken] )
            	            {
            	            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:682:3: (ret= ocl_expressions_operationcallexp[opName, ret, firstToken] )
            	            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:682:4: ret= ocl_expressions_operationcallexp[opName, ret, firstToken]
            	            {
            	            pushFollow(FOLLOW_ocl_expressions_operationcallexp_in_oclexpressions_priority_03301);
            	            ret=ocl_expressions_operationcallexp(opName, ret, firstToken);

            	            checkFollows();
            	            state._fsp--;
            	            if (state.failed) return ret2;

            	            }


            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {
            	      _exitOpSeq();
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:683:3: ( '->' )=> ( '->' ( (ret= ocl_expressions_iterateexp[opName, ret, firstToken] ) ) )
            	    {
            	    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:683:11: ( '->' ( (ret= ocl_expressions_iterateexp[opName, ret, firstToken] ) ) )
            	    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:683:12: '->' ( (ret= ocl_expressions_iterateexp[opName, ret, firstToken] ) )
            	    {
            	    if ( state.backtracking==0 ) {
            	      _enterOpSeq("->", 2, false);
            	    }
            	    if ( state.backtracking==0 ) {
            	      _beforeSeqEl();
            	    }
            	    match(input,47,FOLLOW_47_in_oclexpressions_priority_03317); if (state.failed) return ret2;
            	    if ( state.backtracking==0 ) {
            	      opName = "->";
            	    }
            	    if ( state.backtracking==0 ) {
            	      _afterSeqEl();
            	    }
            	    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:683:95: ( (ret= ocl_expressions_iterateexp[opName, ret, firstToken] ) )
            	    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:683:96: (ret= ocl_expressions_iterateexp[opName, ret, firstToken] )
            	    {
            	    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:683:96: (ret= ocl_expressions_iterateexp[opName, ret, firstToken] )
            	    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:683:97: ret= ocl_expressions_iterateexp[opName, ret, firstToken]
            	    {
            	    pushFollow(FOLLOW_ocl_expressions_iterateexp_in_oclexpressions_priority_03324);
            	    ret=ocl_expressions_iterateexp(opName, ret, firstToken);

            	    checkFollows();
            	    state._fsp--;
            	    if (state.failed) return ret2;

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	      _exitOpSeq();
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              this.setLocationAndComment(ret, firstToken);
              ret2=ret;
               
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "oclexpressions_priority_0"


    // $ANTLR start "oclexpressions_priority_1"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:691:1: oclexpressions_priority_1 returns [Object ret2] : ( (ret= oclexpressions_priority_0 ) ) ;
    public final Object oclexpressions_priority_1() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        java.lang.String opName=null; org.antlr.runtime.Token firstToken=input.LT(1);
        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:692:3: ( ( (ret= oclexpressions_priority_0 ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:693:4: ( (ret= oclexpressions_priority_0 ) )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:693:4: ( (ret= oclexpressions_priority_0 ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:693:6: (ret= oclexpressions_priority_0 )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:693:6: (ret= oclexpressions_priority_0 )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:693:8: ret= oclexpressions_priority_0
            {
            pushFollow(FOLLOW_oclexpressions_priority_0_in_oclexpressions_priority_13365);
            ret=oclexpressions_priority_0();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;

            }


            }

            if ( state.backtracking==0 ) {

              this.setLocationAndComment(ret, firstToken);
              ret2=ret;
               
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "oclexpressions_priority_1"


    // $ANTLR start "ocl_expressions_oclexpression"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:701:1: ocl_expressions_oclexpression returns [Object ret2] : ret= oclexpressions_priority_1 ;
    public final Object ocl_expressions_oclexpression() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:702:3: (ret= oclexpressions_priority_1 )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:703:3: ret= oclexpressions_priority_1
            {
            pushFollow(FOLLOW_oclexpressions_priority_1_in_ocl_expressions_oclexpression3390);
            ret=oclexpressions_priority_1();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {

              ret2=ret;
               
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "ocl_expressions_oclexpression"


    // $ANTLR start "ocl_expressions_literalexp"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:710:1: ocl_expressions_literalexp returns [Object ret2] : (ret= ocl_expressions_primitiveliteralexp | ret= ocl_expressions_enumliteralexp | ret= ocl_expressions_collectionliteralexp ) ;
    public final Object ocl_expressions_literalexp() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:711:3: ( (ret= ocl_expressions_primitiveliteralexp | ret= ocl_expressions_enumliteralexp | ret= ocl_expressions_collectionliteralexp ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:712:3: (ret= ocl_expressions_primitiveliteralexp | ret= ocl_expressions_enumliteralexp | ret= ocl_expressions_collectionliteralexp )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:712:3: (ret= ocl_expressions_primitiveliteralexp | ret= ocl_expressions_enumliteralexp | ret= ocl_expressions_collectionliteralexp )
            int alt39=3;
            switch ( input.LA(1) ) {
            case STRING:
            case INT:
            case FLOAT:
            case BOOL:
                {
                alt39=1;
                }
                break;
            case QNAME:
                {
                alt39=2;
                }
                break;
            case 33:
            case 35:
            case 38:
            case 45:
            case 46:
                {
                alt39=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ret2;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:712:4: ret= ocl_expressions_primitiveliteralexp
                    {
                    pushFollow(FOLLOW_ocl_expressions_primitiveliteralexp_in_ocl_expressions_literalexp3416);
                    ret=ocl_expressions_primitiveliteralexp();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;

                    }
                    break;
                case 2 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:713:5: ret= ocl_expressions_enumliteralexp
                    {
                    pushFollow(FOLLOW_ocl_expressions_enumliteralexp_in_ocl_expressions_literalexp3424);
                    ret=ocl_expressions_enumliteralexp();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;

                    }
                    break;
                case 3 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:714:5: ret= ocl_expressions_collectionliteralexp
                    {
                    pushFollow(FOLLOW_ocl_expressions_collectionliteralexp_in_ocl_expressions_literalexp3432);
                    ret=ocl_expressions_collectionliteralexp();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              ret2=ret;
               
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "ocl_expressions_literalexp"


    // $ANTLR start "ocl_expressions_primitiveliteralexp"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:721:1: ocl_expressions_primitiveliteralexp returns [Object ret2] : (ret= ocl_expressions_numericliteralexp | ret= ocl_expressions_stringliteralexp | ret= ocl_expressions_booleanliteralexp ) ;
    public final Object ocl_expressions_primitiveliteralexp() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:722:3: ( (ret= ocl_expressions_numericliteralexp | ret= ocl_expressions_stringliteralexp | ret= ocl_expressions_booleanliteralexp ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:723:3: (ret= ocl_expressions_numericliteralexp | ret= ocl_expressions_stringliteralexp | ret= ocl_expressions_booleanliteralexp )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:723:3: (ret= ocl_expressions_numericliteralexp | ret= ocl_expressions_stringliteralexp | ret= ocl_expressions_booleanliteralexp )
            int alt40=3;
            switch ( input.LA(1) ) {
            case INT:
            case FLOAT:
                {
                alt40=1;
                }
                break;
            case STRING:
                {
                alt40=2;
                }
                break;
            case BOOL:
                {
                alt40=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ret2;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:723:4: ret= ocl_expressions_numericliteralexp
                    {
                    pushFollow(FOLLOW_ocl_expressions_numericliteralexp_in_ocl_expressions_primitiveliteralexp3459);
                    ret=ocl_expressions_numericliteralexp();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;

                    }
                    break;
                case 2 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:724:5: ret= ocl_expressions_stringliteralexp
                    {
                    pushFollow(FOLLOW_ocl_expressions_stringliteralexp_in_ocl_expressions_primitiveliteralexp3467);
                    ret=ocl_expressions_stringliteralexp();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;

                    }
                    break;
                case 3 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:725:5: ret= ocl_expressions_booleanliteralexp
                    {
                    pushFollow(FOLLOW_ocl_expressions_booleanliteralexp_in_ocl_expressions_primitiveliteralexp3475);
                    ret=ocl_expressions_booleanliteralexp();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              ret2=ret;
               
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "ocl_expressions_primitiveliteralexp"


    // $ANTLR start "ocl_expressions_numericliteralexp"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:732:1: ocl_expressions_numericliteralexp returns [Object ret2] : (ret= ocl_expressions_integerliteralexp | ret= ocl_expressions_realliteralexp ) ;
    public final Object ocl_expressions_numericliteralexp() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:733:3: ( (ret= ocl_expressions_integerliteralexp | ret= ocl_expressions_realliteralexp ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:734:3: (ret= ocl_expressions_integerliteralexp | ret= ocl_expressions_realliteralexp )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:734:3: (ret= ocl_expressions_integerliteralexp | ret= ocl_expressions_realliteralexp )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==INT) ) {
                alt41=1;
            }
            else if ( (LA41_0==FLOAT) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ret2;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:734:4: ret= ocl_expressions_integerliteralexp
                    {
                    pushFollow(FOLLOW_ocl_expressions_integerliteralexp_in_ocl_expressions_numericliteralexp3502);
                    ret=ocl_expressions_integerliteralexp();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;

                    }
                    break;
                case 2 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:735:5: ret= ocl_expressions_realliteralexp
                    {
                    pushFollow(FOLLOW_ocl_expressions_realliteralexp_in_ocl_expressions_numericliteralexp3510);
                    ret=ocl_expressions_realliteralexp();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              ret2=ret;
               
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "ocl_expressions_numericliteralexp"


    // $ANTLR start "ocl_expressions_integerliteralexp"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:742:1: ocl_expressions_integerliteralexp returns [Object ret2] : ( (temp= integerAsString ) ) ;
    public final Object ocl_expressions_integerliteralexp() throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        List<String> metaType=list("OCL","Expressions","IntegerLiteralExp");
        onEnterTemplateRule(metaType);
        IModelElementProxy ret=(getBacktrackingLevel()==0) ? createModelElementProxy(metaType, false, false) : null;
        org.antlr.runtime.Token firstToken=input.LT(1);

        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:747:3: ( ( (temp= integerAsString ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:748:3: ( (temp= integerAsString ) )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:748:3: ( (temp= integerAsString ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:748:4: (temp= integerAsString )
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8EF4C12334511DF8E8BEC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:748:63: (temp= integerAsString )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:748:65: temp= integerAsString
            {
            pushFollow(FOLLOW_integerAsString_in_ocl_expressions_integerliteralexp3544);
            temp=integerAsString();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              setProperty(ret, "name", temp);
            }

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8EF7324334511DF819EEC660A0001C5");
            }
            if ( state.backtracking==0 ) {
              setOclRef(ret, "integerSymbol", null, null, "OCL:self.name.toInteger()", true);_exitInjectorAction();setOclRef(ret, "type", null, null, "OCL:Classifier.allInstances()->select(c| if c.container->isEmpty() then false else c.qualifiedName->asSequence()->at(1)='PrimitiveTypes' and qualifiedName->asSequence()->at(2)='Integer' endif)", true);_exitInjectorAction();
            }
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

              ret2 = commitCreation(ret, firstToken, false);

               
            }

            }

        }
        catch (Exception e) {
            handleExceptionInTemplateRule(e, firstToken, ret);
        }
        finally {
            onExitTemplateRule(metaType);
        }
        return ret2;
    }
    // $ANTLR end "ocl_expressions_integerliteralexp"


    // $ANTLR start "ocl_expressions_stringliteralexp"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:756:1: ocl_expressions_stringliteralexp returns [Object ret2] : ( (temp= stringSymbol ) ) ;
    public final Object ocl_expressions_stringliteralexp() throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        List<String> metaType=list("OCL","Expressions","StringLiteralExp");
        onEnterTemplateRule(metaType);
        IModelElementProxy ret=(getBacktrackingLevel()==0) ? createModelElementProxy(metaType, false, false) : null;
        org.antlr.runtime.Token firstToken=input.LT(1);

        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:761:3: ( ( (temp= stringSymbol ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:762:3: ( (temp= stringSymbol ) )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:762:3: ( (temp= stringSymbol ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:762:4: (temp= stringSymbol )
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8EFE852334511DFCED3EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:762:63: (temp= stringSymbol )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:762:65: temp= stringSymbol
            {
            pushFollow(FOLLOW_stringSymbol_in_ocl_expressions_stringliteralexp3594);
            temp=stringSymbol();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              setProperty(ret, "stringSymbol", temp);
            }

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8F00F64334511DFB50BEC660A0001C5");
            }
            if ( state.backtracking==0 ) {
              setOclRef(ret, "name", null, null, "OCL:self.stringSymbol", true);_exitInjectorAction();setOclRef(ret, "type", null, null, "OCL:Classifier.allInstances()->select(c| if c.container->isEmpty() then false else c.qualifiedName->asSequence()->at(1)='PrimitiveTypes' and qualifiedName->asSequence()->at(2)='String' endif)", true);_exitInjectorAction();
            }
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

              ret2 = commitCreation(ret, firstToken, false);

               
            }

            }

        }
        catch (Exception e) {
            handleExceptionInTemplateRule(e, firstToken, ret);
        }
        finally {
            onExitTemplateRule(metaType);
        }
        return ret2;
    }
    // $ANTLR end "ocl_expressions_stringliteralexp"


    // $ANTLR start "ocl_expressions_realliteralexp"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:770:1: ocl_expressions_realliteralexp returns [Object ret2] : ( (temp= floatAsString ) ) ;
    public final Object ocl_expressions_realliteralexp() throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        List<String> metaType=list("OCL","Expressions","RealLiteralExp");
        onEnterTemplateRule(metaType);
        IModelElementProxy ret=(getBacktrackingLevel()==0) ? createModelElementProxy(metaType, false, false) : null;
        org.antlr.runtime.Token firstToken=input.LT(1);

        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:775:3: ( ( (temp= floatAsString ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:776:3: ( (temp= floatAsString ) )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:776:3: ( (temp= floatAsString ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:776:4: (temp= floatAsString )
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8F0ABA1334511DFCAEDEC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:776:63: (temp= floatAsString )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:776:65: temp= floatAsString
            {
            pushFollow(FOLLOW_floatAsString_in_ocl_expressions_realliteralexp3644);
            temp=floatAsString();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              setProperty(ret, "name", temp);
            }

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8F0D2B0334511DFB4EDEC660A0001C5");
            }
            if ( state.backtracking==0 ) {
              setOclRef(ret, "realSymbol", null, null, "OCL:self.name.toDouble()", true);_exitInjectorAction();setOclRef(ret, "type", null, null, "OCL:Classifier.allInstances()->select(c| if c.container->isEmpty() then false else c.qualifiedName->asSequence()->at(1)='PrimitiveTypes' and qualifiedName->asSequence()->at(2)='Double' endif)", true);_exitInjectorAction();
            }
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

              ret2 = commitCreation(ret, firstToken, false);

               
            }

            }

        }
        catch (Exception e) {
            handleExceptionInTemplateRule(e, firstToken, ret);
        }
        finally {
            onExitTemplateRule(metaType);
        }
        return ret2;
    }
    // $ANTLR end "ocl_expressions_realliteralexp"


    // $ANTLR start "ocl_expressions_booleanliteralexp"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:784:1: ocl_expressions_booleanliteralexp returns [Object ret2] : ( (temp= booleanValueSymbol ) ) ;
    public final Object ocl_expressions_booleanliteralexp() throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        List<String> metaType=list("OCL","Expressions","BooleanLiteralExp");
        onEnterTemplateRule(metaType);
        IModelElementProxy ret=(getBacktrackingLevel()==0) ? createModelElementProxy(metaType, false, false) : null;
        org.antlr.runtime.Token firstToken=input.LT(1);

        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:789:3: ( ( (temp= booleanValueSymbol ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:790:3: ( (temp= booleanValueSymbol ) )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:790:3: ( (temp= booleanValueSymbol ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:790:4: (temp= booleanValueSymbol )
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8F120D1334511DF8C9CEC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:790:63: (temp= booleanValueSymbol )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:790:65: temp= booleanValueSymbol
            {
            pushFollow(FOLLOW_booleanValueSymbol_in_ocl_expressions_booleanliteralexp3694);
            temp=booleanValueSymbol();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              setProperty(ret, "booleanSymbol", temp);
            }

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8F147E3334511DFB1B7EC660A0001C5");
            }
            if ( state.backtracking==0 ) {
              setOclRef(ret, "name", null, null, "OCL:if self.booleanSymbol then 'true' else 'false' endif", true);_exitInjectorAction();setOclRef(ret, "type", null, null, "OCL:Classifier.allInstances()->select(c| if c.container->isEmpty() then false else c.qualifiedName->asSequence()->at(1)='PrimitiveTypes' and qualifiedName->asSequence()->at(2)='Boolean' endif)", true);_exitInjectorAction();
            }
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

              ret2 = commitCreation(ret, firstToken, false);

               
            }

            }

        }
        catch (Exception e) {
            handleExceptionInTemplateRule(e, firstToken, ret);
        }
        finally {
            onExitTemplateRule(metaType);
        }
        return ret2;
    }
    // $ANTLR end "ocl_expressions_booleanliteralexp"


    // $ANTLR start "ocl_expressions_enumliteralexp"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:798:1: ocl_expressions_enumliteralexp returns [Object ret2] : ( (temp= qualifiedNameSymbol ) DCOLON (temp= identifier ) ) ;
    public final Object ocl_expressions_enumliteralexp() throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        List<String> metaType=list("OCL","Expressions","EnumLiteralExp");
        onEnterTemplateRule(metaType);
        IModelElementProxy ret=(getBacktrackingLevel()==0) ? createModelElementProxy(metaType, false, false) : null;
        org.antlr.runtime.Token firstToken=input.LT(1);

        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:803:3: ( ( (temp= qualifiedNameSymbol ) DCOLON (temp= identifier ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:804:3: ( (temp= qualifiedNameSymbol ) DCOLON (temp= identifier ) )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:804:3: ( (temp= qualifiedNameSymbol ) DCOLON (temp= identifier ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:804:4: (temp= qualifiedNameSymbol ) DCOLON (temp= identifier )
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8F1BD14334511DFC210EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:804:63: (temp= qualifiedNameSymbol )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:804:65: temp= qualifiedNameSymbol
            {
            pushFollow(FOLLOW_qualifiedNameSymbol_in_ocl_expressions_enumliteralexp3744);
            temp=qualifiedNameSymbol();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              setOclRef(ret, "referredEnum", null, temp, "OCL:"+"			let t=Sequence{1..?.size()}->select(j|?.subString(j, j+1) = '::')->iterate("+"  				i; acc:Tuple(pos:Integer, ns:Set(Namespace), qn:String)=Tuple{pos=1, ns=null, qn=''} |"+"    				let namePart=?.subString(acc.pos, -1+i) in"+"      				Tuple{pos=i+2,"+"      				      ns=if acc.ns=null then"+"            			  	Namespace.allInstances()->select("+"              					ns2 | ns2.container->isEmpty() and ns2.name=namePart)"+"              			  else"+"              			  	acc.ns.contents->select(ns2 | ns2.name=namePart)->asSet()"+"              			  endif,"+"            			  qn=acc.qn.concat('::').concat(namePart)}) in"+"				t.ns.contents->select(c | c.name=?.subString(t.pos, ?.size()))");
            }

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8F1E420334511DF9A3AEC660A0001C5");
            }
            match(input,DCOLON,FOLLOW_DCOLON_in_ocl_expressions_enumliteralexp3751); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8F1E422334511DFAE39EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:804:995: (temp= identifier )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:804:997: temp= identifier
            {
            pushFollow(FOLLOW_identifier_in_ocl_expressions_enumliteralexp3759);
            temp=identifier();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              setProperty(ret, "literal", temp);
            }

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

              ret2 = commitCreation(ret, firstToken, false);

               
            }

            }

        }
        catch (Exception e) {
            handleExceptionInTemplateRule(e, firstToken, ret);
        }
        finally {
            onExitTemplateRule(metaType);
        }
        return ret2;
    }
    // $ANTLR end "ocl_expressions_enumliteralexp"


    // $ANTLR start "ocl_expressions_collectionliteralexp"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:812:1: ocl_expressions_collectionliteralexp returns [Object ret2] : ( ( ( 'Sequence' (temp= model_classifier_sequence ) ) | ( 'Set' (temp= model_classifier_set ) ) | ( 'Collection' (temp= model_classifier_collection ) ) | ( 'Bag' (temp= model_classifier_bag ) ) | ( 'OrderedSet' (temp= model_classifier_orderedset ) ) ) LCURL (temp= ocl_expressions_collectionliteralpart ( ( ',' ) temp= ocl_expressions_collectionliteralpart )* )? RCURL ) ;
    public final Object ocl_expressions_collectionliteralexp() throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        List<String> metaType=list("OCL","Expressions","CollectionLiteralExp");
        onEnterTemplateRule(metaType);
        IModelElementProxy ret=(getBacktrackingLevel()==0) ? createModelElementProxy(metaType, true, false, new String[]{"collectionliteral"}) : null;
        org.antlr.runtime.Token firstToken=input.LT(1);

        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:817:3: ( ( ( ( 'Sequence' (temp= model_classifier_sequence ) ) | ( 'Set' (temp= model_classifier_set ) ) | ( 'Collection' (temp= model_classifier_collection ) ) | ( 'Bag' (temp= model_classifier_bag ) ) | ( 'OrderedSet' (temp= model_classifier_orderedset ) ) ) LCURL (temp= ocl_expressions_collectionliteralpart ( ( ',' ) temp= ocl_expressions_collectionliteralpart )* )? RCURL ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:818:3: ( ( ( 'Sequence' (temp= model_classifier_sequence ) ) | ( 'Set' (temp= model_classifier_set ) ) | ( 'Collection' (temp= model_classifier_collection ) ) | ( 'Bag' (temp= model_classifier_bag ) ) | ( 'OrderedSet' (temp= model_classifier_orderedset ) ) ) LCURL (temp= ocl_expressions_collectionliteralpart ( ( ',' ) temp= ocl_expressions_collectionliteralpart )* )? RCURL )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:818:3: ( ( ( 'Sequence' (temp= model_classifier_sequence ) ) | ( 'Set' (temp= model_classifier_set ) ) | ( 'Collection' (temp= model_classifier_collection ) ) | ( 'Bag' (temp= model_classifier_bag ) ) | ( 'OrderedSet' (temp= model_classifier_orderedset ) ) ) LCURL (temp= ocl_expressions_collectionliteralpart ( ( ',' ) temp= ocl_expressions_collectionliteralpart )* )? RCURL )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:818:4: ( ( 'Sequence' (temp= model_classifier_sequence ) ) | ( 'Set' (temp= model_classifier_set ) ) | ( 'Collection' (temp= model_classifier_collection ) ) | ( 'Bag' (temp= model_classifier_bag ) ) | ( 'OrderedSet' (temp= model_classifier_orderedset ) ) ) LCURL (temp= ocl_expressions_collectionliteralpart ( ( ',' ) temp= ocl_expressions_collectionliteralpart )* )? RCURL
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8F391D0334511DFC0E2EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:818:63: ( ( 'Sequence' (temp= model_classifier_sequence ) ) | ( 'Set' (temp= model_classifier_set ) ) | ( 'Collection' (temp= model_classifier_collection ) ) | ( 'Bag' (temp= model_classifier_bag ) ) | ( 'OrderedSet' (temp= model_classifier_orderedset ) ) )
            int alt42=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt42=1;
                }
                break;
            case 46:
                {
                alt42=2;
                }
                break;
            case 38:
                {
                alt42=3;
                }
                break;
            case 45:
                {
                alt42=4;
                }
                break;
            case 33:
                {
                alt42=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ret2;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:818:64: ( 'Sequence' (temp= model_classifier_sequence ) )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(0);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:818:80: ( 'Sequence' (temp= model_classifier_sequence ) )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:818:81: 'Sequence' (temp= model_classifier_sequence )
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8F25951334511DF9C87EC660A0001C5");
                    }
                    match(input,35,FOLLOW_35_in_ocl_expressions_collectionliteralexp3807); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8F28060334511DFB10FEC660A0001C5");
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:818:225: (temp= model_classifier_sequence )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:818:227: temp= model_classifier_sequence
                    {
                    pushFollow(FOLLOW_model_classifier_sequence_in_ocl_expressions_collectionliteralexp3814);
                    temp=model_classifier_sequence();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "type", temp);
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8F28063334511DF8C9EEC660A0001C5");
                    }
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "kind", org.omg.ocl.expressions.CollectionKindEnum.SEQUENCE);_exitInjectorAction();
                    }
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 2 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:819:4: ( 'Set' (temp= model_classifier_set ) )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(1);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:819:20: ( 'Set' (temp= model_classifier_set ) )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:819:21: 'Set' (temp= model_classifier_set )
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8F2A770334511DFCC20EC660A0001C5");
                    }
                    match(input,46,FOLLOW_46_in_ocl_expressions_collectionliteralexp3833); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8F2A773334511DF9727EC660A0001C5");
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:819:160: (temp= model_classifier_set )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:819:162: temp= model_classifier_set
                    {
                    pushFollow(FOLLOW_model_classifier_set_in_ocl_expressions_collectionliteralexp3840);
                    temp=model_classifier_set();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "type", temp);
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8F2CE80334511DFC7E5EC660A0001C5");
                    }
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "kind", org.omg.ocl.expressions.CollectionKindEnum.SET);_exitInjectorAction();
                    }
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 3 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:820:4: ( 'Collection' (temp= model_classifier_collection ) )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(2);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:820:20: ( 'Collection' (temp= model_classifier_collection ) )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:820:21: 'Collection' (temp= model_classifier_collection )
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8F2CE82334511DFBC77EC660A0001C5");
                    }
                    match(input,38,FOLLOW_38_in_ocl_expressions_collectionliteralexp3859); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8F2F590334511DF8CF2EC660A0001C5");
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:820:167: (temp= model_classifier_collection )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:820:169: temp= model_classifier_collection
                    {
                    pushFollow(FOLLOW_model_classifier_collection_in_ocl_expressions_collectionliteralexp3866);
                    temp=model_classifier_collection();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "type", temp);
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8F2F593334511DF88F5EC660A0001C5");
                    }
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "kind", org.omg.ocl.expressions.CollectionKindEnum.COLLECTION);_exitInjectorAction();
                    }
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 4 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:821:4: ( 'Bag' (temp= model_classifier_bag ) )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(3);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:821:20: ( 'Bag' (temp= model_classifier_bag ) )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:821:21: 'Bag' (temp= model_classifier_bag )
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8F31CA0334511DFB695EC660A0001C5");
                    }
                    match(input,45,FOLLOW_45_in_ocl_expressions_collectionliteralexp3885); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8F31CA3334511DF9652EC660A0001C5");
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:821:160: (temp= model_classifier_bag )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:821:162: temp= model_classifier_bag
                    {
                    pushFollow(FOLLOW_model_classifier_bag_in_ocl_expressions_collectionliteralexp3892);
                    temp=model_classifier_bag();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "type", temp);
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8F343B2334511DFBBDCEC660A0001C5");
                    }
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "kind", org.omg.ocl.expressions.CollectionKindEnum.BAG);_exitInjectorAction();
                    }
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 5 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:822:4: ( 'OrderedSet' (temp= model_classifier_orderedset ) )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(4);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:822:20: ( 'OrderedSet' (temp= model_classifier_orderedset ) )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:822:21: 'OrderedSet' (temp= model_classifier_orderedset )
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8F343B4334511DFB7A3EC660A0001C5");
                    }
                    match(input,33,FOLLOW_33_in_ocl_expressions_collectionliteralexp3911); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8F36AC0334511DF9A89EC660A0001C5");
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:822:167: (temp= model_classifier_orderedset )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:822:169: temp= model_classifier_orderedset
                    {
                    pushFollow(FOLLOW_model_classifier_orderedset_in_ocl_expressions_collectionliteralexp3918);
                    temp=model_classifier_orderedset();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "type", temp);
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC8F36AC3334511DFAC89EC660A0001C5");
                    }
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "kind", org.omg.ocl.expressions.CollectionKindEnum.ORDERED_SET);_exitInjectorAction();
                    }
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8F391D1334511DFA176EC660A0001C5");
            }
            match(input,LCURL,FOLLOW_LCURL_in_ocl_expressions_collectionliteralexp3933); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8F3B8E3334511DFB738EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:822:605: (temp= ocl_expressions_collectionliteralpart ( ( ',' ) temp= ocl_expressions_collectionliteralpart )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=NAME && LA44_0<=QNAME)||(LA44_0>=INT && LA44_0<=BOOL)||LA44_0==LPAREN||(LA44_0>=32 && LA44_0<=33)||LA44_0==35||LA44_0==38||(LA44_0>=45 && LA44_0<=46)||(LA44_0>=52 && LA44_0<=53)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:822:607: temp= ocl_expressions_collectionliteralpart ( ( ',' ) temp= ocl_expressions_collectionliteralpart )*
                    {
                    pushFollow(FOLLOW_ocl_expressions_collectionliteralpart_in_ocl_expressions_collectionliteralexp3941);
                    temp=ocl_expressions_collectionliteralpart();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "parts", temp);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:822:685: ( ( ',' ) temp= ocl_expressions_collectionliteralpart )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==40) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:822:686: ( ',' ) temp= ocl_expressions_collectionliteralpart
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	      _enterSepSeq();
                    	    }
                    	    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:822:703: ( ',' )
                    	    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:822:704: ','
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	      _beforeSeqEl("E009322EC8F3B8E0334511DFB0FBEC660A0001C5");
                    	    }
                    	    match(input,40,FOLLOW_40_in_ocl_expressions_collectionliteralexp3949); if (state.failed) return ret2;
                    	    if ( state.backtracking==0 ) {
                    	      _afterSeqEl();
                    	    }

                    	    }

                    	    if ( state.backtracking==0 ) {
                    	      _exitSepSeq();
                    	    }
                    	    pushFollow(FOLLOW_ocl_expressions_collectionliteralpart_in_ocl_expressions_collectionliteralexp3956);
                    	    temp=ocl_expressions_collectionliteralpart();

                    	    checkFollows();
                    	    state._fsp--;
                    	    if (state.failed) return ret2;
                    	    if ( state.backtracking==0 ) {
                    	      setProperty(ret, "parts", temp);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);


                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8F3B8E4334511DFBD94EC660A0001C5");
            }
            match(input,RCURL,FOLLOW_RCURL_in_ocl_expressions_collectionliteralexp3968); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8F3DFF0334511DF9E22EC660A0001C5");
            }
            if ( state.backtracking==0 ) {
              setOclRef(ret, "name", null, null, "OCL:self.type.name.subString(1, -4+type.name.size()).concat('{...}')", true);_exitInjectorAction();
            }
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

              ret2 = commitCreation(ret, firstToken, true);

               
            }

            }

        }
        catch (Exception e) {
            handleExceptionInTemplateRule(e, firstToken, ret);
        }
        finally {
            onExitTemplateRule(metaType);
        }
        return ret2;
    }
    // $ANTLR end "ocl_expressions_collectionliteralexp"


    // $ANTLR start "model_classifier_sequence"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:830:1: model_classifier_sequence returns [Object ret2] : (ret= model_datatype_sequence ) ;
    public final Object model_classifier_sequence() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:831:3: ( (ret= model_datatype_sequence ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:832:3: (ret= model_datatype_sequence )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:832:3: (ret= model_datatype_sequence )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:832:4: ret= model_datatype_sequence
            {
            pushFollow(FOLLOW_model_datatype_sequence_in_model_classifier_sequence4009);
            ret=model_datatype_sequence();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;

            }

            if ( state.backtracking==0 ) {

              ret2=ret;
               
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "model_classifier_sequence"


    // $ANTLR start "model_datatype_sequence"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:839:1: model_datatype_sequence returns [Object ret2] : (ret= ocl_types_collectiontype_sequence ) ;
    public final Object model_datatype_sequence() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:840:3: ( (ret= ocl_types_collectiontype_sequence ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:841:3: (ret= ocl_types_collectiontype_sequence )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:841:3: (ret= ocl_types_collectiontype_sequence )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:841:4: ret= ocl_types_collectiontype_sequence
            {
            pushFollow(FOLLOW_ocl_types_collectiontype_sequence_in_model_datatype_sequence4036);
            ret=ocl_types_collectiontype_sequence();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;

            }

            if ( state.backtracking==0 ) {

              ret2=ret;
               
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "model_datatype_sequence"


    // $ANTLR start "ocl_types_collectiontype_sequence"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:848:1: ocl_types_collectiontype_sequence returns [Object ret2] : (ret= ocl_types_sequencetype_sequence ) ;
    public final Object ocl_types_collectiontype_sequence() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:849:3: ( (ret= ocl_types_sequencetype_sequence ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:850:3: (ret= ocl_types_sequencetype_sequence )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:850:3: (ret= ocl_types_sequencetype_sequence )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:850:4: ret= ocl_types_sequencetype_sequence
            {
            pushFollow(FOLLOW_ocl_types_sequencetype_sequence_in_ocl_types_collectiontype_sequence4063);
            ret=ocl_types_sequencetype_sequence();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;

            }

            if ( state.backtracking==0 ) {

              ret2=ret;
               
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "ocl_types_collectiontype_sequence"


    // $ANTLR start "ocl_types_sequencetype_sequence"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:857:1: ocl_types_sequencetype_sequence returns [Object ret2] : ( collectiontypeelementtype[ret] ) ;
    public final Object ocl_types_sequencetype_sequence() throws RecognitionException {
        Object ret2 = null;

        List<String> metaType=list("OCL","Types","SequenceType");
        onEnterTemplateRule(metaType,"sequence");
        IModelElementProxy ret=(getBacktrackingLevel()==0) ? createModelElementProxy(metaType, false, false) : null;
        org.antlr.runtime.Token firstToken=input.LT(1);

        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:862:3: ( ( collectiontypeelementtype[ret] ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:863:3: ( collectiontypeelementtype[ret] )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:863:3: ( collectiontypeelementtype[ret] )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:863:4: collectiontypeelementtype[ret]
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8F6ED30334511DFC700EC660A0001C5");
            }
            pushFollow(FOLLOW_collectiontypeelementtype_in_ocl_types_sequencetype_sequence4093);
            collectiontypeelementtype(ret);

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8F6ED33334511DF862AEC660A0001C5");
            }
            if ( state.backtracking==0 ) {
              setProperty(ret, "name", "SequenceType");_exitInjectorAction();
            }
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

              ret2 = commitCreation(ret, firstToken, false);

               
            }

            }

        }
        catch (Exception e) {
            handleExceptionInTemplateRule(e, firstToken, ret);
        }
        finally {
            onExitTemplateRule(metaType);
        }
        return ret2;
    }
    // $ANTLR end "ocl_types_sequencetype_sequence"


    // $ANTLR start "model_classifier_set"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:871:1: model_classifier_set returns [Object ret2] : (ret= model_datatype_set ) ;
    public final Object model_classifier_set() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:872:3: ( (ret= model_datatype_set ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:873:3: (ret= model_datatype_set )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:873:3: (ret= model_datatype_set )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:873:4: ret= model_datatype_set
            {
            pushFollow(FOLLOW_model_datatype_set_in_model_classifier_set4134);
            ret=model_datatype_set();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;

            }

            if ( state.backtracking==0 ) {

              ret2=ret;
               
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "model_classifier_set"


    // $ANTLR start "model_datatype_set"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:880:1: model_datatype_set returns [Object ret2] : (ret= ocl_types_collectiontype_set ) ;
    public final Object model_datatype_set() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:881:3: ( (ret= ocl_types_collectiontype_set ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:882:3: (ret= ocl_types_collectiontype_set )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:882:3: (ret= ocl_types_collectiontype_set )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:882:4: ret= ocl_types_collectiontype_set
            {
            pushFollow(FOLLOW_ocl_types_collectiontype_set_in_model_datatype_set4161);
            ret=ocl_types_collectiontype_set();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;

            }

            if ( state.backtracking==0 ) {

              ret2=ret;
               
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "model_datatype_set"


    // $ANTLR start "ocl_types_collectiontype_set"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:889:1: ocl_types_collectiontype_set returns [Object ret2] : (ret= ocl_types_settype_set ) ;
    public final Object ocl_types_collectiontype_set() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:890:3: ( (ret= ocl_types_settype_set ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:891:3: (ret= ocl_types_settype_set )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:891:3: (ret= ocl_types_settype_set )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:891:4: ret= ocl_types_settype_set
            {
            pushFollow(FOLLOW_ocl_types_settype_set_in_ocl_types_collectiontype_set4188);
            ret=ocl_types_settype_set();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;

            }

            if ( state.backtracking==0 ) {

              ret2=ret;
               
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "ocl_types_collectiontype_set"


    // $ANTLR start "ocl_types_settype_set"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:898:1: ocl_types_settype_set returns [Object ret2] : ( collectiontypeelementtype[ret] ) ;
    public final Object ocl_types_settype_set() throws RecognitionException {
        Object ret2 = null;

        List<String> metaType=list("OCL","Types","SetType");
        onEnterTemplateRule(metaType,"set");
        IModelElementProxy ret=(getBacktrackingLevel()==0) ? createModelElementProxy(metaType, false, false) : null;
        org.antlr.runtime.Token firstToken=input.LT(1);

        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:903:3: ( ( collectiontypeelementtype[ret] ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:904:3: ( collectiontypeelementtype[ret] )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:904:3: ( collectiontypeelementtype[ret] )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:904:4: collectiontypeelementtype[ret]
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8F9D360334511DFB9B6EC660A0001C5");
            }
            pushFollow(FOLLOW_collectiontypeelementtype_in_ocl_types_settype_set4218);
            collectiontypeelementtype(ret);

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8F9FA70334511DFBEBEEC660A0001C5");
            }
            if ( state.backtracking==0 ) {
              setProperty(ret, "name", "SetType");_exitInjectorAction();
            }
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

              ret2 = commitCreation(ret, firstToken, false);

               
            }

            }

        }
        catch (Exception e) {
            handleExceptionInTemplateRule(e, firstToken, ret);
        }
        finally {
            onExitTemplateRule(metaType);
        }
        return ret2;
    }
    // $ANTLR end "ocl_types_settype_set"


    // $ANTLR start "model_classifier_collection"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:912:1: model_classifier_collection returns [Object ret2] : (ret= model_datatype_collection ) ;
    public final Object model_classifier_collection() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:913:3: ( (ret= model_datatype_collection ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:914:3: (ret= model_datatype_collection )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:914:3: (ret= model_datatype_collection )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:914:4: ret= model_datatype_collection
            {
            pushFollow(FOLLOW_model_datatype_collection_in_model_classifier_collection4259);
            ret=model_datatype_collection();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;

            }

            if ( state.backtracking==0 ) {

              ret2=ret;
               
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "model_classifier_collection"


    // $ANTLR start "model_datatype_collection"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:921:1: model_datatype_collection returns [Object ret2] : (ret= ocl_types_collectiontype_collection ) ;
    public final Object model_datatype_collection() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:922:3: ( (ret= ocl_types_collectiontype_collection ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:923:3: (ret= ocl_types_collectiontype_collection )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:923:3: (ret= ocl_types_collectiontype_collection )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:923:4: ret= ocl_types_collectiontype_collection
            {
            pushFollow(FOLLOW_ocl_types_collectiontype_collection_in_model_datatype_collection4286);
            ret=ocl_types_collectiontype_collection();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;

            }

            if ( state.backtracking==0 ) {

              ret2=ret;
               
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "model_datatype_collection"


    // $ANTLR start "ocl_types_collectiontype_collection"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:930:1: ocl_types_collectiontype_collection returns [Object ret2] : ( collectiontypeelementtype[ret] ) ;
    public final Object ocl_types_collectiontype_collection() throws RecognitionException {
        Object ret2 = null;

        List<String> metaType=list("OCL","Types","CollectionType");
        onEnterTemplateRule(metaType,"collection");
        IModelElementProxy ret=(getBacktrackingLevel()==0) ? createModelElementProxy(metaType, false, false) : null;
        org.antlr.runtime.Token firstToken=input.LT(1);

        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:935:3: ( ( collectiontypeelementtype[ret] ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:936:3: ( collectiontypeelementtype[ret] )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:936:3: ( collectiontypeelementtype[ret] )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:936:4: collectiontypeelementtype[ret]
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8FC1D50334511DF9A77EC660A0001C5");
            }
            pushFollow(FOLLOW_collectiontypeelementtype_in_ocl_types_collectiontype_collection4316);
            collectiontypeelementtype(ret);

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8FC4460334511DFCFD4EC660A0001C5");
            }
            if ( state.backtracking==0 ) {
              setProperty(ret, "name", "CollectionType");_exitInjectorAction();
            }
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

              ret2 = commitCreation(ret, firstToken, false);

               
            }

            }

        }
        catch (Exception e) {
            handleExceptionInTemplateRule(e, firstToken, ret);
        }
        finally {
            onExitTemplateRule(metaType);
        }
        return ret2;
    }
    // $ANTLR end "ocl_types_collectiontype_collection"


    // $ANTLR start "model_classifier_bag"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:944:1: model_classifier_bag returns [Object ret2] : (ret= model_datatype_bag ) ;
    public final Object model_classifier_bag() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:945:3: ( (ret= model_datatype_bag ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:946:3: (ret= model_datatype_bag )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:946:3: (ret= model_datatype_bag )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:946:4: ret= model_datatype_bag
            {
            pushFollow(FOLLOW_model_datatype_bag_in_model_classifier_bag4357);
            ret=model_datatype_bag();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;

            }

            if ( state.backtracking==0 ) {

              ret2=ret;
               
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "model_classifier_bag"


    // $ANTLR start "model_datatype_bag"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:953:1: model_datatype_bag returns [Object ret2] : (ret= ocl_types_collectiontype_bag ) ;
    public final Object model_datatype_bag() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:954:3: ( (ret= ocl_types_collectiontype_bag ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:955:3: (ret= ocl_types_collectiontype_bag )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:955:3: (ret= ocl_types_collectiontype_bag )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:955:4: ret= ocl_types_collectiontype_bag
            {
            pushFollow(FOLLOW_ocl_types_collectiontype_bag_in_model_datatype_bag4384);
            ret=ocl_types_collectiontype_bag();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;

            }

            if ( state.backtracking==0 ) {

              ret2=ret;
               
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "model_datatype_bag"


    // $ANTLR start "ocl_types_collectiontype_bag"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:962:1: ocl_types_collectiontype_bag returns [Object ret2] : (ret= ocl_types_bagtype_bag ) ;
    public final Object ocl_types_collectiontype_bag() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:963:3: ( (ret= ocl_types_bagtype_bag ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:964:3: (ret= ocl_types_bagtype_bag )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:964:3: (ret= ocl_types_bagtype_bag )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:964:4: ret= ocl_types_bagtype_bag
            {
            pushFollow(FOLLOW_ocl_types_bagtype_bag_in_ocl_types_collectiontype_bag4411);
            ret=ocl_types_bagtype_bag();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;

            }

            if ( state.backtracking==0 ) {

              ret2=ret;
               
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "ocl_types_collectiontype_bag"


    // $ANTLR start "ocl_types_bagtype_bag"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:971:1: ocl_types_bagtype_bag returns [Object ret2] : ( collectiontypeelementtype[ret] ) ;
    public final Object ocl_types_bagtype_bag() throws RecognitionException {
        Object ret2 = null;

        List<String> metaType=list("OCL","Types","BagType");
        onEnterTemplateRule(metaType,"bag");
        IModelElementProxy ret=(getBacktrackingLevel()==0) ? createModelElementProxy(metaType, false, false) : null;
        org.antlr.runtime.Token firstToken=input.LT(1);

        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:976:3: ( ( collectiontypeelementtype[ret] ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:977:3: ( collectiontypeelementtype[ret] )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:977:3: ( collectiontypeelementtype[ret] )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:977:4: collectiontypeelementtype[ret]
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8FEB560334511DF9112EC660A0001C5");
            }
            pushFollow(FOLLOW_collectiontypeelementtype_in_ocl_types_bagtype_bag4441);
            collectiontypeelementtype(ret);

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC8FEDC72334511DFBFBEEC660A0001C5");
            }
            if ( state.backtracking==0 ) {
              setProperty(ret, "name", "BagType");_exitInjectorAction();
            }
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

              ret2 = commitCreation(ret, firstToken, false);

               
            }

            }

        }
        catch (Exception e) {
            handleExceptionInTemplateRule(e, firstToken, ret);
        }
        finally {
            onExitTemplateRule(metaType);
        }
        return ret2;
    }
    // $ANTLR end "ocl_types_bagtype_bag"


    // $ANTLR start "model_classifier_orderedset"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:985:1: model_classifier_orderedset returns [Object ret2] : (ret= model_datatype_orderedset ) ;
    public final Object model_classifier_orderedset() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:986:3: ( (ret= model_datatype_orderedset ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:987:3: (ret= model_datatype_orderedset )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:987:3: (ret= model_datatype_orderedset )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:987:4: ret= model_datatype_orderedset
            {
            pushFollow(FOLLOW_model_datatype_orderedset_in_model_classifier_orderedset4482);
            ret=model_datatype_orderedset();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;

            }

            if ( state.backtracking==0 ) {

              ret2=ret;
               
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "model_classifier_orderedset"


    // $ANTLR start "model_datatype_orderedset"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:994:1: model_datatype_orderedset returns [Object ret2] : (ret= ocl_types_collectiontype_orderedset ) ;
    public final Object model_datatype_orderedset() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:995:3: ( (ret= ocl_types_collectiontype_orderedset ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:996:3: (ret= ocl_types_collectiontype_orderedset )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:996:3: (ret= ocl_types_collectiontype_orderedset )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:996:4: ret= ocl_types_collectiontype_orderedset
            {
            pushFollow(FOLLOW_ocl_types_collectiontype_orderedset_in_model_datatype_orderedset4509);
            ret=ocl_types_collectiontype_orderedset();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;

            }

            if ( state.backtracking==0 ) {

              ret2=ret;
               
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "model_datatype_orderedset"


    // $ANTLR start "ocl_types_collectiontype_orderedset"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1003:1: ocl_types_collectiontype_orderedset returns [Object ret2] : (ret= ocl_types_orderedsettype_orderedset ) ;
    public final Object ocl_types_collectiontype_orderedset() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1004:3: ( (ret= ocl_types_orderedsettype_orderedset ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1005:3: (ret= ocl_types_orderedsettype_orderedset )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1005:3: (ret= ocl_types_orderedsettype_orderedset )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1005:4: ret= ocl_types_orderedsettype_orderedset
            {
            pushFollow(FOLLOW_ocl_types_orderedsettype_orderedset_in_ocl_types_collectiontype_orderedset4536);
            ret=ocl_types_orderedsettype_orderedset();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;

            }

            if ( state.backtracking==0 ) {

              ret2=ret;
               
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "ocl_types_collectiontype_orderedset"


    // $ANTLR start "ocl_types_orderedsettype_orderedset"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1012:1: ocl_types_orderedsettype_orderedset returns [Object ret2] : ( collectiontypeelementtype[ret] ) ;
    public final Object ocl_types_orderedsettype_orderedset() throws RecognitionException {
        Object ret2 = null;

        List<String> metaType=list("OCL","Types","OrderedSetType");
        onEnterTemplateRule(metaType,"orderedset");
        IModelElementProxy ret=(getBacktrackingLevel()==0) ? createModelElementProxy(metaType, false, false) : null;
        org.antlr.runtime.Token firstToken=input.LT(1);

        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1017:3: ( ( collectiontypeelementtype[ret] ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1018:3: ( collectiontypeelementtype[ret] )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1018:3: ( collectiontypeelementtype[ret] )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1018:4: collectiontypeelementtype[ret]
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC9014D70334511DFBDD9EC660A0001C5");
            }
            pushFollow(FOLLOW_collectiontypeelementtype_in_ocl_types_orderedsettype_orderedset4566);
            collectiontypeelementtype(ret);

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC9014D73334511DFA8F4EC660A0001C5");
            }
            if ( state.backtracking==0 ) {
              setProperty(ret, "name", "OrderedSetType");_exitInjectorAction();
            }
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

              ret2 = commitCreation(ret, firstToken, false);

               
            }

            }

        }
        catch (Exception e) {
            handleExceptionInTemplateRule(e, firstToken, ret);
        }
        finally {
            onExitTemplateRule(metaType);
        }
        return ret2;
    }
    // $ANTLR end "ocl_types_orderedsettype_orderedset"


    // $ANTLR start "collectiontypeelementtype"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1026:1: collectiontypeelementtype[Object ret] : () ;
    public final void collectiontypeelementtype(Object ret) throws RecognitionException {
        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1027:3: ( () )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1028:3: ()
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1028:3: ()
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1028:4: 
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC902FB20334511DFC97AEC660A0001C5");
            }
            if ( state.backtracking==0 ) {
              setOclRef(ret, "elementType", null, null, "OCL:#context(collectionliteral).oclAsType(CollectionLiteralExp).parts.type->iterate("+"  								t; acc:Moin::Model::Classifier=null |"+"  									if acc->isEmpty() or acc=t then"+"  										t "+"  									else "+"  										if t.allSupertypes()->includes(acc) then"+"  											acc "+"  										else "+"  											if acc.allSupertypes()->includes(t) then"+"  												t "+"  											else "+"  												null "+"  											endif"+"  										endif"+"  									endif)", true);_exitInjectorAction();
            }
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

                
            }

            }

        }
        finally {
        }
        return ;
    }
    // $ANTLR end "collectiontypeelementtype"


    // $ANTLR start "ocl_expressions_collectionliteralpart"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1035:1: ocl_expressions_collectionliteralpart returns [Object ret2] : ( ( ocl_expressions_collectionitem )=> (ret= ocl_expressions_collectionitem ) | ( ocl_expressions_collectionrange )=> (ret= ocl_expressions_collectionrange ) ) ;
    public final Object ocl_expressions_collectionliteralpart() throws RecognitionException {
        Object ret2 = null;

        Object ret = null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1036:3: ( ( ( ocl_expressions_collectionitem )=> (ret= ocl_expressions_collectionitem ) | ( ocl_expressions_collectionrange )=> (ret= ocl_expressions_collectionrange ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1037:3: ( ( ocl_expressions_collectionitem )=> (ret= ocl_expressions_collectionitem ) | ( ocl_expressions_collectionrange )=> (ret= ocl_expressions_collectionrange ) )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1037:3: ( ( ocl_expressions_collectionitem )=> (ret= ocl_expressions_collectionitem ) | ( ocl_expressions_collectionrange )=> (ret= ocl_expressions_collectionrange ) )
            int alt45=2;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1037:4: ( ocl_expressions_collectionitem )=> (ret= ocl_expressions_collectionitem )
                    {
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1037:38: (ret= ocl_expressions_collectionitem )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1037:39: ret= ocl_expressions_collectionitem
                    {
                    pushFollow(FOLLOW_ocl_expressions_collectionitem_in_ocl_expressions_collectionliteralpart4636);
                    ret=ocl_expressions_collectionitem();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;

                    }


                    }
                    break;
                case 2 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1038:5: ( ocl_expressions_collectionrange )=> (ret= ocl_expressions_collectionrange )
                    {
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1038:40: (ret= ocl_expressions_collectionrange )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1038:41: ret= ocl_expressions_collectionrange
                    {
                    pushFollow(FOLLOW_ocl_expressions_collectionrange_in_ocl_expressions_collectionliteralpart4650);
                    ret=ocl_expressions_collectionrange();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;

                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              ret2=ret;
               
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "ocl_expressions_collectionliteralpart"


    // $ANTLR start "ocl_expressions_collectionitem"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1045:1: ocl_expressions_collectionitem returns [Object ret2] : ( (temp= ocl_expressions_oclexpression ) ) ;
    public final Object ocl_expressions_collectionitem() throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        List<String> metaType=list("OCL","Expressions","CollectionItem");
        onEnterTemplateRule(metaType);
        IModelElementProxy ret=(getBacktrackingLevel()==0) ? createModelElementProxy(metaType, false, false) : null;
        org.antlr.runtime.Token firstToken=input.LT(1);

        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1050:3: ( ( (temp= ocl_expressions_oclexpression ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1051:3: ( (temp= ocl_expressions_oclexpression ) )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1051:3: ( (temp= ocl_expressions_oclexpression ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1051:4: (temp= ocl_expressions_oclexpression )
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC9039761334511DF9BB3EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1051:63: (temp= ocl_expressions_oclexpression )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1051:65: temp= ocl_expressions_oclexpression
            {
            pushFollow(FOLLOW_ocl_expressions_oclexpression_in_ocl_expressions_collectionitem4685);
            temp=ocl_expressions_oclexpression();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              setProperty(ret, "item", temp);
            }

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC903BE71334511DF995EEC660A0001C5");
            }
            if ( state.backtracking==0 ) {
              setOclRef(ret, "type", null, null, "OCL:self.item.type", true);_exitInjectorAction();
            }
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

              ret2 = commitCreation(ret, firstToken, false);

               
            }

            }

        }
        catch (Exception e) {
            handleExceptionInTemplateRule(e, firstToken, ret);
        }
        finally {
            onExitTemplateRule(metaType);
        }
        return ret2;
    }
    // $ANTLR end "ocl_expressions_collectionitem"


    // $ANTLR start "ocl_expressions_collectionrange"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1059:1: ocl_expressions_collectionrange returns [Object ret2] : ( (temp= ocl_expressions_oclexpression ) DDOT (temp= ocl_expressions_oclexpression ) ) ;
    public final Object ocl_expressions_collectionrange() throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        List<String> metaType=list("OCL","Expressions","CollectionRange");
        onEnterTemplateRule(metaType);
        IModelElementProxy ret=(getBacktrackingLevel()==0) ? createModelElementProxy(metaType, false, false) : null;
        org.antlr.runtime.Token firstToken=input.LT(1);

        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1064:3: ( ( (temp= ocl_expressions_oclexpression ) DDOT (temp= ocl_expressions_oclexpression ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1065:3: ( (temp= ocl_expressions_oclexpression ) DDOT (temp= ocl_expressions_oclexpression ) )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1065:3: ( (temp= ocl_expressions_oclexpression ) DDOT (temp= ocl_expressions_oclexpression ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1065:4: (temp= ocl_expressions_oclexpression ) DDOT (temp= ocl_expressions_oclexpression )
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC9040C91334511DFA743EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1065:63: (temp= ocl_expressions_oclexpression )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1065:65: temp= ocl_expressions_oclexpression
            {
            pushFollow(FOLLOW_ocl_expressions_oclexpression_in_ocl_expressions_collectionrange4735);
            temp=ocl_expressions_oclexpression();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              setProperty(ret, "first", temp);
            }

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC90433A0334511DF8646EC660A0001C5");
            }
            match(input,DDOT,FOLLOW_DDOT_in_ocl_expressions_collectionrange4742); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC90433A2334511DFCD55EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1065:291: (temp= ocl_expressions_oclexpression )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1065:293: temp= ocl_expressions_oclexpression
            {
            pushFollow(FOLLOW_ocl_expressions_oclexpression_in_ocl_expressions_collectionrange4750);
            temp=ocl_expressions_oclexpression();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              setProperty(ret, "last", temp);
            }

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC90433A5334511DFBD65EC660A0001C5");
            }
            if ( state.backtracking==0 ) {
              setOclRef(ret, "type", null, null, "OCL:if self.first.type=self.last.type then"+"  	  						self.first.type "+"  	  					  else "+"  	  					  	if self.first.type.allSupertypes()->includes(self.last.type) then"+"  	  					  		self.last.type "+"  	  					  	else "+"  	  					  		if self.last.type.allSupertypes()->includes(self.first.type) then "+"  	  					  			self.first.type "+"  	  					  		else "+"  	  					  			null "+"  	  					  		endif "+"  	  					  	endif "+"  	  					  endif", true);_exitInjectorAction();
            }
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

              ret2 = commitCreation(ret, firstToken, false);

               
            }

            }

        }
        catch (Exception e) {
            handleExceptionInTemplateRule(e, firstToken, ret);
        }
        finally {
            onExitTemplateRule(metaType);
        }
        return ret2;
    }
    // $ANTLR end "ocl_expressions_collectionrange"


    // $ANTLR start "ocl_expressions_collectionkind"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1073:1: ocl_expressions_collectionkind returns [Object ret2] : ( ( 'Collection' ) | ( 'Set' ) | ( 'Bag' ) | ( 'Sequence' ) | ( 'OrderedSet' ) ) ;
    public final Object ocl_expressions_collectionkind() throws RecognitionException {
        Object ret2 = null;

        java.lang.Object ret=null;
        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1074:3: ( ( ( 'Collection' ) | ( 'Set' ) | ( 'Bag' ) | ( 'Sequence' ) | ( 'OrderedSet' ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1075:3: ( ( 'Collection' ) | ( 'Set' ) | ( 'Bag' ) | ( 'Sequence' ) | ( 'OrderedSet' ) )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1075:3: ( ( 'Collection' ) | ( 'Set' ) | ( 'Bag' ) | ( 'Sequence' ) | ( 'OrderedSet' ) )
            int alt46=5;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt46=1;
                }
                break;
            case 46:
                {
                alt46=2;
                }
                break;
            case 45:
                {
                alt46=3;
                }
                break;
            case 35:
                {
                alt46=4;
                }
                break;
            case 33:
                {
                alt46=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ret2;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1075:4: ( 'Collection' )
                    {
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1075:4: ( 'Collection' )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1075:5: 'Collection'
                    {
                    match(input,38,FOLLOW_38_in_ocl_expressions_collectionkind4796); if (state.failed) return ret2;

                    }

                    if ( state.backtracking==0 ) {
                      ret = createEnumLiteral(list("OCL","Expressions","CollectionKind"), "Collection");
                    }

                    }
                    break;
                case 2 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1076:4: ( 'Set' )
                    {
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1076:4: ( 'Set' )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1076:5: 'Set'
                    {
                    match(input,46,FOLLOW_46_in_ocl_expressions_collectionkind4804); if (state.failed) return ret2;

                    }

                    if ( state.backtracking==0 ) {
                      ret = createEnumLiteral(list("OCL","Expressions","CollectionKind"), "Set");
                    }

                    }
                    break;
                case 3 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1077:4: ( 'Bag' )
                    {
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1077:4: ( 'Bag' )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1077:5: 'Bag'
                    {
                    match(input,45,FOLLOW_45_in_ocl_expressions_collectionkind4812); if (state.failed) return ret2;

                    }

                    if ( state.backtracking==0 ) {
                      ret = createEnumLiteral(list("OCL","Expressions","CollectionKind"), "Bag");
                    }

                    }
                    break;
                case 4 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1078:4: ( 'Sequence' )
                    {
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1078:4: ( 'Sequence' )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1078:5: 'Sequence'
                    {
                    match(input,35,FOLLOW_35_in_ocl_expressions_collectionkind4820); if (state.failed) return ret2;

                    }

                    if ( state.backtracking==0 ) {
                      ret = createEnumLiteral(list("OCL","Expressions","CollectionKind"), "Sequence");
                    }

                    }
                    break;
                case 5 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1079:4: ( 'OrderedSet' )
                    {
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1079:4: ( 'OrderedSet' )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1079:5: 'OrderedSet'
                    {
                    match(input,33,FOLLOW_33_in_ocl_expressions_collectionkind4828); if (state.failed) return ret2;

                    }

                    if ( state.backtracking==0 ) {
                      ret = createEnumLiteral(list("OCL","Expressions","CollectionKind"), "OrderedSet");
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                ret2=ret;

            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret2;
    }
    // $ANTLR end "ocl_expressions_collectionkind"


    // $ANTLR start "ocl_expressions_ifexp"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1086:1: ocl_expressions_ifexp returns [Object ret2] : ( 'if' (temp= ocl_expressions_oclexpression ) 'then' ( ( (temp= ocl_expressions_oclexpression ) ) ) 'else' ( ( (temp= ocl_expressions_oclexpression ) ) ) 'endif' ) ;
    public final Object ocl_expressions_ifexp() throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        List<String> metaType=list("OCL","Expressions","IfExp");
        onEnterTemplateRule(metaType);
        IModelElementProxy ret=(getBacktrackingLevel()==0) ? createModelElementProxy(metaType, false, false) : null;
        org.antlr.runtime.Token firstToken=input.LT(1);

        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1091:3: ( ( 'if' (temp= ocl_expressions_oclexpression ) 'then' ( ( (temp= ocl_expressions_oclexpression ) ) ) 'else' ( ( (temp= ocl_expressions_oclexpression ) ) ) 'endif' ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1092:3: ( 'if' (temp= ocl_expressions_oclexpression ) 'then' ( ( (temp= ocl_expressions_oclexpression ) ) ) 'else' ( ( (temp= ocl_expressions_oclexpression ) ) ) 'endif' )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1092:3: ( 'if' (temp= ocl_expressions_oclexpression ) 'then' ( ( (temp= ocl_expressions_oclexpression ) ) ) 'else' ( ( (temp= ocl_expressions_oclexpression ) ) ) 'endif' )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1092:4: 'if' (temp= ocl_expressions_oclexpression ) 'then' ( ( (temp= ocl_expressions_oclexpression ) ) ) 'else' ( ( (temp= ocl_expressions_oclexpression ) ) ) 'endif'
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC9051E00334511DFABC8EC660A0001C5");
            }
            match(input,52,FOLLOW_52_in_ocl_expressions_ifexp4858); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC9051E02334511DFA025EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1092:142: (temp= ocl_expressions_oclexpression )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1092:144: temp= ocl_expressions_oclexpression
            {
            pushFollow(FOLLOW_ocl_expressions_oclexpression_in_ocl_expressions_ifexp4865);
            temp=ocl_expressions_oclexpression();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              setProperty(ret, "condition", temp);
            }

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC9051E03334511DFC90DEC660A0001C5");
            }
            match(input,61,FOLLOW_61_in_ocl_expressions_ifexp4871); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC9054510334511DF92CDEC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1092:374: ( ( (temp= ocl_expressions_oclexpression ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1092:375: ( (temp= ocl_expressions_oclexpression ) )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1092:375: ( (temp= ocl_expressions_oclexpression ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1092:376: (temp= ocl_expressions_oclexpression )
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC9051E05334511DFBD20EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1092:435: (temp= ocl_expressions_oclexpression )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1092:437: temp= ocl_expressions_oclexpression
            {
            pushFollow(FOLLOW_ocl_expressions_oclexpression_in_ocl_expressions_ifexp4881);
            temp=ocl_expressions_oclexpression();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              setProperty(ret, "thenExpression", temp);
            }

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }


            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC9054511334511DF849CEC660A0001C5");
            }
            match(input,55,FOLLOW_55_in_ocl_expressions_ifexp4890); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC9056C20334511DF82AAEC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1092:690: ( ( (temp= ocl_expressions_oclexpression ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1092:691: ( (temp= ocl_expressions_oclexpression ) )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1092:691: ( (temp= ocl_expressions_oclexpression ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1092:692: (temp= ocl_expressions_oclexpression )
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC9054513334511DFB71EEC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1092:751: (temp= ocl_expressions_oclexpression )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1092:753: temp= ocl_expressions_oclexpression
            {
            pushFollow(FOLLOW_ocl_expressions_oclexpression_in_ocl_expressions_ifexp4900);
            temp=ocl_expressions_oclexpression();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              setProperty(ret, "elseExpression", temp);
            }

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }


            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC9056C21334511DF9C4CEC660A0001C5");
            }
            match(input,58,FOLLOW_58_in_ocl_expressions_ifexp4909); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC9056C26334511DFAA01EC660A0001C5");
            }
            if ( state.backtracking==0 ) {
              setOclRef(ret, "name", null, null, "OCL:'if '.concat(self.condition.name)", true);_exitInjectorAction();setOclRef(ret, "type", null, null, "OCL:if self.thenExpression.type=self.elseExpression.type then"+"  	                          self.thenExpression.type"+"  	                      else"+"  	                          if self.thenExpression.type.allSupertypes()->includes(self.elseExpression.type) then"+"  	                              self.elseExpression.type"+"  	                          else"+"  	                              if self.elseExpression.type.allSupertypes()->includes(self.thenExpression.type) then"+"  	                                  self.thenExpression.type"+"  	                              else"+"  	                                  null"+"  	                              endif"+"  	                          endif"+"  	                      endif", true);_exitInjectorAction();
            }
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

              ret2 = commitCreation(ret, firstToken, false);

               
            }

            }

        }
        catch (Exception e) {
            handleExceptionInTemplateRule(e, firstToken, ret);
        }
        finally {
            onExitTemplateRule(metaType);
        }
        return ret2;
    }
    // $ANTLR end "ocl_expressions_ifexp"


    // $ANTLR start "ocl_expressions_letexp"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1100:1: ocl_expressions_letexp returns [Object ret2] : ( 'let' (temp= ocl_expressions_variabledeclaration_let ) 'in' ( ( (temp= ocl_expressions_oclexpression ) ) ) ) ;
    public final Object ocl_expressions_letexp() throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        List<String> metaType=list("OCL","Expressions","LetExp");
        onEnterTemplateRule(metaType);
        IModelElementProxy ret=(getBacktrackingLevel()==0) ? createModelElementProxy(metaType, false, false) : null;
        org.antlr.runtime.Token firstToken=input.LT(1);

        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1105:3: ( ( 'let' (temp= ocl_expressions_variabledeclaration_let ) 'in' ( ( (temp= ocl_expressions_oclexpression ) ) ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1106:3: ( 'let' (temp= ocl_expressions_variabledeclaration_let ) 'in' ( ( (temp= ocl_expressions_oclexpression ) ) ) )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1106:3: ( 'let' (temp= ocl_expressions_variabledeclaration_let ) 'in' ( ( (temp= ocl_expressions_oclexpression ) ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1106:4: 'let' (temp= ocl_expressions_variabledeclaration_let ) 'in' ( ( (temp= ocl_expressions_oclexpression ) ) )
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC9060860334511DFCC58EC660A0001C5");
            }
            match(input,32,FOLLOW_32_in_ocl_expressions_letexp4952); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC9060863334511DFB40BEC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1106:143: (temp= ocl_expressions_variabledeclaration_let )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1106:145: temp= ocl_expressions_variabledeclaration_let
            {
            pushFollow(FOLLOW_ocl_expressions_variabledeclaration_let_in_ocl_expressions_letexp4959);
            temp=ocl_expressions_variabledeclaration_let();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              setProperty(ret, "variable", temp);
            }

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC9062F70334511DFCA17EC660A0001C5");
            }
            match(input,54,FOLLOW_54_in_ocl_expressions_letexp4965); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC9062F74334511DF9CCFEC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1106:382: ( ( (temp= ocl_expressions_oclexpression ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1106:383: ( (temp= ocl_expressions_oclexpression ) )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1106:383: ( (temp= ocl_expressions_oclexpression ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1106:384: (temp= ocl_expressions_oclexpression )
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC9062F72334511DFB827EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1106:443: (temp= ocl_expressions_oclexpression )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1106:445: temp= ocl_expressions_oclexpression
            {
            pushFollow(FOLLOW_ocl_expressions_oclexpression_in_ocl_expressions_letexp4975);
            temp=ocl_expressions_oclexpression();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              setProperty(ret, "in", temp);
            }

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }


            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC9065683334511DF86D6EC660A0001C5");
            }
            if ( state.backtracking==0 ) {
              setOclRef(ret, "type", null, null, "OCL:self.\"in\".type", true);_exitInjectorAction();setOclRef(ret, "name", null, null, "OCL:'let '.concat(self.variable.name)", true);_exitInjectorAction();
            }
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

              ret2 = commitCreation(ret, firstToken, false);

               
            }

            }

        }
        catch (Exception e) {
            handleExceptionInTemplateRule(e, firstToken, ret);
        }
        finally {
            onExitTemplateRule(metaType);
        }
        return ret2;
    }
    // $ANTLR end "ocl_expressions_letexp"


    // $ANTLR start "ocl_expressions_variabledeclaration_let"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1114:1: ocl_expressions_variabledeclaration_let returns [Object ret2] : ( (temp= identifier ) ( () | ( COLON (temp= qualifiedNameSymbol ) ) | ( COLON (temp= identifier ) ) ) '=' (temp= ocl_expressions_oclexpression ) ) ;
    public final Object ocl_expressions_variabledeclaration_let() throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        List<String> metaType=list("OCL","Expressions","VariableDeclaration");
        onEnterTemplateRule(metaType,"let");
        IModelElementProxy ret=(getBacktrackingLevel()==0) ? createModelElementProxy(metaType, false, true) : null;
        org.antlr.runtime.Token firstToken=input.LT(1);

        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1119:3: ( ( (temp= identifier ) ( () | ( COLON (temp= qualifiedNameSymbol ) ) | ( COLON (temp= identifier ) ) ) '=' (temp= ocl_expressions_oclexpression ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1120:3: ( (temp= identifier ) ( () | ( COLON (temp= qualifiedNameSymbol ) ) | ( COLON (temp= identifier ) ) ) '=' (temp= ocl_expressions_oclexpression ) )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1120:3: ( (temp= identifier ) ( () | ( COLON (temp= qualifiedNameSymbol ) ) | ( COLON (temp= identifier ) ) ) '=' (temp= ocl_expressions_oclexpression ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1120:4: (temp= identifier ) ( () | ( COLON (temp= qualifiedNameSymbol ) ) | ( COLON (temp= identifier ) ) ) '=' (temp= ocl_expressions_oclexpression )
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC906CBB1334511DFB5C7EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1120:63: (temp= identifier )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1120:65: temp= identifier
            {
            pushFollow(FOLLOW_identifier_in_ocl_expressions_variabledeclaration_let5028);
            temp=identifier();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              setProperty(ret, "varName", temp);
            }

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC90767F0334511DF9EF2EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1120:193: ( () | ( COLON (temp= qualifiedNameSymbol ) ) | ( COLON (temp= identifier ) ) )
            int alt47=3;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==42) ) {
                alt47=1;
            }
            else if ( (LA47_0==COLON) ) {
                int LA47_2 = input.LA(2);

                if ( (LA47_2==QNAME) ) {
                    alt47=2;
                }
                else if ( (LA47_2==NAME) ) {
                    alt47=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ret2;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ret2;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1120:194: ()
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(0);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1120:210: ()
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1120:211: 
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC906F2C0334511DFC182EC660A0001C5");
                    }
                    if ( state.backtracking==0 ) {
                      setOclRef(ret, "type", null, null, "OCL:self.initExpression.type", true);_exitInjectorAction();
                    }
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 2 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1121:4: ( COLON (temp= qualifiedNameSymbol ) )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(1);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1121:20: ( COLON (temp= qualifiedNameSymbol ) )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1121:21: COLON (temp= qualifiedNameSymbol )
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC906F2C2334511DF9E3BEC660A0001C5");
                    }
                    match(input,COLON,FOLLOW_COLON_in_ocl_expressions_variabledeclaration_let5053); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC90719D0334511DFAC29EC660A0001C5");
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1121:162: (temp= qualifiedNameSymbol )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1121:164: temp= qualifiedNameSymbol
                    {
                    pushFollow(FOLLOW_qualifiedNameSymbol_in_ocl_expressions_variabledeclaration_let5061);
                    temp=qualifiedNameSymbol();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      setOclRef(ret, "type", null, temp, "OCL:"+"			let t=Sequence{1..?.size()}->select(j|?.subString(j, j+1) = '::')->iterate("+"  				i; acc:Tuple(pos:Integer, ns:Set(Namespace), qn:String)=Tuple{pos=1, ns=null, qn=''} |"+"    				let namePart=?.subString(acc.pos, -1+i) in"+"      				Tuple{pos=i+2,"+"      				      ns=if acc.ns=null then"+"            			  	Namespace.allInstances()->select("+"              					ns2 | ns2.container->isEmpty() and ns2.name=namePart)"+"              			  else"+"              			  	acc.ns.contents->select(ns2 | ns2.name=namePart)->asSet()"+"              			  endif,"+"            			  qn=acc.qn.concat('::').concat(namePart)}) in"+"				t.ns.contents->select(c | c.name=?.subString(t.pos, ?.size()))");
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 3 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1122:4: ( COLON (temp= identifier ) )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(2);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1122:20: ( COLON (temp= identifier ) )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1122:21: COLON (temp= identifier )
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC90719D2334511DFC617EC660A0001C5");
                    }
                    match(input,COLON,FOLLOW_COLON_in_ocl_expressions_variabledeclaration_let5078); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC90740E3334511DFBB18EC660A0001C5");
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1122:162: (temp= identifier )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1122:164: temp= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_ocl_expressions_variabledeclaration_let5086);
                    temp=identifier();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      setOclRef(ret, "type", null, temp, "OCL:Model::Classifier.allInstances()->select(name=?)");
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC90767F1334511DFB6A5EC660A0001C5");
            }
            match(input,42,FOLLOW_42_in_ocl_expressions_variabledeclaration_let5097); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC90767F4334511DFBAB8EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1122:459: (temp= ocl_expressions_oclexpression )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1122:461: temp= ocl_expressions_oclexpression
            {
            pushFollow(FOLLOW_ocl_expressions_oclexpression_in_ocl_expressions_variabledeclaration_let5104);
            temp=ocl_expressions_oclexpression();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              setProperty(ret, "initExpression", temp);
            }

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC9078F02334511DF9826EC660A0001C5");
            }
            if ( state.backtracking==0 ) {
              setOclRef(ret, "name", null, null, "OCL:self.varName", true);_exitInjectorAction();
            }
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

              ret2 = commitCreation(ret, firstToken, false);

               
            }

            }

        }
        catch (Exception e) {
            handleExceptionInTemplateRule(e, firstToken, ret);
        }
        finally {
            onExitTemplateRule(metaType);
        }
        return ret2;
    }
    // $ANTLR end "ocl_expressions_variabledeclaration_let"


    // $ANTLR start "ocl_expressions_variabledeclaration"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1130:1: ocl_expressions_variabledeclaration returns [Object ret2] : ( (temp= identifier ) ( () | ( COLON ( ( (temp= qualifiedNameSymbol ) ) | ( (temp= identifier ) ) ) ) ) ( ( '=' (temp= ocl_expressions_oclexpression ) ) | ) ) ;
    public final Object ocl_expressions_variabledeclaration() throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        List<String> metaType=list("OCL","Expressions","VariableDeclaration");
        onEnterTemplateRule(metaType);
        IModelElementProxy ret=(getBacktrackingLevel()==0) ? createModelElementProxy(metaType, false, true) : null;
        org.antlr.runtime.Token firstToken=input.LT(1);

        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1135:3: ( ( (temp= identifier ) ( () | ( COLON ( ( (temp= qualifiedNameSymbol ) ) | ( (temp= identifier ) ) ) ) ) ( ( '=' (temp= ocl_expressions_oclexpression ) ) | ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1136:3: ( (temp= identifier ) ( () | ( COLON ( ( (temp= qualifiedNameSymbol ) ) | ( (temp= identifier ) ) ) ) ) ( ( '=' (temp= ocl_expressions_oclexpression ) ) | ) )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1136:3: ( (temp= identifier ) ( () | ( COLON ( ( (temp= qualifiedNameSymbol ) ) | ( (temp= identifier ) ) ) ) ) ( ( '=' (temp= ocl_expressions_oclexpression ) ) | ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1136:4: (temp= identifier ) ( () | ( COLON ( ( (temp= qualifiedNameSymbol ) ) | ( (temp= identifier ) ) ) ) ) ( ( '=' (temp= ocl_expressions_oclexpression ) ) | )
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC9082B41334511DFCA3EEC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1136:63: (temp= identifier )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1136:65: temp= identifier
            {
            pushFollow(FOLLOW_identifier_in_ocl_expressions_variabledeclaration5154);
            temp=identifier();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              setProperty(ret, "varName", temp);
            }

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC9082B44334511DFBADCEC660A0001C5");
            }
            if ( state.backtracking==0 ) {
              setOclRef(ret, "name", null, null, "OCL:self.varName", true);_exitInjectorAction();
            }
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC908C780334511DF83BEEC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1136:353: ( () | ( COLON ( ( (temp= qualifiedNameSymbol ) ) | ( (temp= identifier ) ) ) ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==NAME||LA49_0==42||LA49_0==49||LA49_0==60) ) {
                alt49=1;
            }
            else if ( (LA49_0==COLON) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ret2;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1136:354: ()
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(0);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1136:370: ()
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1136:371: 
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC9085250334511DF9315EC660A0001C5");
                    }
                    if ( state.backtracking==0 ) {
                      setOclRef(ret, "type", null, null, "OCL:#context(propertyCallExp).oclAsType(PropertyCallExp).source.type", true);_exitInjectorAction();
                    }
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 2 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1137:4: ( COLON ( ( (temp= qualifiedNameSymbol ) ) | ( (temp= identifier ) ) ) )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(1);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1137:20: ( COLON ( ( (temp= qualifiedNameSymbol ) ) | ( (temp= identifier ) ) ) )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1137:21: COLON ( ( (temp= qualifiedNameSymbol ) ) | ( (temp= identifier ) ) )
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC9085252334511DF8D2BEC660A0001C5");
                    }
                    match(input,COLON,FOLLOW_COLON_in_ocl_expressions_variabledeclaration5182); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC908A071334511DFA641EC660A0001C5");
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1137:162: ( ( (temp= qualifiedNameSymbol ) ) | ( (temp= identifier ) ) )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==QNAME) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==NAME) ) {
                        alt48=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ret2;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;
                    }
                    switch (alt48) {
                        case 1 :
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1137:163: ( (temp= qualifiedNameSymbol ) )
                            {
                            if ( state.backtracking==0 ) {
                              _enterAlt(0);
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1137:179: ( (temp= qualifiedNameSymbol ) )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1137:180: (temp= qualifiedNameSymbol )
                            {
                            if ( state.backtracking==0 ) {
                              _beforeSeqEl("E009322EC9085257334511DF9CE8EC660A0001C5");
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1137:239: (temp= qualifiedNameSymbol )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1137:241: temp= qualifiedNameSymbol
                            {
                            pushFollow(FOLLOW_qualifiedNameSymbol_in_ocl_expressions_variabledeclaration5195);
                            temp=qualifiedNameSymbol();

                            checkFollows();
                            state._fsp--;
                            if (state.failed) return ret2;
                            if ( state.backtracking==0 ) {
                              setOclRef(ret, "type", null, temp, "OCL:"+"			let t=Sequence{1..?.size()}->select(j|?.subString(j, j+1) = '::')->iterate("+"  				i; acc:Tuple(pos:Integer, ns:Set(Namespace), qn:String)=Tuple{pos=1, ns=null, qn=''} |"+"    				let namePart=?.subString(acc.pos, -1+i) in"+"      				Tuple{pos=i+2,"+"      				      ns=if acc.ns=null then"+"            			  	Namespace.allInstances()->select("+"              					ns2 | ns2.container->isEmpty() and ns2.name=namePart)"+"              			  else"+"              			  	acc.ns.contents->select(ns2 | ns2.name=namePart)->asSet()"+"              			  endif,"+"            			  qn=acc.qn.concat('::').concat(namePart)}) in"+"				t.ns.contents->select(c | c.name=?.subString(t.pos, ?.size()))");
                            }

                            }

                            if ( state.backtracking==0 ) {
                              _afterSeqEl();
                            }

                            }

                            if ( state.backtracking==0 ) {
                              _exitAlt();
                            }

                            }
                            break;
                        case 2 :
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1138:4: ( (temp= identifier ) )
                            {
                            if ( state.backtracking==0 ) {
                              _enterAlt(1);
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1138:20: ( (temp= identifier ) )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1138:21: (temp= identifier )
                            {
                            if ( state.backtracking==0 ) {
                              _beforeSeqEl("E009322EC9087965334511DF8EA7EC660A0001C5");
                            }
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1138:80: (temp= identifier )
                            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1138:82: temp= identifier
                            {
                            pushFollow(FOLLOW_identifier_in_ocl_expressions_variabledeclaration5215);
                            temp=identifier();

                            checkFollows();
                            state._fsp--;
                            if (state.failed) return ret2;
                            if ( state.backtracking==0 ) {
                              setOclRef(ret, "type", null, temp, "OCL:Model::Classifier.allInstances()->select(name=?)");
                            }

                            }

                            if ( state.backtracking==0 ) {
                              _afterSeqEl();
                            }

                            }

                            if ( state.backtracking==0 ) {
                              _exitAlt();
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC908EE92334511DF9761EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1138:332: ( ( '=' (temp= ocl_expressions_oclexpression ) ) | )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==42) ) {
                alt50=1;
            }
            else if ( (LA50_0==NAME||LA50_0==49||LA50_0==60) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ret2;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1138:333: ( '=' (temp= ocl_expressions_oclexpression ) )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(0);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1138:349: ( '=' (temp= ocl_expressions_oclexpression ) )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1138:350: '=' (temp= ocl_expressions_oclexpression )
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC908C784334511DFB9D0EC660A0001C5");
                    }
                    match(input,42,FOLLOW_42_in_ocl_expressions_variabledeclaration5237); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC908EE90334511DF9517EC660A0001C5");
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1138:487: (temp= ocl_expressions_oclexpression )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1138:489: temp= ocl_expressions_oclexpression
                    {
                    pushFollow(FOLLOW_ocl_expressions_oclexpression_in_ocl_expressions_variabledeclaration5244);
                    temp=ocl_expressions_oclexpression();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "initExpression", temp);
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 2 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1138:602: 
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(1);
                    }
                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

              ret2 = commitCreation(ret, firstToken, false);

               
            }

            }

        }
        catch (Exception e) {
            handleExceptionInTemplateRule(e, firstToken, ret);
        }
        finally {
            onExitTemplateRule(metaType);
        }
        return ret2;
    }
    // $ANTLR end "ocl_expressions_variabledeclaration"


    // $ANTLR start "ocl_expressions_variableexp"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1147:1: ocl_expressions_variableexp returns [Object ret2] : ( ( ( (temp= ocl_expressions_variabledeclaration_self ) ) | ( (temp= identifier ) ) ) ) ;
    public final Object ocl_expressions_variableexp() throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        List<String> metaType=list("OCL","Expressions","VariableExp");
        onEnterTemplateRule(metaType);
        IModelElementProxy ret=(getBacktrackingLevel()==0) ? createModelElementProxy(metaType, false, false) : null;
        org.antlr.runtime.Token firstToken=input.LT(1);

        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1152:3: ( ( ( ( (temp= ocl_expressions_variabledeclaration_self ) ) | ( (temp= identifier ) ) ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1153:3: ( ( ( (temp= ocl_expressions_variabledeclaration_self ) ) | ( (temp= identifier ) ) ) )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1153:3: ( ( ( (temp= ocl_expressions_variabledeclaration_self ) ) | ( (temp= identifier ) ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1153:4: ( ( (temp= ocl_expressions_variabledeclaration_self ) ) | ( (temp= identifier ) ) )
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC909B1E1334511DF812CEC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1153:63: ( ( (temp= ocl_expressions_variabledeclaration_self ) ) | ( (temp= identifier ) ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==53) ) {
                alt51=1;
            }
            else if ( (LA51_0==NAME) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ret2;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1153:64: ( (temp= ocl_expressions_variabledeclaration_self ) )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(0);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1153:80: ( (temp= ocl_expressions_variabledeclaration_self ) )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1153:81: (temp= ocl_expressions_variabledeclaration_self )
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC9098AD2334511DFA310EC660A0001C5");
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1153:140: (temp= ocl_expressions_variabledeclaration_self )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1153:142: temp= ocl_expressions_variabledeclaration_self
                    {
                    pushFollow(FOLLOW_ocl_expressions_variabledeclaration_self_in_ocl_expressions_variableexp5309);
                    temp=ocl_expressions_variabledeclaration_self();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "referredVariable", temp);
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 2 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1154:4: ( (temp= identifier ) )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(1);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1154:20: ( (temp= identifier ) )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1154:21: (temp= identifier )
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC9098AD6334511DFB966EC660A0001C5");
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1154:80: (temp= identifier )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1154:82: temp= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_ocl_expressions_variableexp5329);
                    temp=identifier();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      setRef(ret, "referredVariable", list("OCL","Expressions","VariableDeclaration"), "name", temp, null, "never", null, false, null);
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC909D8F2334511DFAD03EC660A0001C5");
            }
            if ( state.backtracking==0 ) {
              setOclRef(ret, "type", null, null, "OCL:self.referredVariable.type", true);_exitInjectorAction();setOclRef(ret, "name", null, null, "OCL:self.referredVariable.name", true);_exitInjectorAction();
            }
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

              ret2 = commitCreation(ret, firstToken, false);

               
            }

            }

        }
        catch (Exception e) {
            handleExceptionInTemplateRule(e, firstToken, ret);
        }
        finally {
            onExitTemplateRule(metaType);
        }
        return ret2;
    }
    // $ANTLR end "ocl_expressions_variableexp"


    // $ANTLR start "ocl_expressions_variabledeclaration_self"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1162:1: ocl_expressions_variabledeclaration_self returns [Object ret2] : ( 'self' ) ;
    public final Object ocl_expressions_variabledeclaration_self() throws RecognitionException {
        Object ret2 = null;

        List<String> metaType=list("OCL","Expressions","VariableDeclaration");
        onEnterTemplateRule(metaType,"self");
        IModelElementProxy ret=(getBacktrackingLevel()==0) ? createModelElementProxy(metaType, false, false) : null;
        org.antlr.runtime.Token firstToken=input.LT(1);

        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1167:3: ( ( 'self' ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1168:3: ( 'self' )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1168:3: ( 'self' )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1168:4: 'self'
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC90A4E20334511DFCCABEC660A0001C5");
            }
            match(input,53,FOLLOW_53_in_ocl_expressions_variabledeclaration_self5380); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC90A7532334511DFC9BAEC660A0001C5");
            }
            if ( state.backtracking==0 ) {
              setProperty(ret, "name", "self");_exitInjectorAction();setProperty(ret, "varName", "self");_exitInjectorAction();setRef(ret, "type", list("Model","Classifier"), null, null, "#context(class)", null, null, false, null, true);_exitInjectorAction();
            }
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

              ret2 = commitCreation(ret, firstToken, false);

               
            }

            }

        }
        catch (Exception e) {
            handleExceptionInTemplateRule(e, firstToken, ret);
        }
        finally {
            onExitTemplateRule(metaType);
        }
        return ret2;
    }
    // $ANTLR end "ocl_expressions_variabledeclaration_self"


    // $ANTLR start "ocl_expressions_iterateexp"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1176:1: ocl_expressions_iterateexp[java.lang.String opName, Object left, org.antlr.runtime.Token firstToken] returns [Object ret2] : ( 'iterate' LPAREN (temp= ocl_expressions_variabledeclaration (temp= ocl_expressions_variabledeclaration )* ) ( ( ';' (temp= ocl_expressions_variabledeclaration ) ) | ( (temp= ocl_expressions_variabledeclaration_implicitAccumulator ) ) ) '|' (temp= ocl_expressions_oclexpression ) RPAREN ) ;
    public final Object ocl_expressions_iterateexp(java.lang.String opName, Object left, org.antlr.runtime.Token firstToken) throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        List<String> metaType=list("OCL","Expressions","IterateExp");
        onEnterTemplateRule(metaType);
        IModelElementProxy ret=(getBacktrackingLevel()==0) ? createModelElementProxy(metaType, true, false, new String[]{"propertyCallExp"}) : null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1181:3: ( ( 'iterate' LPAREN (temp= ocl_expressions_variabledeclaration (temp= ocl_expressions_variabledeclaration )* ) ( ( ';' (temp= ocl_expressions_variabledeclaration ) ) | ( (temp= ocl_expressions_variabledeclaration_implicitAccumulator ) ) ) '|' (temp= ocl_expressions_oclexpression ) RPAREN ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1182:3: ( 'iterate' LPAREN (temp= ocl_expressions_variabledeclaration (temp= ocl_expressions_variabledeclaration )* ) ( ( ';' (temp= ocl_expressions_variabledeclaration ) ) | ( (temp= ocl_expressions_variabledeclaration_implicitAccumulator ) ) ) '|' (temp= ocl_expressions_oclexpression ) RPAREN )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1182:3: ( 'iterate' LPAREN (temp= ocl_expressions_variabledeclaration (temp= ocl_expressions_variabledeclaration )* ) ( ( ';' (temp= ocl_expressions_variabledeclaration ) ) | ( (temp= ocl_expressions_variabledeclaration_implicitAccumulator ) ) ) '|' (temp= ocl_expressions_oclexpression ) RPAREN )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1182:4: 'iterate' LPAREN (temp= ocl_expressions_variabledeclaration (temp= ocl_expressions_variabledeclaration )* ) ( ( ';' (temp= ocl_expressions_variabledeclaration ) ) | ( (temp= ocl_expressions_variabledeclaration_implicitAccumulator ) ) ) '|' (temp= ocl_expressions_oclexpression ) RPAREN
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC90AEA62334511DF978EEC660A0001C5");
            }
            match(input,41,FOLLOW_41_in_ocl_expressions_iterateexp5424); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC90AEA63334511DF807EEC660A0001C5");
            }
            match(input,LPAREN,FOLLOW_LPAREN_in_ocl_expressions_iterateexp5428); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC90AEA65334511DFA887EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1182:230: (temp= ocl_expressions_variabledeclaration (temp= ocl_expressions_variabledeclaration )* )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1182:232: temp= ocl_expressions_variabledeclaration (temp= ocl_expressions_variabledeclaration )*
            {
            pushFollow(FOLLOW_ocl_expressions_variabledeclaration_in_ocl_expressions_iterateexp5436);
            temp=ocl_expressions_variabledeclaration();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              setProperty(ret, "iterators", temp);
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1182:312: (temp= ocl_expressions_variabledeclaration )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==NAME) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1182:314: temp= ocl_expressions_variabledeclaration
            	    {
            	    pushFollow(FOLLOW_ocl_expressions_variabledeclaration_in_ocl_expressions_iterateexp5444);
            	    temp=ocl_expressions_variabledeclaration();

            	    checkFollows();
            	    state._fsp--;
            	    if (state.failed) return ret2;
            	    if ( state.backtracking==0 ) {
            	      setProperty(ret, "iterators", temp);
            	    }

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC90B3881334511DF9EC4EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1182:472: ( ( ';' (temp= ocl_expressions_variabledeclaration ) ) | ( (temp= ocl_expressions_variabledeclaration_implicitAccumulator ) ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==49) ) {
                alt53=1;
            }
            else if ( (LA53_0==60) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ret2;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1182:473: ( ';' (temp= ocl_expressions_variabledeclaration ) )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(0);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1182:489: ( ';' (temp= ocl_expressions_variabledeclaration ) )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1182:490: ';' (temp= ocl_expressions_variabledeclaration )
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC90B1170334511DFB0BBEC660A0001C5");
                    }
                    match(input,49,FOLLOW_49_in_ocl_expressions_iterateexp5458); if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC90B1172334511DF8A77EC660A0001C5");
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1182:627: (temp= ocl_expressions_variabledeclaration )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1182:629: temp= ocl_expressions_variabledeclaration
                    {
                    pushFollow(FOLLOW_ocl_expressions_variabledeclaration_in_ocl_expressions_iterateexp5465);
                    temp=ocl_expressions_variabledeclaration();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "result", temp);
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;
                case 2 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1183:4: ( (temp= ocl_expressions_variabledeclaration_implicitAccumulator ) )
                    {
                    if ( state.backtracking==0 ) {
                      _enterAlt(1);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1183:20: ( (temp= ocl_expressions_variabledeclaration_implicitAccumulator ) )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1183:21: (temp= ocl_expressions_variabledeclaration_implicitAccumulator )
                    {
                    if ( state.backtracking==0 ) {
                      _beforeSeqEl("E009322EC90B1176334511DFB0F6EC660A0001C5");
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1183:80: (temp= ocl_expressions_variabledeclaration_implicitAccumulator )
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1183:82: temp= ocl_expressions_variabledeclaration_implicitAccumulator
                    {
                    pushFollow(FOLLOW_ocl_expressions_variabledeclaration_implicitAccumulator_in_ocl_expressions_iterateexp5485);
                    temp=ocl_expressions_variabledeclaration_implicitAccumulator();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "result", temp);
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _afterSeqEl();
                    }

                    }

                    if ( state.backtracking==0 ) {
                      _exitAlt();
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC90B3882334511DF8A56EC660A0001C5");
            }
            match(input,60,FOLLOW_60_in_ocl_expressions_iterateexp5496); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC90B3884334511DF8F8DEC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1183:364: (temp= ocl_expressions_oclexpression )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1183:366: temp= ocl_expressions_oclexpression
            {
            pushFollow(FOLLOW_ocl_expressions_oclexpression_in_ocl_expressions_iterateexp5503);
            temp=ocl_expressions_oclexpression();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              setProperty(ret, "body", temp);
            }

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC90B3885334511DF9E46EC660A0001C5");
            }
            match(input,RPAREN,FOLLOW_RPAREN_in_ocl_expressions_iterateexp5510); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

              // discarding operator name instead of storing it here
              setProperty(ret,"source" , left);
              ret2 = createOrResolve(ret, firstToken);
              onRuleElementCreationCommited(ret2);
              leaveContext();


            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            onExitTemplateRule(metaType);
        }
        return ret2;
    }
    // $ANTLR end "ocl_expressions_iterateexp"


    // $ANTLR start "ocl_expressions_variabledeclaration_implicitAccumulator"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1194:1: ocl_expressions_variabledeclaration_implicitAccumulator returns [Object ret2] : () ;
    public final Object ocl_expressions_variabledeclaration_implicitAccumulator() throws RecognitionException {
        Object ret2 = null;

        List<String> metaType=list("OCL","Expressions","VariableDeclaration");
        onEnterTemplateRule(metaType,"implicitAccumulator");
        IModelElementProxy ret=(getBacktrackingLevel()==0) ? createModelElementProxy(metaType, false, false) : null;
        org.antlr.runtime.Token firstToken=input.LT(1);

        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1199:3: ( () )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1200:3: ()
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1200:3: ()
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1200:4: 
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC90BFBD0334511DF97DAEC660A0001C5");
            }
            if ( state.backtracking==0 ) {
              setProperty(ret, "name", "acc");_exitInjectorAction();setOclRef(ret, "type", null, null, "OCL:#context(propertyCallExp).oclAsType(IterateExp).\"body\".type", true);_exitInjectorAction();
            }
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

              ret2 = commitCreation(ret, firstToken, false);

               
            }

            }

        }
        catch (Exception e) {
            handleExceptionInTemplateRule(e, firstToken, ret);
        }
        finally {
            onExitTemplateRule(metaType);
        }
        return ret2;
    }
    // $ANTLR end "ocl_expressions_variabledeclaration_implicitAccumulator"


    // $ANTLR start "ocl_expressions_attributecallexp"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1208:1: ocl_expressions_attributecallexp[java.lang.String opName, Object left, org.antlr.runtime.Token firstToken] returns [Object ret2] : ( (temp= identifierOrKeyword ) ) ;
    public final Object ocl_expressions_attributecallexp(java.lang.String opName, Object left, org.antlr.runtime.Token firstToken) throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        List<String> metaType=list("OCL","Expressions","AttributeCallExp");
        onEnterTemplateRule(metaType);
        IModelElementProxy ret=(getBacktrackingLevel()==0) ? createModelElementProxy(metaType, true, false, new String[]{"propertyCallExp"}) : null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1213:3: ( ( (temp= identifierOrKeyword ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1214:3: ( (temp= identifierOrKeyword ) )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1214:3: ( (temp= identifierOrKeyword ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1214:4: (temp= identifierOrKeyword )
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC90C9811334511DFBE75EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1214:63: (temp= identifierOrKeyword )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1214:65: temp= identifierOrKeyword
            {
            pushFollow(FOLLOW_identifierOrKeyword_in_ocl_expressions_attributecallexp5588);
            temp=identifierOrKeyword();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              setOclRef(ret, "referredAttribute", null, temp, "OCL:self.source.type.allSupertypes()->append(self.source.type)."+"  												contents->select(a | a.oclIsKindOf(Attribute))->select(a|a.name=?)");
            }

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC90CBF21334511DFA977EC660A0001C5");
            }
            if ( state.backtracking==0 ) {
              setOclRef(ret, "name", null, null, "OCL:self.referredAttribute.name", true);_exitInjectorAction();setOclRef(ret, "type", null, null, "OCL:self.referredAttribute.type", true);_exitInjectorAction();
            }
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

              // discarding operator name instead of storing it here
              setProperty(ret,"source" , left);
              ret2 = createOrResolve(ret, firstToken);
              onRuleElementCreationCommited(ret2);
              leaveContext();


            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            onExitTemplateRule(metaType);
        }
        return ret2;
    }
    // $ANTLR end "ocl_expressions_attributecallexp"


    // $ANTLR start "ocl_expressions_operationcallexp"
    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1225:1: ocl_expressions_operationcallexp[java.lang.String opName, Object left, org.antlr.runtime.Token firstToken] returns [Object ret2] : ( ( ( identifier LPAREN )=> ( (temp= identifierOrKeyword ) LPAREN (temp= ocl_expressions_oclexpression (temp= ocl_expressions_oclexpression )* )? RPAREN ) ) ) ;
    public final Object ocl_expressions_operationcallexp(java.lang.String opName, Object left, org.antlr.runtime.Token firstToken) throws RecognitionException {
        Object ret2 = null;

        Object temp = null;


        List<String> metaType=list("OCL","Expressions","OperationCallExp");
        onEnterTemplateRule(metaType);
        IModelElementProxy ret=(getBacktrackingLevel()==0) ? createModelElementProxy(metaType, true, false, new String[]{"propertyCallExp"}) : null;


        try {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1230:3: ( ( ( ( identifier LPAREN )=> ( (temp= identifierOrKeyword ) LPAREN (temp= ocl_expressions_oclexpression (temp= ocl_expressions_oclexpression )* )? RPAREN ) ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1231:3: ( ( ( identifier LPAREN )=> ( (temp= identifierOrKeyword ) LPAREN (temp= ocl_expressions_oclexpression (temp= ocl_expressions_oclexpression )* )? RPAREN ) ) )
            {
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1231:3: ( ( ( identifier LPAREN )=> ( (temp= identifierOrKeyword ) LPAREN (temp= ocl_expressions_oclexpression (temp= ocl_expressions_oclexpression )* )? RPAREN ) ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1231:4: ( ( identifier LPAREN )=> ( (temp= identifierOrKeyword ) LPAREN (temp= ocl_expressions_oclexpression (temp= ocl_expressions_oclexpression )* )? RPAREN ) )
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC90DA981334511DF83E2EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1231:63: ( ( identifier LPAREN )=> ( (temp= identifierOrKeyword ) LPAREN (temp= ocl_expressions_oclexpression (temp= ocl_expressions_oclexpression )* )? RPAREN ) )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1231:64: ( identifier LPAREN )=> ( (temp= identifierOrKeyword ) LPAREN (temp= ocl_expressions_oclexpression (temp= ocl_expressions_oclexpression )* )? RPAREN )
            {
            if ( state.backtracking==0 ) {
              _enterAlt(0);
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1231:103: ( (temp= identifierOrKeyword ) LPAREN (temp= ocl_expressions_oclexpression (temp= ocl_expressions_oclexpression )* )? RPAREN )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1231:104: (temp= identifierOrKeyword ) LPAREN (temp= ocl_expressions_oclexpression (temp= ocl_expressions_oclexpression )* )? RPAREN
            {
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC90D5B63334511DF9A01EC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1231:163: (temp= identifierOrKeyword )
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1231:165: temp= identifierOrKeyword
            {
            pushFollow(FOLLOW_identifierOrKeyword_in_ocl_expressions_operationcallexp5644);
            temp=identifierOrKeyword();

            checkFollows();
            state._fsp--;
            if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              setOclRef(ret, "referredOperation", null, temp, "OCL:self.source.type.allSupertypes()->append(self.source.type)."+"  												contents->select(o | o.oclIsKindOf(Operation))->select(o|o.name=?)");
            }

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC90D5B64334511DFB4E6EC660A0001C5");
            }
            match(input,LPAREN,FOLLOW_LPAREN_in_ocl_expressions_operationcallexp5651); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC90D8270334511DFA5DDEC660A0001C5");
            }
            // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1231:549: (temp= ocl_expressions_oclexpression (temp= ocl_expressions_oclexpression )* )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=NAME && LA55_0<=QNAME)||(LA55_0>=INT && LA55_0<=BOOL)||LA55_0==LPAREN||(LA55_0>=32 && LA55_0<=33)||LA55_0==35||LA55_0==38||(LA55_0>=45 && LA55_0<=46)||(LA55_0>=52 && LA55_0<=53)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1231:551: temp= ocl_expressions_oclexpression (temp= ocl_expressions_oclexpression )*
                    {
                    pushFollow(FOLLOW_ocl_expressions_oclexpression_in_ocl_expressions_operationcallexp5659);
                    temp=ocl_expressions_oclexpression();

                    checkFollows();
                    state._fsp--;
                    if (state.failed) return ret2;
                    if ( state.backtracking==0 ) {
                      setProperty(ret, "arguments", temp);
                    }
                    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1231:625: (temp= ocl_expressions_oclexpression )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( ((LA54_0>=NAME && LA54_0<=QNAME)||(LA54_0>=INT && LA54_0<=BOOL)||LA54_0==LPAREN||(LA54_0>=32 && LA54_0<=33)||LA54_0==35||LA54_0==38||(LA54_0>=45 && LA54_0<=46)||(LA54_0>=52 && LA54_0<=53)) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1231:627: temp= ocl_expressions_oclexpression
                    	    {
                    	    pushFollow(FOLLOW_ocl_expressions_oclexpression_in_ocl_expressions_operationcallexp5667);
                    	    temp=ocl_expressions_oclexpression();

                    	    checkFollows();
                    	    state._fsp--;
                    	    if (state.failed) return ret2;
                    	    if ( state.backtracking==0 ) {
                    	      setProperty(ret, "arguments", temp);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);


                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC90D8271334511DFC529EC660A0001C5");
            }
            match(input,RPAREN,FOLLOW_RPAREN_in_ocl_expressions_operationcallexp5679); if (state.failed) return ret2;
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }
            if ( state.backtracking==0 ) {
              _beforeSeqEl("E009322EC90D8276334511DF9607EC660A0001C5");
            }
            if ( state.backtracking==0 ) {
              setOclRef(ret, "name", null, null, "OCL:self.referredOperation.name.concat('(...)')", true);_exitInjectorAction();setOclRef(ret, "type", null, null, "OCL:self.referredOperation.contents->select(p |"+"  	       			p.oclIsKindOf(Moin::Model::Parameter))->select(p |"+"  	       					p.oclAsType(Moin::Model::Parameter).direction = DirectionKind::return_dir)."+"  	       					oclAsType(Moin::Model::Parameter).type", true);_exitInjectorAction();
            }
            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {
              _exitAlt();
            }

            }

            if ( state.backtracking==0 ) {
              _afterSeqEl();
            }

            }

            if ( state.backtracking==0 ) {

              // discarding operator name instead of storing it here
              setProperty(ret,"source" , left);
              ret2 = createOrResolve(ret, firstToken);
              onRuleElementCreationCommited(ret2);
              leaveContext();


            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            onExitTemplateRule(metaType);
        }
        return ret2;
    }
    // $ANTLR end "ocl_expressions_operationcallexp"

    // $ANTLR start synpred1_MofClass
    public final void synpred1_MofClass_fragment() throws RecognitionException {   
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:404:4: ( model_structuralfeature )
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:404:5: model_structuralfeature
        {
        pushFollow(FOLLOW_model_structuralfeature_in_synpred1_MofClass1029);
        model_structuralfeature();

        checkFollows();
        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_MofClass

    // $ANTLR start synpred2_MofClass
    public final void synpred2_MofClass_fragment() throws RecognitionException {   
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:405:5: ( model_behavioralfeature )
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:405:6: model_behavioralfeature
        {
        pushFollow(FOLLOW_model_behavioralfeature_in_synpred2_MofClass1043);
        model_behavioralfeature();

        checkFollows();
        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_MofClass

    // $ANTLR start synpred3_MofClass
    public final void synpred3_MofClass_fragment() throws RecognitionException {   
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:569:64: ( integerSymbol DDOT STAR | integerSymbol DDOT integerSymbol )
        int alt56=2;
        int LA56_0 = input.LA(1);

        if ( (LA56_0==INT) ) {
            int LA56_1 = input.LA(2);

            if ( (LA56_1==DDOT) ) {
                int LA56_2 = input.LA(3);

                if ( (LA56_2==STAR) ) {
                    alt56=1;
                }
                else if ( (LA56_2==INT) ) {
                    alt56=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 1, input);

                throw nvae;
            }
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 56, 0, input);

            throw nvae;
        }
        switch (alt56) {
            case 1 :
                // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:569:65: integerSymbol DDOT STAR
                {
                pushFollow(FOLLOW_integerSymbol_in_synpred3_MofClass1901);
                integerSymbol();

                checkFollows();
                state._fsp--;
                if (state.failed) return ;
                match(input,DDOT,FOLLOW_DDOT_in_synpred3_MofClass1903); if (state.failed) return ;
                match(input,STAR,FOLLOW_STAR_in_synpred3_MofClass1905); if (state.failed) return ;

                }
                break;
            case 2 :
                // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:569:91: integerSymbol DDOT integerSymbol
                {
                pushFollow(FOLLOW_integerSymbol_in_synpred3_MofClass1909);
                integerSymbol();

                checkFollows();
                state._fsp--;
                if (state.failed) return ;
                match(input,DDOT,FOLLOW_DDOT_in_synpred3_MofClass1911); if (state.failed) return ;
                pushFollow(FOLLOW_integerSymbol_in_synpred3_MofClass1913);
                integerSymbol();

                checkFollows();
                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }}
    // $ANTLR end synpred3_MofClass

    // $ANTLR start synpred4_MofClass
    public final void synpred4_MofClass_fragment() throws RecognitionException {   
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:571:4: ( LBRACKET integerSymbol DDOT )
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:571:5: LBRACKET integerSymbol DDOT
        {
        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred4_MofClass1985); if (state.failed) return ;
        pushFollow(FOLLOW_integerSymbol_in_synpred4_MofClass1987);
        integerSymbol();

        checkFollows();
        state._fsp--;
        if (state.failed) return ;
        match(input,DDOT,FOLLOW_DDOT_in_synpred4_MofClass1989); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_MofClass

    // $ANTLR start synpred5_MofClass
    public final void synpred5_MofClass_fragment() throws RecognitionException {   
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:573:4: ( LCURL integerSymbol DDOT )
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:573:5: LCURL integerSymbol DDOT
        {
        match(input,LCURL,FOLLOW_LCURL_in_synpred5_MofClass2071); if (state.failed) return ;
        pushFollow(FOLLOW_integerSymbol_in_synpred5_MofClass2073);
        integerSymbol();

        checkFollows();
        state._fsp--;
        if (state.failed) return ;
        match(input,DDOT,FOLLOW_DDOT_in_synpred5_MofClass2075); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_MofClass

    // $ANTLR start synpred6_MofClass
    public final void synpred6_MofClass_fragment() throws RecognitionException {   
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:575:4: ( LBRACK_LCURL integerSymbol DDOT )
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:575:5: LBRACK_LCURL integerSymbol DDOT
        {
        match(input,LBRACK_LCURL,FOLLOW_LBRACK_LCURL_in_synpred6_MofClass2157); if (state.failed) return ;
        pushFollow(FOLLOW_integerSymbol_in_synpred6_MofClass2159);
        integerSymbol();

        checkFollows();
        state._fsp--;
        if (state.failed) return ;
        match(input,DDOT,FOLLOW_DDOT_in_synpred6_MofClass2161); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_MofClass

    // $ANTLR start synpred7_MofClass
    public final void synpred7_MofClass_fragment() throws RecognitionException {   
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:577:4: ( LCURL_LBRACK integerSymbol DDOT )
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:577:5: LCURL_LBRACK integerSymbol DDOT
        {
        match(input,LCURL_LBRACK,FOLLOW_LCURL_LBRACK_in_synpred7_MofClass2243); if (state.failed) return ;
        pushFollow(FOLLOW_integerSymbol_in_synpred7_MofClass2245);
        integerSymbol();

        checkFollows();
        state._fsp--;
        if (state.failed) return ;
        match(input,DDOT,FOLLOW_DDOT_in_synpred7_MofClass2247); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_MofClass

    // $ANTLR start synpred8_MofClass
    public final void synpred8_MofClass_fragment() throws RecognitionException {   
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:579:4: ( STAR | integerSymbol ~ DDOT )
        int alt57=2;
        int LA57_0 = input.LA(1);

        if ( (LA57_0==STAR) ) {
            alt57=1;
        }
        else if ( (LA57_0==INT) ) {
            alt57=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 57, 0, input);

            throw nvae;
        }
        switch (alt57) {
            case 1 :
                // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:579:5: STAR
                {
                match(input,STAR,FOLLOW_STAR_in_synpred8_MofClass2329); if (state.failed) return ;

                }
                break;
            case 2 :
                // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:579:12: integerSymbol ~ DDOT
                {
                pushFollow(FOLLOW_integerSymbol_in_synpred8_MofClass2333);
                integerSymbol();

                checkFollows();
                state._fsp--;
                if (state.failed) return ;
                if ( (input.LA(1)>=NAME && input.LA(1)<=RPAREN)||(input.LA(1)>=STAR && input.LA(1)<=61) ) {
                    input.consume();
                    state.errorRecovery=false;state.failed=false;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    MismatchedSetException mse = new MismatchedSetException(null,input);
                    throw mse;
                }


                }
                break;

        }}
    // $ANTLR end synpred8_MofClass

    // $ANTLR start synpred9_MofClass
    public final void synpred9_MofClass_fragment() throws RecognitionException {   
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:581:4: ( LBRACKET integerSymbol RBRACKET | LBRACKET STAR RBRACKET )
        int alt58=2;
        int LA58_0 = input.LA(1);

        if ( (LA58_0==LBRACKET) ) {
            int LA58_1 = input.LA(2);

            if ( (LA58_1==STAR) ) {
                alt58=2;
            }
            else if ( (LA58_1==INT) ) {
                alt58=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 1, input);

                throw nvae;
            }
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 58, 0, input);

            throw nvae;
        }
        switch (alt58) {
            case 1 :
                // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:581:5: LBRACKET integerSymbol RBRACKET
                {
                match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred9_MofClass2393); if (state.failed) return ;
                pushFollow(FOLLOW_integerSymbol_in_synpred9_MofClass2395);
                integerSymbol();

                checkFollows();
                state._fsp--;
                if (state.failed) return ;
                match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred9_MofClass2397); if (state.failed) return ;

                }
                break;
            case 2 :
                // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:581:39: LBRACKET STAR RBRACKET
                {
                match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred9_MofClass2401); if (state.failed) return ;
                match(input,STAR,FOLLOW_STAR_in_synpred9_MofClass2403); if (state.failed) return ;
                match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred9_MofClass2405); if (state.failed) return ;

                }
                break;

        }}
    // $ANTLR end synpred9_MofClass

    // $ANTLR start synpred10_MofClass
    public final void synpred10_MofClass_fragment() throws RecognitionException {   
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:583:4: ( LBRACKET RBRACKET )
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:583:5: LBRACKET RBRACKET
        {
        match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred10_MofClass2472); if (state.failed) return ;
        match(input,RBRACKET,FOLLOW_RBRACKET_in_synpred10_MofClass2474); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_MofClass

    // $ANTLR start synpred11_MofClass
    public final void synpred11_MofClass_fragment() throws RecognitionException {   
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:584:4: ( LCURL STAR RCURL | LCURL integerSymbol RCURL )
        int alt59=2;
        int LA59_0 = input.LA(1);

        if ( (LA59_0==LCURL) ) {
            int LA59_1 = input.LA(2);

            if ( (LA59_1==STAR) ) {
                alt59=1;
            }
            else if ( (LA59_1==INT) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 1, input);

                throw nvae;
            }
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 59, 0, input);

            throw nvae;
        }
        switch (alt59) {
            case 1 :
                // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:584:5: LCURL STAR RCURL
                {
                match(input,LCURL,FOLLOW_LCURL_in_synpred11_MofClass2503); if (state.failed) return ;
                match(input,STAR,FOLLOW_STAR_in_synpred11_MofClass2505); if (state.failed) return ;
                match(input,RCURL,FOLLOW_RCURL_in_synpred11_MofClass2507); if (state.failed) return ;

                }
                break;
            case 2 :
                // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:584:24: LCURL integerSymbol RCURL
                {
                match(input,LCURL,FOLLOW_LCURL_in_synpred11_MofClass2511); if (state.failed) return ;
                pushFollow(FOLLOW_integerSymbol_in_synpred11_MofClass2513);
                integerSymbol();

                checkFollows();
                state._fsp--;
                if (state.failed) return ;
                match(input,RCURL,FOLLOW_RCURL_in_synpred11_MofClass2515); if (state.failed) return ;

                }
                break;

        }}
    // $ANTLR end synpred11_MofClass

    // $ANTLR start synpred12_MofClass
    public final void synpred12_MofClass_fragment() throws RecognitionException {   
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:586:4: ( LCURL RCURL )
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:586:5: LCURL RCURL
        {
        match(input,LCURL,FOLLOW_LCURL_in_synpred12_MofClass2582); if (state.failed) return ;
        match(input,RCURL,FOLLOW_RCURL_in_synpred12_MofClass2584); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_MofClass

    // $ANTLR start synpred13_MofClass
    public final void synpred13_MofClass_fragment() throws RecognitionException {   
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:587:4: ( LBRACK_LCURL STAR RCURL_RBRACK | LBRACK_LCURL integerSymbol RCURL_RBRACK )
        int alt60=2;
        int LA60_0 = input.LA(1);

        if ( (LA60_0==LBRACK_LCURL) ) {
            int LA60_1 = input.LA(2);

            if ( (LA60_1==STAR) ) {
                alt60=1;
            }
            else if ( (LA60_1==INT) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 1, input);

                throw nvae;
            }
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 60, 0, input);

            throw nvae;
        }
        switch (alt60) {
            case 1 :
                // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:587:5: LBRACK_LCURL STAR RCURL_RBRACK
                {
                match(input,LBRACK_LCURL,FOLLOW_LBRACK_LCURL_in_synpred13_MofClass2613); if (state.failed) return ;
                match(input,STAR,FOLLOW_STAR_in_synpred13_MofClass2615); if (state.failed) return ;
                match(input,RCURL_RBRACK,FOLLOW_RCURL_RBRACK_in_synpred13_MofClass2617); if (state.failed) return ;

                }
                break;
            case 2 :
                // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:587:38: LBRACK_LCURL integerSymbol RCURL_RBRACK
                {
                match(input,LBRACK_LCURL,FOLLOW_LBRACK_LCURL_in_synpred13_MofClass2621); if (state.failed) return ;
                pushFollow(FOLLOW_integerSymbol_in_synpred13_MofClass2623);
                integerSymbol();

                checkFollows();
                state._fsp--;
                if (state.failed) return ;
                match(input,RCURL_RBRACK,FOLLOW_RCURL_RBRACK_in_synpred13_MofClass2625); if (state.failed) return ;

                }
                break;

        }}
    // $ANTLR end synpred13_MofClass

    // $ANTLR start synpred14_MofClass
    public final void synpred14_MofClass_fragment() throws RecognitionException {   
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:589:4: ( LCURL_LBRACK STAR RBRACK_RCURL | LCURL_LBRACK integerSymbol RBRACK_RCURL )
        int alt61=2;
        int LA61_0 = input.LA(1);

        if ( (LA61_0==LCURL_LBRACK) ) {
            int LA61_1 = input.LA(2);

            if ( (LA61_1==STAR) ) {
                alt61=1;
            }
            else if ( (LA61_1==INT) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 1, input);

                throw nvae;
            }
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 61, 0, input);

            throw nvae;
        }
        switch (alt61) {
            case 1 :
                // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:589:5: LCURL_LBRACK STAR RBRACK_RCURL
                {
                match(input,LCURL_LBRACK,FOLLOW_LCURL_LBRACK_in_synpred14_MofClass2692); if (state.failed) return ;
                match(input,STAR,FOLLOW_STAR_in_synpred14_MofClass2694); if (state.failed) return ;
                match(input,RBRACK_RCURL,FOLLOW_RBRACK_RCURL_in_synpred14_MofClass2696); if (state.failed) return ;

                }
                break;
            case 2 :
                // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:589:38: LCURL_LBRACK integerSymbol RBRACK_RCURL
                {
                match(input,LCURL_LBRACK,FOLLOW_LCURL_LBRACK_in_synpred14_MofClass2700); if (state.failed) return ;
                pushFollow(FOLLOW_integerSymbol_in_synpred14_MofClass2702);
                integerSymbol();

                checkFollows();
                state._fsp--;
                if (state.failed) return ;
                match(input,RBRACK_RCURL,FOLLOW_RBRACK_RCURL_in_synpred14_MofClass2704); if (state.failed) return ;

                }
                break;

        }}
    // $ANTLR end synpred14_MofClass

    // $ANTLR start synpred15_MofClass
    public final void synpred15_MofClass_fragment() throws RecognitionException {   
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:591:4: ( LCURL_LBRACK RBRACK_RCURL )
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:591:5: LCURL_LBRACK RBRACK_RCURL
        {
        match(input,LCURL_LBRACK,FOLLOW_LCURL_LBRACK_in_synpred15_MofClass2771); if (state.failed) return ;
        match(input,RBRACK_RCURL,FOLLOW_RBRACK_RCURL_in_synpred15_MofClass2773); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_MofClass

    // $ANTLR start synpred16_MofClass
    public final void synpred16_MofClass_fragment() throws RecognitionException {   
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:592:4: ( LBRACK_LCURL RCURL_RBRACK )
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:592:5: LBRACK_LCURL RCURL_RBRACK
        {
        match(input,LBRACK_LCURL,FOLLOW_LBRACK_LCURL_in_synpred16_MofClass2802); if (state.failed) return ;
        match(input,RCURL_RBRACK,FOLLOW_RCURL_RBRACK_in_synpred16_MofClass2804); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_MofClass

    // $ANTLR start synpred17_MofClass
    public final void synpred17_MofClass_fragment() throws RecognitionException {   
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:681:50: ( '.' )
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:681:51: '.'
        {
        match(input,57,FOLLOW_57_in_synpred17_MofClass3272); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_MofClass

    // $ANTLR start synpred18_MofClass
    public final void synpred18_MofClass_fragment() throws RecognitionException {   
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:681:139: ( identifier ~ LPAREN )
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:681:140: identifier ~ LPAREN
        {
        pushFollow(FOLLOW_identifier_in_synpred18_MofClass3283);
        identifier();

        checkFollows();
        state._fsp--;
        if (state.failed) return ;
        if ( (input.LA(1)>=NAME && input.LA(1)<=RCURL)||(input.LA(1)>=RPAREN && input.LA(1)<=61) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred18_MofClass

    // $ANTLR start synpred19_MofClass
    public final void synpred19_MofClass_fragment() throws RecognitionException {   
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:683:3: ( '->' )
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:683:4: '->'
        {
        match(input,47,FOLLOW_47_in_synpred19_MofClass3311); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_MofClass

    // $ANTLR start synpred20_MofClass
    public final void synpred20_MofClass_fragment() throws RecognitionException {   
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1037:4: ( ocl_expressions_collectionitem )
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1037:5: ocl_expressions_collectionitem
        {
        pushFollow(FOLLOW_ocl_expressions_collectionitem_in_synpred20_MofClass4630);
        ocl_expressions_collectionitem();

        checkFollows();
        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_MofClass

    // $ANTLR start synpred21_MofClass
    public final void synpred21_MofClass_fragment() throws RecognitionException {   
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1038:5: ( ocl_expressions_collectionrange )
        // C:\\_fzi\\projects\\CTS\\git\\DSLEngineering\\com.sap.tc.moin.tcs.mof.editor\\generated\\generated\\MofClass.g:1038:6: ocl_expressions_collectionrange
        {
        pushFollow(FOLLOW_ocl_expressions_collectionrange_in_synpred21_MofClass4644);
        ocl_expressions_collectionrange();

        checkFollows();
        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_MofClass

    // Delegated rules

    public final boolean synpred20_MofClass() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_MofClass_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_MofClass() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_MofClass_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_MofClass() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_MofClass_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_MofClass() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_MofClass_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_MofClass() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_MofClass_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_MofClass() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_MofClass_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_MofClass() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_MofClass_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_MofClass() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_MofClass_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_MofClass() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_MofClass_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_MofClass() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_MofClass_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_MofClass() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_MofClass_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_MofClass() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_MofClass_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_MofClass() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_MofClass_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_MofClass() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_MofClass_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_MofClass() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_MofClass_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_MofClass() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_MofClass_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_MofClass() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_MofClass_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_MofClass() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_MofClass_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_MofClass() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_MofClass_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_MofClass() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_MofClass_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_MofClass() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_MofClass_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA45 dfa45 = new DFA45(this);
    static final String DFA12_eotS =
        "\66\uffff";
    static final String DFA12_eofS =
        "\66\uffff";
    static final String DFA12_minS =
        "\10\4\2\uffff\1\4\4\10\1\4\1\15\1\10\1\4\1\22\1\17\1\4\2\14\1\4"+
        "\1\17\1\24\1\4\1\17\1\26\2\uffff\3\4\1\10\1\4\2\10\2\4\1\10\2\22"+
        "\2\14\2\24\2\26\4\4";
    static final String DFA12_maxS =
        "\2\62\1\6\2\25\3\44\2\uffff\1\17\1\22\1\20\1\24\1\26\1\4\1\61\1"+
        "\20\1\4\2\22\1\4\1\17\1\14\1\4\2\24\1\4\2\26\2\uffff\3\4\1\20\1"+
        "\4\2\20\2\4\1\20\2\22\2\14\2\24\2\26\4\4";
    static final String DFA12_acceptS =
        "\10\uffff\2\1\24\uffff\1\2\1\1\26\uffff";
    static final String DFA12_specialS =
        "\1\2\1\1\16\uffff\1\0\45\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\4\1\uffff\1\3\1\1\34\uffff\1\2\1\7\1\uffff\1\11\4\uffff"+
            "\1\5\3\uffff\1\6\1\uffff\1\10",
            "\1\4\1\uffff\1\3\35\uffff\1\2\1\7\1\uffff\1\11\4\uffff\1\5"+
            "\3\uffff\1\6\1\uffff\1\10",
            "\1\4\1\uffff\1\3",
            "\1\20\3\uffff\1\12\2\uffff\1\14\4\uffff\1\17\1\13\1\uffff"+
            "\1\15\1\uffff\1\16",
            "\1\20\3\uffff\1\12\2\uffff\1\14\4\uffff\1\17\1\13\1\uffff"+
            "\1\15\1\uffff\1\16",
            "\1\4\1\uffff\1\3\35\uffff\1\2",
            "\1\4\1\uffff\1\3\35\uffff\1\2",
            "\1\4\1\uffff\1\3\35\uffff\1\2",
            "",
            "",
            "\1\20\12\uffff\1\21",
            "\1\24\7\uffff\1\23\1\uffff\1\22",
            "\1\26\3\uffff\1\25\3\uffff\1\27",
            "\1\31\7\uffff\1\32\3\uffff\1\30",
            "\1\34\7\uffff\1\35\5\uffff\1\33",
            "\1\20",
            "\1\36\43\uffff\1\37",
            "\1\41\7\uffff\1\40",
            "\1\20",
            "\1\42",
            "\1\43\2\uffff\1\42",
            "\1\20",
            "\1\44\2\uffff\1\45",
            "\1\44",
            "\1\20",
            "\1\46\4\uffff\1\47",
            "\1\47",
            "\1\20",
            "\1\51\6\uffff\1\50",
            "\1\50",
            "",
            "",
            "\1\20",
            "\1\20",
            "\1\20",
            "\1\53\7\uffff\1\52",
            "\1\20",
            "\1\55\7\uffff\1\54",
            "\1\57\7\uffff\1\56",
            "\1\20",
            "\1\20",
            "\1\61\7\uffff\1\60",
            "\1\62",
            "\1\62",
            "\1\63",
            "\1\63",
            "\1\64",
            "\1\64",
            "\1\65",
            "\1\65",
            "\1\20",
            "\1\20",
            "\1\20",
            "\1\20"
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "404:3: ( ( model_structuralfeature )=> (ret= model_structuralfeature ) | ( model_behavioralfeature )=> (ret= model_behavioralfeature ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_16 = input.LA(1);

                         
                        int index12_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_16==LPAREN) && (synpred2_MofClass())) {s = 30;}

                        else if ( (LA12_16==49) && (synpred1_MofClass())) {s = 31;}

                         
                        input.seek(index12_16);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_1 = input.LA(1);

                         
                        int index12_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_1==36) ) {s = 2;}

                        else if ( (LA12_1==QNAME) ) {s = 3;}

                        else if ( (LA12_1==NAME) ) {s = 4;}

                        else if ( (LA12_1==44) ) {s = 5;}

                        else if ( (LA12_1==48) ) {s = 6;}

                        else if ( (LA12_1==37) ) {s = 7;}

                        else if ( (LA12_1==50) && (synpred1_MofClass())) {s = 8;}

                        else if ( (LA12_1==39) && (synpred1_MofClass())) {s = 9;}

                         
                        input.seek(index12_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                         
                        int index12_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA12_0==MULTI_LINE_COMMENT) ) {s = 1;}

                        else if ( (LA12_0==36) ) {s = 2;}

                        else if ( (LA12_0==QNAME) ) {s = 3;}

                        else if ( (LA12_0==NAME) ) {s = 4;}

                        else if ( (LA12_0==44) ) {s = 5;}

                        else if ( (LA12_0==48) ) {s = 6;}

                        else if ( (LA12_0==37) ) {s = 7;}

                        else if ( (LA12_0==50) && (synpred1_MofClass())) {s = 8;}

                        else if ( (LA12_0==39) && (synpred1_MofClass())) {s = 9;}

                         
                        input.seek(index12_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA32_eotS =
        "\36\uffff";
    static final String DFA32_eofS =
        "\36\uffff";
    static final String DFA32_minS =
        "\2\4\4\10\5\uffff\1\17\2\uffff\1\14\2\uffff\1\17\3\uffff\1\17\10"+
        "\uffff";
    static final String DFA32_maxS =
        "\1\25\1\17\1\22\1\20\1\24\1\26\5\uffff\1\22\2\uffff\1\17\2\uffff"+
        "\1\24\3\uffff\1\26\10\uffff";
    static final String DFA32_acceptS =
        "\6\uffff\1\6\1\17\1\1\1\6\1\7\1\uffff\1\10\1\11\1\uffff\1\12\1"+
        "\13\1\uffff\1\16\1\15\1\14\1\uffff\1\7\1\2\1\3\1\11\1\13\1\4\1\5"+
        "\1\14";
    static final String DFA32_specialS =
        "\1\0\1\4\1\10\1\3\1\2\1\1\5\uffff\1\6\2\uffff\1\11\2\uffff\1\5"+
        "\3\uffff\1\7\10\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\7\3\uffff\1\1\2\uffff\1\3\4\uffff\1\6\1\2\1\uffff\1\4\1"+
            "\uffff\1\5",
            "\1\11\12\uffff\1\10",
            "\1\13\7\uffff\1\12\1\uffff\1\14",
            "\1\16\3\uffff\1\17\3\uffff\1\15",
            "\1\21\7\uffff\1\20\3\uffff\1\22",
            "\1\25\7\uffff\1\24\5\uffff\1\23",
            "",
            "",
            "",
            "",
            "",
            "\1\27\2\uffff\1\26",
            "",
            "",
            "\1\31\2\uffff\1\30",
            "",
            "",
            "\1\33\4\uffff\1\32",
            "",
            "",
            "",
            "\1\34\6\uffff\1\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "569:63: ( ( integerSymbol DDOT STAR | integerSymbol DDOT integerSymbol )=> ( (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) ) | ( LBRACKET integerSymbol DDOT )=> ( LBRACKET (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACKET ) | ( LCURL integerSymbol DDOT )=> ( LCURL (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL ) | ( LBRACK_LCURL integerSymbol DDOT )=> ( LBRACK_LCURL (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL_RBRACK ) | ( LCURL_LBRACK integerSymbol DDOT )=> ( LCURL_LBRACK (temp= integerSymbol ) DDOT ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACK_RCURL ) | ( STAR | integerSymbol ~ DDOT )=> ( ( ( STAR ) | ( (temp= integerSymbol ) ) ) ) | ( LBRACKET integerSymbol RBRACKET | LBRACKET STAR RBRACKET )=> ( LBRACKET ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACKET ) | ( LBRACKET RBRACKET )=> ( LBRACKET RBRACKET ) | ( LCURL STAR RCURL | LCURL integerSymbol RCURL )=> ( LCURL ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL ) | ( LCURL RCURL )=> ( LCURL RCURL ) | ( LBRACK_LCURL STAR RCURL_RBRACK | LBRACK_LCURL integerSymbol RCURL_RBRACK )=> ( LBRACK_LCURL ( ( STAR ) | ( (temp= integerSymbol ) ) ) RCURL_RBRACK ) | ( LCURL_LBRACK STAR RBRACK_RCURL | LCURL_LBRACK integerSymbol RBRACK_RCURL )=> ( LCURL_LBRACK ( ( STAR ) | ( (temp= integerSymbol ) ) ) RBRACK_RCURL ) | ( LCURL_LBRACK RBRACK_RCURL )=> ( LCURL_LBRACK RBRACK_RCURL ) | ( LBRACK_LCURL RCURL_RBRACK )=> ( LBRACK_LCURL RCURL_RBRACK ) | () )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_0 = input.LA(1);

                         
                        int index32_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_0==INT) ) {s = 1;}

                        else if ( (LA32_0==LBRACKET) ) {s = 2;}

                        else if ( (LA32_0==LCURL) ) {s = 3;}

                        else if ( (LA32_0==LBRACK_LCURL) ) {s = 4;}

                        else if ( (LA32_0==LCURL_LBRACK) ) {s = 5;}

                        else if ( (LA32_0==STAR) && (synpred8_MofClass())) {s = 6;}

                        else if ( (LA32_0==NAME) ) {s = 7;}

                         
                        input.seek(index32_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_5 = input.LA(1);

                         
                        int index32_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_5==RBRACK_RCURL) && (synpred15_MofClass())) {s = 19;}

                        else if ( (LA32_5==STAR) && (synpred14_MofClass())) {s = 20;}

                        else if ( (LA32_5==INT) ) {s = 21;}

                         
                        input.seek(index32_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_4 = input.LA(1);

                         
                        int index32_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_4==STAR) && (synpred13_MofClass())) {s = 16;}

                        else if ( (LA32_4==INT) ) {s = 17;}

                        else if ( (LA32_4==RCURL_RBRACK) && (synpred16_MofClass())) {s = 18;}

                         
                        input.seek(index32_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA32_3 = input.LA(1);

                         
                        int index32_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_3==STAR) && (synpred11_MofClass())) {s = 13;}

                        else if ( (LA32_3==INT) ) {s = 14;}

                        else if ( (LA32_3==RCURL) && (synpred12_MofClass())) {s = 15;}

                         
                        input.seek(index32_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA32_1 = input.LA(1);

                         
                        int index32_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_1==DDOT) && (synpred3_MofClass())) {s = 8;}

                        else if ( (LA32_1==NAME) && (synpred8_MofClass())) {s = 9;}

                         
                        input.seek(index32_1);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA32_17 = input.LA(1);

                         
                        int index32_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_17==RCURL_RBRACK) && (synpred13_MofClass())) {s = 26;}

                        else if ( (LA32_17==DDOT) && (synpred6_MofClass())) {s = 27;}

                         
                        input.seek(index32_17);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA32_11 = input.LA(1);

                         
                        int index32_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_11==RBRACKET) && (synpred9_MofClass())) {s = 22;}

                        else if ( (LA32_11==DDOT) && (synpred4_MofClass())) {s = 23;}

                         
                        input.seek(index32_11);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA32_21 = input.LA(1);

                         
                        int index32_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_21==DDOT) && (synpred7_MofClass())) {s = 28;}

                        else if ( (LA32_21==RBRACK_RCURL) && (synpred14_MofClass())) {s = 29;}

                         
                        input.seek(index32_21);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA32_2 = input.LA(1);

                         
                        int index32_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_2==STAR) && (synpred9_MofClass())) {s = 10;}

                        else if ( (LA32_2==INT) ) {s = 11;}

                        else if ( (LA32_2==RBRACKET) && (synpred10_MofClass())) {s = 12;}

                         
                        input.seek(index32_2);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA32_14 = input.LA(1);

                         
                        int index32_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_14==DDOT) && (synpred5_MofClass())) {s = 24;}

                        else if ( (LA32_14==RCURL) && (synpred11_MofClass())) {s = 25;}

                         
                        input.seek(index32_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA37_eotS =
        "\42\uffff";
    static final String DFA37_eofS =
        "\42\uffff";
    static final String DFA37_minS =
        "\1\4\37\0\2\uffff";
    static final String DFA37_maxS =
        "\1\75\37\0\2\uffff";
    static final String DFA37_acceptS =
        "\40\uffff\1\1\1\2";
    static final String DFA37_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\35\1\36\2\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\1\33\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
            "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1"+
            "\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "681:138: ( ( identifier ~ LPAREN )=> (ret= ocl_expressions_attributecallexp[opName, ret, firstToken] ) | (ret= ocl_expressions_operationcallexp[opName, ret, firstToken] ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_1 = input.LA(1);

                         
                        int index37_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_MofClass()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index37_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA37_2 = input.LA(1);

                         
                        int index37_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_MofClass()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index37_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA37_3 = input.LA(1);

                         
                        int index37_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_MofClass()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index37_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA37_4 = input.LA(1);

                         
                        int index37_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_MofClass()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index37_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA37_5 = input.LA(1);

                         
                        int index37_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_MofClass()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index37_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA37_6 = input.LA(1);

                         
                        int index37_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_MofClass()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index37_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA37_7 = input.LA(1);

                         
                        int index37_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_MofClass()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index37_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA37_8 = input.LA(1);

                         
                        int index37_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_MofClass()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index37_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA37_9 = input.LA(1);

                         
                        int index37_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_MofClass()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index37_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA37_10 = input.LA(1);

                         
                        int index37_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_MofClass()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index37_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA37_11 = input.LA(1);

                         
                        int index37_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_MofClass()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index37_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA37_12 = input.LA(1);

                         
                        int index37_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_MofClass()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index37_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA37_13 = input.LA(1);

                         
                        int index37_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_MofClass()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index37_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA37_14 = input.LA(1);

                         
                        int index37_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_MofClass()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index37_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA37_15 = input.LA(1);

                         
                        int index37_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_MofClass()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index37_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA37_16 = input.LA(1);

                         
                        int index37_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_MofClass()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index37_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA37_17 = input.LA(1);

                         
                        int index37_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_MofClass()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index37_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA37_18 = input.LA(1);

                         
                        int index37_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_MofClass()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index37_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA37_19 = input.LA(1);

                         
                        int index37_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_MofClass()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index37_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA37_20 = input.LA(1);

                         
                        int index37_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_MofClass()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index37_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA37_21 = input.LA(1);

                         
                        int index37_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_MofClass()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index37_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA37_22 = input.LA(1);

                         
                        int index37_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_MofClass()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index37_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA37_23 = input.LA(1);

                         
                        int index37_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_MofClass()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index37_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA37_24 = input.LA(1);

                         
                        int index37_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_MofClass()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index37_24);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA37_25 = input.LA(1);

                         
                        int index37_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_MofClass()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index37_25);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA37_26 = input.LA(1);

                         
                        int index37_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_MofClass()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index37_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA37_27 = input.LA(1);

                         
                        int index37_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_MofClass()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index37_27);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA37_28 = input.LA(1);

                         
                        int index37_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_MofClass()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index37_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA37_29 = input.LA(1);

                         
                        int index37_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_MofClass()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index37_29);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA37_30 = input.LA(1);

                         
                        int index37_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_MofClass()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index37_30);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA37_31 = input.LA(1);

                         
                        int index37_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_MofClass()) ) {s = 32;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index37_31);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA45_eotS =
        "\22\uffff";
    static final String DFA45_eofS =
        "\22\uffff";
    static final String DFA45_minS =
        "\1\4\17\0\2\uffff";
    static final String DFA45_maxS =
        "\1\65\17\0\2\uffff";
    static final String DFA45_acceptS =
        "\20\uffff\1\1\1\2";
    static final String DFA45_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\2\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\16\1\5\1\7\1\uffff\1\3\1\4\1\6\2\uffff\1\17\22\uffff\1\1"+
            "\1\14\1\uffff\1\10\2\uffff\1\12\6\uffff\1\13\1\11\5\uffff\1"+
            "\2\1\15",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "1037:3: ( ( ocl_expressions_collectionitem )=> (ret= ocl_expressions_collectionitem ) | ( ocl_expressions_collectionrange )=> (ret= ocl_expressions_collectionrange ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA45_1 = input.LA(1);

                         
                        int index45_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_MofClass()) ) {s = 16;}

                        else if ( (synpred21_MofClass()) ) {s = 17;}

                         
                        input.seek(index45_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA45_2 = input.LA(1);

                         
                        int index45_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_MofClass()) ) {s = 16;}

                        else if ( (synpred21_MofClass()) ) {s = 17;}

                         
                        input.seek(index45_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA45_3 = input.LA(1);

                         
                        int index45_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_MofClass()) ) {s = 16;}

                        else if ( (synpred21_MofClass()) ) {s = 17;}

                         
                        input.seek(index45_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA45_4 = input.LA(1);

                         
                        int index45_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_MofClass()) ) {s = 16;}

                        else if ( (synpred21_MofClass()) ) {s = 17;}

                         
                        input.seek(index45_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA45_5 = input.LA(1);

                         
                        int index45_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_MofClass()) ) {s = 16;}

                        else if ( (synpred21_MofClass()) ) {s = 17;}

                         
                        input.seek(index45_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA45_6 = input.LA(1);

                         
                        int index45_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_MofClass()) ) {s = 16;}

                        else if ( (synpred21_MofClass()) ) {s = 17;}

                         
                        input.seek(index45_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA45_7 = input.LA(1);

                         
                        int index45_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_MofClass()) ) {s = 16;}

                        else if ( (synpred21_MofClass()) ) {s = 17;}

                         
                        input.seek(index45_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA45_8 = input.LA(1);

                         
                        int index45_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_MofClass()) ) {s = 16;}

                        else if ( (synpred21_MofClass()) ) {s = 17;}

                         
                        input.seek(index45_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA45_9 = input.LA(1);

                         
                        int index45_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_MofClass()) ) {s = 16;}

                        else if ( (synpred21_MofClass()) ) {s = 17;}

                         
                        input.seek(index45_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA45_10 = input.LA(1);

                         
                        int index45_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_MofClass()) ) {s = 16;}

                        else if ( (synpred21_MofClass()) ) {s = 17;}

                         
                        input.seek(index45_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA45_11 = input.LA(1);

                         
                        int index45_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_MofClass()) ) {s = 16;}

                        else if ( (synpred21_MofClass()) ) {s = 17;}

                         
                        input.seek(index45_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA45_12 = input.LA(1);

                         
                        int index45_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_MofClass()) ) {s = 16;}

                        else if ( (synpred21_MofClass()) ) {s = 17;}

                         
                        input.seek(index45_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA45_13 = input.LA(1);

                         
                        int index45_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_MofClass()) ) {s = 16;}

                        else if ( (synpred21_MofClass()) ) {s = 17;}

                         
                        input.seek(index45_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA45_14 = input.LA(1);

                         
                        int index45_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_MofClass()) ) {s = 16;}

                        else if ( (synpred21_MofClass()) ) {s = 17;}

                         
                        input.seek(index45_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA45_15 = input.LA(1);

                         
                        int index45_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_MofClass()) ) {s = 16;}

                        else if ( (synpred21_MofClass()) ) {s = 17;}

                         
                        input.seek(index45_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 45, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_NAME_in_identifier63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_identifierOrKeyword94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_identifierOrKeyword102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_identifierOrKeyword110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_identifierOrKeyword118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_identifierOrKeyword126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_identifierOrKeyword134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_identifierOrKeyword142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_identifierOrKeyword150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_identifierOrKeyword158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_identifierOrKeyword166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_identifierOrKeyword174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_identifierOrKeyword182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_identifierOrKeyword190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_identifierOrKeyword198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_identifierOrKeyword206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_identifierOrKeyword214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_identifierOrKeyword222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_identifierOrKeyword230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_identifierOrKeyword238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_identifierOrKeyword246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_identifierOrKeyword254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_identifierOrKeyword262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_identifierOrKeyword270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_identifierOrKeyword278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_identifierOrKeyword286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_identifierOrKeyword294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_identifierOrKeyword302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_identifierOrKeyword310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_identifierOrKeyword318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_identifierOrKeyword326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_identifierOrKeyword334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_stringSymbol365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QNAME_in_qualifiedNameSymbol396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MULTI_LINE_COMMENT_in_annotationSymbol427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_integerSymbol458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_longSymbol489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_integerAsString520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_floatAsString551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_booleanSymbol582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOL_in_booleanValueSymbol613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_floatSymbol644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_model_class_in_main672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_main675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_model_class706 = new BitSet(new long[]{0x0901102000000000L});
    public static final BitSet FOLLOW_visibility_in_model_class710 = new BitSet(new long[]{0x0900000000000000L});
    public static final BitSet FOLLOW_56_in_model_class720 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_model_class738 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_model_class745 = new BitSet(new long[]{0x0000080000000800L});
    public static final BitSet FOLLOW_43_in_model_class757 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_qualifiedNameSymbol_in_model_class769 = new BitSet(new long[]{0x0000010000000800L});
    public static final BitSet FOLLOW_40_in_model_class777 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_qualifiedNameSymbol_in_model_class784 = new BitSet(new long[]{0x0000010000000800L});
    public static final BitSet FOLLOW_identifier_in_model_class807 = new BitSet(new long[]{0x0000010000000800L});
    public static final BitSet FOLLOW_40_in_model_class815 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_model_class822 = new BitSet(new long[]{0x0000010000000800L});
    public static final BitSet FOLLOW_LCURL_in_model_class852 = new BitSet(new long[]{0x000D10B0000010D0L});
    public static final BitSet FOLLOW_model_modelelement_in_model_class863 = new BitSet(new long[]{0x000D10B0000010D0L});
    public static final BitSet FOLLOW_model_modelelement_in_model_class871 = new BitSet(new long[]{0x000D10B0000010D0L});
    public static final BitSet FOLLOW_51_in_model_class888 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LCURL_in_model_class892 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_model_modelelement_invariants_in_model_class900 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_model_modelelement_invariants_in_model_class908 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_RCURL_in_model_class920 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RCURL_in_model_class941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_model_feature_in_model_modelelement1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_model_structuralfeature_in_model_feature1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_model_behavioralfeature_in_model_feature1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_model_attribute_in_model_structuralfeature1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_model_reference_in_model_structuralfeature1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_scopeandvisibility1127 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_48_in_scopeandvisibility1143 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_37_in_scopeandvisibility1159 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_scopeandvisibility1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_model_attribute1221 = new BitSet(new long[]{0x0005103000000050L});
    public static final BitSet FOLLOW_50_in_model_attribute1241 = new BitSet(new long[]{0x0001103000000050L});
    public static final BitSet FOLLOW_scopeandvisibility_in_model_attribute1251 = new BitSet(new long[]{0x0001103000000050L});
    public static final BitSet FOLLOW_typereference_in_model_attribute1255 = new BitSet(new long[]{0x00000000002B0910L});
    public static final BitSet FOLLOW_model_multiplicitytype_in_model_attribute1263 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_model_attribute1273 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_model_attribute1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_model_reference1321 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_model_reference1325 = new BitSet(new long[]{0x0005103000000050L});
    public static final BitSet FOLLOW_50_in_model_reference1344 = new BitSet(new long[]{0x0001103000000050L});
    public static final BitSet FOLLOW_scopeandvisibility_in_model_reference1354 = new BitSet(new long[]{0x0001103000000050L});
    public static final BitSet FOLLOW_typereference_in_model_reference1358 = new BitSet(new long[]{0x00000000002B0910L});
    public static final BitSet FOLLOW_model_multiplicitytype_in_model_reference1366 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_model_reference1376 = new BitSet(new long[]{0x0002000400000000L});
    public static final BitSet FOLLOW_34_in_model_reference1387 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_model_reference1394 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_model_reference1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiedNameSymbol_in_typereference1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_typereference1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_model_operation_in_model_behavioralfeature1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_model_operation1548 = new BitSet(new long[]{0x000510B0000000D0L});
    public static final BitSet FOLLOW_scopeandvisibility_in_model_operation1552 = new BitSet(new long[]{0x000510B0000000D0L});
    public static final BitSet FOLLOW_model_modelelement_returnType_in_model_operation1560 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_model_operation1570 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LPAREN_in_model_operation1577 = new BitSet(new long[]{0x00011030000040D0L});
    public static final BitSet FOLLOW_model_modelelement_parameter_in_model_operation1585 = new BitSet(new long[]{0x00011030000040D0L});
    public static final BitSet FOLLOW_model_modelelement_parameter_in_model_operation1593 = new BitSet(new long[]{0x00011030000040D0L});
    public static final BitSet FOLLOW_RPAREN_in_model_operation1605 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LCURL_in_model_operation1610 = new BitSet(new long[]{0x0030604B00002770L});
    public static final BitSet FOLLOW_ocl_expressions_oclexpression_in_model_operation1618 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RCURL_in_model_operation1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_model_typedelement_returnType_in_model_modelelement_returnType1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_model_parameter_returnType_in_model_typedelement_returnType1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typereference_in_model_parameter_returnType1723 = new BitSet(new long[]{0x00000000002B0900L});
    public static final BitSet FOLLOW_model_multiplicitytype_in_model_parameter_returnType1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_model_typedelement_parameter_in_model_modelelement_parameter1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_model_parameter_parameter_in_model_typedelement_parameter1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_model_parameter_parameter1831 = new BitSet(new long[]{0x0001103000000050L});
    public static final BitSet FOLLOW_typereference_in_model_parameter_parameter1835 = new BitSet(new long[]{0x00000000002B0910L});
    public static final BitSet FOLLOW_model_multiplicitytype_in_model_parameter_parameter1843 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_model_parameter_parameter1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerSymbol_in_model_multiplicitytype1926 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DDOT_in_model_multiplicitytype1933 = new BitSet(new long[]{0x0000000000010100L});
    public static final BitSet FOLLOW_STAR_in_model_multiplicitytype1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerSymbol_in_model_multiplicitytype1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_model_multiplicitytype1999 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_integerSymbol_in_model_multiplicitytype2007 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DDOT_in_model_multiplicitytype2014 = new BitSet(new long[]{0x0000000000010100L});
    public static final BitSet FOLLOW_STAR_in_model_multiplicitytype2025 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_integerSymbol_in_model_multiplicitytype2043 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RBRACKET_in_model_multiplicitytype2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURL_in_model_multiplicitytype2085 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_integerSymbol_in_model_multiplicitytype2093 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DDOT_in_model_multiplicitytype2100 = new BitSet(new long[]{0x0000000000010100L});
    public static final BitSet FOLLOW_STAR_in_model_multiplicitytype2111 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_integerSymbol_in_model_multiplicitytype2129 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RCURL_in_model_multiplicitytype2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_LCURL_in_model_multiplicitytype2171 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_integerSymbol_in_model_multiplicitytype2179 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DDOT_in_model_multiplicitytype2186 = new BitSet(new long[]{0x0000000000010100L});
    public static final BitSet FOLLOW_STAR_in_model_multiplicitytype2197 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_integerSymbol_in_model_multiplicitytype2215 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RCURL_RBRACK_in_model_multiplicitytype2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURL_LBRACK_in_model_multiplicitytype2257 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_integerSymbol_in_model_multiplicitytype2265 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DDOT_in_model_multiplicitytype2272 = new BitSet(new long[]{0x0000000000010100L});
    public static final BitSet FOLLOW_STAR_in_model_multiplicitytype2283 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_integerSymbol_in_model_multiplicitytype2301 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RBRACK_RCURL_in_model_multiplicitytype2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_model_multiplicitytype2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerSymbol_in_model_multiplicitytype2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_model_multiplicitytype2415 = new BitSet(new long[]{0x0000000000010100L});
    public static final BitSet FOLLOW_STAR_in_model_multiplicitytype2426 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_integerSymbol_in_model_multiplicitytype2444 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RBRACKET_in_model_multiplicitytype2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_model_multiplicitytype2484 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RBRACKET_in_model_multiplicitytype2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURL_in_model_multiplicitytype2525 = new BitSet(new long[]{0x0000000000010100L});
    public static final BitSet FOLLOW_STAR_in_model_multiplicitytype2536 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_integerSymbol_in_model_multiplicitytype2554 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RCURL_in_model_multiplicitytype2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURL_in_model_multiplicitytype2594 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RCURL_in_model_multiplicitytype2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_LCURL_in_model_multiplicitytype2635 = new BitSet(new long[]{0x0000000000010100L});
    public static final BitSet FOLLOW_STAR_in_model_multiplicitytype2646 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_integerSymbol_in_model_multiplicitytype2664 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RCURL_RBRACK_in_model_multiplicitytype2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURL_LBRACK_in_model_multiplicitytype2714 = new BitSet(new long[]{0x0000000000010100L});
    public static final BitSet FOLLOW_STAR_in_model_multiplicitytype2725 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_integerSymbol_in_model_multiplicitytype2743 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RBRACK_RCURL_in_model_multiplicitytype2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURL_LBRACK_in_model_multiplicitytype2783 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RBRACK_RCURL_in_model_multiplicitytype2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_LCURL_in_model_multiplicitytype2814 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RCURL_RBRACK_in_model_multiplicitytype2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_model_visibilitykind2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_model_visibilitykind2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_model_visibilitykind2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotationSymbol_in_annotation2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_visibility2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_visibility3013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_visibility3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_model_constraint_invariants_in_model_modelelement_invariants3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ocl_attaching_oclconstraint_invariants_in_model_constraint_invariants3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_ocl_attaching_oclconstraint_invariants3125 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_COLON_in_ocl_attaching_oclconstraint_invariants3132 = new BitSet(new long[]{0x0030604B00002770L});
    public static final BitSet FOLLOW_ocl_expressions_oclexpression_in_ocl_attaching_oclconstraint_invariants3140 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ocl_attaching_oclconstraint_invariants3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ocl_expressions_letexp_in_primary_ocl_expressions_oclexpression3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ocl_expressions_ifexp_in_primary_ocl_expressions_oclexpression3196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ocl_expressions_literalexp_in_primary_ocl_expressions_oclexpression3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ocl_expressions_variableexp_in_primary_ocl_expressions_oclexpression3212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primary_ocl_expressions_oclexpression3221 = new BitSet(new long[]{0x0030604B00002770L});
    public static final BitSet FOLLOW_ocl_expressions_oclexpression_in_primary_ocl_expressions_oclexpression3227 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RPAREN_in_primary_ocl_expressions_oclexpression3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_ocl_expressions_oclexpression_in_oclexpressions_priority_03269 = new BitSet(new long[]{0x0200800000000002L});
    public static final BitSet FOLLOW_57_in_oclexpressions_priority_03278 = new BitSet(new long[]{0x3FFFFFFF00000010L});
    public static final BitSet FOLLOW_ocl_expressions_attributecallexp_in_oclexpressions_priority_03292 = new BitSet(new long[]{0x0200800000000002L});
    public static final BitSet FOLLOW_ocl_expressions_operationcallexp_in_oclexpressions_priority_03301 = new BitSet(new long[]{0x0200800000000002L});
    public static final BitSet FOLLOW_47_in_oclexpressions_priority_03317 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ocl_expressions_iterateexp_in_oclexpressions_priority_03324 = new BitSet(new long[]{0x0200800000000002L});
    public static final BitSet FOLLOW_oclexpressions_priority_0_in_oclexpressions_priority_13365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oclexpressions_priority_1_in_ocl_expressions_oclexpression3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ocl_expressions_primitiveliteralexp_in_ocl_expressions_literalexp3416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ocl_expressions_enumliteralexp_in_ocl_expressions_literalexp3424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ocl_expressions_collectionliteralexp_in_ocl_expressions_literalexp3432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ocl_expressions_numericliteralexp_in_ocl_expressions_primitiveliteralexp3459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ocl_expressions_stringliteralexp_in_ocl_expressions_primitiveliteralexp3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ocl_expressions_booleanliteralexp_in_ocl_expressions_primitiveliteralexp3475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ocl_expressions_integerliteralexp_in_ocl_expressions_numericliteralexp3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ocl_expressions_realliteralexp_in_ocl_expressions_numericliteralexp3510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerAsString_in_ocl_expressions_integerliteralexp3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringSymbol_in_ocl_expressions_stringliteralexp3594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_floatAsString_in_ocl_expressions_realliteralexp3644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanValueSymbol_in_ocl_expressions_booleanliteralexp3694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualifiedNameSymbol_in_ocl_expressions_enumliteralexp3744 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_DCOLON_in_ocl_expressions_enumliteralexp3751 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_ocl_expressions_enumliteralexp3759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ocl_expressions_collectionliteralexp3807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_model_classifier_sequence_in_ocl_expressions_collectionliteralexp3814 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_46_in_ocl_expressions_collectionliteralexp3833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_model_classifier_set_in_ocl_expressions_collectionliteralexp3840 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_38_in_ocl_expressions_collectionliteralexp3859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_model_classifier_collection_in_ocl_expressions_collectionliteralexp3866 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_45_in_ocl_expressions_collectionliteralexp3885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_model_classifier_bag_in_ocl_expressions_collectionliteralexp3892 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_33_in_ocl_expressions_collectionliteralexp3911 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_model_classifier_orderedset_in_ocl_expressions_collectionliteralexp3918 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_LCURL_in_ocl_expressions_collectionliteralexp3933 = new BitSet(new long[]{0x0030604B00003770L});
    public static final BitSet FOLLOW_ocl_expressions_collectionliteralpart_in_ocl_expressions_collectionliteralexp3941 = new BitSet(new long[]{0x0000010000001000L});
    public static final BitSet FOLLOW_40_in_ocl_expressions_collectionliteralexp3949 = new BitSet(new long[]{0x0030604B00002770L});
    public static final BitSet FOLLOW_ocl_expressions_collectionliteralpart_in_ocl_expressions_collectionliteralexp3956 = new BitSet(new long[]{0x0000010000001000L});
    public static final BitSet FOLLOW_RCURL_in_ocl_expressions_collectionliteralexp3968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_model_datatype_sequence_in_model_classifier_sequence4009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ocl_types_collectiontype_sequence_in_model_datatype_sequence4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ocl_types_sequencetype_sequence_in_ocl_types_collectiontype_sequence4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectiontypeelementtype_in_ocl_types_sequencetype_sequence4093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_model_datatype_set_in_model_classifier_set4134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ocl_types_collectiontype_set_in_model_datatype_set4161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ocl_types_settype_set_in_ocl_types_collectiontype_set4188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectiontypeelementtype_in_ocl_types_settype_set4218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_model_datatype_collection_in_model_classifier_collection4259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ocl_types_collectiontype_collection_in_model_datatype_collection4286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectiontypeelementtype_in_ocl_types_collectiontype_collection4316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_model_datatype_bag_in_model_classifier_bag4357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ocl_types_collectiontype_bag_in_model_datatype_bag4384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ocl_types_bagtype_bag_in_ocl_types_collectiontype_bag4411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectiontypeelementtype_in_ocl_types_bagtype_bag4441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_model_datatype_orderedset_in_model_classifier_orderedset4482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ocl_types_collectiontype_orderedset_in_model_datatype_orderedset4509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ocl_types_orderedsettype_orderedset_in_ocl_types_collectiontype_orderedset4536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collectiontypeelementtype_in_ocl_types_orderedsettype_orderedset4566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ocl_expressions_collectionitem_in_ocl_expressions_collectionliteralpart4636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ocl_expressions_collectionrange_in_ocl_expressions_collectionliteralpart4650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ocl_expressions_oclexpression_in_ocl_expressions_collectionitem4685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ocl_expressions_oclexpression_in_ocl_expressions_collectionrange4735 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DDOT_in_ocl_expressions_collectionrange4742 = new BitSet(new long[]{0x0030604B00002770L});
    public static final BitSet FOLLOW_ocl_expressions_oclexpression_in_ocl_expressions_collectionrange4750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ocl_expressions_collectionkind4796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ocl_expressions_collectionkind4804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ocl_expressions_collectionkind4812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ocl_expressions_collectionkind4820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ocl_expressions_collectionkind4828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ocl_expressions_ifexp4858 = new BitSet(new long[]{0x0030604B00002770L});
    public static final BitSet FOLLOW_ocl_expressions_oclexpression_in_ocl_expressions_ifexp4865 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ocl_expressions_ifexp4871 = new BitSet(new long[]{0x0030604B00002770L});
    public static final BitSet FOLLOW_ocl_expressions_oclexpression_in_ocl_expressions_ifexp4881 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ocl_expressions_ifexp4890 = new BitSet(new long[]{0x0030604B00002770L});
    public static final BitSet FOLLOW_ocl_expressions_oclexpression_in_ocl_expressions_ifexp4900 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_ocl_expressions_ifexp4909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ocl_expressions_letexp4952 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ocl_expressions_variabledeclaration_let_in_ocl_expressions_letexp4959 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ocl_expressions_letexp4965 = new BitSet(new long[]{0x0030604B00002770L});
    public static final BitSet FOLLOW_ocl_expressions_oclexpression_in_ocl_expressions_letexp4975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_ocl_expressions_variabledeclaration_let5028 = new BitSet(new long[]{0x0000040000800000L});
    public static final BitSet FOLLOW_COLON_in_ocl_expressions_variabledeclaration_let5053 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_qualifiedNameSymbol_in_ocl_expressions_variabledeclaration_let5061 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_COLON_in_ocl_expressions_variabledeclaration_let5078 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_in_ocl_expressions_variabledeclaration_let5086 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ocl_expressions_variabledeclaration_let5097 = new BitSet(new long[]{0x0030604B00002770L});
    public static final BitSet FOLLOW_ocl_expressions_oclexpression_in_ocl_expressions_variabledeclaration_let5104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_ocl_expressions_variabledeclaration5154 = new BitSet(new long[]{0x0000040000800002L});
    public static final BitSet FOLLOW_COLON_in_ocl_expressions_variabledeclaration5182 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_qualifiedNameSymbol_in_ocl_expressions_variabledeclaration5195 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_identifier_in_ocl_expressions_variabledeclaration5215 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ocl_expressions_variabledeclaration5237 = new BitSet(new long[]{0x0030604B00002770L});
    public static final BitSet FOLLOW_ocl_expressions_oclexpression_in_ocl_expressions_variabledeclaration5244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ocl_expressions_variabledeclaration_self_in_ocl_expressions_variableexp5309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_ocl_expressions_variableexp5329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ocl_expressions_variabledeclaration_self5380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ocl_expressions_iterateexp5424 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LPAREN_in_ocl_expressions_iterateexp5428 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ocl_expressions_variabledeclaration_in_ocl_expressions_iterateexp5436 = new BitSet(new long[]{0x1002000000000010L});
    public static final BitSet FOLLOW_ocl_expressions_variabledeclaration_in_ocl_expressions_iterateexp5444 = new BitSet(new long[]{0x1002000000000010L});
    public static final BitSet FOLLOW_49_in_ocl_expressions_iterateexp5458 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ocl_expressions_variabledeclaration_in_ocl_expressions_iterateexp5465 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ocl_expressions_variabledeclaration_implicitAccumulator_in_ocl_expressions_iterateexp5485 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_ocl_expressions_iterateexp5496 = new BitSet(new long[]{0x0030604B00002770L});
    public static final BitSet FOLLOW_ocl_expressions_oclexpression_in_ocl_expressions_iterateexp5503 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RPAREN_in_ocl_expressions_iterateexp5510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierOrKeyword_in_ocl_expressions_attributecallexp5588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierOrKeyword_in_ocl_expressions_operationcallexp5644 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_LPAREN_in_ocl_expressions_operationcallexp5651 = new BitSet(new long[]{0x0030604B00006770L});
    public static final BitSet FOLLOW_ocl_expressions_oclexpression_in_ocl_expressions_operationcallexp5659 = new BitSet(new long[]{0x0030604B00006770L});
    public static final BitSet FOLLOW_ocl_expressions_oclexpression_in_ocl_expressions_operationcallexp5667 = new BitSet(new long[]{0x0030604B00006770L});
    public static final BitSet FOLLOW_RPAREN_in_ocl_expressions_operationcallexp5679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_model_structuralfeature_in_synpred1_MofClass1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_model_behavioralfeature_in_synpred2_MofClass1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerSymbol_in_synpred3_MofClass1901 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DDOT_in_synpred3_MofClass1903 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_STAR_in_synpred3_MofClass1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerSymbol_in_synpred3_MofClass1909 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DDOT_in_synpred3_MofClass1911 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_integerSymbol_in_synpred3_MofClass1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred4_MofClass1985 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_integerSymbol_in_synpred4_MofClass1987 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DDOT_in_synpred4_MofClass1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURL_in_synpred5_MofClass2071 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_integerSymbol_in_synpred5_MofClass2073 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DDOT_in_synpred5_MofClass2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_LCURL_in_synpred6_MofClass2157 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_integerSymbol_in_synpred6_MofClass2159 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DDOT_in_synpred6_MofClass2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURL_LBRACK_in_synpred7_MofClass2243 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_integerSymbol_in_synpred7_MofClass2245 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DDOT_in_synpred7_MofClass2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STAR_in_synpred8_MofClass2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerSymbol_in_synpred8_MofClass2333 = new BitSet(new long[]{0x3FFFFFFFFFFF7FF0L});
    public static final BitSet FOLLOW_set_in_synpred8_MofClass2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred9_MofClass2393 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_integerSymbol_in_synpred9_MofClass2395 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred9_MofClass2397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred9_MofClass2401 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_STAR_in_synpred9_MofClass2403 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred9_MofClass2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACKET_in_synpred10_MofClass2472 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_RBRACKET_in_synpred10_MofClass2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURL_in_synpred11_MofClass2503 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_STAR_in_synpred11_MofClass2505 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RCURL_in_synpred11_MofClass2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURL_in_synpred11_MofClass2511 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_integerSymbol_in_synpred11_MofClass2513 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RCURL_in_synpred11_MofClass2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURL_in_synpred12_MofClass2582 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RCURL_in_synpred12_MofClass2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_LCURL_in_synpred13_MofClass2613 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_STAR_in_synpred13_MofClass2615 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RCURL_RBRACK_in_synpred13_MofClass2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_LCURL_in_synpred13_MofClass2621 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_integerSymbol_in_synpred13_MofClass2623 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RCURL_RBRACK_in_synpred13_MofClass2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURL_LBRACK_in_synpred14_MofClass2692 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_STAR_in_synpred14_MofClass2694 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RBRACK_RCURL_in_synpred14_MofClass2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURL_LBRACK_in_synpred14_MofClass2700 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_integerSymbol_in_synpred14_MofClass2702 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RBRACK_RCURL_in_synpred14_MofClass2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCURL_LBRACK_in_synpred15_MofClass2771 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_RBRACK_RCURL_in_synpred15_MofClass2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_LCURL_in_synpred16_MofClass2802 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_RCURL_RBRACK_in_synpred16_MofClass2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_synpred17_MofClass3272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_synpred18_MofClass3283 = new BitSet(new long[]{0x3FFFFFFFFFFFDFF0L});
    public static final BitSet FOLLOW_set_in_synpred18_MofClass3285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_synpred19_MofClass3311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ocl_expressions_collectionitem_in_synpred20_MofClass4630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ocl_expressions_collectionrange_in_synpred21_MofClass4644 = new BitSet(new long[]{0x0000000000000002L});

}