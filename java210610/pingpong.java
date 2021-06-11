package java210610;

import java.util.ArrayList;
import java.util.Scanner;

public class pingpong {
    //乒乓球筐
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String a = sc.next();
            String b = sc.next();
            ArrayList<Character> arrayLista = new ArrayList<>();
            ArrayList<Character> arrayListb = new ArrayList<>();
            //把字符串里边的字符拆分并放入顺序表中
            for (int i = 0; i <a.length() ; i++) {
                arrayLista.add(a.charAt(i));
            }
            for (int i = 0; i <b.length() ; i++) {
                arrayListb.add(b.charAt(i));
            }
            for (int i = 0; i <arrayListb.size() ; i++) {
                //如果顺序表a中含有顺序表b中的第一个元素（字符）
                //将顺序表中该相同的元素remove移除掉
                if (arrayLista.contains(arrayListb.get(i))){
                    //要删除顺序表a中的元素需要get找到顺序表a需要移除的字符，
                    //进而要取到这个字符首先需要需要这个字符的下标，通过b这个字符串getdao这个字符是啥
                    //对顺序表a不能直接arrayLista.remove(arrayListb.get(i)),因为当b的长度大于a时会造成数组越界
                    //先获取要删除的这个元素的下标，再通过下标get到这个顺序表中的元素，最后删除，能够保证该元素不会数组越界
                    arrayLista.remove(arrayLista.get(arrayLista.indexOf(arrayListb.get(i))));
                    arrayListb.remove(arrayListb.get(i));
                    //对remove的每一个字符中的顺序表b减少一个单位
                    i--;
                }
            }
            //当对顺序表b遍历完之后，如果顺序表b还有剩余
            //则说明b要么有a中不存在的字符或者b中相同的字符多余a
            if(arrayListb.size()==0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            //一次循环结束将顺序表置空
            arrayLista=null;
            arrayListb=null;
        }
    }
}
