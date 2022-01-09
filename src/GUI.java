import java.util.ArrayList;

public class GUI {

    public static void main(String[] args) {
        IngredientReader ingredientReader = new IngredientReader("ingredients.txt");

        ArrayList<Ingredient> ingredients = ingredientReader.parseIngredients();

        for (Ingredient i : ingredients) {
            System.out.println(i.toString());
        }

        Sandwich sandwich = new Sandwich(false);

    }
}
