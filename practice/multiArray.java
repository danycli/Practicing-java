public class multiArray{
    public static void main(String[] args){
        String [] names = {"Saad","Ahmed","Hayat"};
        String [] subject = {"Physics", "Math", "Biology"};
        int [][][] marks = {{{34,23,54},{67,89,29},{12,43,62}}};

        for(int i = 0; i<3; i++){
            System.out.println(names[i]);
            for(int j = 0; j<3; j++){
                System.out.print(subject[j]);
                for(int k = 0; k< 3; k++){
                    System.out.print(marks[i][k][i]);
                }
                System.out.println("\n");
            }
        }
    }
}