/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spellcasterprototype;

import java.io.*;
import java.util.ArrayList;


/**
 *
 * @author JK
 */
public class Spellcaster {

 
    

public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{


//            ArrayList<int[]> el1 = new ArrayList<>();
//            int[] te = new int[2];
//            te[0] = 1;
//            te[1] = 10;
//            el1.add(te);
//            int[] te1 = new int[2];
//            te1[0] = 2;
//            te1[1] = 5;
//            el1.add(te1);
//            
//            
//            System.out.println(el1.get(0)[0]);
//            System.out.println(el1.get(0)[1]);
//            System.out.println(el1.get(1)[0]);
//            System.out.println(el1.get(1)[1]);
    
    Spell ts1 = new Spell();
    ts1.name = "ts1";
    ts1.addEffect(1, 10, 1);
    ts1.addEffect(1, 5, 1);
    
    Spell ts2 = new Spell();
    ts2.name = "ts2";
    ts2.addEffect(1, 20, 1);
    ts2.addEffect(1, 10, 1);
            
    //SpellList.loadSpellFile();
            //SpellList.addSpell("TSpell2", "Necromancy", 2, el1);
            //SpellList.addSpell(ts1);
            
            
//            SpellList.spellList.add(ts1);
//            SpellList.spellList.add(ts2);
            
           // SpellList.saveSpellsFile();
    
            SpellList.loadSpellFile();

            
            SpellList.addSpell(ts2);
            
            SpellList.saveSpellFile();
            
            SpellList.loadSpellFile();
            
            Mage cass = new Mage("Cass");
            Mage tarr = new Mage ("Tarr");
            
            cass.addaSpell(SpellList.spellList.get(0));
           // cas.spellBook.get(0);
            cass.castaSpell(cass.spellBook.get(0), tarr);
            
           // System.out.println(tarr.hp);
            //System.out.println(tarr.hp);


    }
  
}
