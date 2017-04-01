package com.sdajava.java8problems;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by RENT on 2017-04-01.
 */
public class ArrayExec {

    public static <T> T lastElement(List<T> elements) { // metoda generyczna, żeby była wazna dla każdego rodzaju list
        //int numberOfElement = elements.size();
        return elements.get(elements.size() - 1); //numberOfElement -1);
    }

    public static <T> T lastElementOfALinkedList(LinkedList<T> elements) {
        return elements.getLast();
    }

    public static <T> long length(List<T> list) {
        // return list.size(); <-- 1. sposób, można na typie zwracanym int
        return list.stream().count(); // typ zwracany musi być long
    }
    public static <T> List<T> reverses(List<T> list) {
        Collections.reverse(list);
        return list;
    }

  /*  public static <T> List<T> reverseStream(List<T> list) {
        int size = list.size();
        return IntStream.iterate(size - 1, el -> el - 1).limit(size).mapToObj(list::get).collect(toList);

    }
*/
    public static <T> boolean isPalindrome(List<T> list) {
        List<T> lista2 = new ArrayList<T>(list);
        Collections.reverse(list);
        return Objects.equals(list, lista2);
    }

    public static <T> List<T> compress(List<T> list) {
        List<T> newList = new ArrayList<T>();
        newList.add(list.get(0));

        for(int i = 1; i < list.size(); i++ ){
          for(int j = 0; j < newList.size(); j++ ){
              if( !newList.contains(list.get(i)))
                  newList.add(list.get(i));
          }
        } System.out.println(newList);
       return newList;
    }

    public static <T> List<T> duplicate(List<T> list, int n) {
        List<T> newList = new ArrayList<T>();

        for (int i = 0; i < list.size(); i++) {
            for (int k = 0; k < n; k++) {
                newList.add(list.get(i));
            }
        }    return newList;
    }

    public static <T> List<T> duplicatesWithStream (List<T> list , int n){
        return list.stream().flatMap(e -> Collections.nCopies(n, e).stream()).collect(Collectors.toList());
    }

    public static <T>List<T> dropEveryNth(List<T> list, int n) {
        List<T> newList = new LinkedList<T>();

         for(int i = 0; i < list.size(); i++){
            if ((i+1) % n != 0) {
              newList.add(list.get(i));
             }
         }
         return newList;
    }
}
