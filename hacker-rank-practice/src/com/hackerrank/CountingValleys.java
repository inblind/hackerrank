package com.hackerrank;

public class CountingValleys {

    public static int countingValleys(String path){

        int result = 1;
        int valleys = 0;

        for(int i = 0; i < path.length(); i++){

            if(path.charAt(i) == 'U')
                result += 1;
            else
                result -= 1;

            if( i > 0 && path.charAt(i) == 'U' && result == 1)
                valleys++;
        }

        return valleys;

    }

}