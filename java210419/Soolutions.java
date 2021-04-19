package java210419;

public class Soolutions {
    public static void main(String[] args) {
        //==的优先级高于?:,先执行后边的?
        boolean a = true?false:true == true?false:true;
        System.out.println(a);
    }
}
