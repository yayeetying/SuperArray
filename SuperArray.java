public class SuperArray {

  private String[] data;
  private int size; //the current size

  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public SuperArray(int initialCapacity) {
    if (initialCapacity < 0) {
      throw new IllegalArgumentException("capacity inputted is negative");
    }
    data = new String[initialCapacity];
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

  public void add(int index, String element) {
    if (index < 0 || index > size()) { //add can add to latest slot (size); thas why not >=
      throw new IndexOutOfBoundsException("index out of bounds; either is negative or > size");
    }
    if (size == data.length) resize();
    if (data[index] != null) { //spot at index is occupied
      for (int i = size; i > index; i--) {
        data[i] = data[i-1];
      }
    }
    data[index] = element;
    size++;
  }

  public String remove(int index) {
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException("index out of bounds; either is negative or >= size");
    }
    String removed = data[index];
    for (int i = index; i < size-1; i++) {
      data[i] = data[i+1];
    }
    size--;
    return removed;
  }

  public String get(int index) { //assume index is 0 to size-1
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException("index out of bounds; either is negative or >= size");
    }
    return data[index];
  }

  //not add new values, only to replace old ones
  public String set(int index, String element) { //assume index is 0 to size-1
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException("index out of bounds; either is negative or >= size");
    }
    String replaced = data[index];
    data[index] = element;
    return replaced;
  }

  private void resize() {
    String[] newData = new String[data.length * 2 + 1]; //data.length is the capacity
    for (int i = 0; i < data.length; i++) {
      newData[i] = data[i];
    }
    data = newData;
    //System.out.println("RESIZED!");
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
      if (i == size-1) str += data[i];
      else {str += data[i] + ", ";}
    }
    str += "]";
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

  public int indexOf(String s) {
    for (int i = 0; i < size; i++) {
      if (s == null) { //accounts for if s is null
        if (data[i] == s) return i;
      }
      else {
        if (s.equals(data[i])) return i;
      }
    }
    return -1; //s ain't there
  }

  public int lastIndexOf(String value) {
    for (int i = size-1; i >= 0; i--) {
      if (value == null) { //accounts for if s is null
        if (data[i] == value) return i;
      }
      else {
        if (value.equals(data[i])) return i;
      }
    }
    return -1; //s ain't there
  }

  public String[] toArray() {
    String[] newArray = new String[size];
    for (int i = 0; i < newArray.length; i++) {
      newArray[i] = data[i];
    }
    return newArray;
  }

  public boolean equals(SuperArray other) {
    if (this.size() != other.size()) {
      return false;
    }
    for (int i = 0; i < size; i++) {
      if (!other.get(i).equals(this.get(i))) {
        return false;
      }
    }
    return true;
  }

}
