public class ExceptionAAA1 extends Exception {
    public ExceptionAAA1() {
    }

    public void printStackTrace() {
        super.printStackTrace();
    }
    public String getMessage(){
        return "AAA1";
    }
    public String toString(){
        return "My String" + this.toString();
    }
}
