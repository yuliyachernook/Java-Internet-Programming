public class DDD extends CCC {
    public int x;
    private int y;

    public DDD(){
        super();
        this.x=1;
        this.y=1;
    }
    public DDD(int x, int y){
        super(x, y);
        this.x=x;
        this.y=y;
    }
    public int sum(){
        int a=super.sum();
        return this.y+this.x+a;
    }
    public int calc(){
        int a=super.x*super.getY();
        int b=this.y*this.x;
        return a+b;
    }
}