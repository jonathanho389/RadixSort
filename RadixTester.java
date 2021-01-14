import java.util.*;
public class RadixTester{
  public static void main(String[] args) {
    System.out.println(Radix.nth(123, 0));
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
    int[] testing = {-15, -36, 235, 2305, -6, 39, 92, 124, 250, 340};
    one.add(15); original.add(-15);
    SortableLinkedList two = new SortableLinkedList();
    two.add(36); original.add(-36);
    SortableLinkedList three = new SortableLinkedList();
    three.add(235);original.add(235);
    SortableLinkedList four = new SortableLinkedList();
    four.add(2305);original.add(2305);
    SortableLinkedList five = new SortableLinkedList();
    five.add(6);original.add(-6);
    SortableLinkedList six = new SortableLinkedList();
    six.add(39);original.add(39);
    SortableLinkedList seven = new SortableLinkedList();
    seven.add(92);original.add(92);
    SortableLinkedList eight = new SortableLinkedList();
    eight.add(124);original.add(124);
    SortableLinkedList nine = new SortableLinkedList();
    nine.add(250);original.add(250);
    SortableLinkedList ten = new SortableLinkedList();
    ten.add(340);original.add(340);
    System.out.println("Original" + original.toString());
    Arrays.sort(testing);
    System.out.println("Sorted" + Arrays.toString(testing));
    Radix.radixSort(original);
    System.out.println("Radix" + original.toString());
  }
}
