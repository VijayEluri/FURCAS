package org.eclipse.emf.query.index.ui;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.query.index.Index;
import org.eclipse.emf.query.index.IndexFactory;
import org.eclipse.emf.query.index.internal.ui.builder.QueryIndexBuilder;
import org.eclipse.emf.query.index.internal.ui.builder.QueryIndexNature;
import org.eclipse.ui.IStartup;

/**
 * Starts the indexing of the projects with indexing nature on IDE startup
 */

public class IndexingIntitializer implements IStartup {

	public void earlyStartup() {
		// Check whether master dump file for indices exist or not. If the file
		// does not exist then start a full build, otherwise a incremental build
		// can be run.
		Index index = IndexFactory.getInstance();
		boolean indexFileExists = index.isDumpExists();
		if (indexFileExists) {
			IndexFactory.loadIndexes();
			buildIndexes(QueryIndexBuilder.INCREMENTAL_BUILD);
		} else {
			buildIndexes(QueryIndexBuilder.FULL_BUILD);
		}

	}

	/**
	 * Builds indexes based on the type of build required.
	 * 
	 * @param buildKind
	 *            The type of build required i.e., Incremental Build or Full
	 *            Build
	 */
	private void buildIndexes(int buildKind) {
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot()
				.getProjects();
		for (int i = 0; i < projects.length; i++) {
			try {
				IProject iProject = projects[i];
				if (iProject.isOpen()) {
					String[] natureIds = iProject.getDescription()
							.getNatureIds();
					for (int j = 0; j < natureIds.length; j++) {
						if (QueryIndexNature.NATURE_ID.equals(natureIds[j])) {
							iProject.refreshLocal(IResource.DEPTH_INFINITE,
									null);
							iProject.build(buildKind, new NullProgressMonitor());

						}
					}
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}

}