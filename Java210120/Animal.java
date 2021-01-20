package Java210120;

public class Animal {
    public String name;
    public String food;
    public Animal(String name,String food){
        this.name=name;
        this.food=food;
    }
    public void eat(){
        System.out.println(name + "正在吃"+food );
    }
}
class Bird extends Animal{
    public Bird(String name,String food) {
        super(name,food);
    }

    public void fly(){
        System.out.println(name +"正在飞");
    }
        }
        class Dogs extends Animal{

            public Dogs(String name,String food) {
                super(name,food);
            }
            public void run(){
                System.out.println(name + "正在跑");
            }
        }
