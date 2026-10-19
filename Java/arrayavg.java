//calculate average of array

public class arrayavg{
	
	public static void main(String[] args){
		
		int[] arr = {10,20,30,40};

		int sum = 0;
		
		for(int value : arr) {
		    sum += value;        //sum=sum+value    
		}
		double avg = (double) sum / arr.length;
		
		System.out.println("Average =" +avg);
	}

}