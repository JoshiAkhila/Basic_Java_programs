public class Smallest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= new int[10];
		System.out.println("Enter the size");
		Scanner in =new Scanner(System.in);
		int size= in.nextInt();
		System.out.println("Enter array elements");
		
		for(int i=0;i<size;i++){
			arr[i]=in.nextInt();
		}
		
		int small=arr[0];
		
		for(int i=0;i<size;i++){
			if(small>arr[i]){
				small=arr[i];
			}		
		}
		System.out.println("Smallest number is "+ small);
		
	}

}