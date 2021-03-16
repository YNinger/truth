package java0316;


class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class Solution {
    //检查两棵树是否相同
    //给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。
    //如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的
    //判断依据：结构相同，对应节点的值相同
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p ==null&&q ==null){
            return true;
        }
        if(p == null||q == null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
