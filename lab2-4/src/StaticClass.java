public class StaticClass {
    public static int staticElem = 10;
    public static void getBigStaticElem(){
        while(staticElem<100){
            staticElem+=10;
        }
        System.out.println("The biggest static element is "+ staticElem);
    }
}
