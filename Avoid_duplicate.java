public class Avoid_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[]= {1,3,5,6,7,2,3,1,4,5};
   
   for(int i=0;i<arr.length;i++){
	   boolean isDistinct = false;
	   for(int j=0;j<i;j++){
		   if(arr[i]==arr[j]){
			   isDistinct = true;
			   break;
		   } 
	   }
	   if(!isDistinct){
           System.out.print(arr[i]+" ");
   }
	   }
   }
	}
   
	