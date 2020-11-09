public class Demo {

  //woah these are static methods! vs the non-static ones from SuperArray.java
  public static void removeDuplicates(SuperArray s) {
    for (int i = 0; i < s.size(); i++) { //look at every element
      while (s.indexOf(s.get(i)) != s.lastIndexOf(s.get(i))) { //there's more than 1 occurance of s still
        s.remove(s.lastIndexOf(s.get(i)));
      }
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    removeDuplicates(a);
    removeDuplicates(b);
    SuperArray bothHave = new SuperArray();
    for (int i = 0; i < a.size(); i++) {
      if (b.contains(a.get(i))) bothHave.add(a.get(i));
    }
    return bothHave;
  }

  public static SuperArray zip(SuperArray a, SuperArray b) {
    SuperArray zipped = new SuperArray();
    int smaller = b.size(); //a is bigger; b is smaller
    int bigger = a.size();
    if (b.size() > a.size()) { //b is bigger, a is smaller
      smaller = a.size();
      bigger = b.size();
    }
    for (int i = 0; i < smaller; i++) {
      zipped.add(a.get(i));
      zipped.add(b.get(i));
    }
    for (int i = smaller; i < bigger; i++) {
      if (b.size() > a.size()) zipped.add(b.get(i));
      else {zipped.add(a.get(i));}
    }
    return zipped;
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
    // removeDuplicates(usagi);
    // System.out.println(usagi);

    SuperArray coffee = new SuperArray();
    coffee.add("ccc");   coffee.add("coffee");   coffee.add("coffee");
    coffee.add("coffee");   coffee.add("coffee");   coffee.add("kafei");
    coffee.add("kopi");   coffee.add("kafei");   coffee.add("kapei");
    System.out.println(coffee);
    // removeDuplicates(coffee);
    // System.out.println(coffee);

    SuperArray REE = new SuperArray();
    for (int i = 0; i < 10; i++) {
      REE.add("REE");
    }
    System.out.println(REE);
    removeDuplicates(REE);
    System.out.println(REE);

    SuperArray A = new SuperArray();
    A.add("1");   A.add("2");   A.add("3");   A.add("4");   A.add("5");
    SuperArray B = new SuperArray();
    B.add("1");   B.add("2");   B.add("3");
    System.out.println(findOverlap(A, B));

    SuperArray C = new SuperArray();
    C.add("1");   C.add("2");   C.add("3");
    SuperArray D = new SuperArray();
    D.add("1");   D.add("2");   D.add("3");   D.add("4");   D.add("5");
    System.out.println(findOverlap(C, D));

    SuperArray E = new SuperArray();
    E.add("1");   E.add("2");   E.add("3");
    SuperArray F = new SuperArray();
    F.add("5");   F.add("4");   F.add("3");   F.add("2");   F.add("1");
    System.out.println(findOverlap(E, F));

    SuperArray G = new SuperArray();
    G.add("5");   G.add("4");   G.add("3");   G.add("2");   G.add("1");
    SuperArray H = new SuperArray();
    H.add("1");   H.add("2");   H.add("3");
    System.out.println(findOverlap(G, H));

    SuperArray secret = new SuperArray();
    SuperArray santa = new SuperArray();
    System.out.println(findOverlap(secret, santa));

    SuperArray Secret = new SuperArray();
    SuperArray Santa = new SuperArray();
    Santa.add("uwu");   Santa.add("owo");   Santa.add("bubu");
    System.out.println(findOverlap(Secret, Santa));

    SuperArray Secreta = new SuperArray();
    Secreta.add("uwu");   Secreta.add("owo");   Secreta.add("bubu");
    SuperArray Santaa = new SuperArray();
    System.out.println(findOverlap(Secreta, Santaa));

    SuperArray aaa = new SuperArray();
    aaa.add("9");   aaa.add("1");   aaa.add("2");   aaa.add("2");   aaa.add("3");  aaa.add("4");
    SuperArray bbb = new SuperArray();
    bbb.add("0");   bbb.add("4");   bbb.add("2");   bbb.add("2");   bbb.add("9");
    System.out.println(findOverlap(aaa, bbb));

    SuperArray bobo = new SuperArray();
    bobo.add("5");   bobo.add("5");   bobo.add("4");   bobo.add("2");   bobo.add("2");
    bobo.add("10");   bobo.add("8");   bobo.add("8");   bobo.add("6");   bobo.add("6");
    SuperArray yoyo = new SuperArray();
    yoyo.add("6");   yoyo.add("8");   yoyo.add("4");   yoyo.add("2");   yoyo.add("5");
    System.out.println(findOverlap(bobo, yoyo));

    SuperArray zip1 = new SuperArray();
    zip1.add("a");   zip1.add("b");   zip1.add("c");
    zip1.add("d");   zip1.add("e");   zip1.add("f");
    SuperArray zip2 = new SuperArray();
    zip2.add("0");   zip2.add("1");   zip2.add("2");   zip2.add("3");
    System.out.println(zip(zip1, zip2));

    SuperArray zip3 = new SuperArray();
    zip3.add("a");   zip3.add("b");   zip3.add("c");
    SuperArray zip4 = new SuperArray();
    zip4.add("0");   zip4.add("1");   zip4.add("2");   zip4.add("3");
    zip4.add("4");
    System.out.println(zip(zip3, zip4));

    System.out.println(zip(usagi, ducky)); //same length
    System.out.println(zip(words, secret)); //secret is empty
    System.out.println(zip(secret, words));
    System.out.println(zip(coffee, A));
    System.out.println(zip(A, coffee));
    System.out.println(zip(santa, secret)); //both are empty
    System.out.println(zip(secret, santa));

  }
}
