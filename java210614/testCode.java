package java210614;

public class testCode {
    public static void main(String[] args) {
        int m=1;
        int n=2;
        swap(m,n);
        System.out.printf("swap:m=%d,n=%d",m,n);
    }

    private static void swap(int m, int n) {
        int tmp = m;
        m=n;
        n=tmp;
    }
}
