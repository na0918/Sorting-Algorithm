import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();

        for(int i = 0; i < arr.length; i++) arr[i] = r.nextInt(100);
        for(int j : arr) System.out.printf("%d ", j);
        System.out.println();

        //버블정렬
        AwesomeSort b = new BubbleSort();
        int[] x = b.sort(arr);
        System.out.print("버블정렬 : ");
        for(int j : x) System.out.printf("%d ", j);
        System.out.println();

        //선택정렬
        AwesomeSort s = new SelectionSort();
        int[] y = s.sort(arr);
        System.out.print("선택정렬 : ");
        for(int j : y) System.out.printf("%d ", j);
        System.out.println();

        //삽입정렬
        AwesomeSort i = new InsertionSort();
        int[] z = i.sort(arr);
        System.out.print("삽입정렬 : ");
        for(int j : z) System.out.printf("%d ", j);
        System.out.println();

        //쉘정렬
        AwesomeSort sh = new Shellsort();
        int[] t = i.sort(arr);
        System.out.print("쉘정렬 : ");
        for(int j : t) System.out.printf("%d ", j);
        System.out.println();
    }
}
