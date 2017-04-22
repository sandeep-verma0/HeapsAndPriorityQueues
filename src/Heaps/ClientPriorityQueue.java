package Heaps;

public class ClientPriorityQueue {
public static void main(String[] args) {
	int[] Arr = new int[10];
	
	PriorityQueue pq= new PriorityQueue();
	pq.insert_val(Arr, 4);
	pq.insert_val(Arr, 8);
	pq.insert_val(Arr, 1);
	pq.insert_val(Arr, 7);
	pq.insert_val(Arr, 3);
	pq.insert_val(Arr, 6);
	
	System.out.println("Maximum is : " +pq.maximum(Arr));
	System.out.println("Extract Maximum is : " +pq.extract_maximum(Arr));
	//System.out.println("Extract Maximum is : " +pq.increase_val(Arr, i, val);(Arr));
	
	for(int value: Arr)
		System.out.println(value);
}
}
