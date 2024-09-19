package execirse;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        //Gộp 2 mảng
        //B1: Khai báo và nhập giá trị 2 mảng: firstArr, secondArr
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng đầu tiên:");
        int firstSize = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số phần tử của mảng thứ hai:");
        int secondSize = Integer.parseInt(scanner.nextLine());
        int[] firstArr = new int[firstSize];
        int[] secondArr = new int[secondSize];
        for (int i = 0; i < firstArr.length; i++) {
            System.out.printf("firstArr[%d]-", i);
            firstArr[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < secondArr.length; i++) {
            System.out.printf("secondArr[%d]=", i);
            secondArr[i] = Integer.parseInt(scanner.nextLine());
        }
        //B2: Khai báo mảng gộp: arrInt - có số phần tử bằng tổng số phần tử của 2 mảng
        int[] arrInt = new int[firstArr.length + secondArr.length];
        //B3: Khai báo biên currentIndex=0 - chỉ số phần tử chưa được gán giá trị
        int currentIndex = 0;
        //B4: Duyệt mảng firstArr và copy các phần tử sang mảng arrInt
        for (int i = 0; i < firstArr.length; i++) {
            arrInt[currentIndex] = firstArr[i];
            currentIndex++;
        }
        //B5: duyệt mảng secondArr và copy các phần tử sang mảng arrint
        for (int i = 0; i < secondArr.length; i++) {
            arrInt[currentIndex] = secondArr[i];
            currentIndex++;
        }
        //B6: In mảng gộp
        System.out.println("Các phần tử sau khi gộp mảng là:");
        for (int element : arrInt) {
            System.out.printf("%d\t", element);
        }
    }
}
