import java.util.ArrayList;

/*
Darius Grassi 670176734 dgrassi2 dgrassi2@uic.edu

In this project I create my own versions of the stack and queue data structures.
We practiced inheritance, generic/abstract classes, interfaces, and abstract methods.
 */
public class GLProject {

	public static void main(String[] args) {
		GenericQueue<Integer> q = new GenericQueue<>(5);
		GenericStack<Character> s = new GenericStack<>('A');

		s.push('B');
		s.push('C');
		s.push('D');
		s.pop();
		s.pop();

		System.out.println(s.getHead());

		GLIterator<Character> myStackIterator = s.createIterator();

		while (myStackIterator.hasNext()) {
			System.out.println(myStackIterator.next() + " ");
		}
	}
}