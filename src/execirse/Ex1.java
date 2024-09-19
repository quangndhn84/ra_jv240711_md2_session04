package execirse;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        //Xóa 1 phần tử trong mảng
        //B1: Khai báo và nhập giá trị các phần tử cho mảng - oldArray
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng:");
        int size = Integer.parseInt(scanner.nextLine());
        int[] oldArray = new int[size];
        for (int i = 0; i < oldArray.length; i++) {
            System.out.printf("oldArray[%d]=", i);
            oldArray[i] = Integer.parseInt(scanner.nextLine());
        }
        //B2: Nhập chỉ số phần tử cần xóa - indexDelete: 0-length-1
        System.out.println("Nhập vào chỉ số phần tử cần xóa:");
        int indexDelete;
        do {
            indexDelete = Integer.parseInt(scanner.nextLine());
            if (indexDelete >= 0 && indexDelete < oldArray.length) {
                break;
            } else {
                System.err.println("Không tồn tại chỉ số này trong mảng, vui lòng nhập lại");
            }
        } while (true);
        //B3: Khai báo mảng mới có số phần tử = length-1: newArray
        int[] newArray = new int[oldArray.length - 1];
        //B4: Duyệt mảng mới và copy các phần tử còn lại từ mảng cũ sang
        for (int i = 0; i < newArray.length; i++) {
            if (i < indexDelete) {
                newArray[i] = oldArray[i];
            } else {
                newArray[i] = oldArray[i + 1];
            }
        }
        //B5: In giá trị các phần tử của mảng newArray - các phần tử còn lại sau khi xoa
        System.out.println("Mảng sau khi xóa là:");
        for (int element : newArray) {
            System.out.printf("%d\t", element);
        }
    }
}
