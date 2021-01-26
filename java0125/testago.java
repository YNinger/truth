package java0125;

public class testago {
    public static void main(String[] args) {
        Cat cat = new Cat("啾咪");
        cat.fly("自由自在地");
        cat.eat("好吃的");
    }
}
class Animal{
    public String name;
    public Animal(String name){
        this.name=name;
    }
    public void eat(String food){
        System.out.println(this.name+"正在吃"+food);
    }
}
class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    public void fly(String 状态){
        System.out.println(this.name+"正在"+状态+"飞");
    }
}

