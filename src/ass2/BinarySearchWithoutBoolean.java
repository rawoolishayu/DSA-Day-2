package ass2;

public class BinarySearchWithoutBoolean {

	public static void main(String[] args) {
		int array[] = {4, 9, 17, 26, 38, 54, 72};
		int target = 26;
		int start = 0;
		int end = array.length - 1;
		int mid = (start+end)/2;
		int result = -1;
		while (start<=end) {
			if (target==array[mid]) {
				result = array[mid];
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
		if (result==-1) {
			System.out.println(target+" was not found in the array");
		}
	}

}
