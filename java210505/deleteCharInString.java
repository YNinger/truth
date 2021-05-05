package java210505;

import java.util.HashMap;
import java.util.Scanner;

public class deleteCharInString {
    //输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。
    // 例如，输入”They are students.”和”aeiou”，则删除之后的第一个字符串变成”Thy r stdnts.”
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i =0;i<str2.length();i++){
            if(map.get(str2.charAt(i))==null){
                map.put(str2.charAt(i),1);
            }else{
                map.put(str2.charAt(i),map.get(str2.charAt(i))+1);
            }
        }

        String s = "";
        for(int i =0;i<str1.length();i++){
            if(map.get(str1.charAt(i))==null){
                s += str1.charAt(i);
            }
        }
        System.out.println(s);
    }
}
