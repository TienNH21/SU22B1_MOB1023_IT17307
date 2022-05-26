package buoi8_exception;

import java.util.Scanner;

public class DemoException {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 11; i++) {
            try {
                a[i] = Integer.parseInt( sc.nextLine() );
                System.out.println("Giá trị vừa nhập: " + a[i]);
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai");
                e.printStackTrace();
            } catch (NullPointerException e) {
                System.out.println("Chưa khởi tạo");
                e.printStackTrace();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Ngoài phạm vi mảng");
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                System.out.println("Xử lý xong phần tử thứ " + (i + 1));
            }
        }
        
        System.out.println("Xử lý kết thúc");
    }
}
