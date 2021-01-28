package java0127.operation;

import java0127.BookList;

//往BookList中新增一本书
public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        //里边实现具体的新增操作
        System.out.println("新增书籍");
    }
}
