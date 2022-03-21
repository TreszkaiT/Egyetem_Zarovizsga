package egyetem_zarovizsga;

class Feladat_15 {

    public static void main(String[] args) {
        
        System.out.println( deleteThisChar( args[0], args[1] ) );

    }

    static String deleteThisChar( String s, String c ) {

        char ch = c.charAt(0);
        char[] splitted = s.toCharArray();
        StringBuilder newString = new StringBuilder();

        for (char item : splitted) {
            
            if( item != ch ) newString.append( item );

        }

        return newString.toString();

    }

}