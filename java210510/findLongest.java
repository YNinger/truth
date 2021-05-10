package java210510;

import java.util.Scanner;

public class findLongest {
    //查找两个字符串a,b中的最长公共子串
    //contains，判断一个字符串是否有含有子字符串
    //subString(i,j)，截取字符串
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            //先判断出哪个是长字符串哪个是短字符串
            String maxstr = str1.length()>str2.length()?str1:str2;
            String minstr = str1.length()>str2.length()?str2:str1;
            //对短字符串的每段字符截取作比较
            int lenth = 0;//当前字符串的长度
            String s = "";
            for(int i =0;i<minstr.length();i++){
                for(int j=i+1;j<minstr.length();j++){
                    //判断截取的字符串是否在长字符串中存在且要求该字符串的长度大于上一个符合条件的字符串
                    if(maxstr.contains(minstr.substring(i,j))&&j-i>lenth){
                        s = minstr.substring(i,j);
                        lenth = j-i;
                    }
                }
            }
            System.out.println(s);
        }
    }
}
