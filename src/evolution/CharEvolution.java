package evolution;

import creatures.*;

public CharEvolution implements Genetic {
  protected String key;
  public CharEvolution (int pop, float mut, String key)
  {
    this.pop = pop;
    this.mut = mut;
    this.key = key;
    creatures = new CharCreature [pop];
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
      cross(evaluate())
    }
  }
  protected void cross (int [] ind)
  {
    
  }
  protected CharCreature [] select ()
  {
    int hi1 = 0;
    int hi2 = 0
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
    return ind;
  }
  protected void mutateGeneration ()
  {
    for (int i = 0; i < chrom.length; i++)
    {
      chrom[i].mutate(mut);
    }
  }

}
