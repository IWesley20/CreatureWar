import java.util.Random;
/**
 * Write a description of class Creature here.
 * 
 * @author Isaiah Wesley 
 * @version April 25, 2016
 */
public class Creature
{
   private int hp;
   private int hitPoints;
   private int strength;
   private final int LOW_HP=5;
   private final int LOW_STR=5;
   Random randomGenerator = new Random();
   
   public Creature() {
      hitPoints = 10;
      strength = 10;
    }
    
   public Creature(int hp, int str) {
      setHP(hp);
      setStrength(str);
    }
    
   public void setHP(int hp) {
      if (LOW_HP > hp) {
         hitPoints = 5; 
      }
      else {
         hitPoints = hp; 
      }
    }
    
   public void setStrength(int str) {
      if (LOW_STR > str) {
         strength = 5;  
      }
      else {
         strength = str; 
      }
    }
    
   public int getDamage() {
      return randomGenerator.nextInt(strength)+1;    
   }
   
   public int getHP() {
     return hitPoints;  
   }
   
   public int getStrength() {
     return strength;  
   }
   
   public void BattleWound(int gash) {
     hitPoints = hitPoints -  gash;  
   }
}
