package pl.basics6.ppj.w15;

public class MyTree {

    private TreeNode root;

    public MyTree() {
        this.root = null;
    }

    public void add(int value) {
        if (this.root == null) {
            this.root = new TreeNode(value);
        } else {
            add(this.root, value);
        }
    }

    private void add(TreeNode root, int value) {
        if(root.getValue() > value) {
            if (root.getLNode() == null) {
                root.setLNode(new TreeNode(value));
            } else {
                add(root.getLNode(), value);
            }
        } else {
            if (root.getRNode() == null) {
                root.setRNode(new TreeNode(value));
            } else {
                add(root.getRNode(), value);
            }

        }
    }

    public void show() {
        show(this.root);
    }

    private void show(TreeNode node) {
        if (node.getLNode() == null) {
            System.out.println("null");
        } else {
            show(node.getLNode());
        }
        if (node.getRNode() == null) {
            System.out.println("null");
        } else {
            show(node.getRNode());
        }
        System.out.println(node);
    }
}
