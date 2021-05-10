package java210509;

import java.util.Scanner;

public class Day18 {
    //题目：统计每个月兔子总数
    //有一只兔子，从出生后第3个月起每个月都生一只兔子，
    // 小兔子长到第三个月后每个月又生一只兔子，
    // 假如兔子都不死，问每个月的兔子总数为多少?
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int month = sc.nextInt();
            System.out.println(count(month));
        }
    }

    public static int count(int month) {
        if(month==0){
            return 0;
        }
        if(month==1|month==2){
            return 1;
        }
        return count(month-1)+count(month-2);
    }
}
