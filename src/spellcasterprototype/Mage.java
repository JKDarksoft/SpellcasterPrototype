/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spellcasterprototype;

/**
 *
 * @author JK
 */
public class Mage {
    
    //----- ATRYBUTY -----------------------------------------------------------
    
    //--- Main attributes- ------------------
    
    String name;
    int maxHp;
    int hp;
    int xp;
    int power;
    
    //--------------------------------------
    
    //--- Resists --------------------------
        /* 
         * Okreslaja ile dmg w turze moze zostac pochlonietych przez resista 
         * zanim reszta dmg przejdzie na hp
         */
    
    int physRes;
    int magiRes;
    int fireRes;
    int coldRes;
    int acidRes;
    int elecRes;
    
    //--------------------------------------
    
    //--- Invulnerabilities ----------------
        /*
         * Określają procent dmg pochlanianych, zanim reszta dmg przejdzie na hp
         * (straszna nazwa - jakis zamiennik?)
         */
    
    int physInv;
    int magiInv;
    int fireInv;
    int coldInv;
    int acidInv;
    int elecInv;
    
    //--------------------------------------
    //--------------------------------------------------------------------------
    
    
    //szybszy dostep kosztem zasmiecania pamieci?????
   // public static Spell[] spellBook;
    
    //wolniejszy dostep, mniej smieci?????????
   // public static int[] spellBook;
    

    
    
    public Mage(){

}
    
    public void castaSpell(Spell s, Mage tar){
    
    }
    
    public void die(){
        System.out.println(this.name+" died!");
    }
    
    
    
}
