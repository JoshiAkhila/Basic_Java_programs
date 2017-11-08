public class Palindome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.out.print("Enter the string");
		Scanner name = new Scanner(System.in);
		int n = name.nextInt();	
		series(n);
	}

	private static void series(int n) {
		// TODO Auto-generated method 
		int rem =0; int sum=0; int temp;
		temp=n;
		while(n>0){
			rem = n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		if(sum==temp){
			System.out.print("Palindrome");	
		}
		else System.out.print("not Palindrome");
	}

}
