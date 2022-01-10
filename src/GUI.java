import java.util.ArrayList;

public class GUI {

    public static void main(String[] args) {
        IngredientReader ingredientReader = new IngredientReader("ingredients.txt");

        ArrayList<Ingredient> ingredients = ingredientReader.parseIngredients();

        for (Ingredient i : ingredients) {
            System.out.println(i.toString());
        }

        Sandwich sandwich = new Sandwich(false);
        String[] names = new String[]{"ArtisanItalian", "Olives", "Cucumbers", "Pickles", "Lettuce", "Turkey"};

        for (Ingredient i : ingredients) {
            for (String n : names)
                if (i.getName() != null) {
                    if (i.getName().contains(n)) {
                        sandwich.add(i);
                    }
                }

        }

        System.out.println(sandwich.getTotalCalories());

        System.out.println(sandwich.getTotalProtein());


    }
}
