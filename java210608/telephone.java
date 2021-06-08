package java210608;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class telephone {
    //电话号码
    public static void main(String[] args){
        String symbol="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String number="222333444555666777788899991234567890";
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int n=scanner.nextInt();
            //定义一个顺序表来存储字符串
            ArrayList<String> arrayList=new ArrayList<String>();
            for(int i=0;i<n;i++){
                String str=scanner.next();
                //将字符串中的所有的"-"去掉
                str=str.replace("-","");
                //取一个新的字符串用来存储新的字符串
                String result="";
                for(int j=0;j<7;j++){
                    //取输入字符串的第i个字符与字符串symbol下标相对应并取到此时的电话号码所对应的数组
                    result+=number.charAt(symbol.indexOf(str.charAt(j)+""));
                }
                //截取输出字符串的前三个和后四个，substring( ，]是前闭后开的，中间加个"-"
                result=result.substring(0,3)+"-"+result.substring(3,7);
                if(!arrayList.contains(result))
                    //判断是否存在同一个字符串
                    arrayList.add(result);
            }
            //用Collections对字符串进行排序，从低到高
            Collections.sort(arrayList);
            for(int j=0;j<arrayList.size();j++){
                //从顺序表取出一个一个字符串并输出
                System.out.println(arrayList.get(j));
            }
            System.out.println();
        }
    }

//    public static void main(String[] args) {
//        String s = "-3F-2G-SFV-2-VV---";
//        String news = "";
//        s=s.replace("-","");
//        for (int i = 0; i <s.length(); i++) {
//            if(s.charAt(i)>=48&&s.charAt(i)<=57){
//                news+=s.charAt(i);
//            }
//        }
//        System.out.println(news);
//    }
}
