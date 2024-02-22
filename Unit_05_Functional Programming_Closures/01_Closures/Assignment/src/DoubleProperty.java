public class DoubleProperty {

    public static DoubleProperty of(Double value){
        return new DoubleProperty(value);
    }

    private Double value;

    private DoubleProperty(Double value) {
        this.value = value;
    }

    public Double get() {
        return value;
    }

    public void set(Double value) {
        this.value = value;
    }

    public DoubleProperty plus(DoubleProperty value) {
        this.value += value.get();
        return this;
    }

    public DoubleProperty minus(DoubleProperty value) {
        this.value -= value.get();
        return this;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

}