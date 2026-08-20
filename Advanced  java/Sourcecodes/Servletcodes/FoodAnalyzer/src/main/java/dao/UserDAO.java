package dao;

import java.sql.*;
import db.DBConnection;
import model.User;

public class UserDAO {

    // REGISTER USER
    public static boolean register(User u) {
        boolean status = false;

        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO users(name,email,password,weight,height) VALUES(?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, u.getName());
            ps.setString(2, u.getEmail());
            ps.setString(3, u.getPassword());
            ps.setDouble(4, u.getWeight());
            ps.setDouble(5, u.getHeight());

            int rows = ps.executeUpdate();

            if (rows > 0) status = true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    // LOGIN USER
    public static User login(String email, String password) {

        User user = null;

        try {
            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM users WHERE email=? AND password=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                user = new User();

                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setWeight(rs.getDouble("weight"));
                user.setHeight(rs.getDouble("height"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }
}