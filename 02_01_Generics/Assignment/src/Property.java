public class Property<X> {
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
    

}
