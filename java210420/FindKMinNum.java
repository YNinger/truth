package java210420;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindKMinNum {
    //输出n个整数里最小的k个数。升序输出
    //输出n个整数里最小的k个数.升序输出
//    public static void main(String[] args) {
//
//        ArrayList<Integer> List = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//
//        //往顺序表里边添加
//        while (sc.hasNext()) {
//            int n = sc.nextInt();
//            List.add(n);
//        }
//        int k = List.get(List.size()-1);
//        List.remove(List.size()-1);
//        int[] arr = new int[List.size()];
//        for(int i =0;i<List.size();i++){
//            arr[i] = List.get(i);
//        }
//        Arrays.sort(arr);
//        for(int i =0;i<k;i++){
//            System.out.println(arr[i]+" ");
//        }


//        int []arr=new int[100];
//        while(sc.hasNext()){
//            for(int i =0;i<arr.length;i++){
//                arr[i] = sc.nextInt();
//            }
//        }
        //Arrays.sort();
        //System.out.println(arrayList);
//    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //输入一个字符串  1 2 3 4 5
        String strings = scanner.nextLine();
        String[] num = strings.split(" ");//用空格分隔

        int[] array = new int[num.length];
        for (int i = 0; i < array.length; i++){

            array[i] = Integer.valueOf(num[i]);//转成了int放到了数组中
            //System.out.print(array[i] + " ");

        }
        int k =array[array.length-1];
        int[] arr2 = new int[array.length-1];
        for(int i =0;i<arr2.length;i++){
            arr2[i] = array[i];
        }
        Arrays.sort(arr2);
        for(int i=0;i<k;i++){
            System.out.print(arr2[i]+" ");
        }
        //System.out.println(k);
//        Arrays.sort(array);
//        for(int i =0;i<k;i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println(Arrays.toString(array));


    }

}
