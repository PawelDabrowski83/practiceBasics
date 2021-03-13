package pl.basics6.ppj.w15;

public class TreeNode {

    private int value;
    private TreeNode LNode;
    private TreeNode RNode;

    public TreeNode(int value) {
        this.value = value;
        this.LNode = null;
        this.RNode = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLNode() {
        return LNode;
    }

    public void setLNode(TreeNode LNode) {
        this.LNode = LNode;
    }

    public TreeNode getRNode() {
        return RNode;
    }

    public void setRNode(TreeNode RNode) {
        this.RNode = RNode;
    }

    public String toString() {
        return "" + getValue();
    }
}
