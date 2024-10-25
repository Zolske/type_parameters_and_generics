package generics;

public interface BoxOperations <V extends Number> {

    public abstract void setLargestValue(V num1, V num2);

    public abstract V getLargestValue();
}
