package egyetem_zarovizsga;

class Feladat_26 {
    
    public static void main(String[] args) {
    
        int[] arr = {2, 5, 23, 21, 3, 3, 8, 4, 66, 43, 98, 22};
        System.out.println( indexOfNum(arr, 3) );

    }

    static int indexOfNum( int[] arr, int num ) {
    
        int logHossz = (int)Math.log( (double)(arr.length) );

        for (int i = 0; i < logHossz; i++) {
            
            if (arr[i] == num) {
                return i;
            }

        }

        return -1;
    
    }

}