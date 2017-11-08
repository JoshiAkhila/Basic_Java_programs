public class Fibbinochi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.out.println("Enter the number");
		Scanner Scan = new Scanner(System.in);
		int n = Scan.nextInt();
		series(n);	
	}

	private static void series(int n) {
		// TODO Auto-generated method stub
		int i=0;
		int j=1;
		System.out.print(i+" "+j );
		int m;
		for(int k=0;k<=n;k++){
			m=i+j;
			i=j;
			j=m;
			
			System.out.print(" "+m );
		}
	}

}
