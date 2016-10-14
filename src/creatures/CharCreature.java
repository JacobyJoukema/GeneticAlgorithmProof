package creatures;

public class CharCreature implements Creature {
  public CharCreature (int len)
  {
    chrom = char [len];
    for (int i = 0; i < chrom.length; i++)
    {
      char[i] = genRandom;
    }
  }
  public char genRandom ()
  {
    char randChar = char(int (Math.random()*137)+40);
  }
  public mutate (float mut)
  {
    for (int i = 0; i < chrom.length; i++)
    {
      if (Math.random()<mut)
      {
        chrom[i] = randChar;
      }
    }
  }
  public float fitness (char [] metric)
  {
    float fit = 0;
    for (int i = 0; i < chrom.length; i++)
    {
      if (metric[i] == chrom[i])
      {
        fit+=1;
      }
    }
    return fit;
  }
}
