package list1;

import com.sdajava.java8problems.ArrayExec;
import com.sdajava.java8problems.CollectionUtils;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.Matchers.contains;
/**
 * Created by RENT on 2017-04-01.
 */
public class ArraysTEST {

    @Test
    public void shouldFindLastElementFromAList(){
        assertThat(ArrayExec.lastElement(asList("a","b","c")), is(equalTo("c")));
        assertEquals("c",ArrayExec.lastElement(asList("a","b","c")));
    }

    @Test
    public void shouldFindLastElementOfLinkedList(){
        //LinkedList<String> list = new LinkedList<String>(Arrays.asList("a","b","c")); //1. sposób tworzenia listy
      //  assertThat(ArrayExec.lastElementOfALinkedList(list),is(equalTo("c"))); //1. sposób testu
        LinkedList<String> list =  CollectionUtils.lastElementOfALinkedList("a","b","c","d"); //2. sposób tworzenia listyassertEquals("c", ArrayExec.lastElementOfALinkedList(list)); //2.sposób testu

    }

    @Test
    public void listOfEmptyShouldBe0(){
        long length = ArrayExec.length(Collections.emptyList());
        assertThat(length, is(equalTo(0L)));
    }

    @Test
    public void shouldFindListOfNonEmptyList(){
        assertThat(ArrayExec.length(asList(1,2,3,4,5,6)), is(equalTo(6)));
    }
    @Test
    public void shouldReverseAList(){
        List<Integer> numbers = asList(1,2,3,4,5,6,7,8,9,10);
        assertThat(ArrayExec.reverses(numbers), is(equalTo(asList(10,9,8,7,6,5,4,3,2,1))));
    }

    @Test
    public void shouldReturnTrueWhenListIsPalindrome(){
        assertTrue(ArrayExec.isPalindrome(asList("a","l","a")));
    }

    @Test
    public void shouldRemoveConsecutiveDuplicatesInAList(){
        List<String> compressedList = ArrayExec.compress(asList("a","a","b","b", "a"));
        assertThat(compressedList, contains("a","b"));
    }

    @Test
    public void shouldDuplicateElementsInAList()throws Exception{
        List<String> duplicates = ArrayExec.duplicate(Arrays.asList("a","b","c","d"),3);
        assertThat(duplicates, contains("a","a","a","b","b","b","c","c","c","d","d","d"));
    }
}
