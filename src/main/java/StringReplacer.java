public class StringReplacer implements StringTransformer{
    private char oldchar;
    private char newchar;
    public StringReplacer(char oldchar, char newchar) {
        this.oldchar = oldchar;
        this.newchar = newchar;
    }
    @Override
    public void execute(StringDrink drink) {
        drink.setText(drink.getText().replace(this.oldchar, this.newchar));
    }
    @Override
    public void undo(StringDrink drink) {
        drink.setText(drink.getText().replace(this.newchar, this.oldchar));
    }
}