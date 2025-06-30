//Print All Unique Elements in an Array


public class UniqueElements {
    public static void main(String[] args) {
        int[] arr = {4, 5, 4, 6, 7, 5, 8};

        System.out.println("Unique elements are:");
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
