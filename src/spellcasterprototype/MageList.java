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
    
    
    public static void addMage(String nam) throws IOException{

        
        Mage newMage = new Mage();
        newMage.name = nam;
        newMage.maxHp = 100;
        newMage.hp = 100;
        newMage.power = 1;
        newMage.xp = 0;
        
        newMage.acidRes = 0;
        newMage.coldRes = 0;
        newMage.elecRes = 0;
        newMage.fireRes = 0;
        newMage.magiRes = 0;
        newMage.physRes = 0;
        
        
        
        
        
        mageList.add(newMage);
         
    }
    
    
        public static void createMagesFile(Mage m)throws IOException{
        ObjectOutputStream pl=null;
        
        try{
            pl=new ObjectOutputStream(new FileOutputStream(magesFile));
            pl.writeObject(m);
            pl.flush();
        }
        finally{
            if(pl!=null)
                pl.close();
        }
    }
        
        
        
        public static void saveMagesFile(Mage m)throws IOException, ClassNotFoundException, FileNotFoundException{
            try{
        ArrayList<Mage> tlista = new ArrayList<>();
        ObjectInputStream pl2=null;
        Mage tm = null;
        try{
            pl2=new ObjectInputStream(new FileInputStream(magesFile));
            while(true){
            tm=(Mage)pl2.readObject();
            tlista.add(tm);
            }
 
        } catch (EOFException ex) {

            if(pl2!=null)
                pl2.close();
 
            ObjectOutputStream pl=null;
            try{
                pl=new ObjectOutputStream(new FileOutputStream(magesFile));
                for(int i=0; i < tlista.size(); i++)
                    pl.writeObject(tlista.get(i));
 
                pl.writeObject(m);
                pl.flush();
            }
            finally{
                if(pl!=null)
                    pl.close();
            }
        }
            }catch (FileNotFoundException fnf){
            createMagesFile(m);
            }
    }
       
        
         public static void loadMagesFile()throws IOException,ClassNotFoundException{
        ObjectInputStream pl2=null;
        Spell m = null;
        try{
            pl2=new ObjectInputStream(new FileInputStream(magesFile));
            while(true){
            m=(Spell)pl2.readObject();
 
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