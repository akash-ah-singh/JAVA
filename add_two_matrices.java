package Practice_Set_6;

public class add_two_matrices {
    public static void main(String[] args) {

        int[][] tabel1 ={{0,2,4},{1,3,5}};
        int[][] tabel2 = {{5,3,1},{4,2,0}};
        int[][] tabel3 = new int[2][3];

//        tabel1[0][0] = 0;
//        tabel1[0][1] = 2;
//        tabel1[0][2] = 4;
//        tabel1[1][0] = 1;
//        tabel1[1][1] = 3;
//        tabel1[1][2] = 5;
//
//        tabel2[0][0] = 5;
//        tabel2[0][1] = 3;
//        tabel2[0][2] = 1;
//        tabel2[1][0] = 4;
//        tabel2[1][1] = 2;
//        tabel2[1][2] = 0;

        for (int i = 0; i < tabel1.length; i++) {
            for (int j = 0; j < tabel1[i].length; j++) {
                tabel3[i][j]=tabel1[i][j]+tabel2[i][j];
                System.out.print(tabel3[i][j]+" ");


            }
            System.out.println("");
        }

    }
}