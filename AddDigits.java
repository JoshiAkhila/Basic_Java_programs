public class AddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number");
		Scanner scan = new Scanner(System.in);
		int in=scan.nextInt();
		int sum=0,rem=0;
		int temp=in;
		while(in>0){
			rem=in%10;
			sum=sum+rem;
			in=in/10;
		}
		System.out.println(sum);
	}

}
