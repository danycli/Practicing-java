public class methods {
    static void function(){
        System.out.println("This should be done wisely");
    }
    static int doSomething(int num){
        if(num < 2){
            return num;
        }
        return doSomething(num-1) + doSomething(num -2);
    }
    public static void main(String[] args){
        function();
        int num = 6;
        for(int i = 0; i<=num; i++){
            System.out.println(doSomething(i));
        }
    }
}
