import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int vals[] = {1, 2, 3, 4, 5, 6, 7, 3, 9, 10};

        System.out.println(Arrays.toString(reverse(vals)));
    }

    //return the max value in array a
    public static int maxValue(int a[]) 
    {
        //assume the max value is in index 0
        int currentMax = a[0];

        /* 
         * for loop through the rest of the array
         * we start at 1, because we already processed
         * element 0
         */
        for(int i=1; i < a.length; i++)
        {
            //grab the next value in the array
            int current = a[i];

            //if the current value is larger than our currentMax
            if(current > currentMax)
            {
                //set currentMax to current, we found a larger value
                currentMax = current;
            }
        }

        //return the currentMax
        return currentMax;
    }

    //return the index of where the max value is located
    public static int maxIndex(int a[]) 
    {
        //assume the max value is in index 0
        int maxIndex = 0;

        /* 
         * for loop through the rest of the array
         * we start at 1, because we already processed
         * element 0
         */
        for(int i=1; i < a.length; i++)
        {
            //grab the next value in the array
            int current = a[i];

            //if the current value is larger than our currentMax
            if(current > a[maxIndex])
            {
                //set currentMax to i, the index where we found a new max
                maxIndex = i;
            }
        }

        //return the maxIndex
        return maxIndex;
    }

    //find the sum of the entire array
    public static int sum(int a[]) 
    {
        //create a total to add to
        int total = 0;

        //for loop through the entire array
        for(int i=0; i < a.length; i++) 
        {
            //grab the next value
            int current = a[i];

            //add the current value to total
            total += current;
        }

        //return the total
        return total;
    }

    //find the average of the array
    public static double average(int a[]) 
    {
        //find the total by calling method sum
        //that we previously wrote
        int total = sum(a);

        //return the average, casting total to make
        //sure we get a floating point answer (double)
        return (double)total / a.length;
    }
    
    /*
     * Algorithm: determine if at lest one element as a particular property
     * returns true if array a contains at least one zero, false otherwise
     */
    public static boolean containsAZero(int a[])
    {
        //loop through the entire array
        for(int i=0; i < a.length; i++)
        {
            //grab the current value
            int current = a[i];

            //if the current value is a zero
            if(current == 0)
            {
                //return true, we found a zero
                return true;
            }
        }

        //if we got through the whole array without returning true,
        //return false
        return false;
    }

    /*
     * Algorithm: determine if all elements have a particular property
     * returns true if all elements are positive, false otherwise
     */
    public static boolean allPositive(int a[])
    {
        //loop through the entire array
        for(int i=0; i < a.length; i++)
        {
            //grab the current value
            int current = a[i];

            //if the current value is negative
            if(current < 0) 
            {
                //return false, we found a negative value
                return false;
            }
        }

        //if we made it through the whole array without returning false,
        //return true
        return true;
    }

    /*
     * Algorithm: determine the number of elements having a particular property
     * returns the total number of positive values in array a
     */
    public static int countPositives(int a[])
    {
        //create a count variable to count the number of positives
        int count = 0;

        //loop through the entire array
        for(int i=0; i < a.length; i++)
        {
            //grab the current value
            int current = a[i];

            //if the current value is positive
            if(current > 0)
            {
                //add one to count
                count++;
            }
        }

        //return the total number of positives we counted
        return count;
    }

    /*
     * Algorithm: access all consecutive pairs of elements
     * returns true if the array is in ascending order,
     * false otherwise
     */
    public static boolean inOrder(int a[])
    {
        //loop through the array, stopping one before the end
        for(int i=0; i < a.length-1; i++)
        {
            //grab the current value
            int current = a[i];

            //grab the next value after current
            int next = a[i+1];

            //if current is greater than next
            if(current > next)
            {
                //they are not in order, return false
                return false;
            }
        }

        //if we never return false, they must all be in order
        return true;
    }

    /*
     * Algorithm: determine the presence or absence of duplicate elements
     * returns true if there are muliples 3's in the array, false
     * otherwise
     */
    public static boolean multiple3s(int a[]) 
    {
        //a boolean variable to indicate if I have found a three
        boolean found3 = false;

        //loop through the entire array
        for(int i=0; i < a.length; i++)
        {
            //grab the current value
            int current = a[i];

            //if current is a 3 and I have not yet found a 3
            if(current == 3 && !found3)
            {
                //set found3 to true, I have found a 3!
                found3 = true;
            }
            //if current is a 3 and I have already found a 3.
            else if(current == 3 && found3)
            {
                //return true, there are mulitple 3's
                return true;
            }
        }

        //if I get through the whole array and never return true
        //then there are no muliple 3's in the array
        return false;
    }

    /*
     * Algorithm: shift elements left or right
     * return a new integer array that is the same length as
     * the parameter but you
     * remove all the negative values in the parameter
     * and shift all the positive values
     * to the front of the array, the back of array should be 
     * filled with zeros (if need be)
     */
    public static int[] removeNegatives(int a[])
    {
        //create a new array that is the same lenght as parameter a
        int ans[] = new int[a.length];

        //create a variable to keep track of where we are in the
        //new array
        int currentIndex = 0;

        //loop through the entire array parameter
        for(int i=0; i < a.length; i++)
        {
            //grab the current value
            int current = a[i];

            //if current is a positive number
            if(current > 0) {
                //move the value over to the new array
                //in the correct index
                ans[currentIndex] = current;

                //increment the index
                currentIndex++;
            }
        }

        //return the newly created array
        return ans;

    }

    /*
     * Algorithm: reverse the order of the elements
     * returns a new array with the order of the elements
     * in parameter a reversed.
     */
    public static int[] reverse(int a[])
    {
        //create a new array that is the same lenght as parameter a
        int ans[] = new int[a.length];

        //create a variable to keep track of where we are in the
        //new array
        int currentIndex = 0;

        //loop through the entire array parameter backwards
        for(int i = a.length-1; i >= 0; i--)
        {
            //grab the current value
            int current = a[i];

            //put the current value in the new array
            ans[currentIndex] = current;

            //increment the current index
            currentIndex++;
        }

        //return the newly created array
        return ans;
    }
}
