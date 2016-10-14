package creatures;

public class CharCreature {
char []chrom;
  public CharCreature (char [] chrom)
  {
    this.chrom = chrom;
  }
  public CharCreature (int len)
  {
    chrom = new char [len];
    for (int i = 0; i < chrom.length; i++)
    {
      chrom [i] = genRandom();
    }
  }
  public char genRandom ()
  {
    return (char)((int)(Math.random()*94)+32);
  }
  public void mutate (float mut)
  {
    for (int i = 0; i < chrom.length; i++)
    {
      if (Math.random()<mut)
      {
        chrom[i] = genRandom();
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
        output[i] = creat1.chrom[i];
      }
      else
      {
        output[i] = creat2.chrom[i];
      }
    }
    return output;
  }
  public void print ()
  {
    System.out.println(new String (chrom));
  }
  public char [] getChrom ()
  {
    return chrom;
  }
}
