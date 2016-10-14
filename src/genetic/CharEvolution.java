package genetic;

import creatures.CharCreature;

public class CharEvolution {
	  float bestFit;
	  int gen;
	  int pop;
	  float mut;
	  CharCreature [] creatures;
	  CharCreature bestCreature;
  protected char [] key;
  public CharEvolution (int pop, float mut, String key)
  {
    this.pop = pop;
    this.mut = mut;
    this.key = key.toCharArray();
    this.gen = 0;
    creatures = new CharCreature [pop];
    bestCreature = creatures[0];
    init();
  }
  public void init ()
  {
    for (int i = 0; i < pop; i++)
    {
      creatures[i] = new CharCreature(key.length);
    }
  }
  public void evolve ()
  {
    while (true)
    {
      printInfo();
      newGen(select());
    }
  }
  protected void newGen (int [] ind)
  {
    char [] child = creatures[0].cross(creatures[ind[0]], creatures[ind[1]]);
    for (int i = 0; i < creatures.length;i++)
    {
      creatures[i] = new CharCreature(child);
      creatures[i].mutate(mut);
    }
  }
  public int [] select ()
  {
	float fit = 0;
    float hi1 = 0;
    float hi2 = 0;
    int ind [] = new int[2];
    ind[0] = 0;
    ind[1] = 0;
    for (int i = 0; i < creatures.length; i++)
    {
      fit = creatures[i].evaluate(key);
      if (hi1 < fit)
      {
        ind[1] = ind[0];
        ind[0] = i;
        hi2 = hi1;
        hi1 = fit;
      }
      else if (hi2 < fit)
      {
        ind[1] = i;
        hi2 = fit;
      }
    }
    if (hi1 > bestFit)
    {
      bestFit = hi1;
      bestCreature = creatures[ind[0]];
    }
    return ind;
  }
  public void printInfo ()
  {
    System.out.println ("Gen: " + gen);
    for (int i = 0; i < creatures.length; i++)
    {
      creatures[i].print();
    }
    System.out.println ("---------------------------------");
    System.out.println("Best Fitness: " +bestFit);
    bestCreature.print();
  }
}
