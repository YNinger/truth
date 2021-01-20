package Java210120;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird("杜鹃","虫子");
        Dogs dogs = new Dogs("高迪","肉");
        bird.eat();
        bird.fly();
        dogs.eat();
        dogs.run();
    }
}
