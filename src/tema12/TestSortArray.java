package tema12;

public class TestSortArray {

	public static void main(String[] args) {

		SortArray array = new SortArray();

		String[] textArray = {"Alba", "Iasi", "Bacau", "Constanta"};
		Integer[] intArray = {100, 500, 300, 400, 200};
		Character[] charArray = {'a', 'b', 'd', 'c'};
		
		array.sortArray(textArray);
		array.sortArray(intArray);
		array.sortArray(charArray);
		

	}

}
