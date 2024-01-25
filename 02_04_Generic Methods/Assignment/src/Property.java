public class Property<X extends Comparable<X>> implements Inequality<X>{
    private X x;

    public Property(X x){
        this.x = x;
    }
    public Property(){
        this.x = null;
    }

    public X get(){
        return this.x;
    }

    public void set(X x){
        this.x = x;
    }
    @Override
    public boolean isGreaterthan(Property<X> other) {
        if (x.compareTo(other.x) == 1){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public boolean isLessthan(Property<X> other) {
        if (x.compareTo(other.x) == -1){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public boolean isEqual(Property<X> other) {
        if (x.compareTo(other.x) == 0){
            return true;
    }else{
        return false;
    }
    

}
    @Override
    public boolean isNotEqual(Property<X> other) {
        return !isEqual(other);
    }
    @Override
    public boolean isGreaterThanOrEqual(Property<X> other) {
        return !isGreaterthan(other) || !isEqual(other);
    }
    @Override
    public boolean isLessThanOrEqual(Property<X> other) {
        return !isLessthan(other) || !isEqual(other);
    }
}