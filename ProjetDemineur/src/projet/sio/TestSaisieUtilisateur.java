package projet.sio;

public class TestSaisieUtilisateur {
    public static boolean testSaisie(String position){

        boolean charUn=false;
        boolean charDeux=false;
        boolean charTrois=false;
        if(position.length()==2 || position.length()==3) {
            if (position.length() == 2) {
                charUn = charUn(position.charAt(0));
                charDeux = charDeux(position.charAt(1));
                if(charUn&charDeux){
                    return true;
                }
            }
            if (position.length() == 3) {
                charUn = charUn(position.charAt(0));
                charDeux = charDeux(position.charAt(1));
                charTrois = charTrois(position.charAt(2));

                if(charUn&charDeux&charTrois){
                    return true;
                }
                return false;
            }
        }

        return false;
    }

    public static boolean charUn(char char1){
        if(char1>=65 && char1<=74){
            return true;
        }
        return false;
    }
    public static boolean charDeux(char char2){
        if(char2=='1' || char2=='2' || char2=='3' || char2=='4' || char2=='5' || char2=='6' || char2=='7' || char2=='8' || char2=='9'){
            return true;
        }
        return false;
    }

    public static boolean charTrois(char char3){
        if(char3=='0'){
            return true;
        }
        return false;
    }
}
