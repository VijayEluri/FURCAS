/**
 * Generated by the MOIN Generator Version 3.0
 **/

package bibtex;

/**
 * This interface is not intended to be implemented by clients.
 */
public interface BibtexPackage extends com.sap.tc.moin.repository.mmi.reflect.RefPackage
{
    /**
     * Extent descriptor
     */
    public final com.sap.tc.moin.repository.mmi.descriptors.PackageDescriptor<bibtex.BibtexPackage> PACKAGE_DESCRIPTOR = new com.sap.tc.moin.repository.mmi.descriptors.PackageDescriptor<bibtex.BibtexPackage>("483FE092F83DF8402E3811DD8EBF0017421AAAAA", "sap.com/moin/mm/bibtex.metamodel", "Bibtex"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ 
    // classes
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getEntry();
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getAuthor();
    public com.sap.tc.moin.repository.mmi.reflect.RefClass getLiteratureDb();
    // associations
    public bibtex.LitertureDbEntry getLitertureDbEntry();
    public bibtex.LitertureDbAuthor getLitertureDbAuthor();
    public bibtex.EntryAuthor getEntryAuthor();
}