public class Radix{
  public static int nth(int n, int col){
    return (Math.abs(n) / (int)Math.pow(10, col)) % 10;
  }

  public static int length(int n){
    int temp = n;
    int digits = 0;
    if(temp == 0){
      return 1;
    }
    else{
        while(temp != 0){
        temp /= 10;
        digits++;
      }
    }
    return digits;
  }

  public static void merge(SortableLinkedList original, SortableLinkedList[] buckets){
    for(int i = 0;i < buckets.length;i++){
      original.extend(buckets[i]);
    }
  }
//use while loop
  public static void radixSortSimple(SortableLinkedList data){
    int loops = 0;
    SortableLinkedList temp = data;
    for(int i = 0;i < temp.size();i++){
      loops = Math.max(length(temp.get(0)), loops);
      temp.remove(0);
    }
    SortableLinkedList[] buckets = new SortableLinkedList[10];
    for(int i = 0;i < 10;i++){
      buckets[i] = new SortableLinkedList();
    }
    for(int i = 0;i < loops;i++){
      while(data.size() != 0){
        int num = nth(data.get(0),i);
        buckets[num].add(data.get(0));
        data.remove(0);
      }
    merge(data, buckets);
    }
  }

  public static void radixSort(SortableLinkedList data){
    int loops = 0;
    for(int i = 0;i < data.size();i++){
      loops = Math.max(length(data.get(i)), loops);
    }
    SortableLinkedList[] buckets = new SortableLinkedList[10];
    SortableLinkedList[] negbuckets = new SortableLinkedList[10];
    for(int i = 0;i < 10;i++){
      buckets[i] = new SortableLinkedList();
      negbuckets[i] = new SortableLinkedList();
    }
    for(int i = 0;i < loops;i++){
      while(data.size() != 0){
        int num = nth(data.get(0),i);
        if(data.get(0) < 0){
          negbuckets[10 - num - 1].add(data.get(0));
        }
        else{
          buckets[num].add(data.get(0));
          }
        data.remove(0);
      }
      merge(data, negbuckets);
      merge(data, buckets);
    }
  }
}
