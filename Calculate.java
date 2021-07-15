import java.util.Scanner;

class Calculate{  
  static int cube(int x){  
  return x*x*x;  
  }  
  
  public static void main(String args[]){  
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter no to find cube:");
	  int n=sc.nextInt();
  int result=Calculate.cube(n);  
  System.out.println("Cube is: "+result);  
  }  
}  