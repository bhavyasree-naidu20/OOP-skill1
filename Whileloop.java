package csit;
import java.util.Scanner;
public class Whileloop {
public static void main(String[] args) {
  int n,i=1;
  Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
  while( i<=n) {
  System.out.println("i=" +i);
  i++;
  }
}
}    