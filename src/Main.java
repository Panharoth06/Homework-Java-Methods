import java.util.Arrays;

public class Main {
    static int wordCount(String words) {
        int count = 0;
        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) == ' ') count++;
        }
        return ++count;
    }

    static int[] sort(int [] arr) {
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Word Count: " + wordCount("A cat wearing sunglasses strutted across the keyboard like it owned the code."));
        int arr[] = {1, 3, 5, 7, 6, 2, 9, 4, 2};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
