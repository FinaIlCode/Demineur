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
     * @param tDemineur tableau de la grille du démineur
     * @return true il y a une mine à indice.
     * false pas de mine à indice.
     * @author Thierry
     */
    public static void affiche(char[] tLettre, char[] tDemineur) {
        System.out.println("  1 2 3 4 5 6 7 8 9 10");
        int k = 0;
        int l = 10;
        int compteur=0;
        for (int i = 0; i < 10; i++) {
            System.out.print(tLettre[i]);
            System.out.print(" ");
            for (int j = k; j < l; j++) {
                if (tDemineur[j] == 'M') {
                    System.out.print("M ");
                } else {
                    if(tDemineur[compteur] == '1' ||tDemineur[compteur] == '2' ||tDemineur[compteur] == '3' ||tDemineur[compteur] == '4' ||tDemineur[compteur] == '5' ||tDemineur[compteur] == '6' ||tDemineur[compteur] == '7' ||tDemineur[compteur] == '8' ||tDemineur[compteur] == '9' ){
                        System.out.print(tDemineur[compteur] + " ");
                    } else {
                        if (tDemineur[compteur]=='X') {
                            System.out.print(tDemineur[compteur] + " ");
                        } else{
                            if(tDemineur[compteur]=='0'){
                                System.out.print("0 ");
                            } else {
                                System.out.print("- ");
                            }
                        }
                    }
                }
                compteur++;
            }
            k = k + 10;
            l = k + 10;
            System.out.println("");
        }

    }


    public static boolean isMine(char[] tDemineur, int indice) {
        indice--;
        if (tDemineur[indice] == 'M') return true;
        return false;
    }

    public static void initParti(char[] tDemineur){
        int mine = 10;
        int random;
        while(mine>0){
            random = (int)(Math.random()*99);
            System.out.println(random);
            tDemineur[random] = 'M';
            mine--;
        }
    }

    public static int position (String coordonne){
        char lettre;
        char unite;
        int position;
        if(coordonne.length()==2) {
            lettre = coordonne.charAt(0);
            position = traitementPosition(lettre);
            unite = coordonne.charAt(1);
            position += traitementPosition(unite);
        } else {
            lettre = coordonne.charAt(0);
            position = traitementPosition(lettre);
            position+=10;
        }

        return position;
    }


    private static int traitementPosition(char caractere){
        int valeur = 0;
        switch(caractere){
            case 'A':
                valeur = 0;
                break;
            case 'B':
                valeur = 10;
                break;
            case 'C':
                valeur = 20;
                break;
            case 'D':
                valeur = 30;
                break;
            case 'E':
                valeur = 40;
                break;
            case 'F':
                valeur = 50;
                break;
            case 'G':
                valeur = 60;
                break;
            case 'H':
                valeur = 70;
                break;
            case 'I':
                valeur = 80;
                break;
            case 'J':
                valeur = 90;
                break;
            case '1':
                valeur = 1;
                break;
            case '2':
                valeur = 2;
                break;
            case '3':
                valeur = 3;
                break;
            case '4':
                valeur = 4;
                break;
            case '5':
                valeur = 5;
                break;
            case '6':
                valeur = 6;
                break;
            case '7':
                valeur = 7;
                break;
            case '8':
                valeur = 8;
                break;
            case '9':
                valeur = 9;
                break;


        }
        return valeur;
    }

    public static char compteurBombe(char[] tDemineur,int valeurPosition){
        int cBombe= 0 ;
        valeurPosition--;
        //Coins
        if(valeurPosition == 0 || valeurPosition == 9 || valeurPosition == 90 || valeurPosition == 99 ){
            if(valeurPosition==0){
                if (tDemineur[valeurPosition+1]=='M') {
                    cBombe++;
                }
                if (tDemineur[valeurPosition+10]=='M'){
                    cBombe++;
                }
                if (tDemineur[valeurPosition+11]=='M'){
                    cBombe++;
                }
            }

            if(valeurPosition==9){
                if (tDemineur[valeurPosition-1]=='M') {
                    cBombe++;
                }
                if (tDemineur[valeurPosition+9]=='M'){
                    cBombe++;
                }
                if (tDemineur[valeurPosition+10]=='M'){
                    cBombe++;
                }
            }

            if(valeurPosition==90){
                if (tDemineur[valeurPosition+1]=='M') {
                    cBombe++;
                }
                if (tDemineur[valeurPosition-10]=='M'){
                    cBombe++;
                }
                if (tDemineur[valeurPosition-11]=='M'){
                    cBombe++;
                }
            }

            if(valeurPosition==99){
                if (tDemineur[valeurPosition-1]=='M') {
                    cBombe++;
                }
                if (tDemineur[valeurPosition-10]=='M'){
                    cBombe++;
                }
                if (tDemineur[valeurPosition-11]=='M'){
                    cBombe++;
                }
            }
        }
        char charBombe= intToChar(cBombe);
        return charBombe;
    }

    private static char intToChar(int i){
        String s = ""+i;
        return s.charAt(0);
    }

}