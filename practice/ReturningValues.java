public class ReturningValues {
    static int rule(int sum){
        if(sum>30){
            return 300;
        }else{
            return 400;
        }
    }
    static String freak(String ambush){
        if(ambush == "Learning"){
            return "Shut the fuck up";
        }else{
            return "Good for now!";
        }
    }
    public static void main(String[] args){
        System.out.println("The price of the condoms is "+rule(45));
        System.out.println("The price of the condoms is "+rule(23));
        System.out.println(freak("Learning"));
        System.out.println(freak("Free"));
    }
}
