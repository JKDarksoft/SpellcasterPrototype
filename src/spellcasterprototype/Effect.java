/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spellcasterprototype;

/**
 *
 * @author JK
 */
public class Effect {
    private int effIndex;
    
    
    public int iInflictDamage = 1;
    public int iHeal = 2;
    public int iEffectInvulnerability = 3;

    public Effect() {
    }
    
    
    
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
    
//    public void eAccelerate(Mage trg, int v, int d){
//        //trg.cAccelerated(v, d);
//    }
    
    public boolean checkEffectInvulnerability(Mage trg, int effi){
        
        
        for (int i = 0; i < trg.actEffList.size(); i++) {
            if (trg.actEffList.get(i)[0] == iEffectInvulnerability){
                if (trg.actEffList.get(i)[1] == effi){
                    System.out.println("Efekt nie zadzialal!");
                    return true;
                }  
            }
        }
        return false;
    }
    
    
    public void eHeal(Mage trg, int v, int t, int tleft){
        
        boolean active=true;
        if (checkEffectInvulnerability(trg, iHeal)) active=false;
         
        if (active==true){
            trg.hp = trg.hp+v;
            if (trg.hp > trg.maxHp) trg.hp =trg.maxHp;
                if ((t>1)&(tleft==t)){
                    int[] ef = new int[3];
                    ef[0] = iHeal;
                    ef[1] = v;
                    ef[2] = tleft--;
                    trg.actEffList.add(ef);
                }
            } 
    }
    
    public void eInflictDamage (Mage trg, int v, int t, int tleft){
        
        boolean active=true;
        if (checkEffectInvulnerability(trg, iInflictDamage)) active=false;
         
        if (active==true){
            trg.hp = trg.hp - v;
            if (trg.hp < 0) trg.die();
            if ((t>1)&(tleft==t)){
                int[] ef = new int[3];
                ef[0] = iInflictDamage;
                ef[1] = v;
                ef[2] = tleft--;
                trg.actEffList.add(ef);
            }
        }
    }
    
    public void eEffectInvunrablility(Mage trg, int v, int t, int tleft){
        
        boolean active=true;
        if (checkEffectInvulnerability(trg, iInflictDamage)) active=false;
         
        if (active==true){
            if ((t>1)&(tleft==t)){
                int[] ef = new int[3];
                ef[0] = effIndex;
                ef[1] = v;
                ef[2] = tleft--;
                trg.actEffList.add(ef);
            } 
        }
    }
    
    
//    public void eUntargetable(Mage trg){
//        // TO DO **********************************************
//    }
    

    
    
    
    
    
}
