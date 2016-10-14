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
  protected void cross (Object [] parents)
  {
    
  }

}
