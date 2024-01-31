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
    public boolean isGreaterthan(X other) {
        if (x.compareTo(other) == 1){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public boolean isLessthan(X other) {
        if (x.compareTo(other) == -1){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public boolean isEqual(X other) {
        if (x.compareTo(other) == 0){
            return true;
    }else{
        return false;
    }
    

}
    @Override
    public boolean isGreaterthan(Property<X> other) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isGreaterthan'");
    }
    @Override
    public boolean isLessthan(Property<X> other) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isLessthan'");
    }
    @Override
    public boolean isEqual(Property<X> other) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEqual'");
    }
    @Override
    public boolean isNotEqual(Property<X> other) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isNotEqual'");
    }
    @Override
    public boolean isGreaterThanOrEqual(Property<X> other) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isGreaterThanOrEqual'");
    }
    @Override
    public boolean isLessThanOrEqual(Property<X> other) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isLessThanOrEqual'");
    }
}