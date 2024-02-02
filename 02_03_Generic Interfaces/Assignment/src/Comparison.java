public interface Comparison<X extends Comparable<X>> {
    
    public boolean isGreaterthan(Property<X> other);

    public boolean isLessthan(Property<X> other);

    public boolean isEqual(Property<X> other);
}