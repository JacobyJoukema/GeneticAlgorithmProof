package evolution;

public CharEvolution implements Genetic {
  protected String key;
  public CharEvolution (int pop, float mut, String key)
  {
    this.pop = pop;
    this.mut = mut;
    this.key = key;
    creatures = new CharCreature [pop];
  }
  public void init ()
  {
    for (int i = 0; i < pop; i++)
    {
      creatures[i] = new CharCreature(key.length);
    }
  }
}
