public class Arraya {
    public static void main(String[] args) {
        // int a[] = { 2, 3, 4 };
        // for(int i = 0; i<3; i++){
        // System.out.print(a[i]+" ");
        // }
        // int b[] = { 1, 4, 2 };
        // for (int i = 0; i < 3; i++) {
        //     System.out.print(a[i] + b[i] + " ");
        // }
        // int a[][] = {{2,3,4},{4,7,4}};
        // for(int i = 0; i<2; i++){
        //     for(int k = 0; k<3; k++){
        //         System.out.print(a[i][k]+" ");
        //     }
        //     System.out.println();
        // }
        // int z[][] = {{2,3,4},{4,7,4}};
        // int r[][] = {{3,2,7},{9,1,6}};
        // int t[][] = new int[2][3];
        // for(int i = 0; i<2; i++){
        //     for(int j=0; j<3; j++){
        //         t[i][j] = z[i][j] + r[i][j];
        //     }
        // }
        // for(int i = 0; i<2; i++){
        //     for(int k = 0; k<3; k++){
        //         System.out.print(t[i][k]+" ");
        //     }
        //     System.out.println();
        // }
        int v[][] = {{2,3,4},{4,7,4},{9,2,1}};
        int f[][] = {{3,2,7},{9,1,6},{8,5,3}};
        int e[][] = new int [3][3];

        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                for(int k = 0; k<3; k++){
                    e[i][j] += v[i][k] * f[k][j];
                }
            }
        }
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(e[i][j]+" ");
            }
            System.out.println();
        }
    }
}
