/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spellcasterprototype;

/**
 *
 * @author JK
 */

    
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author JK
 */
public class MageList {
    
    public static ArrayList<Mage> mageList = new ArrayList<>();
    
    public static ArrayList<Spell> spellBook = new ArrayList<>();
    
    public static int mageNumber;// = 0;
    
    public static File magesFile = new File("Mages.txt");
    
    
    public static void addMage(String nam, ArrayList<Spell> sb ) throws IOException{

        
        Mage newMage = new Mage(nam);
        newMage.name = nam;
        newMage.maxHp = 100;
        newMage.hp = 100;
        newMage.power = 1;
        newMage.xp = 0;
        
//        newMage.acidRes = 0;
//        newMage.coldRes = 0;
//        newMage.elecRes = 0;
//        newMage.fireRes = 0;
//        newMage.magiRes = 0;
//        newMage.physRes = 0;
        
        newMage.spellBook = sb;

        mageList.add(newMage);
         
    }
    
    
    public static void addMage(Mage m){
        mageList.add(m);
    }
    
    public static void removeMage(Mage m){
        mageList.remove(m);
    }
    
    public static void removeMage(String nam){
                for (int i = 0; i < mageList.size(); i++) {
            if (mageList.get(i).name == nam){
                mageList.remove(mageList.get(i));
                break;
            }
        }
    }
    
        
        public static void saveMageFile()throws IOException{
        ObjectOutputStream pl=null;
        
        try{
            pl=new ObjectOutputStream(new FileOutputStream(magesFile));
            //pl.writeObject(s);
            
            for(int i=0; i < mageList.size(); i++)
            pl.writeObject(mageList.get(i));
            
            pl.flush();
        }
        finally{
            if(pl!=null)
                pl.close();
        }
    }
        
        
        public static void loadMageFile()throws IOException,ClassNotFoundException{
        ObjectInputStream pl2=null;
        Mage m = null;
        try{
            pl2=new ObjectInputStream(new FileInputStream(magesFile));
            while(true){
            m=(Mage)pl2.readObject();
            
            mageList.add(m);
 
            System.out.println(m.name);
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