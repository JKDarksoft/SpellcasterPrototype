/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spellcasterprototype;

import java.util.ArrayList;

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
    
//    int physRes;
//    int magiRes;
//    int fireRes;
//    int coldRes;
//    int acidRes;
//    int elecRes;
    
    //--------------------------------------
    
    //--- Invulnerabilities ----------------
        /*
         * Określają procent dmg pochlanianych, zanim reszta dmg przejdzie na hp
         * (straszna nazwa - jakis zamiennik?)
         */
    
//    int physInv;
//    int magiInv;
//    int fireInv;
//    int coldInv;
//    int acidInv;
//    int elecInv;
    
    //--------------------------------------
    //--------------------------------------------------------------------------
    
    
    public ArrayList<Spell> spellBook = new ArrayList<>();
    public ArrayList<int[]> actEffList = new ArrayList<>();
    

    
    
    public Mage(String n){
        
    name = n;
    maxHp = 100;
    hp = 100;
    xp = 0;
    power = 1;

}
    
    public void castaSpell(Spell s, Mage tar){    
        s.execute(this, tar);
    }
    
    public void addaSpell(Spell s){
        spellBook.add(s);
    }
    
    
    public void die(){
        System.out.println(this.name+" died!");
    }
   
        
    }
    
    
    

