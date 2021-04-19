package java210419;

import com.sun.org.apache.xml.internal.utils.StringToIntTable;

import java.util.Stack;

public class strToint {
    //把字符串转换成整数
    public static int StrToInt(String str){
        if(str==null||str.length()==0){
            return 0;
        }

        //将字符串转化成字符数组
        char[] ch = str.toCharArray();
        int flag = 1;
        if(ch[0] =='-'){
            flag = -1;
        }
        int sum =0;
        for(int i= (ch[0]=='+'||ch[0]=='-'?1:0);i<ch.length;i++){
            if(ch[i]<'0'||ch[i]>'9'){
                return 0;
            }else{
                //计算每一个值
                sum = sum*10+ch[i]-'0';
            }
        }
        return sum*flag;
    }

    public static void main(String[] args) {
        String arr = "0";
        StrToInt(arr);
    }
}
