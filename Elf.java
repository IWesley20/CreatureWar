
/**
 * This is the Elf subtype class. Elfs have the 10% chance to do magical damage. 
 * 
 * @author Isaiah Wesley 
 * @version April 25, 2016
 */
public class Elf extends Creature
{
   public Elf() {
    super();       
  }

   public Elf(int hp, int str) {
    super(hp, str);   
  }
  
   public int obtainDamage() {
    int luck = super.randomGenerator.nextInt(10);
    int inheritDamage = super.getDamage();
    
    if (luck == 0) {
       return inheritDamage*2;
    }
    else {
       return inheritDamage; 
    }
  }
}
