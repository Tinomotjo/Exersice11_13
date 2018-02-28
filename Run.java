package Exersice11_13;
import java.util.*;
/*
Write a method isUnique that accepts a map whose keys and values
are strings as a parameter and returns true if no two keys map to the same value
(and false if any two or more keys do map to the same value). For example,
if the map contains the following key/value pairs, your method would return true:
{Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins}.
But calling it on the following map would return false, because of two mappings for Perkins and Reges:
{Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges, Hal=Perkins}.
 */


public class Run
{

    public static void main(String[] args)
    {
        Map<String, String> list2 = new TreeMap<>();
        list2.put("Bo", "1");
        list2.put("Carl", "2");
        list2.put("Simon", "54");
        list2.put("Tino", "21");
        list2.put("Mark", "21");
        list2.put("Gunner", "18");


        System.out.println(isUnique(list2));


    }


    public static Boolean isUnique(Map<String, String> list)
    {

        Set<String> set = new HashSet<>();
        set.addAll(list.values());
        if(set.size()<list.keySet().size())
        {
            return false;
        }
        return true;
    }





}
