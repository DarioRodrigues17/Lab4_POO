public class StringReplacer implements StringTransformer {
    private char targetChar;
    private char replacementChar;

    public StringReplacer(char targetChar, char replacementChar) {
        this.targetChar = targetChar;
        this.replacementChar = replacementChar;
    }

    @Override
    public void execute(StringDrink drink) {
        String text = drink.getText();

        String replacedText = text.replace(targetChar, replacementChar);

        drink.setText(replacedText);
    }
}
