package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        int i = 1;
        String sp = "";
        System.out.println();
        while (!(i < cathetusLength)) {
            String k = String.valueOf(i);
            System.out.println(k + sp + k);
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
