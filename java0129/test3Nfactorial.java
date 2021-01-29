package java0129;

public class test3Nfactorial {
    //递归求 N 的阶乘
    public static void main(String[] args) {
        int ret =Mul(10);
        System.out.println(ret);
    }
    public static int Mul(int i){
        if(i==1){
            return i;
        }
        return i*Mul(i-1);
    }
}
