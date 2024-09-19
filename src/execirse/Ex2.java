package execirse;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        //Thêm 1 phần tử vào mảng
        //B1: Khai báo và nhập giá trị các phần tử cho mảng - oldArray
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng:");
        int size = Integer.parseInt(scanner.nextLine());
        int[] oldArray = new int[size];
        for (int i = 0; i < oldArray.length; i++) {
            System.out.printf("oldArray[%d]=", i);
            oldArray[i] = Integer.parseInt(scanner.nextLine());
        }
        //B2: Nhập chỉ số cần thêm và gía trị cần thêm - indexInsert>=0
        int indexInsert;
        System.out.println("Nhập vào chỉ số phần tử cần thêm:");
        do {
            indexInsert = Integer.parseInt(scanner.nextLine());
            if (indexInsert >= 0) {
                break;
            } else {
                System.err.println("Chỉ số phần tử không tồn tại");
            }
        } while (true);
        System.out.println("Nhập vào giá trị của phần tử cần thêm:");
        int valueInsert = Integer.parseInt(scanner.nextLine());
        //B3: Kiểm tra các trường hợp của chỉ số cần thêm
        int[] newArray;
        if (indexInsert < oldArray.length) {
            //-B3.1.1: indexInsert<length
            //-B3.1.2: Khai báo mảng mới có số phần tử là length+1
            newArray = new int[oldArray.length + 1];
            //-B3.1.3: copy các phần tử của mảng cũ sang mảng mới và chèn phần tử mới vào
            for (int i = 0; i < newArray.length; i++) {
                if (i < indexInsert) {
                    newArray[i] = oldArray[i];
                } else if (i == indexInsert) {
                    newArray[i] = valueInsert;
                } else {
                    newArray[i] = oldArray[i - 1];
                }
            }
        } else {
            //-B3.2.1: indexInsert>=length
            //B3.2.2: Khai báo mảng mới có số phần tử là indexInsert+1
            newArray = new int[indexInsert + 1];
            //B3.2.3: copy toàn bộ mảng cũ sang mới và gán giá trị phần tử có chỉ số indexInsert = valueInsert
            for (int i = 0; i < oldArray.length; i++) {
                newArray[i] = oldArray[i];
            }
            newArray[indexInsert] = valueInsert;
        }
        //B4: In ra mảng sau khi thêm phần tử
        System.out.println("Mảng sau khi thêm phần tử:");
        for (int element : newArray) {
            System.out.printf("%d\t", element);
        }
    }
}
