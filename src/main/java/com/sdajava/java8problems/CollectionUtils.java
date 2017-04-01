package com.sdajava.java8problems;

import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by RENT on 2017-04-01.
 */
public class CollectionUtils {

    public static <T>LinkedList<T> lastElementOfALinkedList(T... elements){
     return Stream.of(elements).collect(Collectors.toCollection(LinkedList::new));
    }




}
