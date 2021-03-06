package Heaps;

public class Min_Heapify {

	public void min_heapify(int[] Arr, int i, int N) {

		// Parent is at position 1
		int left = 2* i+1;
		int right = 2* i + 2;
		int smallest = i;
		//System.out.println("left is " + left + " right is : " +right );

		// If left child is greater than parent than largest is left
		if (left <= N-1 && Arr[left] < Arr[i])
			smallest = left;
		else
	         smallest = i;
		// If right child is greater than parent than largest is right
		if (right <= N-1 && Arr[right] < Arr[smallest])
			smallest = right;

		//System.out.println("left is " + left + " right is : " +right  + " largest is : " + largest);
		// If parent is not the largest then we need to swap largest with parent
		// and max heapify is called on the child node which was maximum
		if (smallest!= i) {
			
			swap(smallest, i, Arr);
			min_heapify(Arr, smallest, N);
		}

	}

	public void swap(int a, int b, int[] Arr) {
		int temp = Arr[a];
		Arr[a] = Arr[b];
		//System.out.println("swapped " + temp + " and " + Arr[b]);
		Arr[b] = temp;
	}

}
