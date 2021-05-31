package java210531;

import java.util.Scanner;

public class libraryConnection {
    //数据库连接池
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int count =0;
            int max =0;
            int n = sc.nextInt();
            for (int i = 0; i <n ; i++) {
                String id = sc.next();
                String operation = sc.next();
                if (operation.equals("connect")){
                    count++;
                    if(count>=max){
                        max=count;
                    }
                }else if (operation.equals("disconnect")){
                    count--;
                }
            }
            System.out.println(max);
        }
    }
}
