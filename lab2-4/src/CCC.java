public class CCC {
    public int x;
    private int y;

    public int getY() {
        return y;
    }

    public CCC(){
        x=0;
        y=0;
    }
    public CCC(int x, int y){
        this.x=x;
        this.y=y;
    }
    public int sum(){
        return x+y;
    }
    public static int sub(int a, int b){
        return a-b;
    }
}
