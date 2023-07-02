
import java.util.ArrayList;
import java.util.HashMap;

public class BookList {
    public static HashMap<Integer, String> createBookMap(ArrayList<String> bookList) {
        HashMap<Integer, String> bookMap = new HashMap<>();

        for (int i = 0; i < bookList.size(); i++) {
            bookMap.put(i, bookList.get(i));
        }

        return bookMap;
    }

    public static void main(String[] args) {
        ArrayList<String> bookList = new ArrayList<>();
        bookList.add("Book 1");
        bookList.add("Book 2");
        bookList.add("Book 3");
        bookList.add("Book 4");
        bookList.add("Book 5");

        HashMap<Integer, String> bookMap = createBookMap(bookList);

        for (Integer key : bookMap.keySet()) {
            System.out.println("Index: " + key + ", Book: " + bookMap.get(key));
        }
    }
}
