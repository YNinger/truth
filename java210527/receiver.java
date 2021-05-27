package java210527;

import java.util.Scanner;

public class receiver {
    //收件人列表
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int line = sc.nextInt();
            sc.nextLine();
            String[] name = new String[line];
            StringBuilder ret = new StringBuilder();
            for(int i=0;i<line;i++){
                name[i] = sc.nextLine();
                if (i==line-1) {
                    if(name[i].contains(",")||name[i].contains(" ")){
                        ret.append("\"").append(name[i]).append("\"");
                    }else{
                        ret.append(name[i]);
                    }
                }else{
                    if(name[i].contains(",")||name[i].contains(" ")){
                        ret.append("\"").append(name[i]).append("\"").append(", ");
                    }else{
                        ret.append(name[i]).append(", ");
                    }
                }
                //System.out.println(name[i].toString());
            }
            System.out.println(ret.toString().toString());
            //System.out.println(Arrays.toString(name));
        }
    }
}
