package Heaps;

public class Client_Max_Heapify {

	public static void main(String[] args) {

		int Arr[] = {1,4,3,7,8,9,10};
		Build_Max_Heap build_max_heap = new Build_Max_Heap();
		build_max_heap.build_max_heap(Arr);
		
		for(int value : Arr)
			System.out.print(" " +value);
	}

}
