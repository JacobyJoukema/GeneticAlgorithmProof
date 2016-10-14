package evolution;

public interface Genetic
{
  protected float bestFit;
  protected int gen;
  protected int pop;
  protected float mut;
  protected Object [] creatures;
  protected Object bestCreature;

  public Genetic (int pop, float mut)
  {

  }
  protected void init ()
  {

  }
  public void evolve ()
  {

  }
  protected Object [] select ()
  {

  }
  protected void newGen (Object [] parents)
  {

  }

}
