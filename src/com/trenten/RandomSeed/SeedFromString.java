package com.trenten.RandomSeed;
import java.util.*;


public class SeedFromString {
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in); 
	String seed = scan.nextLine();
	long WorldSeed = (long)seed.hashCode();
	scan.close();
    System.out.println(WorldSeed);
    }
}
