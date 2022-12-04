package com.solid.principles.first.good;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Hugo Gois
 */

/*
  ConnectionDAO class is a class responsible to deal with different connections attributes. So, we can deal with different types
  of databases connections using the createConnection() method. It was created to make the code more flexible and scalable. This
  removes even more responsibilities of the VideoDAO class.
 */

public class ConnectionDAO {
    private final String user;
    private final String password;
    private final String url;

    public ConnectionDAO(String user, String password, String url){
         this.user = user;
         this.password = password;
         this.url = url;
    }

    public Connection createConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

}
