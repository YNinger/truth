package java210415;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import java210408.BinarySearchTree;

//public class test {
//    private String name = "person";
//    int age =0;
//
//}
//
//class child extends test{
//    public String grade;
//
//    public static void main(String[] args) {
//        test p = new child();
//        System.out.println(p.name);
//    }
//}
//
//class Base{
//    public Base(String s){
//        System.out.println("B");
//    }
//
//}
//class Derived extends Base{
//
//    public Derived(String s) {
//        super(s);
//        System.out.println("D");
//    }
//
//    public static void main(String[] args) {
//        new Derived("C");
//    }
//}

class MyString{
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "he"+new String("llo");
        System.out.println(str1==str2);//==比较的是字符串的内存地址
        System.out.println(str1.equals(str2));//比大小
    }
}

