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
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ingredient() {

    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setTotalFat(double totalFat) {
        this.totalFat = totalFat;
    }

    public void setSaturatedFat(double saturatedFat) {
        this.saturatedFat = saturatedFat;
    }

    public void setTransfat(int transfat) {
        this.transfat = transfat;
    }

    public void setCholesterol(int cholesterol) {
        this.cholesterol = cholesterol;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrates(int carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public void setFibers(int fibers) {
        this.fibers = fibers;
    }

    public void setSugars(int sugars) {
        this.sugars = sugars;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }

    public void setVitaminA(int vitaminA) {
        this.vitaminA = vitaminA;
    }

    public void setVitaminB(int vitaminB) {
        this.vitaminB = vitaminB;
    }

    public void setCalcium(int calcium) {
        this.calcium = calcium;
    }

    public void setIron(int iron) {
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

    @Override
    public String toString() {
        return "Ingredient{" +
                "servingSize=" + servingSize +
                ", calories=" + calories +
                ", totalFat=" + totalFat +
                ", saturatedFat=" + saturatedFat +
                ", transfat=" + transfat +
                ", cholesterol=" + cholesterol +
                ", sodium=" + sodium +
                ", carbohydrates=" + carbohydrates +
                ", fibers=" + fibers +
                ", sugars=" + sugars +
                ", protein=" + protein +
                ", vitaminA=" + vitaminA +
                ", vitaminB=" + vitaminB +
                ", calcium=" + calcium +
                ", iron=" + iron +
                ", name='" + name + '\'' +
                '}';
    }
}
