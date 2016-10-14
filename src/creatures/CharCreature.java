package creatures;

public class CharCreature implements Creature {
  public CharCreature (char [] chrom)
  {
    this.chrom = chrom;
  }
  public CharCreature (int len)
  {
    chrom = char [len];
    for (int i = 0; i < chrom.length; i++)
    {
      char[i] = genRandom;
    }
  }
  private char genRandom ()
  {
    char randChar = char(int (Math.random()*160)+30);
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
  public float evaluate (char [] metric)
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
  public static char[] cross (CharCreature creat1, CharCreature creat2)
  {
    char [] output = new char[creat1.chrom.length];
    for (int i = 0; i < output.length; i++)
    {
      if (i < output.length/2)
      {
        output[i] = creat1[i];
      }
      else
      {
        output[i] = creat2[i];
      }
    }
  }
  public void print ()
  {
    System.out.println(new String (chrom));
  }
}
