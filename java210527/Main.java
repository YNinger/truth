package java210527;

import java.util.Scanner;

public class Main {
    //剪花布条
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int count=0;
            String s = sc.next();
            String t = sc.next();
            //判断t是s的子字符串
            for(int i=0;i<=s.length()-t.length();){//重点是这里，要减去t的长度，不然i到了最后会造成字符串越界
                if(s.substring(i,i+t.length()).equals(t)){
                    count++;
                    i+=t.length();//每次跳过t的字符串的个数
                }else{
                    i++;
                }
            }
            System.out.println(count);
        }
    }
}
