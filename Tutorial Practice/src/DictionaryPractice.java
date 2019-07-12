import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;

/**
 * The program use HashMap to generate a english Vietnamese dictionary.
 */
public class DictionaryPractice {
    public static void main (String[] args){
        Map<String, String>englishVietnameseDictionary = new HashMap<String,String>();

        //Putting Things inside our dictionary:
        englishVietnameseDictionary.put("Monday"    ,  "Thứ Hai");
        englishVietnameseDictionary.put("Tuesday"   ,  "Thứ Ba");
        englishVietnameseDictionary.put("Wednesday" ,  "Thứ Tư");
        englishVietnameseDictionary.put("Thursday"  ,  "Thứ Năm");
        englishVietnameseDictionary.put("Friday"    ,  "Thứ Sau");
        englishVietnameseDictionary.put("Saturday"  ,  "Thứ Bảy");
        englishVietnameseDictionary.put("Sunday"    ,  "Chủ Nhật");
        //Retrieve things from our dictionary:
        System.out.println(englishVietnameseDictionary.get("Wednesday"));
        System.out.println(englishVietnameseDictionary.get("Thursday"));
        System.out.println(englishVietnameseDictionary.get("Friday"));
        System.out.println(englishVietnameseDictionary.get("Saturday"));
        //Print out all keys:
        System.out.println(englishVietnameseDictionary.keySet());
        //Print out all values:
        System.out.println(englishVietnameseDictionary.values());
        //Print out dictionary's size:
        System.out.println("The Size of our Dictionary is " + englishVietnameseDictionary.size());
        //Shopping List
        Map<String,Boolean> shoppingList = new HashMap<String,Boolean>();
        shoppingList.put("Ham"  ,  true);
        shoppingList.put("Bread",  Boolean.TRUE);
        shoppingList.put("Oreo",   Boolean.TRUE);
        shoppingList.put("Eggs" ,  Boolean.FALSE);
        shoppingList.put("Sugar",  false);
        //Retrieve items
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Oreo"));
        //Key-Value Pairs Print Out
        System.out.println(shoppingList);

        //Is Empty?
        System.out.println(shoppingList.isEmpty());
        //Remove things
        shoppingList.remove("Eggs");
        //Replace values for a certain key
        shoppingList.replace("Bread", Boolean.TRUE);
        System.out.println(shoppingList);
        //Clear out dictionary
        shoppingList.clear();
        System.out.println(shoppingList);
    }
}
