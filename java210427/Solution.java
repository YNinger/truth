package java210427;

public class Solution {
    public static void main(String[] args) {
        Thread t = new Thread(){
            public void run(){
                System.out.println();
            }
        };
        t.run();
        System.out.println("dazhong");
    }
    static void dianping(){
        System.out.println("dianping");
    }
}
