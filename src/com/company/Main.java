package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số để đọc: ");
        int number = scanner.nextInt();
        switch (number) {
            case 0:
                System.out.print("Không");
                break;
            case 1:
                System.out.print("Một");
                break;
            case 2:
                System.out.print("Hai");
                break;
            case 3:
                System.out.print("Ba");
                break;
            case 4:
                System.out.print("Bốn");
                break;
            case 5:
                System.out.print("Năm");
                break;
            case 6:
                System.out.print("Sáu");
                break;
            case 7:
                System.out.print("Bảy");
                break;
            case 8:
                System.out.print("Tám");
                break;
            case 9:
                System.out.print("Chín");
                break;
            case 10:
                System.out.print("Mười");
                break;
            case 11:
                System.out.print("Mười Một");
                break;
            case 12:
                System.out.print("Mười Hai");
                break;
            case 13:
                System.out.print("Mười Ba");
                break;
            case 14:
                System.out.print("Mười Bốn");
                break;
            case 15:
                System.out.print("Mười lăm");
                break;
            case 16:
                System.out.print("Mười Sáu");
                break;
            case 17:
                System.out.print("Mười Bảy");
                break;
            case 18:
                System.out.print("Mười Tám");
                break;
            case 19:
                System.out.print("Mười Chín");
                break;
            case 20:
                System.out.print("Hai Mươi");
                break;
            default:
                System.out.print("Không có số");
                break;
        }
    }
}
