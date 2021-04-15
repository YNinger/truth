package java210415;

import java.util.Scanner;

public class MaxNumber {
    //读入一个字符串str，输出字符串str中的连续最长的数字串
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int max =0;
        int count = 0;
        int endstr =0;
        String str = null;
        for(int i =0;i<input.length();i++){
            if(input.charAt(i)<=73 && input.charAt(i)>=48){
                count++;
                if(count>max){
                    max = count;
                    endstr = i;
                }//asd12as1234d
            }else{
                count = 0;
            }
        }
        for(int i =0;i<max;i++){
            System.out.print(input.charAt(endstr-max+1));
            endstr++;
        }
        //System.out.println(input.substring(endstr-max+1,endstr+1));
    }
}
