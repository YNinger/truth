package java210427;

import java.util.ArrayList;
import java.util.Scanner;

public class biancheng {

    //参数解析
        public static void main(String args[]) {

            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            ArrayList as = Func(s);
            System.out.println(as.size());
            for (int i = 0; i < as.size(); i++) {
                System.out.println(as.get(i));
            }

        }
        public static ArrayList Func(String s) {
            ArrayList re = new ArrayList();
            char[] c = s.toCharArray();
            boolean flag = true;
            int i = 0;
            while (flag) {
                if (c[i] == '"') {
                    StringBuilder sd = new StringBuilder();
                    i++;
                    while (true) {
                        sd.append(c[i]);
                        i++;
                        if (c[i] == '"') {
                            re.add(sd);
                            i++;
                            break;
                        }
                    }
                } else {
                    StringBuilder sdd = new StringBuilder();
                    while (true) {
                        sdd.append(c[i]);
                        i++;
                        if (c[i] == ' ') {
                            re.add(sdd);
                            i++;
                            break;
                        }
                    }
                }
                if (i == c.length) {
                    flag = false;
                }
            }
            return re;
        }

        //

}
