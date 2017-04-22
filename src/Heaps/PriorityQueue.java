package Heaps;

public class PriorityQueue {

	public int length=0;
	public int maximum(int[] Arr){
		
		return Arr[0];
	}
	

	public int extract_maximum(int[] Arr){
		int max= Arr[0];
		length=length-1;
		if(length==0){
			System.out.println("Cannot remove element as queue is empty.");
		}
		Arr[0]=Arr[length-1];
		Arr[length-1]=-1;
		Max_Heapify max_heapify = new Max_Heapify();
		max_heapify.max_heapify(Arr, 0, length);
		return max;
	}
	
	public void increase_val (int[] Arr, int i ,int val){
		
		if(val < Arr[i])
			System.out.println("New value is less than current value, can’t be inserted.");
		
		Arr[i]=val;
		//System.out.println("Arr[i] is : " + Arr[i]);
		while(i>0 && Arr[i/2] < Arr[i]){
			//System.out.println("Arr[i/2] is : " + Arr[i/2]);
			
			int temp = Arr[i/2];
			Arr[i/2] = Arr[i];
			//System.out.println("swapped " + temp + " and " + Arr[b]);
			Arr[i] = temp;

			//System.out.println("Arr[i/2] is : " + Arr[i/2] + " Arr[i] is : " + Arr[i]);
			i=i/2;
		}
	}
	

	public void insert_val (int[] Arr, int val ){
		length=length+1;
		Arr[length-1]=-1;//assuming all the numbers greater than 0 are to be inserted in queue.
		increase_val (Arr, length-1 , val);
	}
}
