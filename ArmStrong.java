public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter the number");
		Scanner in= new Scanner(System.in);
		int n=in.nextInt();
		
		int m=0; int rem;
		int temp = n;
		while(n>0){
			rem = n%10;
			n=n/10;
			m=m+(rem*rem*rem);
		}
		if(temp==m)
			System.out.println("number is Armstrong");
		else
			System.out.println("number is not Armstrong");
	}

}
