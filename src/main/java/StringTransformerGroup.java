import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    private List<StringTransformer> transformers;
    public StringTransformerGroup(List<StringTransformer> transformers) {
        this.transformers = transformers;
    }
    public List<StringTransformer> getTransformers() {
        return transformers;
    }
    public void setTransformers(List<StringTransformer> transformers) {
        this.transformers = transformers;
    }
    @Override
    public void execute(StringDrink drink) {
        for (StringTransformer transformers : transformers) {
            transformers.execute(drink);
        }
    }
    @Override
    public void undo(StringDrink drink) {
        for (StringTransformer transformers : transformers) {
            transformers.execute(drink);
        }
    }
}