package java210525;
import java.util.*;
public class TaobaoStore{
    public static final int[] arr = {31*2,28,31,30*2,31,30*2,31,31*2,30*2,31*2,30,31*2};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int year1 = sc.nextInt();
            int month1 = sc.nextInt();
            int day1 = sc.nextInt();
            int year2 = sc.nextInt();
            int month2 = sc.nextInt();
            int day2 = sc.nextInt();
            int ret =0;
            //用来判断是不是闰年
            //如果是不同一年时
            //该部分粗略的计算从year1到year2
            for(int i =year1;i<year2;i++){
                //对每年的每个月进行循环遍历
                //如果该年是闰年，则二月份为29天
                //不然二月份则为正常的28天
                //且二月为素数，一天一元
                for(int j =0;j<12;j++){
                    if(j==1 && isleapYear(i)){
                        ret+=29;
                    }else{
                        ret+=arr[j];
                    }
                }
            }
            //对月份
            for(int i = month1-1;i<month2-1;i++){
                if(i==1 && isleapYear(year2)){
                    ret+=29;
                }else {
                    ret+=arr[i];
                }
            }
            //日
            if(month2==2||month2==3||month2==5||month2==7||month2==11){
                ret+=day2-day1+1;
            }else {
                ret+=2*(day2-day1+1);
            }
            System.out.println(ret);
        }
    }

    public static boolean isleapYear(int year) {
        //判断是闰年
        return(year%4==0&&year%100!=0||year%400==0);
    }
}
