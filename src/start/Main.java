package start;

import genetic.CharEvolution;
import creatures.CharCreature;

public class Main {
  public static void main(String[] args) {
    CharEvolution evolution = new CharEvolution (50, (float)0.02, "--Genetic Algorithm By Jacoby Joukema!--");
    evolution.evolve();
    /*char [] test = {'a','b','c','d','e','f','g'};
    char [] test2 = {'1','2','3','4','5','6','6'};
    System.out.println(new String (CharCreature.cross(test,test2)));*/
  }
}
