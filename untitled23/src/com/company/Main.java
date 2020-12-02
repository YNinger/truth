package com.company;

public class Main {

    public static void main1(String[] args) {
        // write your code here
        Car c = new Car("BMW", 200);
        c.Disp();
    }
}

class Car {
    String Brand;
    int Speed;

    Car(String Brands, int Speeds) {
        Brand = Brands;
        Speed = Speeds;
    }

    void Disp() {
        System.out.println("Brand is :" + Brand + "\t" + "Speed is :" + Speed);
    }



    public static void main(String[] args) {
        Bird bird=new Bird("燕子",2);
        Cat cat=new Cat("hellokity",1);
        cat.Eat();
        cat.Climb();
        bird.Eat();
        bird.Fly();

    }
}

 class Animal{
    String name;
    int age;
    Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    void Eat(){
        System.out.println(name+"正在吃");
        System.out.println(name+age+"岁了");
    }
}
 class Bird extends Animal{
    Bird(String name,int age){
        super(name,age);

    }
    void Fly(){
        System.out.println(name+"正在飞");
    }
}
 class Cat extends Animal{
    Cat(String name,int age){
        super(name,age);
    }
    void Climb(){
        System.out.println(name+"会爬树");
    }

}