 package dao;

import java.sql.*;
import java.util.*;

import db.DBConnection;
import model.History;

public class HistoryDAO {

    // SAVE SCAN HISTORY
    public static void save(int userId, String name, String barcode, int score, String category, String recommendation) {

        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO history(user_id,product_name,barcode,score,category,recommendation) VALUES(?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, userId);
            ps.setString(2, name);
            ps.setString(3, barcode);
            ps.setInt(4, score);
            ps.setString(5, category);
            ps.setString(6, recommendation);

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // GET USER HISTORY
    public static List<History> getHistoryByUser(int userId) {

        List<History> list = new ArrayList<>();

        try {
            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM history WHERE user_id=? ORDER BY scan_date DESC";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, userId);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                History h = new History();

                h.setId(rs.getInt("id"));
                h.setUserId(rs.getInt("user_id"));
                h.setProductName(rs.getString("product_name"));
                h.setBarcode(rs.getString("barcode"));
                h.setScore(rs.getInt("score"));
                h.setCategory(rs.getString("category"));
                h.setDate(rs.getTimestamp("scan_date"));

                list.add(h);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}