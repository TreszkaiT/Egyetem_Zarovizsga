package egyetem_zarovizsga;

class Feladat_14 {

    public static void main(String[] args) {
        
        System.out.println( wordsToUppercase( args[0] ) );

    }

    static String wordsToUppercase( String s ) {

        String[] words =  s.split("\\s");
        StringBuilder newString = new StringBuilder();

        for( int i=0; i < words.length; i++ ) {

            newString.append( words[i].substring(0,1).toUpperCase() + words[i].substring(1) + " " );

        }

        return newString.toString();

    }

}