package ass3;

public class BinarySearchWithSteps {

	public static void main(String[] args) {
		int array[] = {3, 11, 23, 37, 52, 68, 79};
		int target = 37;
		int start = 0;
		int end = array.length - 1;
		int mid = (start+end)/2;
		boolean found = false;
		int count = 0;
		while (start<=end) {
			count++;
			if (target==array[mid]) {
				found = true;
				System.out.println(target+" found at index "+mid);
				System.out.println("Steps taken: "+count);
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
