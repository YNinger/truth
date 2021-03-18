package java0318;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}


public class Solutions {
    // 1.求二叉树的最大深度
    // 思路：先判断根节点是否为空，在对左右子树进行遍历，当遍历到叶子结点的时候就会对其左右节点判定
    // 此时会返回一个1，继而回到上一步叶子节点的父节点，在对其右节点计算深度
    // 最后所有左右子树判定结束之后会return一个最大值
    public static int maxDepth(TreeNode root) {
        // 先判断根节点是否为空，当根节点为空时说明是空树或者前一个结点为空树
        if(root == null){
            return 0;
        }
        //从叶子节点开始计算每个节点的深度
        int leftTreehigth =maxDepth(root.left);
        int rightTreehight = maxDepth(root.right);
        return 1+(leftTreehigth > rightTreehight? leftTreehigth:rightTreehight);
    }

    // 2.判断是否是平衡二叉树（一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1）
    // 平衡二叉树判断条件：
    // 计算每一个左右子树的深度并且做差，高度差要小于等于1
    public static boolean isBalanced(TreeNode root){
        if(root ==null){
            return true;
        }
        if(root.left == null&&root.right == null){
            return true;
        }
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        if(leftHeight-rightHeight > 1 || leftHeight - rightHeight < -1){
        //这里应该是不成立的时候
        //如果是成立的条件那就直接返回上一层不进行其子节点的计算
            return false;
        }
    //在这里是同时处理左右子树，让其左右子树的高度差不超过1，必须同时成立
        return isBalanced(root.left) && isBalanced(root.right);
    }


    //3.判断是否是对称二叉树
    public boolean isSymmetric(TreeNode root) {
        //思路：对二叉树的左右节点进行遍历
        if(root == null){
            return true;
        }
        return isMirror(root.left,root.right);
    }

    public boolean isMirror(TreeNode p, TreeNode q) {
        //判断两棵子树是否相同
        if(p==null&&q==null){
            return true;
        }
        if(p==null ||q==null){
            //注意这段代码！！！
            //当其中有一个节点为空的时候，则输出为不对称
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        return isMirror(p.left,q.right)&&isMirror(p.right,q.left);//注意这段代码！！！
    }


    //4.实现二叉树的层序遍历
    public static void levelOrder(TreeNode root){
        if(root == null){
            return;
        }

    }


//    //判断是否是完全二叉树
//    public static boolean isCompleteTree(TreeNode root){
//    //思路：
//    }

    public static void main(String[] args) {

    }
}
