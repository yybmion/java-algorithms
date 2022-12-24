### Java Set 관련 메소드

***
boolean	add(E e)
Adds the specified element to this set if it is not already present (optional operation).

boolean	addAll(Collection<? extends E> c)
Adds all of the elements in the specified collection to this set if they're not already present (optional operation).

void	clear()
Removes all of the elements from this set (optional operation).

boolean	contains(Object o)
Returns true if this set contains the specified element.

boolean	containsAll(Collection<?> c)
Returns true if this set contains all of the elements of the specified collection.

boolean	equals(Object o)
Compares the specified object with this set for equality.

int	hashCode()
Returns the hash code value for this set.

boolean	isEmpty()
Returns true if this set contains no elements.

Iterator<E>	iterator()
Returns an iterator over the elements in this set.

boolean	remove(Object o)
Removes the specified element from this set if it is present (optional operation).

boolean	removeAll(Collection<?> c)
Removes from this set all of its elements that are contained in the specified collection 
(optional operation).

boolean	retainAll(Collection<?> c)
Retains only the elements in this set that are contained in the specified collection (optional operation).

int	size()
Returns the number of elements in this set (its cardinality).

default Spliterator<E>	spliterator()
Creates a Spliterator over the elements in this set.

Object[]	toArray()
Returns an array containing all of the elements in this set.

<T> T[]	toArray(T[] a)
Returns an array containing all of the elements in this set; the runtime type of the returned array is that of the specified array.
