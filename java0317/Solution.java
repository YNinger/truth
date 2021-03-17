package java0317;

class TreeNode{
    String val;
    TreeNode left;
    TreeNode right;

    public TreeNode(String val) {
        this.val = val;
    }
}

public class Solution {
    public static TreeNode createList(){
        TreeNode a = new TreeNode("A");
        TreeNode b = new TreeNode("B");
        TreeNode c = new TreeNode("C");
        TreeNode d = new TreeNode("D");
        TreeNode e = new TreeNode("E");
        TreeNode f = new TreeNode("F");
        TreeNode g = new TreeNode("G");

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        e.left = g;
        c.right = f;
        return a;
    }

    public static TreeNode createList1(){
        TreeNode a = new TreeNode("A");
        TreeNode b = new TreeNode("B");
        TreeNode c = new TreeNode("C");
        TreeNode d = new TreeNode("D");
        TreeNode e = new TreeNode("E");
        TreeNode f = new TreeNode("F");
        TreeNode g = new TreeNode("Q");

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        e.left = g;
        c.right = f;
        return a;
    }
    //判断是否是同一棵树
    public static boolean issametree(TreeNode p, TreeNode q){
        if(p == null&&q == null){
            return true;
        }
        if(p ==null||q ==null){
            return false;
        }
        if(q.val!=p.val){
            return false;
        }
        return issametree(p.left,q.left)&&issametree(p.right,q.right);
    }

    //判断一棵树是否是另一棵树的子树
    //t是子树，s是父树
    public boolean isSubtree(TreeNode s, TreeNode t) {
        //思路：先判断t或者s是否是空树，在判断两棵树是否相同，如果相同，直接返回true
        //不相同的话先便利s的左子树与t相比较再与s的右子树比较,两个为相或关系
        if(s==null){
            return false;
        }
        boolean ret = issametree(s,t);
        if(ret){
            return ret;
        }
        return isSubtree(s.left,t)||isSubtree(s.right,t);
    }

//    //判断是否是完全二叉树
//    public static boolean isCompleteTree(TreeNode root){
//
//    }

    public static void main(String[] args) {
        TreeNode q = createList();
        TreeNode p = createList1();
        issametree(p,q);
    }
}
