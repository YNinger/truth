package java210805;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

//JZ41 和为S的连续正数序列
//穷举法
//12
//123
//23||1234
public class Solution {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if (sum<0){
            return list;
        }
        int left = 1;
        int right = 2;
        int mysum = left+right;
        //要判断
        while (sum>right){
            //如果得到的和比所需的和小，向右加一个数
            if (mysum<sum){
                right++;
                mysum+=right;
            }else if (mysum>sum){
                //如果得到的和比所需的和大，向左减一个数
                mysum-=left;
                left++;
            }else{
                //如果得到的和与所需的和相等，直接将这些数字输入到顺序表
                ArrayList<Integer> list1 = new ArrayList<>();
                for (int i = left; i <=right ; i++) {
                    list1.add(i);
                }
                //将每次的一个顺序表中的元素放入到顺序表存起来
                list.add(list1);
                //将数据放进去之后要更新
                right++;
                mysum+=right;
            }
        }
        return list;
    }



    //JZ42 和为S的两个数字
    public static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int mul = array[0]*array[1];
        for (int i = 0; i <array.length ; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if (array[i]+array[j]==sum&&array[i]*array[j]>mul){
                    if (stack.isEmpty()){
                        stack.push(array[i]);
                        stack.push(array[j]);
                    }else{
                        while(!stack.isEmpty()){
                            stack.pop();
                        }
                        stack.push(array[i]);
                        stack.push(array[j]);
                    }
                    mul = array[i]*array[j];
                }
            }
        }
        while (!stack.isEmpty()){
            list.add(stack.pop());
        }
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,4,7,11,15};
        int sum = 15;
        //FindNumbersWithSum(arr,sum);
        //System.out.println(LeftRotateString("abcXYZdef",3));
        
    }

    //JZ43 左旋转字符串
    //输入："abcXYZdef",3
    //返回值："XYZdefabc"
    public static String LeftRotateString(String str,int n) {
        ArrayList<String> list = new ArrayList<>();
        String str1 = "";
        String str2 = "";
        if(str.length()==0){
            return str1;
        }
        if (n>str.length()){
            return str1;
        }
        str1 = str.substring(n,str.length());
        str2 = str.substring(0,n);
        return (str1+str2);
    }


    //JZ44 翻转单词序列
    //输入："nowcoder. a am I"
    //返回值："I am a nowcoder."
    public String ReverseSentence(String str) {
        Stack<String> stack = new Stack<>();
        String[] string = str.split(" ");
        for (int i = 0; i <string.length-1; i++) {
            stack.push(string[i]);
            stack.push(" ");
        }
        stack.push(string[string.length-1]);
        StringBuilder ret = new StringBuilder();
        while(!stack.isEmpty()){
            ret.append(stack.pop());
        }
        return ret.toString();
    }
}