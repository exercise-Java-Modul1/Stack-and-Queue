package daoNguocPhanTu;

import java.util.Stack;

public class ClassStack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();
        int[] array = {6, 3, 34, 19, 40, 58, 10};

        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }

        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + "\t");
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }

        System.out.print("\n" + "Mảng mới: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t" + array[i]);
        }

        Stack<Character> wStack = new Stack<>();
        String mWord = "HELLO HANOI";
        char[] arr = mWord.toCharArray();
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        for (int i = 0; i < arr.length; i++) {
            wStack.push(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = wStack.pop();
        }

        String bWord = "";
        for (int i = 0; i < arr.length; i++) {
            bWord += arr[i];
        }
        System.out.println("\n" + "Sau khi đảo ngược từ " + mWord + " ta được một từ mới là: " + bWord);
    }
}
