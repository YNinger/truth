package java210525;

import java.util.Scanner;

public class AmericanDay {
    public static int[] num={31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int year = sc.nextInt();
            //1.一月一号元旦
            System.out.println(year+"-01-01");
            //2.一月的第三个星期一：马丁路德金纪念日
            startWeek(year,1,3,1);
            //3.二月的第三个星期一：总统日
            //4.五月的最后一个星期一：阵亡将士纪念日
            //5.七月四日：美国国庆
            System.out.println(year+"-07-04");
            //6.九月的第一个星期一：劳动节
            //7.十一月第四个星期四：感恩节
            //8.十二月二十五日：圣诞结
            System.out.println(year+"-12-25");
        }
    }

    public static void startWeek(int year, int i, int i1, int i2) {
    }
}
