/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.sio;

import plum.console.Clavier;

import java.awt.*;
import java.util.Locale;

/**
 *
 * @author theo
 */
public class HelloDemineur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        char[] tLettre = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',};
        char[] tDemineur = new char[100];
        char[] tPlayer = new char[100];
        String difficulte;

        Demineur_Théo.initPlayer(tPlayer);
        Demineur_Théo.affiche(tLettre,tPlayer);
        boolean continuer = true;
        boolean saisie=false;
        String position;
        while (continuer) {

            do {
                position = Clavier.lireTexte("Saisissez une position : ");
                position=position.toUpperCase();
                saisie=TestSaisieUtilisateur.testSaisie(position);
                if(!saisie){
                    System.out.println("La position indiqué n'existe pas ! \nVeuillez réessayer !");
                }
            }while(!saisie);

            int valeurPosition = Demineur_Théo.position(position);

            if (Demineur_Théo.isMine(tDemineur, valeurPosition)) {
                tPlayer[valeurPosition] = 'X';
                Demineur_Théo.affiche(tLettre, tPlayer);
                continuer = false;
            } else {
                Demineur_Théo.nombreBombe(tDemineur,valeurPosition,tLettre,tPlayer);
                Demineur_Théo.affiche(tLettre,tPlayer);
                continuer=Demineur_Théo.testWin(tPlayer,tDemineur);
            }
        }
        if(!continuer){
            System.out.println("Vous avez perdu !");
        } else {
            System.out.println("Vous avez gagné ! ");
        }
    }
}

