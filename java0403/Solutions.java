package java0403;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class Solutions {
    //1.二叉树的分层遍历
    //给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
    //https://leetcode-cn.com/problems/binary-tree-level-order-traversal/

    //创建一个成员变量，用来跟新递归方法中的变量
    public static List<List<Integer>> result = null;
    public List<List<Integer>> levelOrder(TreeNode root) {
        //对result进行实例化，以便用来接收每次递归所更新的值
        result = new ArrayList<List<Integer>>();
    //递归的方式进行遍历
        if(root == null){
            return result;
        }

        //调用一个辅助函数进行递归
        helper(root,0);
        return result;
    }
    public void helper(TreeNode root,int level){
        if(level == result.size()){
            //当行数和数组的大小相等时需要扩容
            //给二维List中添加一个新行
            result.add(new ArrayList<Integer>());
        }
        //访问节点，去到当前节点的值并放入result中
        result.get(level).add(root.val);

        if(root.left!=null){
            helper(root.left,level+1);
        }
        if(root.right!=null){
            helper(root.right,level+1);
        }
    }

    //2.将该二叉搜索树转换成一个排序的双向链表
    //要求不能创建任何新的结点，只能调整树中结点指针的指向。
    public TreeNode Convert(TreeNode pRootOfTree) {

    }
}
