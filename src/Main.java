import java.util.Scanner;

public class Main
{
    static void linear_search( int target, int[] array )
    {
        for( int i = 0; i < array.length; i++ )
        {
            if( array[i] == target )
            {
                System.out.println( "found in index " + i );
                return;
            }
        }
        System.out.println( "not found" );
    }

    static void binary_search( int target, int[] array )
    {
        int start = 0;
        int end = array.length - 1;
        int mid;
        while( start <= end )
        {
            mid = ( start + end ) / 2;
            if( array[mid] == target )
            {
                System.out.println( "found in " + mid );
                return;
            }
            else if( array[mid] > target )
            {
                end = mid - 1;
            }
            else
            {
                start = mid - 1;
            }
        }
    }

    static int largeValue( int[] array )
    {

        int nextIndex = 0;
        int temp = array[nextIndex];
        while( nextIndex < array.length )
        {
            if( temp <= array[nextIndex] )
            {
                temp = array[nextIndex];

            }
            nextIndex++;
        }
        return temp;

    }

    static int[] numArray = { 2, 3, 588, 7, 8, 0, 12, 4, 5, 6, 6, 99, 7, 77, 9, 2, 3, 2, 4, 2, 4, 2, 4, 3, 4 };
    static int[] sortedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

    public static void main( String[] args )
    {
        //Linear Search
        Scanner scanner1 = new Scanner( System.in );
        System.out.println( "Enter number" );
        int num = scanner1.nextInt();
        linear_search( num, numArray );

        //Binary Search

        System.out.println( "Enter num" );
        int num2 = scanner1.nextInt();
        binary_search( num2, sortedArray );

        //Find second largest value in a array
        int num1 = largeValue( numArray );
        int num3 = largeValue( sortedArray );
        int[] tempArray = new int[numArray.length - 1];
        for( int i = 0; i < numArray.length - 1; i++ )
        {
            if( numArray[i] != num1 )
            {
                tempArray[i] = numArray[i];

            }
        }
        System.out.println( largeValue( tempArray ) );

    }
}
