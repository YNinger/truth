package java0206;

public class Test {
    //计算a的n次方
    public static int power(int a,int n){
        int p = 1;
        for(int i =0;i<n;i++){
            p*=a;
        }
        return p;
    }
    //计算n的各位数字的立方和
    public static int cubeofDigit(int n){
        int sum = 0;
        do{
            int digit = n%10;
            sum+=power(digit,3);
            n=n/10;
        }while(n!=0);
        return sum;
    }
    //对其进行判断是否时水仙花数
    public static boolean inNarcissisticNumber(int n){
        return cubeofDigit(n)==n;
    }

    public static void main(String[] args) {
        for(int i =100;i<=999;i++){
            if(inNarcissisticNumber(i)){
                System.out.println(i+"是一个水仙花数");
            }
        }
    }
}
