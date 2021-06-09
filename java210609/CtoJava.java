package java210609;

import java.util.Scanner;
public class CtoJava {
    //骆驼命名法
    //从C/C++转到Java的程序员，一开始最不习惯的就是变量命名方式的改变。
    // C语言风格使用下划线分隔多个单词，
    // 例如“hello_world"”;而Java则采用一种叫
    // 骆驼命名法的规则:除首个单词以外，所有单词的首字母大写，
    // 例helloWorld”。请你帮可怜的程序员们自动转换变量名。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            String s1 = "";
            for (int i = 0; i <s.length(); i++) {
                if(s.charAt(i)=='_'){
                    s1+=s.substring(i+1,i+2).toUpperCase();
                    i++;
                }else{
                    s1+=s.charAt(i);
                }
            }

            System.out.println(s1);
        }
    }
}
