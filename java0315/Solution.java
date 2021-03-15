package java0315;

import java.util.Scanner;

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
        return false;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个浮点数");
        double input = scanner.nextDouble();
        System.out.println("输出的整数为："+(int)input);

    }
}
