package com.hemant.junit.udemy;

public class App 
{
    public static void main( String[] args )
    {
        StringHelper stringHelper = new StringHelper();
        String str = stringHelper.truncateAInFirst2Positions("AABCDAS");
        System.out.println(str);
        
        boolean result = stringHelper.areFirstAndLastTwoCharactersTheSame("ABYZXAB");
        System.out.println(result);
    }
}
