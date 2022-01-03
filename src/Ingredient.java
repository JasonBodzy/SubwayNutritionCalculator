public class Ingredient {
    private int servingSize;
    private int calories;
    private double totalFat;
    private double saturatedFat;
    private int transfat;
    private int cholesterol;
    private int sodium;
    private int carbohydrates;
    private int fibers;
    private int sugars;
    private int protein;
    private int vitaminA;
    private int vitaminB;
    private int calcium;
    private int iron;

    public Ingredient(int servingSize, int calories, double totalFat, double saturatedFat, int transfat,
                      int cholesterol, int sodium, int carbohydrates, int fibers, int sugars, int protein, int vitaminA,
                      int vitaminB, int calcium, int iron) {
        this.servingSize = servingSize;
        this.calories = calories;
        this.totalFat = totalFat;
        this.saturatedFat = saturatedFat;
        this.transfat = transfat;
        this.cholesterol = cholesterol;
        this.sodium = sodium;
        this.carbohydrates = carbohydrates;
        this.fibers = fibers;
        this.sugars = sugars;
        this.protein = protein;
        this.vitaminA = vitaminA;
        this.vitaminB = vitaminB;
        this.calcium = calcium;
        this.iron = iron;
    }

    public int getServingSize() {
        return servingSize;
    }

    public int getCalories() {
        return calories;
    }

    public double getTotalFat() {
        return totalFat;
    }

    public double getSaturatedFat() {
        return saturatedFat;
    }

    public int getTransfat() {
        return transfat;
    }

    public int getCholesterol() {
        return cholesterol;
    }

    public int getSodium() {
        return sodium;
    }

    public int getCarbohydrates() {
        return carbohydrates;
    }

    public int getFibers() {
        return fibers;
    }

    public int getSugars() {
        return sugars;
    }

    public int getProtein() {
        return protein;
    }

    public int getVitaminA() {
        return vitaminA;
    }

    public int getVitaminB() {
        return vitaminB;
    }

    public int getCalcium() {
        return calcium;
    }

    public int getIron() {
        return iron;
    }
}
