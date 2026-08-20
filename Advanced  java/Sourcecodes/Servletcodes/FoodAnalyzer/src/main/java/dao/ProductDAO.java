package dao;

import java.sql.*;
import db.DBConnection;
import model.Product;

public class ProductDAO {

    // SAVE PRODUCT (CACHE)
    public static void save(Product p, String barcode) {

        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO products(barcode,product_name,ingredients) VALUES(?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, barcode);
            ps.setString(2, p.getName());
            ps.setString(3, p.getIngredients());

            ps.executeUpdate();

        } catch (Exception e) {
            // ignore duplicate barcode
        }
    }

    // GET PRODUCT FROM DB
    public static Product getByBarcode(String barcode) {

        Product p = null;

        try {
            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM products WHERE barcode=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, barcode);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                p = new Product();

                p.setName(rs.getString("product_name"));
                p.setIngredients(rs.getString("ingredients"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return p;
    }
}