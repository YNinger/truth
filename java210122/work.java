package java210122;

public class work {
    public static void main(String[] args) {
        B a = new B();
        B b = new D();//向上转型
        a.Func();
        b.Func();
    }
}
class B {
    public int Func() {
        System.out.print("B");
        return 0;
    }
}
class D extends B {
    @Override//子类对父类的方法重写的注释
    public int Func() {//方法重写
        System.out.print("D");
        return 0;
    }
}

class Example{
    String str = new String("good");
    char[ ] ch = { 'a' , 'b' , 'c' };
    public static void main(String args[]){
        Example ex = new Example();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str + " and ");
        System.out.print(ex.ch);
    }
    public void change(String str,char ch[ ]){
        str = "test ok";//字符串不能被修改
        ch[0] = 'g';
    }
}

class SystemUtil{
    public static boolean isAdmin(String userId){
        return userId.toLowerCase()=="admin";//userId.toLowerCase()将字符串转为小写
    }
    public static void main(String[] args){
        System.out.println(isAdmin("Admin"));
    }
}