package java0129;

public class add1to10 {
    //递归求 1 + 2 + 3 + ... + 10
    public static void main(String[] args) {
        int sum=add(1);
        System.out.println(sum);
    }

    public static int add(int i) {
        if(i==10){//明白递归到最后的时候要渐进
            return i;
        }
        return i+add(i+1);
    }
}
