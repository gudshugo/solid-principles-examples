package src.main.principles.srp.bad;

import lombok.Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Hugo Gois
 */

/*
   Single Responsibility Principle case:
*  This is a good example of class with more than one responsibility.
*  It's a Video class with some attributes and two methods. The first one (getNumberOfHoursPlayed) is ok to be there
*  because it's a method that only calculates some value based on the class attributes.
*  However, the second method (persist) deals with database persistence, which is something that it's not related to the
*  class responsibility.
*  */

@Data
public class Video {

    private String title;
    private int time;
    private int likes;
    private int views;

    public double getNumberOfHoursPlayed() {
        return (time / 3600.0) * views;
    }

    public void persist(){

        String url = "jdbc:mysql://localhost:3306/youtube";
        String sql = "INSERT INTO Video (Title, Time, Likes, Views) VALUES ("+title + "," + time
                + "," + likes + "," + views + ")";
        String password = System.getProperty("password");

        try(Connection conn = DriverManager.getConnection(url, "root", password);
                Statement stmt = conn.createStatement()){
            stmt.execute(sql);
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

}
