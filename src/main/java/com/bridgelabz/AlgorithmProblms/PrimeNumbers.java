package com.bridgelabz.AlgorithmProblms;

public class PrimeNumbers {
    public static void main (String[] args)
    {
        int i ,num;
        //Empty String
        String  primeNumbers = "";

        for (i = 1; i <= 100; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter++;
                }
            }
            if (counter ==2)
            {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.print("Prime numbers from 1 to 100 are : ");
        System.out.print(primeNumbers);
    }
}
