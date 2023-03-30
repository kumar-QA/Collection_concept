package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterfaces {

	public static void main(String[] args) {
//		boolean add(Object obj)--Adds obj to the invoking collection. Returns true if obj was added to the collection. Returns false if obj is already a member of the collection, or if the collection does not allow duplicates.
//		boolean addAll(Collection c)--Adds all the elements of c to the invoking collection. Returns true if the operation succeeds (i.e., the elements were added). Otherwise, returns false.
//		void clear( )--Removes all elements from the invoking collection.		
//		boolean contains(Object obj)--Returns true if obj is an element of the invoking collection. Otherwise, returns false.
//		boolean containsAll(Collection c)--Returns true if the invoking collection contains all elements of c. Otherwise, returns false.
//		boolean equals(Object obj)--Returns true if the invoking collection and obj are equal. Otherwise, returns false.
//		int hashCode( )--Returns the hash code for the invoking collection.
//		boolean isEmpty( )--Returns true if the invoking collection is empty. Otherwise, returns false
//		Iterator iterator( )--Returns an iterator for the invoking collection.
//		boolean remove(Object obj)--Removes one instance of obj from the invoking collection. Returns true if the element was removed. Otherwise, returns false.
//		boolean removeAll(Collection c)--Removes all elements of c from the invoking collection. Returns true if the collection changed (i.e., elements were removed). Otherwise, returns false.
//		boolean retainAll(Collection c)--Removes all elements from the invoking collection except those in c. Returns true if the collection changed (i.e., elements were removed). Otherwise, returns false.
//		int size( )--Returns the number of elements held in the invoking collection.
//		Object[ ] toArray( )--Returns an array that contains all the elements stored in the invoking collection. The array elements are copies of the collection elements.
//		Object[ ] toArray(Object array[ ])--Returns an array containing only those collection elements whose type matches that of array.
		
		Collection<Object> c1=new ArrayList<Object>();
		
		System.out.println(c1.isEmpty());
		
		// 1.add() public boolean add(Object o)
		
			c1.add(1);   
			c1.add("kumar");
			c1.add('x');
			c1.add(true);
			c1.add(1);
			c1.add(null);
			System.out.println(c1.size());
			System.out.println(c1.contains("grghrthh"));
			
//			System.out.println(c1.add("aa"));
			System.out.println("C1 Collection consisit:"+c1);
	//	
	//	
//		// 2.addAll public boolean addAll(Collection c)
//			
			Collection<Object> c2=new ArrayList<Object>();
			
			c2.add(55);
			c2.add(44);
			System.out.println("C2 Collection consisit:"+c2);
			
//			
//			System.out.println("Before c1.addAll(c2) c1 collection :"+c1);
//			c1.addAll(c2);
//			System.out.println("After c1.addAll(c2) c1 collection :"+c1);
			c2.addAll(c1);
			System.out.println(c2);
			c2.removeAll(c1);
			System.out.println(c2);
	//	
//		//3.remove public boolean remove(Object o)
//			
//			System.out.println("Before Remove object:  in collection c1 "+c1);
//			c1.remove("kumar");
//			System.out.println("After Remove object: in collection c1 "+c1);
//			
//			System.out.println("Before Remove object: in collection c2 "+c2);
//			c2.remove(55);
//			System.out.println("After Remove object:  in collection c2 "+c2);
	//	
//			
//			
////		//contains() public boolean contains(Object o)
	//	
//			System.out.println("is c collection contain 3 value "+c2.contains(44));
//			
////		//containsAll() public boolean containsAll(Collection c)
//			
//			System.out.println("C1 collection: "+c1);
//			System.out.println("C2 Collection: "+c2);
//			System.out.println("is c1 collection consisit of c1 collection data:"+c1.containsAll(c2));
//			
////		//isEmpty() public boolean isEmpty();
////			
//			Collection<Object> c3=new ArrayList<Object>();
//			System.out.println("Is c2 collection is Empty"+c3.isEmpty());
//			c3.add(12);
//			c3.add(13);
//			c3.add(14);
//			c3.add(15);
//			System.out.println("Is  c2 collection is empyt data:"+c3.isEmpty());
//			
//		//size public int size()
//			
//			System.out.println("Total Size: "+c3.size());
//			
//		//toArray()  
	//	
////			Integer[] a=new Integer[c1.size()];
//			Object[] objs=c1.toArray();	
//			for(Object o:objs) {
//				System.out.println(o);		
//				}
//			
		//4.removeAll public boolean removeAll(Collection c) 	
			
//			System.out.println("Before removing c1:" +c1);
//			System.out.println(c1.removeAll(c2));
//			System.out.println("After removing c1: "+c1);
			
//			System.out.println("Before collection c2:"+c2);
//			System.out.println("c2 remove: "+c2.removeAll(c1));
//			System.out.println("Afetr collection c2: "+c2);
//			
//			//5.retainAll() public boolean retainAl(Collection c)	
//			
//					c2.add(55);
//					System.out.println("c2 collection:"+c2);
//					c1.addAll(c2);
	//
//					System.out.println("c1 collection:"+c1);
//					
//					System.out.println("Before retainAll c1 collection consist of:"+c1);
//					c1.retainAll(c2);
//					System.out.println("After retainAll c collection consisit of "+c1);
//					
//				//clear() void clear();
//					System.out.println("Before clear() collection c1 consist of"+c1);
//					c1.clear();
//					System.out.println("After clear() collection c1 consist of"+c1);
	//	
	}

}
