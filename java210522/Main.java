package java210522;
import java.util.Scanner;
public class Main {
    //找假币
    //居然有假币!现在猪肉涨了，但是农民的工资却不见涨啊，
    // 没钱怎么买猪肉啊。nowcoder这就去买猪肉，结果找来的零钱中有假币
    // 可惜nowcoder一不小心把它混进了一堆真币里面去了。
    // 只知道假币的重量比真币的质量要轻，给你一个天平(天平两端能容纳无限个硬币)，
    // 请用最快的时间把那个可恶的假币找出来。
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int coinNums = sc.nextInt();
        culcion1(coinNums,sc);
        coincoin2(coinNums,sc);
    }

    public static void culcion1(int coinNums,Scanner sc) {
        while (sc.hasNext()) {
            if(coinNums==0){
                break;
            }
            int count =0;
            while(coinNums != 1){
                if(coinNums%3==0){
                    coinNums/=3;
                    count++;
                }else{
                    coinNums = coinNums/3+1;
                    count++;
                }
            }
            System.out.println(count);
            coinNums = sc.nextInt();
        }
    }

    public static int coincoin2(int coinNums, Scanner sc) {
            if(coinNums==0){
                return 0;
            }
            if(coinNums<=3){
                return 1;
            }
            return coincoin2((coinNums+2)/3+1,sc);
    }
}
