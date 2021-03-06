package com.sap.furcas.runtime.referenceresolving;

import com.sap.furcas.metamodel.FURCAS.textblocks.LexedToken;

/**
 * When {@link Activator#addTokenChanger(TokenValueChanger) registering} with the {@link Activator}, a
 * token value changer receives change requests for tokens in the text blocks model that should have their value changed
 * based on a re-binding or a re-name that took place.
 * 
 * @author Axel Uhl (d043530)
 * 
 */
public interface TokenChanger {
    void requestTokenValueChange(LexedToken token, String oldTokenValue, String newTokenValue);
}
