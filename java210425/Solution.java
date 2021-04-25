package java210425;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
//
//        Map map = new HashMap();
//        map.put("age",null);
//        map.put("name","jack");
//        System.out.println(map.size());

        //System.out.println(getValue(2));

        Thread t = new Thread(){
            public void run(){
                pong();
            }
        };
        t.run();
        System.out.println("ping");

    }

    public static int getValue(int i){
        int result =0;
        switch(i){
            case 1:
                result = result +i;
            case 2:
                result = result + i*2;
            case 3:
                result = result + i*3;
        }
        return result;
    }

    static void pong(){
        System.out.println("pong");
    }

}
