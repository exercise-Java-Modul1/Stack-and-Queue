package kiemtrachuoiPalindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        System.out.print("nhập độ dài: ");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.println("nhập phần tử cho mảng: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int dem = 0;
        for (int i = 0; i < (arr.length / 2); i++) {
            for (int j = (arr.length / 2 + 1); j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    dem++;
                }
            }
        }
        if (dem == arr.length / 2) {
            System.out.println("Đây là chuỗi Palindrome");
        } else {
            System.out.println("Đây không phải là chuỗi Palindrome.");
        }
    }
}
