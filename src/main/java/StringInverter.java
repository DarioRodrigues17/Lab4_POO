public class StringInverter implements StringTransformer {
    @Override
    public void execute(StringDrink drink) {

        String text = drink.getText();

        StringBuilder reversedText = new StringBuilder(text).reverse();

        drink.setText(reversedText.toString());
    }
}
