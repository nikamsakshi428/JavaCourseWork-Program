import java.util.Arrays;

public class Prog61 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        int key = 15;

        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("Found at index: " + mid);
                return;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Not found");
    }
}