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

    public boolean isValid(char[] walk) {
        int north = 0, south = 0, east = 0, west = 0;
        if(walk.length == 10){
            for (int i = 0; i < walk.length; i++) {
                switch (walk[i]) {
                    case 'n':
                        north++;
                        break;
                    case 's':
                        south++;
                        break;
                    case 'e':
                        east++;
                        break;
                    case 'w':
                        west++;
                        break;
                }
            }
            if (north == south && east == west)
                return true;
        }
        return false;
    }

    public int reverseInt(int n) {
        int reversed = 0;
        while(n != 0){
            reversed = reversed * 10 + (n % 10);
            n /= 10;
        }
        return reversed;
    }

    public boolean feast(String beast, String dish) {
        char lastChar = beast.charAt(beast.length()-1);
        char firstChar = beast.charAt(0);

        System.out.println(lastChar);

        return dish.charAt(0) == firstChar && dish.charAt(dish.length()-1) == lastChar;

    }

    public String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter attacker = (fighter1.name.equals(firstAttacker)) ? fighter1 : fighter2;
        Fighter defender = (attacker.equals(fighter2)) ? fighter1 : fighter2;
        Fighter temp = null;

        while(fighter1.health > 0 || fighter2.health > 0) {
            defender.health -= attacker.damagePerAttack;

            temp = defender;
            defender = attacker;
            attacker = temp;
        }

        return temp.name;
    }

    public int arithmetic(int a, int b, String operator) {
        switch (operator) {
        case "add":
            System.out.println(a+b);
            return a + b;
        case "subtract":
            System.out.println(a - b);
            return a - b;
        case "multiply":
            System.out.println(a * b);
            return a * b;
        default:
            System.out.println(a / b);
            return a / b;
        }
    }
    
    public String makeReadable(int time) {
        if(time == 0)
            return "00:00:00";

        String hours = "00";
        String minutes = "00";
        String seconds = "00";
        int remainder = time % 3600;
        
        if(time/3600 != 0) {
            if (time / 3600 < 10)
                hours = "0" + time / 3600;
            else
                hours = String.valueOf(time / 3600);
        }

        if(remainder/60 != 0) {
            if (remainder / 60 < 10)
                minutes = "0" + remainder / 60;
            else
                minutes = String.valueOf(remainder / 60);
        }
         remainder = remainder % 60;

         if(remainder != 0) {
            if (remainder < 10)
                seconds = "0" + remainder;
            else
                seconds = String.valueOf(remainder);
         }
        return String.format("%s:%s:%s", hours, minutes, seconds);
    }
}
