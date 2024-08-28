package maxmin;
import java.util.Scanner;

public class Maxmin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập vào số phần tử của mảng: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        
        System.out.println("Nhập vào các phần tử của mảng:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        int max = array[0];
        int min = array[0];
        
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        
        System.out.println("Giá trị lớn nhất: " + max);
        System.out.println("Giá trị nhỏ nhất: " + min);
        scanner.close();
    }
}
