import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;

public class IngredientReader {

    String fileName;

    IngredientReader(String fileName) {
        this.fileName = fileName;
    }

    public ArrayList<Ingredient> parseIngredients() {

        ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String currentLine = bufferedReader.readLine();
            while(currentLine != null) {
                String readNum = "";
                Ingredient ingredient = new Ingredient();
                for (char c : currentLine.toCharArray()) {
                    int tracker = 0;

                    if (c >= 48 && c <= 57 || c == '.') {
                        readNum += c;
                    } else {
                        readNum = "";
                    }

                    switch(tracker) {
                        case 0 -> ingredient.setServingSize(Integer.parseInt(readNum));
                        case 1 ->ingredient.setCalories(Integer.parseInt(readNum));
                        case 2 -> ingredient.setTotalFat(Double.parseDouble(readNum));
                        case 3 -> ingredient.setSaturatedFat(Double.parseDouble(readNum));
                        case 4 -> ingredient.setTransfat(Integer.parseInt(readNum));
                        case 5 -> ingredient.setCholesterol(Integer.parseInt(readNum));
                        case 6 -> ingredient.setSodium(Integer.parseInt(readNum));
                        case 7 -> ingredient.setCarbohydrates(Integer.parseInt(readNum));
                        case 8 -> ingredient.setFibers(Integer.parseInt(readNum));
                        case 9 -> ingredient.setSugars(Integer.parseInt(readNum));
                        case 10 -> ingredient.setProtein(Integer.parseInt(readNum));
                        case 11 -> ingredient.setVitaminA(Integer.parseInt(readNum));
                        case 12 -> ingredient.setVitaminB(Integer.parseInt(readNum));
                        case 13 -> ingredient.setCalcium(Integer.parseInt(readNum));
                        case 14 -> ingredient.setIron(Integer.parseInt(readNum));
                    }
                }
                ingredients.add(ingredient);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ingredients;
    }


}
