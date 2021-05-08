package java210507;

public class Test {
    public String name = "abc";

    public static void main(String[] args) {
        Test test = new Test();
        Test test1 = new Test();
        System.out.println(test.equals(test1)+","+test.name.equals(test1.name));
    }
}
