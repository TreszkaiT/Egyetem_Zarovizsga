package egyetem_zarovizsga;

import java.util.Random;

class Feladat_19 {

    public static void main( String[] args ) {

        System.out.println( insertAChar( args[0] ) );

    }

    static String insertAChar( String string ) {

        Random rand = new Random();
        int stringLength = string.length();
        int rndInt;
        StringBuilder newString = new StringBuilder();
        String firstPart, secondPart;

        rndInt = Math.abs( (int)(rand.nextInt() % stringLength ));
        
        firstPart = string.substring( 0, rndInt );
        secondPart = string.substring( rndInt + 1 );

        newString.append(firstPart + 'a' + secondPart);

        return newString.toString();


    }

}