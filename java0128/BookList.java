package java0127;

//通过这个类把多个Book对象给组织起来
public class BookList {
    private Book[] books = new Book[100];//书本的最大容量
    private int size = 0;//书本的个数

    public BookList(){//构造方法初始化数据，写死数据
        books[0] = new Book("三国演义","罗贯中",88.0,"古典小说");
        books[1] = new Book("西游记","吴承恩",100.0,"古典小说");
        books[2] = new Book("重生","东野圭吾",40.0,"悬疑小说");
        size = 3;
    }

    //针对其中一本书操作，对下标进行
    public Book getBook(int index){//index是数组下标
        return books[index];//获取这本书的信息
    }

    public void setBook(int index, Book book){
        books[index] = book;//？？
    }
    public int getSize(){
        return size;
    }
    public void setsize(int size){
        this.size = size;
    }
}
