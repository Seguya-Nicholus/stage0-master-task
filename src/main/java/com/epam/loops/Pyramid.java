package com.epam.loops;

public class Pyramid {

  public void printPyramid(int cathetusLength) {
    int i, j, k, a;
    a = cathetusLength;
    for (i = 1; i <= cathetusLength; i++) {
      for (j = a; j > 1; j--) {
        System.out.print(" ");
      }
      for (k = i; k != 0; k--) {
        System.out.print(k);
      }
      a--;

      for (int l = 2; l <= i; l++) {
        System.out.print(l);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    new Pyramid().printPyramid(7);
  }
}
