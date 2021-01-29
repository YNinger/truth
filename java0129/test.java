package java0129;

public class test {//时间复杂度O(N),N为多少就调用几次
//    public static int factorial(int N){
//        if(N<2){
//            return N;
//        }
//        return factorial(N-1)*N;
//    }
    //斐波那契数列
    public static int fib(int N){
        if(N==1||N==2)
            return 1;
        return fib(N-1)+fib(N-2);
    }

    public static void main(String[] args) {
//        int ret=factorial(5);
//        System.out.println(ret);
        int ret1=fib(5);
        System.out.println(ret1);
    }
}
