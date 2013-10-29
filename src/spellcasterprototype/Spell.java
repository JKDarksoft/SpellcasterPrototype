/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spellcasterprototype;

import java.io.Serializable;
import java.util.ArrayList;

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
    
    
   public ArrayList<int[]> effList = new ArrayList<>();
   
   
    
    
    //--- DZIALANIE SPELLA -----------------------------------------------------
    
    /*--- LISTA MOZLIWYCH EFEKTOW ---
     * ?? przejecie kontroli nad celem - rzuty obronne? jak uniknac?
     * ?? zmiana scenerii - jesli beda jakies scenerie, powinny wplywac na rozgrywke (?)
     * ?? zmiana w inna istote - daleka przyszlosc
     * 
     * Heal
     * InflictDamage
     * EffectInvunrablility
     * 
     * mozliwosc zrobienia wiecej niz 1 akcji w turze
     * //  na cel dzialaja tylko zaklecia obszarowe
     * niemoznosc rzucenia konkretnych zaklec
     * niewrazliwosc na obr
     * niewrazliwosc na zaklecie
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
     * zatrzymanie czasu
     * zmuszenie celu do rzucenia losowego zaklecia
     * zniszczenie jednorazowego przedmiotu celu
     * zwiekszenie Mocy
     * zwiekszenie mozliwosci przedmiotu

     */
   
    
    //--------------------------------------------------------------------------
    public Spell() {

    }
    
    
    public void addEffect(int effIndex, int v1, int t){
        int[] eff = new int[3];
        eff[0] = effIndex;
        eff[1] = v1;
        eff[2] = t; 
        effList.add(eff);
    }
    
    
    public void execute(Mage caster, Mage target){
        Effect ef = new Effect();
        for(int i=0; i < effList.size(); i++){
        int ti = effList.get(i)[0];
        int tv1 = effList.get(i)[1];
        int tt = effList.get(i)[2];
        
        
        if (ti == ef.iInflictDamage) ef.eInflictDamage(target, tv1, tt, tt);else
        if (ti == ef.iHeal) ef.eHeal(target, tv1, tt, tt);
       
        }
 
    }
    
    
    

    
}
