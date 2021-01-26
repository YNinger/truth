package java0126;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

//public class test {
//}

//class Person{
//     String name = "Person";
//    int age=0;
//}
//class Child extends Person{
//    public String grade;
//    String name = "abc";
//    public static void main(String[] args){
//        Person p = new Child();
//        System.out.println(p.name);
//    }
//}

//class HasStatic {// 1
//    private static int x = 100;// 2
//    public static void main(String args[]) {// 3
//        HasStatic hsl = new HasStatic();// 4
//        hsl.x++;// 5
//        HasStatic hs2 = new HasStatic();// 6
//        hs2.x++;// 7
//        hsl = new HasStatic();// 8
//        hsl.x++;// 9
//        HasStatic.x--;// 10
//        System.out.println(" x=" + x);// 11
//    }
//}

class  Person {
    public  static  void  prt(String s) {
        System.out.println(s);
    }
    Person() {
        prt( "父类·无参数构造方法： " + "A Person." );
    } //构造方法(1)
    Person(String name) {
        prt( "父类·含一个参数的构造方法： " + "A person's name is "  + name);
    } //构造方法(2)
}

class  Chinese  extends  Person { 
    Chinese() {
        super ();  // 调用父类构造方法（1）
        prt( "子类·调用父类”无参数构造方法“： " + "A chinese coder." );
    }
    Chinese(String name) {
        super (name); // 调用父类具有相同形参的构造方法（2）
        prt( "子类·调用父类”含一个参数的构造方法“： " + "his name is "  + name);
    }
    Chinese(String name,  int  age) {
        this (name); // 调用具有相同形参的构造方法（3）
        prt( "子类：调用子类具有相同形参的构造方法：his age is "  + age);
    }
    public  static  void  main(String[] args) {
        Chinese cn =  new  Chinese();
        cn =  new  Chinese( "codersai" );
        cn =  new  Chinese( "codersai" ,  18 );
    }
}