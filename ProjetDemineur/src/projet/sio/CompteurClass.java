package projet.sio;

public class CompteurClass {
    public static char compteurBombeHaut(char[] tDemineur, int valeurPosition) {
        int compteurBombeHaut = 0;
        char charBombeHaut;
        if (tDemineur[valeurPosition-1]=='M'){
            compteurBombeHaut++;
        }
        if (tDemineur[valeurPosition+1]=='M'){
            compteurBombeHaut++;
        }
        if (tDemineur[valeurPosition+9]=='M'){
            compteurBombeHaut++;
        }
        if (tDemineur[valeurPosition+10]=='M'){
            compteurBombeHaut++;
        }
        if (tDemineur[valeurPosition+11]=='M'){
            compteurBombeHaut++;
        }

        charBombeHaut=intToChar(compteurBombeHaut);
        return charBombeHaut;
    }

    public static char compteurBombeBas(char[] tDemineur, int valeurPosition) {
        int compteurBombeBas = 0;
        char charBombeBas;
        if (tDemineur[valeurPosition-1]=='M'){
            compteurBombeBas++;
        }
        if (tDemineur[valeurPosition+1]=='M'){
            compteurBombeBas++;
        }
        if (tDemineur[valeurPosition-9]=='M'){
            compteurBombeBas++;
        }
        if (tDemineur[valeurPosition-10]=='M'){
            compteurBombeBas++;
        }
        if (tDemineur[valeurPosition-11]=='M'){
            compteurBombeBas++;
        }

        charBombeBas=intToChar(compteurBombeBas);
        return charBombeBas;
    }

    public static char compteurBombeGauche(char[] tDemineur, int valeurPosition) {
        int compteurBombeGauche = 0;
        char charBombeGauche;
        if (tDemineur[valeurPosition+1]=='M'){
            compteurBombeGauche++;
        }
        if (tDemineur[valeurPosition-9]=='M'){
            compteurBombeGauche++;
        }
        if (tDemineur[valeurPosition-10]=='M'){
            compteurBombeGauche++;
        }
        if (tDemineur[valeurPosition+10]=='M'){
            compteurBombeGauche++;
        }
        if (tDemineur[valeurPosition+11]=='M'){
            compteurBombeGauche++;
        }

        charBombeGauche=intToChar(compteurBombeGauche);
        return charBombeGauche;
    }

    public static char compteurBombeDroite(char[] tDemineur, int valeurPosition) {
        int compteurBombeDroite = 0;
        char charBombeDroite;
        if (tDemineur[valeurPosition+1]=='M'){
            compteurBombeDroite++;
        }
        if (tDemineur[valeurPosition-9]=='M'){
            compteurBombeDroite++;
        }
        if (tDemineur[valeurPosition-10]=='M'){
            compteurBombeDroite++;
        }
        if (tDemineur[valeurPosition+10]=='M'){
            compteurBombeDroite++;
        }
        if (tDemineur[valeurPosition+11]=='M'){
            compteurBombeDroite++;
        }

        charBombeDroite=intToChar(compteurBombeDroite);
        return charBombeDroite;
    }

    public static char compteurBombeMilieu(char[] tDemineur, int valeurPosition) {
        int compteurBombeMilieu = 0;
        char charBombeMilieu;
        if (tDemineur[valeurPosition+1]=='M'){
            compteurBombeMilieu++;
        }
        if (tDemineur[valeurPosition-1]=='M'){
            compteurBombeMilieu++;
        }
        if (tDemineur[valeurPosition-9]=='M'){
            compteurBombeMilieu++;
        }
        if (tDemineur[valeurPosition+9]=='M'){
            compteurBombeMilieu++;
        }
        if (tDemineur[valeurPosition-10]=='M'){
            compteurBombeMilieu++;
        }
        if (tDemineur[valeurPosition+10]=='M'){
            compteurBombeMilieu++;
        }
        if (tDemineur[valeurPosition-11]=='M'){
            compteurBombeMilieu++;
        }
        if (tDemineur[valeurPosition+11]=='M'){
            compteurBombeMilieu++;
        }

        charBombeMilieu=intToChar(compteurBombeMilieu);
        return charBombeMilieu;
    }

    public static char compteurBombeCoin(char[] tDemineur,int valeurPosition){
        int cBombe= 0 ;
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
