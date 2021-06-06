package java210606;

import java.util.*;

public class readPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            StringBuilder ret = new StringBuilder();
            for (int i = 0; i <s.length() ; i++) {
                //48-57
                if(s.charAt(i)>=48&&s.charAt(i)<=57){
                    ret.append(s.charAt(i));
                }
            }
            System.out.println(ret);
        }
    }
}
