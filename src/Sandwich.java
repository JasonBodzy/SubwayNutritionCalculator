import java.util.ArrayList;

public class Sandwich {
    ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();

    public Sandwich() {
        this.ingredients = new ArrayList<Ingredient>();
    }

    public Sandwich(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
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
        return calories;
    }

    public double getTotalFat() {
        double fat = 0;
        for (Ingredient i : this.ingredients) {
            fat += i.getTotalFat();
        }
        return fat;
    }

    public double getTotalSaturatedFat() {
        double satfat = 0;
        for (Ingredient i : this.ingredients) {
            satfat += i.getSaturatedFat();
        }
        return satfat;
    }

    public int getTotalTransfat() {
        int transfat = 0;
        for (Ingredient i : this.ingredients) {
            transfat += i.getTransfat();
        }
        return transfat;
    }

    public int getTotalCholesterol() {
        int cholesterol = 0;
        for (Ingredient i : this.ingredients) {
            cholesterol += i.getCholesterol();
        }
        return cholesterol;
    }

    public int getTotalSodium() {
        int sodium = 0;
        for (Ingredient i : this.ingredients) {
            sodium += i.getSodium();
        }
        return sodium;
    }

    public int getTotalCarbohydrats() {
        int carbs = 0;
        for (Ingredient i : this.ingredients) {
            carbs += i.getCarbohydrates();
        }
        return carbs;
    }

    public int getTotalFibers() {
        int fibers = 0;
        for (Ingredient i : this.ingredients) {
            fibers += i.getFibers();
        }
        return fibers;
    }

    public int getTotalSugars() {
        int sugars = 0;
        for (Ingredient i : this.ingredients) {
            sugars += i.getSugars();
        }
        return sugars;
    }

    public int getTotalProtein() {
        int protein = 0;
        for (Ingredient i : this.ingredients) {
            protein += i.getProtein();
        }
        return protein;
    }


    public int getTotalVitaminA() {
        int vitaminA = 0;
        for (Ingredient i : this.ingredients) {
            vitaminA += i.getVitaminA();
        }
        return vitaminA;
    }

    public int getTotalVitaminB() {
        int vitaminB = 0;
        for (Ingredient i : this.ingredients) {
            vitaminB += i.getVitaminB();
        }
        return vitaminB;
    }

    public int getTotalCalcium() {
        int calcium = 0;
        for (Ingredient i : this.ingredients) {
            calcium += i.getCalcium();
        }
        return calcium;
    }

    public int getTotalIron() {
        int iron = 0;
        for (Ingredient i : this.ingredients) {
            iron += i.getIron();
        }
        return iron;
    }

}
