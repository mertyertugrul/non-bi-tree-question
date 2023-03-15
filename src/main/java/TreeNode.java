import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    int val;
    List<TreeNode> children;

    public TreeNode(int val) {
        this.val = val;
        this.children = new ArrayList<>();
    }

    public int getVal() {
        return val;
    }

    public void addChild(TreeNode children) {
        this.children.add(children);
    }

    public List<TreeNode> getChildren() {
        return children;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        toStringHelper(this, sb, 0);
        return sb.toString();
    }

    private void toStringHelper(TreeNode node, StringBuilder sb, int depth) {
        for (int i = 0; i < depth; i++) {
            sb.append("  ");
        }
        sb.append("- ");
        sb.append(node.getVal());
        sb.append("\n");
        for (TreeNode child : node.getChildren()) {
            toStringHelper(child, sb, depth + 1);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode treeNode = (TreeNode) o;
        return getVal() == treeNode.getVal() && getChildren().equals(treeNode.getChildren());
    }

}
