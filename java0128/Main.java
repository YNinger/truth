package java0127;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1.先准好书籍信息
        BookList bookList= new BookList();
        //2.创建用户（涉及登录过程）
        User user =login();//user引用指向了一个login的返回值（返回了User的实例）方法返回
        //3.进入主循环
        while(true){
            //此时的user是父类的引用，调用的meun是哪个版本的方法就看user指向哪个子类的实例
            //这就是多态，在这个场景中，调用者根本无需关注user到底是啥类型
            int choice=user.menu();
            //有了用户输入的选择后，需要根据这个选项执行对应的操作
            user.doOperation(choice,bookList);
        }
    }

    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的学号：");
        String name = scanner.next();
        System.out.println("请输入您的身份:1代表管理员；2代表普通用户");
        int who = scanner.nextInt();
        if(who==1){
            return new Admin(name);
        }
        return new NormalUser(name);
    }
}
