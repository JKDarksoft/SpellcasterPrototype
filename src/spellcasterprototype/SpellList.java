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
public class SpellList {
    
       public static ArrayList<Spell> lista = new ArrayList<>();
    
    public static int spellNumber;// = 0;
    
    public static File spellsFile = new File("Spells.txt");
    
    
    public static void addSpell(String nam, String typ, int pow, int dam, int sNo) throws IOException{

        
        Spell newspell = new Spell();
        newspell.name = nam;
        newspell.dmg = dam;
        newspell.power = pow;
        newspell.type = typ;
        
        
        
        lista.add(newspell);
         
    }
    
    
        public static void createSpellsFile(Spell s)throws IOException{
        ObjectOutputStream pl=null;
        
        try{
            pl=new ObjectOutputStream(new FileOutputStream(spellsFile));
            pl.writeObject(s);
            pl.flush();
        }
        finally{
            if(pl!=null)
                pl.close();
        }
    }
        
        
        
        public static void saveSpellsFile(Spell s)throws IOException, ClassNotFoundException, FileNotFoundException{
            try{
        ArrayList<Spell> tlista = new ArrayList<>();
        ObjectInputStream pl2=null;
        Spell ts = null;
        try{
            pl2=new ObjectInputStream(new FileInputStream(spellsFile));
            while(true){
            ts=(Spell)pl2.readObject();
            tlista.add(ts);
            }
 
        } catch (EOFException ex) {

            if(pl2!=null)
                pl2.close();
 
            ObjectOutputStream pl=null;
            try{
                pl=new ObjectOutputStream(new FileOutputStream(spellsFile));
                for(int i=0; i < tlista.size(); i++)
                    pl.writeObject(tlista.get(i));
 
                pl.writeObject(s);
                pl.flush();
            }
            finally{
                if(pl!=null)
                    pl.close();
            }
        }
            }catch (FileNotFoundException fnf){
            createSpellsFile(s);
            }
    }
       
        
         public static void loadSpellFile()throws IOException,ClassNotFoundException{
        ObjectInputStream pl2=null;
        Spell s = null;
        try{
            pl2=new ObjectInputStream(new FileInputStream(spellsFile));
            while(true){
            s=(Spell)pl2.readObject();
 
            System.out.println(s.name);
            }
            
        } catch (EOFException ex) {
            //System.out.println("EOF");
        }
 
        finally{
            if(pl2!=null)
                pl2.close();
        }
 
 
    }
    
    
}
