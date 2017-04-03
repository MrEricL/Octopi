# Octopi

##Choosing a Doubly Linked Node
We at Team Octopi chose to use a doubly linked node for it's simplicity in implementing a robust and efficient solution. Every operation except toString() has a runtime of O(1), as you are only dealing with the outermost elements and their links. This also makes it so that capcity restrictions are not a problem, as you don't have to keep expanding an Array or ArrayList. If using an array based solution then your O(1) time would only be ammortized and there would be edge cases of O(n) in case swaps would need to take place. There is one somewhat efficient way to implement it, where you start from the center index of a preset capacity and hope you do not expand beyond it, and then just "add" or "remove" by setting elements at outermost indexes to null and then decreasing the visible index range. However, this is much more work and will still occasionally require deep copying.

##Methods:
`public void addFirst(T x)`
Adds an element at the front of an array

`public void addLast(T x)`
Adds an element at the end of an array

`public T removeFirst()`
Removes an element at the front of an array

`public T removeLast()`
Removes an element at the end of an array

`public T getFirst()`
Gets an element at the front of an array

`public T getLast()`
Gets an element at the end of an array

`public int size()`
Returns the size of the elements.
