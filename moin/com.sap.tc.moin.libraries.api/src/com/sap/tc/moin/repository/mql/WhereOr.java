/*
 * Created on 10.02.2006
 */
package com.sap.tc.moin.repository.mql;

import java.util.List;

/**
 * This boolean OR operator can be used in a where-entry and is n-ary, i.e. can
 * take multiple operands.
 */
final public class WhereOr extends WhereNary {

    /**
     * Connects the provided nested clauses by a logical OR.
     * 
     * @param _nestedClauses the nested clauses.
     */
    public WhereOr( WhereClause[] _nestedClauses ) {

        this.nestedClauses = _nestedClauses;
    }

    /**
     * Connects the provided nested clauses by a logical OR.
     * 
     * @param _nestedClauses the nested clauses.
     */
    public WhereOr( List<WhereClause> _nestedClauses ) {

        this.nestedClauses = _nestedClauses.toArray( new WhereClause[_nestedClauses.size( )] );
    }

    @Override
    protected void toString( StringBuilder sb, int indent ) {

        if ( this.nestedClauses != null && this.nestedClauses.length > 0 ) {
            sb.append( "or (" ); //$NON-NLS-1$
            this.nestedClauses[0].toString( sb, indent );
            for ( int i = 1; i < this.nestedClauses.length; i++ ) {
                sb.append( ", " ); //$NON-NLS-1$
                this.nestedClauses[i].toString( sb, indent );
            }
            sb.append( ")" ); //$NON-NLS-1$
        }
    }
}