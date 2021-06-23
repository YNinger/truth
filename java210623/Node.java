package java210623;
import java.util.List;

public class Node implements Comparable<Node> {
    private String name;
    public int parent;
    private int left;
    private int right;
    public double weight;
    public int index;
    public String code;

    public Node(String name, double weight, int index) {
        super();
        this.name = name;
        this.weight = weight;
        this.index = index;
        this.parent = -1; // 父节点初始化为-1,代表没有父节点
        this.left = -1; // 左孩子初始化为-1,代表没有左孩子
        this.right = -1; // 右结点初始化为-1,代表没有右孩子
        this.code = "";
    }
    /**
     * Compares this object with the specified object for order.
     * Returns a negative integer, zero, or a positive integer
     * as this object is less than, equal to, or greater than the specified object
     * */
    @Override
    public int compareTo(Node o) {
        if(this.weight < o.weight)
            return -1;
        else if(this.weight > o.weight)
            return 1;
        return 0;
    }

    public void show() {
//        out.printf("name = %-2s lchild = %-2d	rchild = %-2d "
//                        + "index = %-2d parent = %-2d weight = %.2f"
//                        + "	code = %s\n",
//                name , left, right,index ,parent ,weight,code);
        System.out.println(name+" "+code);
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public void setLeft(){

    }
    public void setRight(int right) {
        this.right = right;
    }

    public void setParent(int parent) {
        this.parent = parent;
    }
    /**
     * 实现求该结点的哈夫曼编码
     * @param list 以下标形式表示的哈夫曼树
     */
    public void huffmanCode(List<Node> list) {
        int parent = this.parent;
        int index = this.index;
        while (parent != -1) {	//结点的父节点为-1代表这个结点是根节点,树叶不断寻找父节点,由下向上求哈夫曼编码
            if (list.get(parent).left == index)
                code += "1";	//如果树叶是 树叶父节点 的左孩子
            else
                code += "0";

            index = list.get(parent).index;
            parent = list.get(parent).parent;
        }
        StringBuffer reverse = new StringBuffer();	//真正的哈夫曼编码是由根部到树叶,所以需要逆序
        for (int i = code.length() - 1; i >= 0; --i)
            reverse.append(code.charAt(i));

        code = reverse.toString();
    }
}
