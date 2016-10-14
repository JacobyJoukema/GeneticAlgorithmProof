package genetic;

import creatures.CharCreature;

public class CharEvolution {
	float bestFit;
	int gen;
	int pop;
	float mut;
  CharCreature [] creatures;
	CharCreature bestCreature;
	boolean correct;
  protected char [] key;

  public CharEvolution (int pop, float mut, String key)
  {
    this.pop = pop;
    this.mut = mut;
    this.key = key.toCharArray();
    this.gen = 0;
    creatures = new CharCreature [pop];
    init();
  }
  public void init ()
  {
    for (int i = 0; i < pop; i++)
    {
      creatures[i] = new CharCreature(key.length);
    }
		bestCreature = new CharCreature(creatures[0].getChrom());

  }
  public void evolve ()
  {
		int cnt = 0;
    while (!correct)
    {
			gen++;
      newGen(select());
			printInfo();
			cnt++;
    }
		System.out.println("*********************************************");
		System.out.println("Evolved to Key After " + gen + " Generations");
		System.out.println("Correct Key: " + new String (bestCreature.getChrom()));
  }
  protected void newGen (int [] ind)
  {
    char [] child = CharCreature.cross(creatures[ind[0]].getChrom(), creatures[ind[1]].getChrom());
    for (int i = 0; i < creatures.length;i++)
    {
      creatures[i] = new CharCreature(child.clone());
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
      bestCreature = new CharCreature (creatures[ind[0]].getChrom());
			if (checkBest()) correct = true;
    }
    return ind;
  }
  public void printInfo ()
  {
    System.out.println ("Gen: " + gen);
    for (int i = 0; i < creatures.length; i++)
    {
      creatures[i].print();
			//System.out.println(creatures[i]);
    }
    System.out.println ("---------------------------------");
    System.out.println("Best Fitness: " +bestFit);
    bestCreature.print();
  }
	public boolean checkBest ()
	{
		boolean right = true;
		char [] bestChrom = bestCreature.getChrom().clone();
		for (int i = 0; i < key.length; i++)
		{
			if (key[i] != bestChrom[i])
			{
				right = false;
				break;
			}
		}
		return right;
	}
}
