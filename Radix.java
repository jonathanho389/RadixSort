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

  public static void radixSortSimple(SortableLinkedList data){
    int loops = 0;
    for(int i = 0;i < data.size();i++){
      loops = Math.max(length(data.get(i)), loops);
    }
    SortableLinkedList[] buckets = new SortableLinkedList[10];
    for(int i = 0;i < 10;i++){
      buckets[i] = new SortableLinkedList();
    }
    for(int i = 0;i < loops;i++){
      for(int j = 0;j < data.size();j++){
        int num = nth(data.get(j),i);
        buckets[num].add(data.get(j));
        data.remove(j);
        j--;
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
      for(int j = 0;j < data.size();j++){
        int num = nth(data.get(j),i);
        if(data.get(j) < 0){
          negbuckets[10 - num - 1].add(data.get(j));
        }
        else{
          buckets[num].add(data.get(j));
          }
        data.remove(j);
        j--;
      }
      merge(data, negbuckets);
      merge(data, buckets);
    }
  }
}
