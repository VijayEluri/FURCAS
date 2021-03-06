package com.sap.furcas.ide.editor;


//public class FurcasDocumentSetupParticpant implements IDocumentSetupParticipant {
//
//    public static final String PARTITIONING = "CTS_PARTITIONING";
//    
//    public FurcasDocumentSetupParticpant() {
//    }
//
//    public void setup(IDocument document) {
//	if(document instanceof CtsDocument) {
//	    ((CtsDocument) document).setSetupParticipant(this);
//	}
//    }
//    
//    public void setupCallback(IDocument document) {
//	IDocumentPartitioner partitioner = createDocumentPartitioner(document);
//	if (partitioner != null) {
//	    partitioner.connect(document);
//	    if (document instanceof IDocumentExtension3) {
//		IDocumentExtension3 de3 = (IDocumentExtension3) document;
//		de3.setDocumentPartitioner(PARTITIONING, partitioner);
//	    } else {
//		document.setDocumentPartitioner(partitioner);
//	    }
//	}
//    }
//
//    private IDocumentPartitioner createDocumentPartitioner(IDocument document) {
//	if(document instanceof CtsDocument) {
//	    FurcasPartitionScanner scanner = new FurcasPartitionScanner(((CtsDocument)document).getSyntax());
//	    return new FastPartitioner(scanner, FurcasPartitionScanner.PARTITIONS);
//	} else {
//	    return null;
//	}
//    }
//}
