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
    
    
    //--- DZIALANIE SPELLA -----------------------------------------------------
    
    /*--- LISTA MOZLIWYCH EFEKTOW ---
     * ?? przejecie kontroli nad celem - rzuty obronne? jak uniknac?
     * ?? zmiana scenerii - jesli beda jakies scenerie, powinny wplywac na rozgrywke (?)
     * ?? zmiana w inna istote - daleka przyszlosc
     * 
     * leczenie
     * mozliwosc zrobienia wiecej niz 1 akcji w turze
     * na cel dzialaja tylko zaklecia obszarowe
     * niemoznosc rzucenia konkretnych zaklec
     * niewrazliwosc na efekt
     * niewrazliwosc na obr
     * oblozenie efektu efektem
     * oblozenie zaklecia efektem
     * obnizenie Mocy
     * obnizenie mozliwosci przedmiotu
     * obnizenie odpornosci na obr
     * obnizenie niewrazliwosci na obr
     * otrzymanie info o przedmiotach celu
     * otrzymanie info o zakleciach celu
     * pochlanianie obr
     * przedluzenie dzialania efektu
     * przywolanie przedmiotu
     * usuniecie efektu
     * skrocenie dzialania efektu
     * smierc celu (wybujane ograniczenia i mozliwosc obrony przed tym)
     * strata tury
     * szansa ze zaklecie rzucone na cel nie wypali
     * szansa na nietrafienie celu zakleciem nie-obszarowym
     * wykluczenie zaklecia
     * wywolanie zaklecia
     * zablokowanie magicznego przedmiotu
     * zadanie obr
     * zatrzymanie czasu
     * zmuszenie celu do rzucenia losowego zaklecia
     * zniszczenie jednorazowego przedmiotu celu
     * zwiekszenie Mocy
     * zwiekszenie mozliwosci przedmiotu

     */
   
    
    //--------------------------------------------------------------------------
    public Spell() {

    }
    
    
    public void execute(Mage caster, Mage target){
        
 
    }
    
    
    
//    
//    public void inflictDamage(Mage tar){
//        
//        tar.hp = tar.hp - this.dmg;
//        if (tar.hp < 1) tar.die();
//    }
//    
//    
    
}
