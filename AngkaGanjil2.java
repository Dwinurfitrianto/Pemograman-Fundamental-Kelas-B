import java.util.Scanner;

class AngkaGanjil2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();
    int matriks[][] = new int [a][b];
    
    for (int baris = 0; baris < a; baris++){
      for (int kolom = 0; kolom < b; kolom++){
      matriks[baris][kolom] = input.nextInt();
        }
      }
      int ganjil = 0;
      for (int baris = 0; baris < a; baris++){
        for (int kolom = 0; kolom < b; kolom++){
          if(matriks[baris][kolom]%2!=0){
            ganjil++;
          }
        }
      System.out.println(ganjil);
      ganjil = 0;
    }
    
  }
}