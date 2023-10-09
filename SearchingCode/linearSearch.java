class LinearSearch {
  public static void main(String args[]) {
    int [] SearchArray = new int[]{1,5,2,9,77,34,21,22,0}; // perform linear search to find target value.....
    int length = SearchArray.length;
    int target = 77;

    boolean searchFound = false;
    
    for(int i=0; i<length; i++) {
      if(SearchArray[i] == target) {
        System.out.println("Target was found at index : " + i);
        searchFound = true;
      }
    }

    if(searchFound == false) {
      System.out.println("Target was not found in the Search Array.");
    }
    
  }
}
