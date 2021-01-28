/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.sio;

import plum.console.Clavier;

import java.awt.*;

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

        Demineur_Théo.initParti(tDemineur);
        Demineur_Théo.affiche(tLettre, tDemineur);
        Boolean continuer = true;

        while (continuer) {

            String position = Clavier.lireTexte("Saisissez une position : ");
            int valeurPosition = Demineur_Théo.position(position);

            if (Demineur_Théo.isMine(tDemineur, valeurPosition)) {
                tDemineur[valeurPosition] = 'X';
                Demineur_Théo.affiche(tLettre, tDemineur);
                System.out.println("Vous avez perdu ! ");
                continuer = false;
            } else {
                tDemineur[valeurPosition-1]=Demineur_Théo.compteurBombe(tDemineur,valeurPosition);
                Demineur_Théo.affiche(tLettre, tDemineur);
            }
        }
    }
}

    

