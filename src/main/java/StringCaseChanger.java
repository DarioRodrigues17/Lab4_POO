public class StringCaseChanger implements StringTransformer {
    @Override
    public void execute(StringDrink drink) {

        String text = drink.getText();

        StringBuilder newText = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (Character.isLowerCase(c)) {
                newText.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                newText.append(Character.toLowerCase(c));
            } else {
                newText.append(c);
            }
        }
        drink.setText(newText.toString());
    }
}