package java210626;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    //JZ31 整数中1出现的次数（从1到n整数中1出现的次数）
    public static int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for(int i=1;i<=n;i++){
            int ret =i;
            while(ret/10!=0){
                if(ret%10==1){
                    count++;
                }
                ret/=10;
            }
            if(ret==1){
                count++;
            }
        }
        return count;
    }

    //JZ32 把数组排成最小的数
    //输入:[3,32,321]
    //返回:"321323"
    public String PrintMinNumber(int [] numbers) {
        if(numbers==null){
            return "";
        }
        for(int i=0;i<numbers.length;i++){
            //对其进行冒泡排序，相邻字符串之间相加
            //如果前者加后者更大，则相邻两个需要互换位置
            for(int j=i;j<numbers.length;j++){
                int a = Integer.parseInt(numbers[i]+""+numbers[j]);
                int b = Integer.parseInt(numbers[j]+""+numbers[i]);
                if(a>b){
                    int tmp = numbers[j];
                    numbers[j] =numbers[i];
                    numbers[i] = tmp;
                }
            }
        }
        StringBuilder string = new StringBuilder();
        for (int number : numbers) {
            string.append(number);
        }
        return string.toString();
    }

    //JZ1 二维数组中的查找
    //方法一：暴力解法，依次遍历
    public boolean Find(int target, int [][] array) {
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(array[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
    //方法二：从左下角找，每次找完都能删除一行或者一列
    //[
    //  [1,2,8,9],
    //  [2,4,9,12],
    //  [4,7,10,13],
    //  [6,8,11,15]
    //]
    public boolean Find2(int target,int[][] array){
        int rows = array.length;
        if (rows==0){
            return false;
        }
        int lines = array[0].length;
        if(lines==0){
            return false;
        }
        int row = rows-1;
        int line =0;
        while(row>=0&&line<lines){
            if (array[row][line]>target){
                row--;
            }else if(array[row][line]<target){
                line++;
            }else{
                return true;
            }
        }
        return false;
    }

    //JZ2 替换空格
    //输入："We Are Happy"
    //返回值："We%20Are%20Happy"
    public static String replaceSpace (String s) {
        // write code here
        StringBuilder string = new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {
            if (s.charAt(i)==' '){
                string.append("%20");
            }else{
                string.append(s.charAt(i));
            }
        }
        return string.toString();
    }


    //JZ3 从尾到头打印链表
    //输入：{1,2,3}
    //返回值：[3,2,1]
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list= new ArrayList<>();
        ArrayList<Integer> newList = new ArrayList<>();
        ListNode cur = listNode;
        if(listNode==null){
            return list;
        }
        if (listNode.next==null){
            list.add(listNode.val);
            return list;
        }
        while(cur.next!=null){
            list.add(cur.val);
            cur = cur.next;
        }
        list.add(cur.val);
        for (int i = list.size()-1; i >=0 ; i--) {
            newList.add(list.get(i));
        }
        return newList;
    }
    //通过逆置链表的方式
    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode){
        ArrayList<Integer> list = new ArrayList<>();
        if (listNode==null||listNode.next==null){
            return list;
        }
        ListNode newhead = null;
        ListNode curNode = listNode;
        ListNode preNode = null;
        ListNode nextNode;
        while (curNode!=null){
            nextNode = curNode.next;
            if(nextNode==null){
                newhead = curNode;
            }
            curNode.next = preNode;
            preNode = curNode;
            curNode = nextNode;
        }
        while (newhead.next!=null){
            list.add(newhead.val);
        }
        list.add(newhead.val);
        return list;
    }
    //用堆栈的方法
    public ArrayList<Integer> printListFromTailToHead3(ListNode listNode){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        if(listNode==null){
            return list;
        }
        while(listNode!=null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }

        public static void main(String[] args) {
        String s = "We Are Happy";
        System.out.println(replaceSpace(s));
    }

    //JZ11 二进制中1的个数
    //输入一个整数，输出该数32位二进制表示中1的个数。其中负数用补码表示。
    //方法1:用n和n-1相与
    public int NumberOf1(int n){
        int count=0;
        while(n!=0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
    //方法2:用Java的Interger.bitCount函数
    public int NumberOf2(int n){
        return Integer.bitCount(n);
    }
    //方法3:将n和1相与运算，并且每次进行左移操作
    public int NumberOf3(int n){
        int flag = 0;
        int count =0;
        while (flag!=0){
            if ((n&flag)!=0){
                count++;
            }
            flag<<=1;
        }
        return count;
    }


}
class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
 }