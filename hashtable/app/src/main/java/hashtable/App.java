/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashtable;

public class App {

    public static void main(String[] args) {

        HashTable myTable = new HashTable();
        myTable.add("Cat" , 1);
        myTable.add("container" , 2);
        myTable.add("ddd" , 2);
        myTable.add(555 , 3);
        myTable.add(8 , 4);
        System.out.println(myTable.get("Cat"));
        System.out.println(myTable.get("container"));
        System.out.println(myTable.get("test"));
        System.out.println(myTable.contains("Thaer"));
        System.out.println(myTable.contains("Cat"));
        System.out.println(myTable.hash("555"));
        System.out.println(myTable.hash("Cat"));
        System.out.println(myTable.hash("ddd"));
        System.out.println(myTable);
    }
}