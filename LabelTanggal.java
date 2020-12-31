import java.util.Scanner;

class LabelTanggal {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[] bulan = {
                "Januari",
                "Februari",
                "Maret",
                "April",
                "Mei",
                "Juni",
                "Juli",
                "Agustus",
                "September",
                "Oktober",
                "November",
                "Desember",
    } ;
    
    int tanggal = input.nextInt();
    int nobulan = input.nextInt();
    int tahun = input.nextInt();
    
    System.out.print( tanggal  +  bulan [ nobulan - 1 ]  +  tahun );
    
  }
}