package java210420;

public class test {
    static int count =9;
    static{
        count+=3;
    }

    public static void main(String[] args) {
        animals a = new animals();
        animals b = new pannda();
        animals c = new legs();
        System.out.println("count="+count);
    }
    static{
        count/=3;
    };
}

class animals{

}
class pannda extends animals{

}
class legs extends pannda{

}
