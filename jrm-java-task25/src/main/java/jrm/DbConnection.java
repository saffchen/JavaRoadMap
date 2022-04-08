package jrm;

public class DbConnection {
   private String host;
   private String port;

    public String getHost() {
        return host;
    }

    public String getPort() {
        return port;
    }

    public DbConnection(String host, String port){
        this.host = host;
        this.port = port;
    }

    public DbConnection(){
        this.host = "localHost";
        this.port = "8080";
    }
}
