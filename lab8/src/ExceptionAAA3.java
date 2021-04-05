public class ExceptionAAA3 extends Exception {
    public ExceptionAAA3() {
    }

    public void printStackTrace() {
        this.printStackTrace();
    }
    public String getMessage(){
        return "AAA3";
    }
    public String toString(){
        return "My String" + this.toString();
    }
}
