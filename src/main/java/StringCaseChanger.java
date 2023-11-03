public class StringCaseChanger implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        StringBuilder str  = new StringBuilder("");
        String Text  = drink.getText();
        for (int i=0; i<Text.length(); i++) {
            char c = Text.charAt(i);
            if (Character.isLowerCase(c)){
                str.append(Character.toUpperCase(c));
            }else{
                str.append(Character.toLowerCase(c));
            }
        }
        drink.setText(str.toString());
    }
    @Override
    public void undo(StringDrink drink) {
        execute(drink);
    }
}