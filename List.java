
public class List extends BasicStructures {

	public void AddAtBegin(Object item) {
		collection.add(0, item);
	}
	
	public void AddAtEnd(Object item) {
		collection.add(collection.size()-1, item);
	}
	
	public void AddAtIndex(int index, Object item) {
		collection.add(index, item);
	}
	
	public void RemoveFirst() {
		collection.remove(0);
	}
	
	public void RemoveLast() {
		collection.remove(collection.size()-1);
	}
	
	public void RemoveAtIndex(int index) {
		try {
			collection.remove(index);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index out of range.");
		}
	}
	
}
