package service;

public class RecommendationService {

    public static String getRecommendation(int score, double bmi) {

        if (score < 50 && bmi > 25) {
            return "⚠ Avoid this product. It may increase weight.";
        }

        if (score < 50) {
            return "❌ This product is not healthy. Limit consumption.";
        }

        if (bmi < 18.5) {
            return "✅ You can consume this. Try more protein-rich foods.";
        }

        if (bmi > 25) {
            return "⚠ Maintain diet. Avoid high sugar & fat foods.";
        }

        return "✅ Safe to consume in moderation.";
    }
}