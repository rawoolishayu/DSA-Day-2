package ass1;

public class BinarySearch {

	public static void main(String[] args) {
		int array[] = {5, 12, 19, 28, 33, 47, 56};
		int target = 56;
		int start = 0;
		int end = array.length - 1;
		int mid = (start+end)/2;
		boolean found = false;
		while (start<=end) {
			if (target==array[mid]) {
				found = true;
				System.out.println(target+" found at index "+mid);
				break;
			}
			else if (target>array[mid]) {
				start = mid+1;
				mid = (start+end)/2;
			}
			else {
				end = mid-1;
				mid = (start+end)/2;
			}
		}
		if (!found) {
			System.out.println(target+" was not found in the array");
		}
	}

}
