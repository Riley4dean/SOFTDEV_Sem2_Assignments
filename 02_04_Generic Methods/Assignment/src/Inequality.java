public interface Inequality<X extends Comparable<X>> {
    
    public boolean isGreaterthan(Property<X> other);

    public boolean isLessthan(Property<X> other);

    public boolean isEqual(Property<X> other);

    public boolean isNotEqual(Property<X> other);

    public boolean isGreaterThanOrEqual(Property<X> other);

    public boolean isLessThanOrEqual(Property<X> other);
    
}
