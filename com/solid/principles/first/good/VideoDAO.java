package com.solid.principles.first.good;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Hugo Gois
 */

/*
  In order to achieve the Single Responsibility Principle, it was created a Video Data Access Object (DAO) to deal with
  persistence operations related to the Video class.
 */

public class VideoDAO {
   private static final String URL = "jdbc:mysql://localhost:3306/youtube";

   public void persist(Video video) throws SQLException {

        try(Connection conn = new ConnectionDAO("root", System.getProperty("password"), URL).createConnection();
                Statement stmt = conn.createStatement()){
            String sql = "INSERT INTO Video (Title, Time, Likes, Views) VALUES ("+ video.getTitle() + "," + video.getTime()
                    + "," + video.getLikes() + "," + video.getViews() + ")";
            stmt.execute(sql);
        }catch (SQLException e){
            e.printStackTrace();
        }

    }

}
