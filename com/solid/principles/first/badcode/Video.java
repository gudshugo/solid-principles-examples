package com.solid.principles.first.badcode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
