package egyetem_zarovizsga;

/* Írjon olyan függvényt vagy metódust, amely megszámolja egy adott karakterlánc vagy
sztring összes előfordulását egy másik karakterláncban vagy sztringben! */

class Feladat_16 {

    public static void main(String[] args) {
        
        System.out.println( incidence( args[0], args[1] ));

    }

    static int incidence( String string, String subString ) {

        int counter = 0;
        String newString = string.toLowerCase();
        int i;

        while( newString.indexOf(subString) != -1 ) {

            i = newString.indexOf( subString );
            newString = newString.substring( i + subString.length());
            // System.out.println( newString );
            
            counter++;

        }

        return counter;

    }

}