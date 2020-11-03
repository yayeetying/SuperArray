public class Tester {

  public static void main(String[] args) {
    SuperArray fruits = new SuperArray();
    SuperArray numbers = new SuperArray();
    SuperArray words = new SuperArray();

    System.out.println(fruits.size());
    System.out.println(fruits.add("orange"));
    System.out.println(fruits.add("apple"));
    System.out.println(fruits.size());
    System.out.println();
    System.out.println(fruits.get(0));
    System.out.println(fruits.get(1));
    System.out.println(fruits.get(2)); //null, because there's nothing in fruits[2] yet
    System.out.println();
    System.out.println(fruits.set(0, "apple"));
    System.out.println(fruits.get(0));
    System.out.println();

    for (int i = 0; i <= 15; i++) {
      numbers.add(Integer.toString(i));
    }
    for (int i = 0; i < numbers.size(); i++) {
      System.out.println(numbers.get(i));
    }
    System.out.println();

    words.add("kani");
    words.add("uni");
    words.add("ebi");
    words.add(""); //you can add an empty String
    words.add(null); //you can add a null?!
    System.out.println(words.set(0, "kaniSalad"));
    words.add("peanuts");
    for (int i = 0; i < words.size(); i++) {
      System.out.println(words.get(i));
    }
    System.out.println(words.size());
    System.out.println();

    System.out.println(words.isEmpty());
    words.clear();
    System.out.println(words.isEmpty());
    System.out.println(fruits.toString());
    System.out.println(fruits.size());
    System.out.println(numbers.toString());
  }
}
