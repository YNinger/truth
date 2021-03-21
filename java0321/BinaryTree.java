package java0321;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    String val;
    TreeNode left;
    TreeNode right;

    public TreeNode(String val) {
        this.val = val;
    }
}

public class BinaryTree {
    public static TreeNode build(){
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
        c.right = f;
        e.left = g;

        return a;
    }

    //层序遍历二叉树
    public static void levelOrder(TreeNode root){
        if(root == null){
            return;
        }
        //构建一个队列
        Queue<TreeNode>queue = new LinkedList<>();
        //将根节点入队列
        queue.offer(root);
        while(true){
            //先将二叉树里边的元素一个一个取出来
            //一个一个取出先入队列的节点
            //也就是根节点的左右节点
            TreeNode cur = queue.poll();
            //结束循环的条件是当取出来的那个节点为空的时候跳出循环
            if(cur == null){
                break;
            }
            //当此节点不为空的时候，打印结果
            System.out.print(cur.val+" ");
            //将左子树入队列
            if(cur.left!=null){
                queue.offer(cur.left);
            }
            //将右子树入队列
            if(cur.right!=null){
                queue.offer(cur.right);
            }
        }
    }

    public static boolean isCompleteTree(TreeNode root){
        //完全二叉树满足的条件
        //1.针对这个二叉树进行层序遍历
        //2.遍历过程中针对这个二叉树的判定要分成两个阶段来看
        //a)第一阶段：要求每个子树必须要有两个节点
        //如果遇到某个节点，只有左子树或者没有子树，进入第二个阶段
        //如果遇到某个节点只有右子树，则认为这个不是完全二叉树
        //b)第二阶段：要求每个子树必须没有子树
        //如果发现某个子树有子树，则不是完全二叉树
        if(root == null){
            return true;
        }

        //定义一个变量当其为false的时候进入第一阶段
        //当表示true的时候即进入第二阶段
        boolean level = false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(true){
            TreeNode cur = queue.poll();
            if(cur == null){
                break;
            }

            if(!level){
                if(cur.left!=null&cur.right!=null){
                    //此时为第一阶段每个子树必须要有两个节点
                    //则继续遍历其左右节点,把左右子树入队列
                    queue.offer(cur.left);
                    queue.offer(cur.right);
                }else if(cur.left==null&&cur.right!=null){
                    //只有右子树没有左子树，则不成立
                    return false;
                }else if(cur.left!=null&&cur.right==null){
                    //只有左子树没有右子树时，进入第二阶段
                    queue.offer(cur.left);
                    level = true;
                }else{
                    //节点无子树，也进入第二阶段
                    level = true;
                }
            }else{
                //第二阶段
                if(cur.left!=null||cur.right!=null){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode root = build();
        levelOrder(root);
    }
}
