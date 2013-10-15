/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spellcasterprototype;

import java.io.Serializable;

/**
 *
 * @author JK
 */
public class Spell implements Serializable{
    
    String name;
    String type;
    int power;
    int dmg;
    int duration;
    int timeLeft;
    //String damageType;
    
    public Spell() {

    }
    
    
    
    
    
    public void inflictDamage(Mage tar){
        
        tar.hp = tar.hp - this.dmg;
        if (tar.hp < 1) tar.die();
    }
    
    
    
}
