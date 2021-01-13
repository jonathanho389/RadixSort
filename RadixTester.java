public class RadixTester{
  public static void main(String[] args) {
    System.out.println(Radix.nth(123, 1));
    System.out.println(Radix.nth(-123,1));
    System.out.println(Radix.nth(123, 2));
    System.out.println(Radix.nth(123, 2));
    System.out.println(Radix.length(0));
    System.out.println(Radix.length(1));
    System.out.println(Radix.length(15));
    System.out.println(Radix.length(-10));
    System.out.println(Radix.length(5112));
    SortableLinkedList[] buckets = new SortableLinkedList[10];
    SortableLinkedList original = new SortableLinkedList();
    SortableLinkedList one = new SortableLinkedList();
    one.add(1); one.add(2);
    SortableLinkedList two = new SortableLinkedList();
    two.add(1); two.add(2);
    SortableLinkedList three = new SortableLinkedList();
    three.add(1); three.add(2);
    SortableLinkedList four = new SortableLinkedList();
    four.add(1); four.add(2);
    SortableLinkedList five = new SortableLinkedList();
    five.add(1); five.add(2);
    SortableLinkedList six = new SortableLinkedList();
    six.add(1); six.add(2);
    SortableLinkedList seven = new SortableLinkedList();
    seven.add(1); seven.add(2);
    SortableLinkedList eight = new SortableLinkedList();
    eight.add(1); eight.add(2);
    SortableLinkedList nine = new SortableLinkedList();
    nine.add(1); nine.add(2);
    SortableLinkedList ten = new SortableLinkedList();
    ten.add(1); ten.add(2);
    buckets[0] = (one);
    buckets[1] = (two);
    buckets[2] = (three);
    buckets[3] = (four);
    buckets[4] = (five);
    buckets[5] = (six);
    buckets[6] = (seven);
    buckets[7] = (eight);
    buckets[8] = (nine);
    buckets[9] = (ten);
    Radix.merge(original, buckets);
    System.out.println(original.toString());
  }
}
