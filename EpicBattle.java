import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class EpicBattle here.
 * 
 * @author Isaiah Wesley
 * @version April 25, 2016
 */
public class EpicBattle
{
  private ArrayList<Creature> FireAnts;
  private ArrayList<Creature> BomberTermites;
  private Random randomGenerator;
  
   public EpicBattle() {
     FireAnts = new ArrayList<Creature>();
     BomberTermites = new ArrayList<Creature>();
     randomGenerator = new Random();
     setUpBattle();
     battle();
   }
   
  private void setUpBattle() {
     int amtFireAnts = 10;
     int BomberTermites = 10;
     System.out.println("\tHitpoints \tStrength");
     
     System.out.println("Human \n");
     for (int i = 0; i < amtFireAnts/2; i++) {
         int hp = randomGenerator.nextInt(20);
         int str = randomGenerator.nextInt(20);
         
         FireAnts.add(new Human(hp, str));
         System.out.println("\t\t" + FireAnts.get(i).getHP() + "\t\t" + FireAnts.get(i).getStrength()); 
     }
     
     System.out.println("Elf \n");
     for (int i = amtFireAnts/2; i < amtFireAnts; i++) {
         int hp = randomGenerator.nextInt(24);
         int str = randomGenerator.nextInt(13);
         
         FireAnts.add(new Elf(hp, str));
         System.out.println("\t\t" + FireAnts.get(i).getHP() + "\t\t" + FireAnts.get(i).getStrength());
     }
     
     System.out.println("Demon \n");
     for (int i = 0; i < amtFireAnts/2; i++) {
         int hp = randomGenerator.nextInt(20);
         int str = randomGenerator.nextInt(20);
         
         FireAnts.add(new Demon(hp, str));
         System.out.println("\t\t" + FireAnts.get(i).getHP() + "\t\t" + FireAnts.get(i).getStrength());
     }
     
     System.out.println("Balrog \n");
     for (int i = amtFireAnts/2; i < amtFireAnts; i++) {
         int hp = randomGenerator.nextInt(20);
         int str = randomGenerator.nextInt(20);
         
         FireAnts.add(new Balrog(hp, str));
         System.out.println("\t\t" + FireAnts.get(i).getHP() + "\t\t" + FireAnts.get(i).getStrength());
     }
  }
  
  private void battle() {
   int i = 0;
   int y = 0;
   
   boolean startTheWar = true;
   
   int TermiteStrike;
   int FireAntsStrike;
   
  while (startTheWar && (FireAnts.get(i).getHP() > 0 && BomberTermites.get(y).getHP() > 0)) {
       TermiteStrike = BomberTermites.get(y).getDamage();
       System.out.println(FireAnts.get(i).getHP());
       System.out.println(TermiteStrike);
       
       BomberTermites.get(i).BattleWound(TermiteStrike);
       System.out.println(FireAnts.get(i).getHP() + "[" + i + "]");
       
       System.out.println(BomberTermites.get(y).getHP());
       FireAntsStrike = FireAnts.get(i).getDamage();
       System.out.println(FireAntsStrike);
       BomberTermites.get(y).BattleWound(FireAntsStrike);
       
       System.out.println(BomberTermites.get(y).getHP() + "[" + y + "]");
       
         if (BomberTermites.size() > y && BomberTermites.get(y) instanceof Balrog) {
             if (FireAnts.get(i).getHP() <= 0) {
                 i++;
                 if (FireAnts.size() > i) {
                     System.out.println("Balrog gets to attack a second time!");
                     TermiteStrike = BomberTermites.get(y).getDamage();
                     System.out.println(FireAnts.get(i).getHP());
                     System.out.println(TermiteStrike);
                     FireAnts.get(i).BattleWound(TermiteStrike);
                     System.out.println(FireAnts.get(i).getHP() + "[" + i + "]");
                }
         
          }
       
    }
    if (FireAnts.size() > i && BomberTermites.size() > y) {
         if (FireAnts.get(i).getHP() <= 0) {
             i++;             
         }
         if (FireAnts.get(y).getHP() <= 0) { 
             y++;                
    }
    if (FireAnts.size() == i || BomberTermites.size() == y) {
         startTheWar = false;
    }
    if (i == y) {
       System.out.println("Nobody was victorious in this round!");
    }
    if (i < y) { 
       System.out.println("The Fire Ants survived with " + (FireAnts.size()- i) + "troop(s) alive.");
    } 
    if (i > y) {
       System.out.println("The Bomber Termites with " + (BomberTermites.size()- i) + "troop(s) alive.");
  }
}
}
}
}