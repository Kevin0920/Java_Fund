import java.util.ArrayList;

public class GenericLists {
  public static void main(String[] args) {
    ArrayList<Object> myList = new ArrayList<Object>();
    myList.add("13");
    myList.add("hello world");
    myList.add(48);
    myList.add("Goodbye World");
    for (int i = 0; i < myList.size(); i++) {
      try {
        Integer castedValue = (Integer) myList.get(i);
        myList.set(i, castedValue);
      }
      catch (ClassCastException e) {
        System.out.println("ERROR ON INDEX #" + i);
        System.out.println("Value: " + myList.get(i));
        System.out.println("Error Message: " + e.getMessage());
      }
    }
  }
  // public static void main(String[] args) {
  //      ArrayList<Integer> myList = new ArrayList<Integer>();
  //
  //      myList.add("13");
  //      myList.add("hello world");
  //      myList.add(48);
  //      myList.add("Goodbye World");
  //  }
}