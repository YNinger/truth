package java210529test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class readName {
    //抄送列表
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String allname = sc.nextLine();
            String name = sc.nextLine();
            StringBuilder ret = new StringBuilder();
            char[] ch = allname.toCharArray();
            List<String> list = new ArrayList<>();
            int flag = 0;
            for (int i = 0; i <allname.length(); i++) {
                if(allname.charAt(i)=='"' && flag==0){
                    //此处代表第一个双引号
                    flag = 1;
                    list.add(ret.toString());
                    ret = new StringBuilder();
                }else if(allname.charAt(i)=='"'&&flag==1){
                    //此时代表相对的后边的一个双引号
                    flag = 0;
                    list.add(ret.toString());
                    ret = new StringBuilder();//一次取值结束后要将该字符串重新置空
                }else if (flag == 1){
                    //flag等于1代表有双引号
                    ret.append(ch[i]);
                }else if(allname.charAt(i) != ','){
                    //此时代表无双引号包含的名字
                    ret.append(ch[i]);
                }
            }
            list.add(ret.toString());
            boolean findit = false;
            for (String str:list) {
                if(str.equals(name)){
                    findit =true;
                    break;
                }
            }
            if(findit){
                System.out.println("Ignore");
            }else {
                System.out.println("Important!");
            }
        }
    }
}
