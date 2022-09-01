public class main {
    public static void main(String[] args) {
        int[] arr = new int[]{12,3,5,21,4,85,6,9,2,1};
        for (int i : arr) {
            System.out.print(i+" ");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("\nAfter Sorting...");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
