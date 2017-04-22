package Heaps;

public class Max_Heapify {

	public void max_heapify(int[] Arr, int i, int N) {

		// Parent is at position 1
		int left = 2* i+1;
		int right = 2* i + 2;
		int largest = i;
		//System.out.println("left is " + left + " right is : " +right );

		// If left child is greater than parent than largest is left
		if (left <= N-1 && Arr[left] > Arr[i])
			largest = left;
		else
	         largest = i;
		// If right child is greater than parent than largest is right
		if (right <= N-1 && Arr[right] > Arr[largest])
			largest = right;

		//System.out.println("left is " + left + " right is : " +right  + " largest is : " + largest);
		// If parent is not the largest then we need to swap largest with parent
		// and max heapify is called on the child node which was maximum
		if (largest != i) {
			
			swap(largest, i, Arr);
			max_heapify(Arr, largest, N);
		}

	}

	public void swap(int a, int b, int[] Arr) {
		int temp = Arr[a];
		Arr[a] = Arr[b];
		//System.out.println("swapped " + temp + " and " + Arr[b]);
		Arr[b] = temp;
	}

}
