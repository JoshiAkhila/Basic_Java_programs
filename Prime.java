public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.print("Emter the number");   
		Scanner Scan=new Scanner(System.in);
		int n= Scan.nextInt();
		check_prime(n);
	}

	private static void check_prime(int n) {
		// TODO Auto-generated method stub
		int  m=n/2; int flag=0;
		for(int i=2;i<=m;i++){
			if(n%i==0){
				System.out.println("number is not prime");
				flag=1;
				break;
			}
			}
			if(flag==0){
				System.out.println("number is prime");
			}
				
			}
	

}