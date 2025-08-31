public class staticMethod{
    static void myMethod(){
        System.out.println("Hi how are you!");
    }
    static void java(int num){
        System.out.println("This is not a number "+num);
    }
    static void google(String name){
        System.out.println("Why the fuck you are not swiming "+name);
    }
    public static void main(String[] args){
        myMethod();
        java(5);
        google("Talha");
    }
}