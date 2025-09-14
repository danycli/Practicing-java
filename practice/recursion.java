public class recursion {
    static int fib(int num){
        if(num <= 1){
            return num;
        }
        return fib(num-1) + fib(num-2);
    }
    public static void main(String[] args){
        int a = 9;
        System.out.println(fib(a));
        for(int i=1; i<=a; i++){
            System.out.print(fib(i)+" ");
        }
    }
}
