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
    System.out.println();
    System.out.println(fruits.set(0, "apple"));
    System.out.println(fruits.get(0));
    System.out.println();

    for (int i = 0; i <= 100; i++) {
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
    System.out.println(words.contains(""));
    System.out.println(words.contains(null));
    System.out.println(words.contains("ebi"));
    System.out.println(words.contains("oogabooga"));
    words.clear();
    System.out.println(words.isEmpty());
    System.out.println(fruits.toString());
    System.out.println(fruits.size());
    System.out.println(numbers.toString());
    System.out.println();

    System.out.println(numbers.contains("asar"));
    System.out.println(numbers.contains("1"));
    System.out.println(numbers.contains(null));
    System.out.println(numbers.contains(""));
    System.out.println();
    System.out.println();
    //numbers = 1-100; fruits = apple x2; words = cleared

    SuperArray numbers2 = new SuperArray(120);
    for (int i = 0; i <= 100; i++) {
      numbers2.add(Integer.toString(i));
    }
    System.out.println(numbers2.size()); //numbs 0 - 100, so size should = 101
    System.out.println(numbers2.toString());
    numbers2.add(50, "cats");
    System.out.println();
    System.out.println(numbers2.toString());
    System.out.println(numbers2.size()); //size should = 102
    System.out.println();
    numbers2.add("cat");
    numbers2.add(103, "neko");
    System.out.println(numbers2.toString());
    System.out.println(numbers2.size()); //size should = 104
    System.out.println(numbers2.remove(50)); //cats
    System.out.println(numbers2.remove(102)); //neko
    System.out.println(numbers2.toString());
    System.out.println(numbers2.size()); //size should = 102
    // System.out.println(numbers2.remove(102));
    // System.out.println(numbers2.remove(115)); //size <= index <= capacity; returns null
    System.out.println(numbers2.toString());
    System.out.println(numbers2.size()); //size should = 102
    System.out.println();

    numbers2.add(37,"cat");
    numbers2.add(83,null);
    System.out.println(numbers2.indexOf("peanuts"));
    System.out.println(numbers2.indexOf("12"));
    System.out.println(numbers2.indexOf("cat"));
    System.out.println(numbers2.indexOf(null));

    System.out.println();
    String[] fruits2 = fruits.toArray();
    System.out.println(fruits2[0]);
    System.out.println(fruits2[1]);
    //System.out.println(fruits2[2]); should fail, bc index out of bounds

    System.out.println();
    SuperArray work = new SuperArray();
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j <= 4; j++) {
        work.add(Integer.toString(j));
      }
    }
    System.out.println(work.remove(19));
    System.out.println(work);
    System.out.println(work.lastIndexOf("3"));
    System.out.println(work.lastIndexOf("2"));
    System.out.println(work.lastIndexOf("1"));
    System.out.println(work.lastIndexOf("0"));
    System.out.println(work.lastIndexOf("cats"));
    System.out.println(work.indexOf("4"));
    System.out.println(work.indexOf("3"));
    System.out.println(work.indexOf("2"));
    System.out.println(work.indexOf("1"));
    System.out.println(work.indexOf("0"));
    System.out.println();
    System.out.println(fruits.indexOf("apple"));
    System.out.println(fruits.lastIndexOf("apple"));
    System.out.println(numbers.lastIndexOf("1"));
    System.out.println(numbers.indexOf("1"));
    System.out.println(numbers.lastIndexOf("150"));
    System.out.println(numbers.indexOf("150"));
    System.out.println();

    SuperArray q = new SuperArray();
    q.add("1");   q.add("2");   q.add("3");   q.add("4");
    SuperArray w = new SuperArray();
    w.add("1");
    System.out.println(q.equals(w));
    System.out.println(w.equals(q));

    SuperArray e = new SuperArray();
    e.add("1");   e.add("2");   e.add("3");   e.add("4");
    SuperArray r = new SuperArray();
    r.add("1");   r.add("2");   r.add("3");   r.add("4");
    System.out.println(e.equals(r));
    System.out.println(r.equals(e));

    SuperArray t = new SuperArray(100);
    SuperArray y = new SuperArray(1);
    System.out.println(t.equals(y));

    SuperArray u = new SuperArray(100);
    u.add("8");   u.add("1");
    SuperArray i = new SuperArray(1);
    i.add("8");   i.add("1");
    System.out.println(u.equals(i));
    System.out.println();

    SuperArray wahh = new SuperArray(0);
    try {
      SuperArray qahh = new SuperArray(-10);
    }
    catch (IllegalArgumentException error) {
      System.out.println("IllegalArgumentException error!");
    }

    try {
      System.out.println(fruits.get(-10));
    }
    catch (IndexOutOfBoundsException error) {
      System.out.println("IndexOuttaBounds dumbo! :DD");
    }
    try {
      System.out.println(fruits.get(2));
    }
    catch (IndexOutOfBoundsException error) {
      System.out.println("IndexOuttaBounds dumbo! :DD");
    }

    try {
      System.out.println(fruits.get(1));
    }
    catch (IndexOutOfBoundsException error) {
      System.out.println("IndexOuttaBounds dumbo! :DD");
    }

    try {
      System.out.println(fruits.set(2, "yummy")); //can only set to existing elements; should fail
    }
    catch (IndexOutOfBoundsException error) {
      System.out.println("IndexOuttaBounds T_T");
    }

    try {
      System.out.println(fruits.set(-1, "fubby"));
    }
    catch (IndexOutOfBoundsException error) {
      System.out.println("IndexOuttaBounds T_T");
    }

    try {
      fruits.add(-1, "yapple");
    }
    catch (IndexOutOfBoundsException error) {
      System.out.println("IndexOuttaBounds no bueno bro");
    }

    try {
      fruits.add(5, "yapple");
    }
    catch (IndexOutOfBoundsException error) {
      System.out.println("IndexOuttaBounds no bueno bro");
    }

    try {
      fruits.add(2, "yapple");
    }
    catch (IndexOutOfBoundsException error) {
      System.out.println("IndexOuttaBounds no bueno bro");
    }
    System.out.println(fruits);

    try {
      System.out.println(fruits.remove(-1));
    }
    catch (IndexOutOfBoundsException error) {
      System.out.println("IndexOuttaBounds weewoo weewoo!");
    }

    try {
      System.out.println(fruits.remove(10));
    }
    catch (IndexOutOfBoundsException error) {
      System.out.println("IndexOuttaBounds weewoo weewoo!");
    }

    try {
      System.out.println(fruits.remove(3));
    }
    catch (IndexOutOfBoundsException error) {
      System.out.println("IndexOuttaBounds weewoo weewoo!");
    }

  }
}
