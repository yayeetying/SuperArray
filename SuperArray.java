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
    if (size == data.length) resize();
    data[size] = element;
    size++;
    return true;
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

  private void resize() {
    String[] newData = new String[data.length + 10];
    for (int i = 0; i < data.length; i++) {
      newData[i] = data[i];
    }
    data = newData;
  }

  public boolean isEmpty() {
    return (size == 0);
  }

  public void clear() {
    data = new String[10]; //maybe don't reset the capacity of array
    size = 0;
  }

  public String toString() { //size is the index value still available
    String str = "[";
    for (int i = 0; i < size; i++) {
      if (i == size-1) str += data[i] + "]";
      else {str += data[i] + ", ";}
    }
    return str;
  }

  public boolean contains(String s) {
    for (int i = 0; i < size; i++) {
      if (s == null) { //doesn't need to, but accounts for if s is null
        if (data[i] == s) return true;
      }
      else {
        if (s.equals(data[i])) return true;
      }
    }
    return false;
  }

}
