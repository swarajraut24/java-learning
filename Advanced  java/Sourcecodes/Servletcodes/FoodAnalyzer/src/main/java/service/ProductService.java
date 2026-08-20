package service;

import java.io.*;
import java.net.*;

import com.google.gson.*;

import model.Product;

public class ProductService {

    public static Product getProductByBarcode(String barcode) {

        Product product = new Product();

        try {
            URL url = new URL("https://world.openfoodfacts.org/api/v0/product/" + barcode + ".json");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream())
            );

            StringBuilder response = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                response.append(line);
            }

            br.close();

            // Parse JSON
            JsonObject json = JsonParser.parseString(response.toString()).getAsJsonObject();
            JsonObject p = json.getAsJsonObject("product");

            if (p != null) {

                product.setName(
                    p.has("product_name") ? p.get("product_name").getAsString() : "Unknown Product"
                );

                product.setIngredients(
                    p.has("ingredients_text") ? p.get("ingredients_text").getAsString() : "No ingredients available"
                );
            }

        } catch (Exception e) {
            product.setName("Product not found");
            product.setIngredients("No data available");
        }

        return product;
    }
}