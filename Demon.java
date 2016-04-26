/**
 * This is the Demon subtype class. Demons have a 5% chance to do magical damage.
 * 
 * @author Isaiah Wesley
 * @version April 25, 2016
 */
public class Demon extends Creature
{
     /**
     * Constructor for objects of class Demon
     */
    public Demon()
    {
      super();
    }

    public Demon(int hp, int str) {
      super(hp, str);  
    }

    public int getDamage() {
      int luck = super.randomGenerator.nextInt(30);
      int inheritDamage = super.getDamage();
      
      if (luck == 0) {
        return inheritDamage + 50; 
      }
      else {
        return inheritDamage;
      }
    }
}
    
