public class object_classes {
    final int x =9; // the attribute become constant know it cannot be changed in main
    int y = 7;
    int z = x+y;
    public static void main(String[] args){
        object_classes addition = new object_classes();
        System.out.println(addition.z);
        object_classes myObj = new object_classes();
        System.out.println(myObj.z+4);
        array print = new array();
        System.out.println(print.copy);
    }
}
