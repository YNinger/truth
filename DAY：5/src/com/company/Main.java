package com.company;

public class Main {

//    public static void main(String[] args) {
//	// write your code here
//
//        Bird bird =new Bird("mimi");
//        bird.eat("稻子");
//        bird.fly();
//        Elephant elephant = new Elephant("jack");
//        elephant.eat("banana");
//    }
}
class Animal{

    String name;

    private void empty(){
        System.out.println("私有的不能被继承");
    }
    public Animal(String name) {
        this.name=name;
    }


    public void eat(String food){
        System.out.println(name+"正在吃"+food);
    }

    public static void main(String[] args) {
        Animal animal = new Animal("动物");
        animal.empty();//当私有的方法只能在该作用域里边才能进行调用，main函数得在该类里边
    }
}
class Bird extends Animal{
    public Bird(String name){
        super(name);
    }
    public void fly(){
        System.out.println(name+"正在飞");
    }
}
class Elephant extends Animal{
    public Elephant(String name){
        super(name);
    }
}
