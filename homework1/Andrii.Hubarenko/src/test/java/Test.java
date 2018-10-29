import org.junit.Assert;

import java.util.ArrayList;

public class Test {

    @org.junit.Test
    public void test() {
        ICommitContainer cc = new CommitContainer("Andrii");

        cc.init();
        Assert.assertEquals("Master", cc.getCurrentBranch().getName());

        Blob<String> file1 = new Blob<>("file 1", "Some content");
        Blob<Integer> file2 = new Blob<>("file 2", 124);
        Blob<Boolean> file3 = new Blob<>("file 3", true);

        cc.addFileToBranch(file1);
        cc.addFileToBranch(file2);

        cc.addSubBranch("Second branch");
        Assert.assertEquals("Second branch", cc.getSubBranch("Second branch").getName());

        cc.deleteFileFromBranch("file 2");
        Assert.assertNull(cc.getFile("file 2"));

        cc.setCurrentBranch("Second branch");
        Assert.assertEquals("Second branch", cc.getCurrentBranch().getName());

        cc.addFileToBranch(file3);
        cc.getFile("file 3");
        Assert.assertEquals(file3, cc.getFile("file 3"));

        Assert.assertEquals("Master", cc.getCurrentBranch().getParentBranch().getName());
        cc.setCurrentBranch("Master");
        Assert.assertEquals("Master", cc.getCurrentBranch().getName());

        Assert.assertEquals("Second branch", cc.getSubBranch("Second branch").getName());
        cc.deleteSubBranch("Second branch");
        Assert.assertNull(cc.getSubBranch("Second branch"));

        cc.addSubBranch("Second branch");

        cc.commit("First commit");
        ArrayList<String> expected = new ArrayList<>();
        expected.add("First commit");
        Assert.assertEquals(expected, cc.readListOfCommits());

        cc.setCurrentBranch("Second branch");
        Assert.assertEquals("Second branch", cc.getCurrentBranch().getName());
        cc.commit("Second commit");
        expected.add(0,"Second commit");
        Assert.assertEquals(expected, cc.readListOfCommits());

        cc.deleteCommit("Second commit");
        Assert.assertEquals("First commit", cc.getCurrentCommit().getCommitName());

        cc.commit("Second commit");
        Assert.assertEquals(expected, cc.readListOfCommits());
        Assert.assertEquals("Second commit", cc.getCurrentCommit().getCommitName());
        cc.setCommitAsCurrent("First commit");
        Assert.assertEquals("First commit", cc.getCurrentCommit().getCommitName());
    }
}
