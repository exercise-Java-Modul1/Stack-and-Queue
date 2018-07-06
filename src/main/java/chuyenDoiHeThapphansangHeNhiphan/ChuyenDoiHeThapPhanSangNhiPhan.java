package chuyenDoiHeThapphansangHeNhiphan;

import java.util.Stack;

public class ChuyenDoiHeThapPhanSangNhiPhan {
    public static void main(String[] args) {

        Stack stack = new Stack();
        int number = 111;

        while (number > 0) {
            stack.push(number%2);
            number = number/2;
        }

        for (int j = stack.size(); j > 0 ; j--) {
            System.out.print(stack.pop() + " \t");
        }

    }
}
