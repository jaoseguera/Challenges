package com.codewars.challenges;

import java.util.List;

public class Algorithms 
{
    public int countSmileys(List<String> arr) {
        // int counter = 0;        
        String pattern = "[:;][-~]?[)D]";
        
        // for(int i=0; i<arr.size();i++){
        //     if(arr.get(i).matches(pattern))
        //         counter++;
        // }
        // return counter;
        System.out.println(arr.stream());

        return (int)arr.stream().filter(x -> x.matches(pattern)).count();
    }
}
