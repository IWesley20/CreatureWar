
/**
 * Write a description of class Human here.
 * 
 * @author Isaiah Wesley
 * @version April 25, 2016
 */
public class Human extends Creature
{
    private final int TOP_HP=30;
    private final int TOP_STR=18;
    
    public Human() {
       super(); 
    }
    
    public Human(int hp, int str) {
       super(hp, str);
       setHP(hp);
       setStrength(str);
    }
    
    public void setHP(int hp) {
       if (TOP_HP < hp) {
           super.setHP(TOP_HP);
       }
       else {
           super.setHP(hp);
       }
    }
    
    public void setStrength(int str) {
       if (TOP_STR < str) {
           super.setStrength(TOP_STR);
       }
       else {
           super.setStrength(str);
       }
    }
}