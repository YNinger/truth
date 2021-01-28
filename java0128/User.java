package java0127;

import java0127.operation.IOperation;

abstract public class User {
    //User类不应该被实例化，实际的角色只有管理员和普通用户
    //做成抽象类，防止后边不小心对User实例化了，编译器就能给出报错提示
    //用来作为Admin和NormalUser的父类
    //存放两种角色的公共信息
    protected String name;
    protected IOperation[] operations;

    public abstract int menu();
    //这个方法用来打印用户的菜单
    //不同的用户支持的操作不一样，菜单内容也不一样
    //此处做成抽象方法，再由该类的子类来重写这个方法

    public void doOperation(int choice,BookList booklist){
        this.operations[choice-1].work(booklist);
//        IOperation operation = this.operations[choice];
////        operation.work(booklist);
    }
}
