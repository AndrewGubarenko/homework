import java.util.ArrayList;

/**
 * @author Andrii Hubarenko
 * Interface ICommitContainer is a template for controller class CommitContainer,
 * used to operate the tree`s functions
 */
public interface ICommitContainer {
    /**
     * Provide the access to current branch
     * @return Branch which is current
     */
    Branch getCurrentBranch();

    /**
     * Method initialize the work with the tree and create
     * the first branch named "Master"
     */
    void init();

    /**
     * Method adds file to current branch
     * @param blob file you are going to add to the branch
     */
    void addFileToBranch(Blob blob);

    /**
     * Method return the desired file
     * @param name of desired file
     * @return Blob file or null
     */
    Blob getFile(String name);

    /**
     * Remove file from the branch by file name
     * @param name of file
     */
    void deleteFileFromBranch(String name);

    /**
     * Create and add the new branch to the current brunch
     * @param name of new branch
     */
    void addSubBranch(String name);

    /**
     * Return the branch by name
     * @param name of desired branch
     * @return Branch you are looking for or null
     */
    Branch getSubBranch(String name);

    /**
     * Set up the specified by name branch as actual
     * @param name of brunch you are going to set up as current
     */
    void setCurrentBranch(String name);

    /**
     * Remove the branch by name
     * @param name of branch you are going to remove
     */
    void deleteSubBranch(String name);

    /**
     * Create and store the commit object
     * @param name of commit
     */
    void commit(String name);

    /**
     * Read the list of commits and return the array of their names
     * @return String[] of the commit`s names
     */
    ArrayList<String> readListOfCommits();

    /**
     * Set up the specified by name commit as an actual
     * @param name of desired commit
     */
    void setCommitAsCurrent(String name);

    /**
     * Remove the commit by name
     * @param name you are going to remove
     */
    void deleteCommit(String name);

    /**
     * Allow the access to current commit value
     * @return Commit current commit
     */
    CommitContainer.Commit getCurrentCommit();
}
