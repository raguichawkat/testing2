public class minmax {

    public int [] minmax (int Array[] ){

        int x =Array.length;

        int [] minmax = {Array[0] , Array[0]}; // minmax[0] is the minimum value and minmax[1] is the maximum value

        for ( int i=1; i<x; i++){
            if(Array[i] <= minmax[0])
                minmax[0] = Array[i];
            else if (Array[i] >= minmax[1])
                minmax[1] = Array[i];
        }

        return minmax;

    }
}
