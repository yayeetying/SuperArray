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
  }
}
