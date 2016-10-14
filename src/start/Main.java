package start;

import genetic.CharEvolution;

public class Main {
  public static void main(String[] args) {
    CharEvolution evolution = new CharEvolution (50, (float)0.10, "Hello World");
    evolution.evolve();
  }
}
