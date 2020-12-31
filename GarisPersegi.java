import java.util.Scanner;

class GarisPersegis {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int simbol = input.nextInt() ;
    
    for(int i=1;i<=simbol;i++){
    for(int j=1;j<=simbol;j++)
    {  
    if((j==1||j==simbol)||(i==1||i==simbol))
    
      System.out.print("#");
      else
      System.out.print(" ");
      }
      System.out.println();
      }
    
    
  }
}