package com.company;

import java.util.Scanner;

public class Main {

    private String masyvas[];
    private Scanner sc = new Scanner(System.in);

    public void main(String[] args) {

        Main objektas = new Main();
        objektas.nuskaitymas();
        objektas.isvedimas();
    }

    private void nuskaitymas() {
        masyvas = new String[5];
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println("Iveskite " + (i + 1) + "-aji zodi: ");
            masyvas[i] = sc.nextLine();
        }
    }

    private void isvedimas() {
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println((i + 1) + "-asis Jusu zodis: " + masyvas[i]);
        }
    }
}
