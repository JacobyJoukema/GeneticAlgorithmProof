package evolution;

public interface Genetic
{
  protected float bestFit;
  protected int gen;
  protected int pop;
  protected float mut;
  protected Object [] creatures;

  public Genetic (int pop, float mut)
  {

  }
  protected void init ()
  {

  }
  public void evolve ()
  {

  }
  protected Object [] evalute ()
  {

  }
  protected void cross (Object [] parents)
  {

  }
  protected void mutate ()
  {

  }
}
