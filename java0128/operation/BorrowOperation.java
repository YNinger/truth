package java0127.operation;

import java0127.BookList;

public class BorrowOperation implements IOperation {
    //从BookList中借一本书
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅书籍");
    }
}
