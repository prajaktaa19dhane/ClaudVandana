package javaTask;
import java.util.*;

public class RandomArray {
	public static void RndomArr(int arr[]) {
		
		Random r = new Random();
		int i , temp ;
		for(int  j = 0; j < arr.length;j++) {
			
			i = r.nextInt(j+1);
			
			temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
		}
	}
	public static void CollectionRandom(int[] arr) {
		List<Integer>list  = new ArrayList<>();
		for(int n : arr) {
			list.add(n);
		}
		Collections.shuffle(list);
		System.err.println(list.toString());
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(arr));
		RndomArr(arr);
		System.out.println(Arrays.toString(arr));				
        CollectionRandom(arr);
	}

}
