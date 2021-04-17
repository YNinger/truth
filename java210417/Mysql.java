package java210417;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class Mysql {


}
class newmysql{
    public static void main(String[] args) {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("6666");
    }
}
