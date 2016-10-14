package creatures;

public class CharCreature {
private char [] chrom;
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
    fit = fit/(chrom.length*chrom.length);//Add or remove to see linear vs exponetial fitness function
    return fit;
  }
  public static char[] cross (char [] chrom1, char [] chrom2)
  {
    int low = (int) (Math.random()*chrom1.length/2);
    int hi = low+(chrom1.length/2);
    char [] output = new char[chrom1.length];
    for (int i = 0; i < output.length; i++)
    {
      if (i < hi && i >= low)
      {
        output[i] = chrom1[i];
      }
      else
      {
        output[i] = chrom2[i];
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
