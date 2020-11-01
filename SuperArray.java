public class SuperArray {

  private String[] data;
  private int size; //the current size

  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean add(String element) {
    if (size < data.length) {
      data[size] = element;
      size++;
      return true;
    }
    return false;
  }

  public String get(int index) { //assume index is 0 to size-1
    return data[index];
  }

  //not add new values, only to replace old ones
  public String set(int index, String element) { //assume index is 0 to size-1
    String replaced = data[index];
    data[index] = element;
    return replaced;
  }

}
