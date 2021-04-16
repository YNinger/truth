package java210416;

import java.util.Scanner;
import java.util.Stack;

public class scale {
    //给定一个十进制数M，以及需要转换的进制数N。将十进制数M转化为N进制数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();//给定的的十进制数
        int n = sc.nextInt();//所需转换的n进制
            Myswitch(m,n);
    }
    public static void Myswitch(int m, int n) {
        boolean flag = true;
        if(n==10){
            System.out.println(m);
            return;
        }
        Stack<Integer> stack = new Stack<>();
        StringBuilder str = new StringBuilder();
        //先对m采用二分法计算结果，并采取压栈
        int m1 =m;
        //此处用m！=0比用(m/n)>=1方便，不用判断正负数
        while(m1!=0){
            stack.push(m1%n);
            m1=m1/n;
        }
        //这边进行出栈
        while(stack.size()>=1){
            if(m<=0&&flag){
                str.append("-");
                flag = false;
            }
            int e = stack.peek();
            if(e>9){
                char c = (char)((e-10)+'A');
                //stack.pop();
                str.append(stack.pop());
            }else {
                str.append(stack.pop());
            }
        }
        System.out.println(str.toString());
    }
}
