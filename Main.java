
public class Main {

	public static void main(String[] args) {
		var q = new List();
		q.AddAtBegin(1);
		q.AddAtEnd(2);
		q.AddAtBegin(4);
		q.AddAtEnd(8);
		q.PrintAll();
		q.RemoveFirst();
		q.RemoveAtIndex(12);
		q.PrintAll();
		System.out.println(q.GetElementByIndex(12));
	}

}
