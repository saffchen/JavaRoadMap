package jrm;

public class DataBase {
    public void connect(DbConnection dbConnection){
        System.out.println(dbConnection.getHost());
        System.out.println(dbConnection.getPort());
    }
}
