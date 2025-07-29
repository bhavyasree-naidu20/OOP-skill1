package csit;
import java.util.Scanner;
public class Forloop {
public static void main(String[] args) {
  int n;
  Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
  for( int i=1;i<=n;i++) {
    System.out.println("Count :" +i);
  }
}
}