public class Tester {
  public static void main(String[] args) {
    SuperArray fruits = new SuperArray();
    SuperArray numbers = new SuperArray();

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

    for (int i = 0; i < 15; i++) {
      numbers.add(Integer.toString(i));
    }
    for (int i = 0; i < numbers.size(); i++) {
      System.out.println(numbers.get(i));
    }

  }
}
