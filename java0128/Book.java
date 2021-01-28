package java0127;

//Book用来表示一本所属的信息
//这些信息通过Book类的属性来表示
public class Book {
    //能用private尽量用private，封装
    private String name;
    private String author;
    private Double price;
    private String type;
    private boolean isborrowed = false;

    //使用构造方法针对私有成员进行初始化

    public Book(String name, String author, Double price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }
}
