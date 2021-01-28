package java0127.operation;

import java0127.BookList;
//上面几种操作都有一个work方法，这个方法的参数都是BookList，返回值都是void
//这些操作都有共性，就可以把这些共性单独提取出来，做成一个接口
//只有方法是公共的使用接口，既有方法也有属性用继承
public interface IOperation {
    //接口
    void work(BookList bookList);
}
