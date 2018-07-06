package kiemtrachuoiPalindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int[] arr;
        System.out.print("nhập độ dài: ");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.println("nhập phần tử cho mảng: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < (arr.length / 2); i++) {
            ((LinkedList<Integer>) queue).addFirst(arr[i]);
        }
        for (int i = ((arr.length / 2) + 1); i < arr.length; i++) {
            stack.push(arr[i]);
        }
        System.out.println("-----------------------------");
        int dem = 1;
        for (int i = 0; i < queue.size(); i++) {
            if (((LinkedList<Integer>) queue).pop() == stack.pop()) {
                dem++;
            }
        }
        if (dem == 1) {
            System.out.println("Đây là chuỗi Palindrome");
        } else {
            System.out.println("Đây không phải là chuỗi Palindrome");
        }
    }
}
