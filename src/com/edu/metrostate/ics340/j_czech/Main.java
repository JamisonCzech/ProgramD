package com.edu.metrostate.ics340.j_czech;


import java.util.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


	// write your code here
        Map<String, Integer> classes = new HashMap<String, Integer>();

        Map<String, List<Integer>> icsClasses = new TreeMap<>();



        classes.put("Math", 120);
        classes.put("Math", 210);
        classes.put("Math", 215);
        classes.put("Liberal Studies", 998);
        classes.put("Liberal Studies", 999);


        // create list one and store values
        List<Integer> valSetOne = new ArrayList<Integer>();
        valSetOne.add(120);
        valSetOne.add(210);
        valSetOne.add(215);

        // create list two and store values
        List<Integer> valSetTwo = new ArrayList<Integer>();
        valSetTwo.add(140);
        valSetTwo.add(141);
        valSetTwo.add(232);

        // create list three and store values
        List<Integer> valSetThree = new ArrayList<Integer>();
        valSetThree.add(998);
        valSetThree.add(999);

        icsClasses.put("Math", valSetOne);
        icsClasses.put("ICS", valSetTwo);
        icsClasses.put("Liberal Studies", valSetThree);


        // iterate and display values
        System.out.println("Fetching Keys and corresponding [Multiple] Values n");
        for (Map.Entry<String, List<Integer>> entry : icsClasses.entrySet()) {
            String key = entry.getKey();
            List<Integer> values = entry.getValue();
            System.out.println("Key = " + key);
            System.out.println("Values = " + values + "n");
        }

        for (Object o : icsClasses.keySet()) {
            System.out.println(icsClasses.get(o));
        }



        for (Map.Entry<String, List<Integer>> entry : icsClasses.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        //
        // Create a hashtable and put some key-value pair.
        //
        HashMap<String, String> companies = new HashMap<String, String>();
        companies.put("eBay", "South San Jose");
        companies.put("Paypal", "North San Jose");
        companies.put("Google", "Mountain View");
        companies.put("Yahoo", "Santa Clara");
        companies.put("Twitter", "San Francisco");

//        // Get a random entry from the HashMap.
//        Object[] crunchifyKeys = companies.keySet().toArray();
//        Object key = crunchifyKeys[new Random().nextInt(crunchifyKeys.length)];
//        System.out.println("************ Random Value ************ \n" + key + " :: " + companies.get(key));

        List<Map.Entry<String, String>> list = new ArrayList<Map.Entry<String, String>>(companies.entrySet());

        // Bonus Crunchify Tips: How to Shuffle a List??
        // Each time you get a different order...
        System.out.println("\n************ Now Let's start shuffling list ************");
        Collections.shuffle(list);
        for (Map.Entry<String, String> entry : list) {
            System.out.println(entry.getKey() + " :: " + entry.getValue());
        }

        Object randomName = classes.keySet().toArray()[new Random().nextInt(classes.keySet().toArray().length)];

        List<Map.Entry<String, Integer>> swirlValues = new ArrayList<>(classes.entrySet());


        System.out.println("\n************ Now Let's start shuffling list the classes ************");
        Collections.shuffle(swirlValues);
        for (Map.Entry<String, Integer> entry : swirlValues) {
            System.out.println(entry.getKey() + " :: " + entry.getValue());
        }

        System.out.println("Random Class: " + randomName);


       int ran = RandomNumber.getRandomNumberInRange(1,7);

        System.out.println(ran);
    }






}
