package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = 0;
        do {
            System.out.println("nhap N");
            N = sc.nextInt();
        }while (N < 0 || N % 2 == 0);
        System.out.println(checkprime.check(N));
        int count = 0;

        for (int i = 0;; i++) {
            if(checkprime.check(i)){
                System.out.println(i);
                count ++;
            if(count == N){
                break;
            }
            }
        }
        int[] myList = new int[N];
        for (int i = 0; i < myList.length; i++) {
            System.out.println("Nhap phan tu thu" +(+i + 1));
            int num = sc.nextInt();
            myList[i] = num;
        }
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i]);
        }
        for (int i = 0; i < myList.length; i++) {
            if(checkprime.check(myList[i])){
                System.out.println(myList[i]);
            }
        }
        int Nposition = 0;
        for (int i = 0; i < myList.length; i++) {
            if(myList[i] == N){
                System.out.println(i);
                Nposition = i;
                break;
            }
        }
        System.out.println(Nposition);
        int[] myListTemp = new int[myList.length-1];
        for (int i = 0; i < myListTemp.length; i++) {
            if(i < Nposition){
                myListTemp[i] = myList[i];
            }else {
                myListTemp[i] = myList[i+1];
            }

        }
    }

}
