public class Main {
    public static void main(String[] args) {
        try{
            AAA ex=new AAA(null);
            ex.method(0);
        }
        catch (ExceptionAAA1 e){
            System.out.println(e.getMessage());
        }
        catch (ExceptionAAA2 e){
            System.out.println(e.getMessage());
        }
        catch(ExceptionAAA3 e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("The end");
        }
    }
}
