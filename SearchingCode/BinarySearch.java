class BinarySearch {
  
  public static int Search(int SearchArray, int target) {
    int length = SearchArray.length;
    int start = 0;
    int end = length-1;

    while(start <= end) {
      int mid = (start + end)/2;
      
      if(SearchArray[mid] == target) {
        return mid;
      }
      else if (SearchArray[mid] > target) {
        end = mid - 1;
      }
      else {
        start = mid + 1;
      }
    }
    return -1;
  }
  
  public static void main(String args[]) {
    int [] SearchArray = new int[]{1, 5, 8, 20, 34, 45, 46, 50, 99}; // Perform Binary search to find target value .....
    int target = 46;

    int index = Search(SearchArray, target);

    if(index == -1) {
      System.out.println("Target was not presesnt in the given Array");
    }
    else {
      System.out.println("Target was presesnt at index : " + index);
    }
    
  }
}
