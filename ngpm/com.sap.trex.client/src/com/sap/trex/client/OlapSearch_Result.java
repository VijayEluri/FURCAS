//
// TrexClient - (c) Copyright 2008-2009 SAP AG
//
// created from OlapSearch_Result.xsd/wsdl.  ! do not edit !
//
package com.sap.trex.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OlapSearch_Result extends Result
{
    private long                                  itsNoOfAllHits;
    private long                                  itsKernelTime;
    private ArrayList <ResultAttributeDefinition> itsAttributes;
    private ResultTable                           itsTable;

    public OlapSearch_Result ()
    {
        itsNoOfAllHits = 0;
        itsKernelTime = 0;
        itsAttributes = new ArrayList <ResultAttributeDefinition> ();
        itsTable = new ResultTable ();
    }

    public void clear()
    {
        super.clear();
        itsNoOfAllHits = 0;
        itsKernelTime = 0;
        itsAttributes.clear();
        itsTable.clear();
    }

    public void read(InputStream theStream) throws IOException, TrexException
    {
        int i,j;
        super.read(theStream);
        itsNoOfAllHits = theStream.readLong();
        itsKernelTime = theStream.readLong();
        j = theStream.readVectorSize();
        itsAttributes.ensureCapacity(j);
        while(itsAttributes.size()<j)
            itsAttributes.add(new ResultAttributeDefinition());
        while(itsAttributes.size()>j)
            itsAttributes.remove(itsAttributes.size()-1);
        for(i=0; i<j; i++)
            itsAttributes.get(i).read(theStream);
        itsTable.read(theStream);
    }

    public void write(OutputStream theStream) throws IOException, TrexException
    {
        throw new TrexException(Error.TDBC_READ_ONLY,"OlapSearch_Result");
    }

    /**
     * \class OlapSearch_Result
     *
     * \var noOfAllHits  -
     * \var kernelTime   -
     * \var attributes   -
     * \var table        -
     */

    public long getNoOfAllHits() 
    {
        return itsNoOfAllHits;
    }

    public void setNoOfAllHits(long theNoOfAllHits)
    {
        itsNoOfAllHits = theNoOfAllHits; 
    }


    public long getKernelTime() 
    {
        return itsKernelTime;
    }

    public void setKernelTime(long theKernelTime)
    {
        itsKernelTime = theKernelTime; 
    }


    public ArrayList <ResultAttributeDefinition> getAttributes() 
    {
        return itsAttributes;
    }

    public void setAttributes(ArrayList <ResultAttributeDefinition> theAttributes)
    {
        itsAttributes = theAttributes; 
    }

    public void addAttribute(ResultAttributeDefinition theAttributes)
    {
        itsAttributes.add(theAttributes); 
    }


    public ResultTable getTable() 
    {
        return itsTable;
    }

    public void setTable(ResultTable theTable)
    {
        itsTable = theTable; 
    }

}