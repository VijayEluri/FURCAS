package com.sap.tc.moin.xm.generation.core.code.parser;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateErrorListener;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.StringTemplateGroupLoader;
import org.antlr.stringtemplate.language.DefaultTemplateLexer;

import com.sap.tc.moin.repository.exception.MoinNullPointerException;
import com.sap.tc.moin.repository.shared.logger.MoinCategoryEnum;
import com.sap.tc.moin.repository.shared.logger.MoinLocationEnum;
import com.sap.tc.moin.repository.shared.logger.MoinLogger;
import com.sap.tc.moin.repository.shared.logger.MoinLoggerFactory;
import com.sap.tc.moin.repository.shared.logger.MoinSeverity;
import com.sap.tc.moin.xm.generation.core.code.parser.template.XmParserHandlerTemplate;
import com.sap.tc.moin.xm.generation.core.code.util.CommonClassLoaderGroupLoader;
import com.sap.tc.moin.xm.generation.core.code.util.MoinStringTemplateErrorListener;

/** Generator for the XM Parser Handler. */
public final class XmParserGenerator {

    private static final MoinLogger LOGGER = MoinLoggerFactory.getLogger( MoinCategoryEnum.MOIN_XM, MoinLocationEnum.MOIN_XM_GEN, XmParserGenerator.class );

    private static final StringTemplateGroup parsergroup;

    static {
        // instantiate StringTemplateGroupLoader and register it
        final StringTemplateErrorListener errorListener = new MoinStringTemplateErrorListener( );

        final StringTemplateGroupLoader loader = new CommonClassLoaderGroupLoader( "com/sap/tc/moin/xm/generation/core/code/parser/template", errorListener, XmParserGenerator.class.getClassLoader( ) ); //$NON-NLS-1$
        StringTemplateGroup.registerGroupLoader( loader );

        parsergroup = StringTemplateGroup.loadGroup( "parser", DefaultTemplateLexer.class, null ); //$NON-NLS-1$
    }


    /**
     * Generates the code for a template.
     * 
     * @param template
     * @return generated code
     * @throws NullPointerException if the parameter is <code>null</code>
     */
    public String createCode( final XmParserHandlerTemplate template ) {

        if ( template == null ) {
            throw new MoinNullPointerException( "template" ); //$NON-NLS-1$
        }
        LOGGER.trace( MoinSeverity.DEBUG, "Creating code for XM Parser {0} started", template.getJavaName( ) ); //$NON-NLS-1$
        final StringTemplate st = parsergroup.getInstanceOf( "parser" ); //$NON-NLS-1$
        st.setAttribute( "template", template ); //$NON-NLS-1$
        return st.toString( );
    }
}