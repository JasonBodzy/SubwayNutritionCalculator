import java.util.ArrayList;

public class Sandwich {
    ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
    Boolean isFootlong = false;

    public Sandwich(Boolean isFootlong) {
        this.ingredients = new ArrayList<Ingredient>();
        this.isFootlong = isFootlong;
    }

    public ArrayList<Ingredient> getIngredients() {
        return this.ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public int getTotalCalories() {
        int calories = 0;
        for (Ingredient i : this.ingredients) {
            calories += i.getCalories();
        }
        if (isFootlong) {
            return  calories * 2;
        }
        return calories;
    }

    public double getTotalFat() {
        double fat = 0;
        for (Ingredient i : this.ingredients) {
            fat += i.getTotalFat();
        }
        if (isFootlong) {
            return  fat * 2;
        }
        return fat;
    }

    public double getTotalSaturatedFat() {
        double satfat = 0;
        for (Ingredient i : this.ingredients) {
            satfat += i.getSaturatedFat();
        }
        if (isFootlong) {
            return  satfat * 2;
        }
        return satfat;
    }

    public int getTotalTransfat() {
        int transfat = 0;
        for (Ingredient i : this.ingredients) {
            transfat += i.getTransfat();
        }
        if (isFootlong) {
            return  transfat * 2;
        }
        return transfat;
    }

    public int getTotalCholesterol() {
        int cholesterol = 0;
        for (Ingredient i : this.ingredients) {
            cholesterol += i.getCholesterol();
        }
        if (isFootlong) {
            return  cholesterol * 2;
        }
        return cholesterol;
    }

    public int getTotalSodium() {
        int sodium = 0;
        for (Ingredient i : this.ingredients) {
            sodium += i.getSodium();
        }
        if (isFootlong) {
            return  sodium * 2;
        }
        return sodium;
    }

    public int getTotalCarbohydrats() {
        int carbs = 0;
        for (Ingredient i : this.ingredients) {
            carbs += i.getCarbohydrates();
        }
        if (isFootlong) {
            return  carbs * 2;
        }
        return carbs;
    }

    public int getTotalFibers() {
        int fibers = 0;
        for (Ingredient i : this.ingredients) {
            fibers += i.getFibers();
        }
        if (isFootlong) {
            return  fibers * 2;
        }
        return fibers;
    }

    public int getTotalSugars() {
        int sugars = 0;
        for (Ingredient i : this.ingredients) {
            sugars += i.getSugars();
        }
        if (isFootlong) {
            return  sugars * 2;
        }
        return sugars;
    }

    public int getTotalProtein() {
        int protein = 0;
        for (Ingredient i : this.ingredients) {
            protein += i.getProtein();
        }
        if (isFootlong) {
            return  protein * 2;
        }
        return protein;
    }


    public int getTotalVitaminA() {
        int vitaminA = 0;
        for (Ingredient i : this.ingredients) {
            vitaminA += i.getVitaminA();
        }
        if (isFootlong) {
            return  vitaminA * 2;
        }
        return vitaminA;
    }

    public int getTotalVitaminB() {
        int vitaminB = 0;
        for (Ingredient i : this.ingredients) {
            vitaminB += i.getVitaminB();
        }
        if (isFootlong) {
            return  vitaminB * 2;
        }
        return vitaminB;
    }

    public int getTotalCalcium() {
        int calcium = 0;
        for (Ingredient i : this.ingredients) {
            calcium += i.getCalcium();
        }
        if (isFootlong) {
            return  calcium * 2;
        }
        return calcium;
    }

    public int getTotalIron() {
        int iron = 0;
        for (Ingredient i : this.ingredients) {
            iron += i.getIron();
        }
        if (isFootlong) {
            return  iron * 2;
        }
        return iron;
    }

}
