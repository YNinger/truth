package java210609;

public class testCode {
    public static void main(String[] args) {
        String s = "I am a student";

//        s="";
//        s+="da";
        String[]string = s.split(" ");
//        System.out.println(s);
        System.out.println(string.length);
        for (int i = 0; i <string.length; i++) {
            System.out.print(string[i]);
        }
    }
}
