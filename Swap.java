
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	       System.out.println("enter the 1st number");
	       int x = input.nextInt();
	       System.out.println("enter the 2nd number");
	       int y = input.nextInt();
	       x=x+y;
	       y=x-y;
           x=x-y;
           System.out.println("after swapping x is"+ x);
           System.out.println("after swapping y is"+ y);           
	}

}