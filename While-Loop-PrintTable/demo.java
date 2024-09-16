//While loop is another loop like for loop but unlike for loop it only checks for one condition.
//
//        Here, we will use a while loop and print a number n's table in reverse order.
//
//        Note : As the code is checked against multiple test cases, don't forget to add a new line as it is necessary after every execution.
//
//        Example 1:
//
//        Input:
//        1
//
//        Output:
//        10 9 8 7 6 5 4 3 2 1


//User function Template for Java
class Geeks {
    static void printTable (int n)
    {
        int c=0;
        int multiplier=10;
        while(multiplier>0)
        {
            //Your code here
            c = n*multiplier;
            -- multiplier ;
            System.out.print(c + " " );

        }

    }

}