package com.trenten.RandomSeed;
import java.util.Random;

public class RandomSeedLooped {
  public static void main(String[] args) {
    Random rand = new Random();
    for(int d = 0; d != 5; ++d) {
        System.out.printf("%12d ",rand.nextLong());
        System.out.println();
    }
  }
}
