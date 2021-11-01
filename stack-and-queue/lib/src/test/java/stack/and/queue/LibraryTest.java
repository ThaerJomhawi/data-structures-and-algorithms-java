/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.and.queue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }
    @Test void testCanPush(){
        Stack stack = new Stack();
        stack.push("a");
        stack.push("b");
        String str = "{b}->{a}->NUll";
        assertEquals(str,stack.toString());
    }
    @Test void testPop() throws Exception {
        Stack stack =new Stack();
        stack.push("a");
        stack.push("b");
        stack.pop();
        stack.pop();

        assertEquals("Is empty",stack.toString());

    }
    @Test void testPeek() throws Exception {
        Stack stack =new Stack();
        stack.push("a");
        stack.push("b");
        System.out.println(stack.peek().toString());
        assertEquals("b",stack.peek());



    }
    @Test void testExceptionForEmptyStack() throws Exception {
        Stack stack =new Stack();

        assertNotNull(stack);



        try {
            stack.pop();
        }catch (Exception e){
            assertEquals(e.getMessage(),"Is empty");
        }
        try {
            stack.peek();
        }catch (Exception e){
            assertEquals(e.getMessage(),"Is empty");
        }






    }




    @Test void testQueue() throws Exception {
        Queue queue = new Queue();
        assertNotNull(queue);
        try {
            queue.dequeue();
        }catch (Exception e){
            assertEquals(e.getMessage(),"Is empty");
        }
        try{
            queue.peek();

        }catch (Exception e){
            assertEquals(e.getMessage(),"Is empty");
        }


    }
    @Test void testEnqueueToQueue() throws Exception {
        Queue queue = new Queue();
        queue.enqueue("a");
        queue.enqueue("b");

        assertEquals("{a}->{b}->NUll",queue.toString());





    }
    @Test void testDequeueFromQueue() throws Exception {

        Queue queue =new Queue();
        queue.enqueue("1");
        queue.enqueue("2");
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.size);
        assertEquals("Is empty",queue.toString());
    }

    @Test void testPeekQueue() throws Exception {
        Queue queue =new Queue();
        queue.enqueue("1");
        queue.enqueue("2");
        System.out.println(queue.peek().toString());
        assertEquals("2",queue.peek());



    }


    @Test void animalShelter() throws Exception {

        AnimalShelter animalTest = new AnimalShelter();

        // Edge case "object is empty"
        assertNull(animalTest.toString());

        // Add cats in order "first in first out"
        animalTest.enqueue(new Cats("Tom"));
        animalTest.enqueue(new Cats("flash"));

        assertEquals( "Front = Cat :Tom -> Cat :flash -> Null",animalTest.cats.toString());

        // Add Dogs in order "first in first out"
        animalTest.enqueue(new Dogs("Rex"));
        animalTest.enqueue(new Dogs("Togo"));
        assertEquals( "Front = Dog :Rex -> Dog :Togo -> Null",animalTest.dogs.toString());

        // Add to both list
        assertEquals( "{Dog List :Front = Dog :Rex -> Dog :Togo -> Null} --- {Cat List :Front = Dog :Rex -> Dog :Togo -> Null}" ,animalTest.toString());


        // dequeue from list in order "first in first out"
        animalTest.dequeue("cat");
        animalTest.dequeue("dog");
        assertEquals( "Front = Dog :Togo -> Null",animalTest.dogs.toString());
        assertEquals( "Front = Cat :flash -> Null",animalTest.cats.toString());

        // Return: either a dog or a cat, based on preference.
        assertEquals("Dog :Togo" , animalTest.dequeue("dog").toString());
        assertEquals("Cat :flash" , animalTest.dequeue("cat").toString());

        // If pref is not "dog" or "cat" then return "null".
        assertNull(animalTest.dequeue("none"));
    }



}
