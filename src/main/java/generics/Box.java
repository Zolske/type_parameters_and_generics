package generics;

public class Box<T, V extends Number> implements BoxOperations {
    private T genericAttribute;
    private V largestValue;

//    @Override
//    public void setLargestValue(V num1, V num2)  {
//        this.largestValue = num1.doubleValue() > num2.doubleValue() ? num1 : num2;
//    }


    @Override
    public void setLargestValue(Number num1, Number num2) {
        this.largestValue = num1.doubleValue() > num2.doubleValue() ? num1 : num2;
    }

    public V getLargestValue() {
        return largestValue;
    }

    public T getGenericAttribute() {
        return genericAttribute;
    }

    public void setGenericAttribute(T genericAttribute) {
        this.genericAttribute = genericAttribute;
    }

}
