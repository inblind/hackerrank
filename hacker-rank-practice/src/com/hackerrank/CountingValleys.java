package com.hackerrank;

//https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

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