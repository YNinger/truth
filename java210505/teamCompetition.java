package java210505;

import java.util.Arrays;
import java.util.Scanner;

public class teamCompetition {
    //队伍的水平值等于该队伍队员中第二高水平值，为了所有队伍的水平值总和最大的解法，
    //也就是说每个队伍的第二个值是尽可能大的值。
    //所以实际值把最大值放到最右边，最小是放到最左边。
    //【组队竞赛】牛牛举办了一次编程比赛,参加比赛的有3*n个选手,每个选手都有一个水平值a_i.
    // 现在要将这些选手进行组队,一共组成n个队伍,即每个队伍3人.牛牛发现
    //队伍的水平值等于该队伍队员中第二高水平值。
    //例如:
    //一个队伍三个队员的水平值分别是3,3,3.那么队伍的水平值是3
    //一个队伍三个队员的水平值分别是3,2,3.那么队伍的水平值是3
    //一个队伍三个队员的水平值分别是1,5,2.那么队伍的水平值是2
    //为了让比赛更有看点,牛牛想安排队伍使所有队伍的水平值总和最大。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[3*n];

        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int sum =0;
        for(int i =0;i<n;i++){
            sum += arr[arr.length-2*(i+1)];
        }
        System.out.println(sum);
    }
}
