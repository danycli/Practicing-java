public class array {
    String copy = "You coppied from Array";
    public static void main(String[] args){
        String [] myNum = {"Dani","PC", "580"};
        System.out.println(myNum[0]);
        int [][] nums = {{2,3},{5,7}};
        for(int i = 0; i<2; i++){
            for(int j = 0; j<2; j++){
                System.out.print(nums[j][i]);
            }
            System.out.print("\n");
        }
    }
}
