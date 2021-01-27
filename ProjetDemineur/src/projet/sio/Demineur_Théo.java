/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.sio;

/**
 *
 * @author delot
 */
public class Demineur_Théo {
  
    /**
    * retourne true s'il existe un "M" à cet indice
    *
    * @author Thierry
    *
    * @param tDemineur tableau de la grille du démineur
    * @param indice indice dans tDemineur. Doit être compris entre 0 et 99
    *
    * @return
    *    true il y a une mine à indice.
    *    false pas de mine à indice.
    *
    */
    public static boolean isMine(String[] tDemineur, int indice){
       if (tDemineur[indice] == "M" ) return true;
       return false;
    }
    
}
