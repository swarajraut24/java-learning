package service;

public class AnalyzerService {

    public static int calculateScore(String ingredients) {

        int score = 100;

        if (ingredients == null) return 0;

        ingredients = ingredients.toLowerCase();

        if (ingredients.contains("sugar")) score -= 20;
        if (ingredients.contains("palm oil")) score -= 15;
        if (ingredients.contains("salt")) score -= 10;
        if (ingredients.contains("preservative")) score -= 10;

        if (ingredients.contains("fiber")) score += 5;
        if (ingredients.contains("protein")) score += 5;

        return Math.max(score, 0);
    }

    public static String getCategory(int score) {

        if (score >= 80) return "Healthy 🟢";
        else if (score >= 50) return "Moderate 🟡";
        else return "Unhealthy 🔴";
    }

    // Highlight ingredients
    public static String analyzeIngredients(String ingredients) {

        if (ingredients == null) return "No data";

        ingredients = ingredients.toLowerCase();

        String result = "";

        if (ingredients.contains("sugar"))
            result += "❌ Sugar (High Risk)<br>";

        if (ingredients.contains("palm oil"))
            result += "❌ Palm Oil (Bad Fat)<br>";

        if (ingredients.contains("salt"))
            result += "⚠ Salt (Moderate)<br>";

        if (ingredients.contains("fiber"))
            result += "✅ Fiber (Good)<br>";

        return result;
    }
}