public class Demo {

  public static void removeDuplicates(SuperArray s) {
    for (int i = 0; i < s.size(); i++) { //look at every element
      while (s.indexOf(s.get(i)) != s.lastIndexOf(s.get(i))) { //there's more than 1 occurance of s still
        s.remove(s.lastIndexOf(s.get(i)));
      }
    }
  }

  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);

    SuperArray rawr = new SuperArray();
    System.out.println(rawr);
    removeDuplicates(rawr);
    System.out.println(rawr);

    SuperArray ducky = new SuperArray();
    ducky.add("quack");   ducky.add("quackquack");   ducky.add("Quack");
    ducky.add("QuackQuack");   ducky.add("REEEEEEEEEEE!");
    System.out.println(ducky);
    removeDuplicates(ducky);
    System.out.println(ducky);

    SuperArray usagi = new SuperArray();
    usagi.add("pyun");   usagi.add("ribbit");   usagi.add("aww");
    usagi.add("hophop");   usagi.add("pyun");
    System.out.println(usagi);
    removeDuplicates(usagi);
    System.out.println(usagi);

    SuperArray coffee = new SuperArray();
    coffee.add("ccc");   coffee.add("coffee");   coffee.add("coffee");
    coffee.add("coffee");   coffee.add("coffee");   coffee.add("kafei");
    coffee.add("kopi");   coffee.add("kafei");   coffee.add("kapei");
    System.out.println(coffee);
    removeDuplicates(coffee);
    System.out.println(coffee);

    SuperArray REE = new SuperArray();
    for (int i = 0; i < 10; i++) {
      REE.add("REE");
    }
    System.out.println(REE);
    removeDuplicates(REE);
    System.out.println(REE);

  }
}
