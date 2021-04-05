public class ExceptionAAA2 extends Exception {
    public ExceptionAAA2() {
    }

    public void printStackTrace() {
        this.printStackTrace();
    }
    public String getMessage(){
        return "AAA2";
    }
    public String toString(){
        return "My String" + this.toString();
    }
}
