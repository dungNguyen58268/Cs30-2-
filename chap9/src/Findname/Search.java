package Findname;

public class Search {
	public static int Linear(String[] array, String NametoFind) {
		int index = 0;
		
		while (!(array[index].equals(NametoFind)) && (index < array.length -1)) {
			index +=1;
		}

		if (array[index].equals(NametoFind)) {
			return (index + 1);
		} else {
			return (-1);
		}
	}
}
