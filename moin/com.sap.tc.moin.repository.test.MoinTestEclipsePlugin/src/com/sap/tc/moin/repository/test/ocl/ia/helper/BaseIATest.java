package com.sap.tc.moin.repository.test.ocl.ia.helper;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import com.sap.tc.moin.ocl.ia.events.InternalEvent;
import com.sap.tc.moin.repository.test.ocl.base.BaseOclTest;

/**
 * Base class for all impact analyzer tests.
 * 
 * @author Thomas Hettel (D039141)
 */
public class BaseIATest extends BaseOclTest {

    /**
     * Checks the IA result (<tt>iaResult</tt>) against an optimum. If
     * <tt>iaResult</tt> is a superset of <tt>optimum</tt> a number &gt;= 0
     * will be returned as a measurement of quality. If <tt>iaResult</tt> is
     * not superset of <tt>optimum</tt> a number &lt; 0 will be returned
     * 
     * @param optimum
     * @param iaResult
     * @return the "quality" of the result
     */
    protected double checkResultAgainstOptimum( Set<InternalEvent> optimum, Set<InternalEvent> iaResult ) {

        Hashtable<String, Object> hash = new Hashtable<String, Object>( );
        boolean subSet = true;
        /*
         * TODO can't we replace this with Set? unfortunately Set#containsAll()
         * does not use equals() to compare objects and hence the method will
         * return true, even if iaResult is a valid superset of optimum. As a
         * work around we put the events form iaResult in a hash with their
         * string representation as key and then go through all events in
         * optimum to find out whether they are also included in iaResult.
         */

        for ( Iterator<InternalEvent> i = iaResult.iterator( ); i.hasNext( ); ) {
            InternalEvent event = i.next( );
            hash.put( event.toString( ), event );
        }
        for ( Iterator<InternalEvent> i = optimum.iterator( ); i.hasNext( ); ) {
            InternalEvent event = i.next( );
            if ( !hash.containsKey( event.toString( ) ) ) {
                subSet = false;
                break;
            }
        }

        if ( subSet ) {
            // this is a valid result since all events in the
            // optimum are in the iaResult set
            // we determine the quality of the result and return it.
            double iaSize = iaResult.size( );
            double optSize = optimum.size( );
            double quality = ( iaSize - optSize ) / optSize;
            return quality;

        }
        // this is not a valid result since there are some crucial
        // events not contained in the iaResult set
        return -1;
    }

    /**
     * Prints out a set of events.
     * 
     * @param result the set of events
     * @param out the Stream to print to
     * @param ordered whether the set should be orderd befor printing
     * @throws IOException
     */
    private void printResult( Set<InternalEvent> result, OutputStream out, boolean ordered ) throws IOException {

        if ( ordered ) {
            SortedMap<String, InternalEvent> sortedResult = new TreeMap<String, InternalEvent>( );
            for ( Iterator<InternalEvent> i = result.iterator( ); i.hasNext( ); ) {
                InternalEvent o = i.next( );
                sortedResult.put( o.toString( ), o );
            }
            BufferedWriter writer = new BufferedWriter( new OutputStreamWriter( out ) );
            for ( Iterator<InternalEvent> i = sortedResult.values( ).iterator( ); i.hasNext( ); ) {
                writer.write( i.next( ) + "\n" );
            }
            writer.flush( );
        } else {
            BufferedWriter writer = new BufferedWriter( new OutputStreamWriter( out ) );
            for ( Iterator<InternalEvent> i = result.iterator( ); i.hasNext( ); ) {
                writer.write( i.next( ) + "\n" );
            }
            writer.flush( );
        }
    }

    /**
     * Prints out a set of events and marks the events contained in an optimum.
     * 
     * @param result the set of events
     * @param optimum the optimum set of events
     * @param out the Stream to print to
     * @param ordered whether the set should be orderd before printing
     * @throws IOException
     */
    protected void printResult( Set<InternalEvent> result, Set<InternalEvent> optimum, OutputStream out, boolean ordered ) throws IOException {

        Hashtable<String, InternalEvent> optHash = new Hashtable<String, InternalEvent>( );
        for ( Iterator<InternalEvent> i = optimum.iterator( ); i.hasNext( ); ) {
            InternalEvent event = i.next( );
            optHash.put( event.toString( ), event );
        }

        if ( ordered ) {
            SortedMap<String, InternalEvent> sortedResult = new TreeMap<String, InternalEvent>( );
            for ( Iterator<InternalEvent> i = result.iterator( ); i.hasNext( ); ) {
                InternalEvent o = i.next( );
                sortedResult.put( o.toString( ), o );
            }
            BufferedWriter writer = new BufferedWriter( new OutputStreamWriter( out ) );
            for ( Iterator<InternalEvent> i = sortedResult.values( ).iterator( ); i.hasNext( ); ) {
                Object event = i.next( );
                if ( optHash.containsKey( event.toString( ) ) ) {
                    writer.write( event + " (opt)\n" );
                } else {
                    writer.write( event + "\n" );
                }
            }
            writer.flush( );
        } else {
            BufferedWriter writer = new BufferedWriter( new OutputStreamWriter( out ) );
            for ( Iterator<InternalEvent> i = result.iterator( ); i.hasNext( ); ) {
                Object event = i.next( );
                if ( optHash.containsKey( event.toString( ) ) ) {
                    writer.write( event + " (opt)\n" );
                } else {
                    writer.write( event + "\n" );
                }
            }
            writer.flush( );
        }
    }

}