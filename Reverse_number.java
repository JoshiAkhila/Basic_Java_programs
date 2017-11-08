public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int num,rev=0,temp,rem;
		
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter the original number");
   int n=scan.nextInt();
   
    while(n!=0){
    	rem=n%10;
    	rev=rev*10+rem;
    	n=n/10;
    }
    System.out.println(rev);
		   
		   }
	}

