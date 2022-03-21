package egyetem_zarovizsga;

class Feladat_9 {
    
    public static void main(String[] args) {
        
        System.out.println( "Jobbról a második bit: " + jobbrolMasodikBit(321) );

    }

    static int jobbrolMasodikBit( int szam ) {

        int szam2 = szam / 2;
        return szam2 % 2;

    }

}