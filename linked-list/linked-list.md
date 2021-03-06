## Singly Linked List

This is an application to create and manipulate data structure using node and linked list

## Challenge

The challenge was creating the Node and Linked List from scratch without using any built in method

And make it accept any data type -Java-Generic.

## Approach & Efficiency

**initialize** method will initialize the constructor, and it's auto generated when you create new
LinkedList,this method will take O(1) for both space and time because we are not looping through anything, and we just
create the constructor for the class.

**insert** method will take value and insert it in the head of the node LinkedList, this method will take O(1)
for both space and time again we are not looping or creating N variable - we are just inserting one data every time

 **include** method will take a value and check if it's exist inside the whole node and return true if it's exist
and false otherwise,this method will take O(N) for Time because we are looping over all the LinkedList and O(1) for
space because we're not creating any variable.

 **toString** method will return string that contain all the value inside linked list in "{value} =>{value} =>
Null" Format, this method will take O(N) for time because we are looping through the whole Node and O(N) for space
because the string depends on the Linked List length

## API

| #  | Method | usage |
| ----------- | ----------- | -----------|
| 1      | `LinkedList<T> linkedListName = new LinkedList<>()`       |this method to initilize newLinkedList
| 2 | `linkedListName.insert(value)` |this method will add new value to the linked list tree|
|3| `linkedList.include(value)`|this method will return `true` only if the linkedList contain the input value otherwise will return `false`|
|4| `linkedList.toString()`| this method will return formatted String showing the LinkedList value|

######

##  Add Node At Last :
![Add Node At Last](CC6-1.png)
### Approach & Efficiency
* loop, time : O(n) scape : O(2n)

## Add Node Before specific node:
![Add Node At Last](CC6-2.png)
### Approach & Efficiency
* loop, time : O(n) scape : O(2n)
## Add Node After specific node:
![Add Node At Last](CC6-3.png)
### Approach & Efficiency
* loop, time : O(n) scape : O(2n)

## Return the node Value at kth (the entered value )
![Add Node At Last](CC7.png)

### Approach & Efficiency
* loop, time : O(n) scape : O(1)

## Zip two linked lists
![Zip two linked lists](CC8.png)

### Approach & Efficiency
* loop, time : O(n) scape : O(2n)