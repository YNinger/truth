package java210623;
import static java.lang.System.out;

import java.util.*;

/*测试数据*/
/*a b c d
0.1 0.2 0.3 0.4

a b c d e f
45 13 12 16 9 5*/
class HuffmanTree {
    public static int number;
    static List<Node> list;
    public static void main(String[] args) {
        list = new ArrayList<Node>();
        System.out.println("请输入字符的个数:");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        final int ret = number;
        System.out.println("请输入" + number + "个字符:");
        String[] c = new String[number];
        for (int i = 0; i < c.length; ++i)
            c[i] = sc.next();

        System.out.println("请输入字符对应的频率:");
        double[] freq = new double[number];
        for (int i = 0; i < freq.length; ++i)
            freq[i] = sc.nextDouble();

        for (int i = 0; i < number; ++i) {
            Node node = new Node(c[i], freq[i], i);
            list.add(node);
        }
        Collections.sort(list);
        huffmanTree();
        sc.close();
    }

    /**
     * @return : 权重最大值和次大值所在下标
     */
    private static ArrayList<Integer> selectTwoMin() {
        ArrayList<Integer> two = new ArrayList<Integer>();
        int first = 0, second = 0;/* 两个最小值都初始化为下表为0 */
        double small1, small2;
        small1 = small2 = Double.MAX_VALUE;/* 将最大值和最小值初始化为double类型的最大值 */
        for (int i = list.size()-1; i >=0; --i) {
            if (list.get(i).parent == -1) {

                if (small1 > list.get(i).weight) {
                    second = first;/* 更新次小的值 */
                    small2 = small1;
                    small1 = list.get(i).weight;/* 更新最小值 */
                    first = i;
                } else if (small2 > list.get(i).weight) {
                    small2 = list.get(i).weight;/* 更新次小值 */
                    second = i;
                }
            }
        }
        two.add(first);
        two.add(second);
        return two;
    }

    /**
     * 求哈夫曼树:通过selectTwoMin()找到两个最小结点在list中的下标first,second
     * 形成新的结点node,权值为first.weight + first.weight 将first,second的父节点域更新为node的下标
     * node.left = first , node.right = second
     */
    public static void huffmanTree() {
        for (int i = number; i < 2 * number - 1; ++i) {
            ArrayList<Integer> two = selectTwoMin();
            Integer first = two.get(0);
            Integer second = two.get(1);
            Node left = list.get(first);
            Node right = list.get(second);
            left.setParent(i);
            right.setParent(i);
            Node parent = new Node("*", left.weight + right.weight, i);
            parent.setLeft(list.get(first).index);
            parent.setRight(list.get(second).index);
            list.add(parent);
        }
        for (Node node : list) {
            node.huffmanCode(list);
            node.show();
        }
    }
}

