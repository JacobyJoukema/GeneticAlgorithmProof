package evolution;

import creatures.*;

public CharEvolution implements Genetic {
  protected char [] key;
  public CharEvolution (int pop, float mut, String key)
  {
    this.pop = pop;
    this.mut = mut;
    this.key = key.toCharArray();
    this.gen = 0;
    creatures = new CharCreature [pop];
    bestCreature = creatures[0]
    init();
  }
  protected void init ()
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
      printInfo()
      newGen(select())
    }
  }
  protected void newGen (int [] ind)
  {
    char [] child = CharCreature.cross(creature[ind[0]], creature[ind[1]])
    for (int i = 0; i < chrom.length;i++)
    {
      chrom[i] = new CharCreature(child);
      chrom[i].mutate(mut);
    }
  }
  protected int [] select ()
  {
    int hi1 = 0;
    int hi2 = 0;
    int ind [] = new int[2];
    int ind[0] = 0;
    int ind[1] = 0;
    for (int i = 0; i < chrom.length; i++)
    {
      fit = chrom[i].fitness();
      if (hi < fit)
      {
        ind[1] = ind[0];
        ind[0] = fit;
        hi1 = ind[0];
        hi2 = ind[1];
      }
      else if (hi2 < fit)
      {
        ind[1] = fit;
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
    for (int i = 0; i < chrom.length; i++)
    {
      creatures[i].print();
    }
    System.out.println ("---------------------------------")
    System.out.println("Best Fitness: " +bestFit);
    bestCreature.print();
  }
}
