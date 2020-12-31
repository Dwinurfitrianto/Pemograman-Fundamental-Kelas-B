import java.util.Scanner;

class JumlahBaris {
  public static void main(String[] args) {
    int i, j, m, n;
    int jumlahmatriks [][] = new int [10][10];
    int hasil [][] = new int [10][10];
    Scanner input = new Scanner(System.in);
    m = 5;
    n = 5;
    for (i=0; i < m; i++){
      for (j=0; j < n; j++){
        jumlahmatriks[i][j] = input.nextInt();
      }
    }
    
    System.out.println(jumlahmatriks[0][0] + jumlahmatriks [0][1] + jumlahmatriks [0][2] + jumlahmatriks [0][3] + jumlahmatriks [0][4] );
    System.out.println(jumlahmatriks[1][0] + jumlahmatriks [1][1] + jumlahmatriks [1][2] + jumlahmatriks [1][3] + jumlahmatriks [1][4] );
    System.out.println(jumlahmatriks[2][0] + jumlahmatriks [2][1] + jumlahmatriks [2][2] + jumlahmatriks [2][3] + jumlahmatriks [2][4] );
    System.out.println(jumlahmatriks[3][0] + jumlahmatriks [3][1] + jumlahmatriks [3][2] + jumlahmatriks [3][3] + jumlahmatriks [3][4] );
    System.out.println(jumlahmatriks[4][0] + jumlahmatriks [4][1] + jumlahmatriks [4][2] + jumlahmatriks [4][3] + jumlahmatriks [4][4] );
  }

}