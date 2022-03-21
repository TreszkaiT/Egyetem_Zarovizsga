package egyetem_zarovizsga;

class Feladat_24 {

    public static void main(String[] args) {
        
        int[] arr = { 30, 2, 4, 5, 14, 52, 3, 1, 18 };
        System.out.println( whichIndex(arr) );

    }

    static int whichIndex( int[] arr ) {

        int smallestIndex = 0;
        int multipOfFirstTwoElement = arr[0] * arr[1];
        int sum = 0;

        for (int i = 2; i < arr.length; i++) {
            
            sum = 0;

            for (int j = 0; j < i - 1; j++) {
                
                sum += arr[j];

            }

            if ( sum > multipOfFirstTwoElement ) {
                
                smallestIndex = i;
                return smallestIndex;

            }

        }

        return smallestIndex;

    }

}