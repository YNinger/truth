package java0330;

public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}

class Solutions{
    //二叉搜索树转换成双向链
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return null;
        }
        if (pRootOfTree.left == null && pRootOfTree.right == null) {
            return pRootOfTree;
        }
        TreeNode leftHead = Convert(pRootOfTree.left);
        TreeNode leftTail = leftHead;
        while (leftTail != null && leftTail.right != null)  {
            leftTail = leftTail.right;
        }
        if (leftHead != null) {
            leftTail.right = pRootOfTree;
            pRootOfTree.left = leftTail;
        }
        TreeNode rightHead = Convert(pRootOfTree.right);
        if (rightHead != null) {
            rightHead.left = pRootOfTree;
            pRootOfTree.right = rightHead;
        }
        return leftHead != null ? leftHead : pRootOfTree;
    }
}
