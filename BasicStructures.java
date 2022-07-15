import java.util.ArrayList;
import java.util.List;

public class BasicStructures {
	
	protected List<Object> collection = new ArrayList<>();

	public Boolean Contains(Object item) { 
		return collection.contains(item); 
	}
	
	public Object GetElementByIndex(int index) {
		try { 
			return collection.get(index);
		} 
		catch (IndexOutOfBoundsException e) { 
			return "Index out of range."; 
		}	
	}
	
	public int Length() { 
		return collection.size(); 
	}
	
	public void Clear() { 
		collection.clear(); 
	}
	
	public void PrintAll() {
		for (int i = 0; i < collection.size(); i++) {
			System.out.print(collection.get(i) + " ");
		}
		System.out.println();
	}
	
}
