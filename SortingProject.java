import java.util.*;

class BubbleSort{

    BubbleSort() {
        System.out.println("\n---- Hey You have choosen Bubble Sort for sorting your Elements ----");
        System.out.println("The Worst Case Time Complexity of Bubble sort is O(N^2) .\n");
    }

    public void enteringElements(Scanner sc, int sizeOfArray, int bubbleSortArray[]) {
        
        for(int i=0; i<sizeOfArray; i++) {
            if(i==0)
                System.out.print("Enter the 1st Integer : ");
            else if(i==1)
                System.out.print("Enter the 2nd Integer : ");
            else if(i==2) 
                System.out.print("Enter the 3rd Integer : ");
            else
                System.out.print("Enter the " + (i+1) + "th Integer : ");

            bubbleSortArray[i] = sc.nextInt();
        }
        System.out.println();
    }

    public void sortingBubbleSortAscendingOrder(int bubbleSortArray[], int sizeOfArray) {

        System.out.println("Started Sorting the Elements in ASCENDING ORDER!\n");
        int swap = 0;

        for(int i=0; i<sizeOfArray-1; i++) {
            System.out.println("Pass " + (i+1) + " : \n\n     { \n");

            for(int j=0; j<(sizeOfArray-i-1); j++) {
                if(bubbleSortArray[j] > bubbleSortArray[j+1]) {
                    System.out.print( "     " +bubbleSortArray[j] + " > " + bubbleSortArray[j+1] + " So, SWAP");
                    int tempVariable = bubbleSortArray[j];
                    bubbleSortArray[j] = bubbleSortArray[j+1];
                    bubbleSortArray[j+1] = tempVariable;
                    swap++;
                }
                else {
                    System.out.print("     " + bubbleSortArray[j] + " < or = " + bubbleSortArray[j+1] + " So, No SWAP");
                }
                System.out.println(" : " + swap);
            }
            System.out.print("\n     Elements after PASS " + (i+1) + " : ");
            for(int j=0; j<sizeOfArray; j++)
                System.out.print( bubbleSortArray[j] + " ");
            System.out.println("\n\n     }\n");
        }

    }

    public void sortingBubbleSortDescendingOrder(int bubbleSortArray[], int sizeOfArray) {

        System.out.println("Started Sorting the Elements in DESCENDING ORDER!\n");
        int swap = 0;
        for(int i=0; i<sizeOfArray-1; i++) {
            System.out.println("Pass " + (i+1) + " : \n\n     { \n");

            for(int j=0; j<(sizeOfArray-i-1); j++) {
                if(bubbleSortArray[j] < bubbleSortArray[j+1]) {
                    System.out.print( "     " +bubbleSortArray[j] + " < " + bubbleSortArray[j+1] + " So, SWAP");
                    int tempVariable = bubbleSortArray[j];
                    bubbleSortArray[j] = bubbleSortArray[j+1];
                    bubbleSortArray[j+1] = tempVariable;
                    swap++;

                }
                else {
                    System.out.print("     " + bubbleSortArray[j] + " < or = " + bubbleSortArray[j+1] + " So, No SWAP");
                }
                System.out.println(" : " + swap);
            }

            System.out.print("\n     Elements after PASS " + (i+1) + " : ");

            for(int j=0; j<sizeOfArray; j++)
                System.out.print("     " + bubbleSortArray[j] + " ");
            System.out.println("\n\n     }\n");
        }
    }

}

class InsertionSort{
    InsertionSort() {
        System.out.println("\n---- Hey You have choosen Insertion Sort for sorting your Elements ----");
        System.out.println("The Worst Case Time Complexity of Insertion sort is O(N^2) .");
    }

    public void enteringElements(Scanner sc, int sizeOfArray, int bubbleSortArray[]) {
        
        for(int i=0; i<sizeOfArray; i++) {
            if(i==0)
                System.out.print("Enter the 1st Integer : ");
            else if(i==1)
                System.out.print("Enter the 2nd Integer : ");
            else if(i==2) 
                System.out.print("Enter the 3rd Integer : ");
            else
                System.out.print("Enter the " + (i+1) + "th Integer : ");
            bubbleSortArray[i] = sc.nextInt();
        }
        System.out.println();
    }

    public void sortingInsertionSortAscendingOrder (int insertionSortArray[], int sizeOfArray) {
        System.out.println("Started Sorting the Elements in ASCENDING ORDER!");
        for(int i=1; i<sizeOfArray; i++) {
            System.out.print("Pass "+(i)+" : { ");
            int tempVariable = insertionSortArray[i];
            int j = i-1;
            while(j>=0 && insertionSortArray[j]>=tempVariable) {
                insertionSortArray[j+1] = insertionSortArray[j];
                j--;
            }
            insertionSortArray[j+1] = tempVariable;
            for(int k=0; k<sizeOfArray; k++)
                System.out.print(insertionSortArray[k] + " ");
            System.out.println("}");
        }
    }

    public void sortingInsertionSortDescendingOrder (int insertionSortArray[], int sizeOfArray) {
        System.out.println("Started Sorting the Elements in Descending ORDER!");

        for(int i=1; i<sizeOfArray; i++) {
            System.out.print("Pass "+(i)+" : { ");
            int tempVariable = insertionSortArray[i];
            int j = i-1;
            while(j>=0 && insertionSortArray[j]<=tempVariable) {
                insertionSortArray[j+1] = insertionSortArray[j];
                j--;
            }
            insertionSortArray[j+1] = tempVariable;
            for(int k=0; k<sizeOfArray; k++)
                System.out.print(insertionSortArray[k] + " ");
            System.out.println("}");
        }
    }
}

class SelectionSort{
    SelectionSort() {
        System.out.println("\n---- Hey You have choosen Selection Sort for sorting your Elements ----");
        System.out.println("The Worst Case Time Complexity of Selection sort is O(N^2) .");
    }

    public void enteringElements(Scanner sc, int sizeOfArray, int SelectionSortArray[]) {
        
        for(int i=0; i<sizeOfArray; i++) {
            if(i==0)
                System.out.print("Enter the 1st Integer : ");
            else if(i==1)
                System.out.print("Enter the 2nd Integer : ");
            else if(i==2) 
                System.out.print("Enter the 3rd Integer : ");
            else
                System.out.print("Enter the " + (i+1) + "th Integer : ");
            SelectionSortArray[i] = sc.nextInt();
        }
        System.out.println();

    }

    public void sortingSelectionSortAscendingOrder (int SelectionSortArray[], int sizeOfArray) { 

        System.out.println("Started Sorting the Elements in ASCENDING ORDER!\n");
        
        int swap = 0;
        for(int i=0; i<sizeOfArray-1; i++) {
            System.out.println("Pass " + (i+1) + " : \n     { \n");
            int minElement = SelectionSortArray[i];
            int minElementIdx = i;
            for(int j=i+1; j<sizeOfArray; j++) {
                if(SelectionSortArray[j] < minElement) {
                    minElement = SelectionSortArray[j];
                    minElementIdx = j;
                }
            }
            if(i != minElementIdx) {
                System.out.println( "      " + SelectionSortArray[minElementIdx] + " < " + SelectionSortArray[i] + ",           So SWAP");
                swap++ ;
            }
            else
                System.out.println( "      " + SelectionSortArray[minElementIdx] + " = " + SelectionSortArray[i] + ",           So No-SWAP");
            SelectionSortArray[minElementIdx] = SelectionSortArray[i];
            SelectionSortArray[i] = minElement;

            System.out.print("      ");
            for(int k=0; k<sizeOfArray; k++) {
                System.out.print(SelectionSortArray[k] + " ");
            }
            System.out.println("      Swaps = "+ swap +"\n\n      }\n");
        }
    }

    public void sortingSelectionSortDescendingOrder (int SelectionSortArray[], int sizeOfArray) {

        System.out.println("Started Sorting the Elements in DESCENDING ORDER!");
        int swap = 0;
        for(int i=0; i<sizeOfArray-1; i++) {
            System.out.println("Pass " + (i+1) + " : \n     { \n");
            int maxElement = SelectionSortArray[i];
            int maxElementIdx = i;
            for(int j=i+1; j<sizeOfArray; j++) {
                if(SelectionSortArray[j] > maxElement) {
                    maxElement = SelectionSortArray[j];
                    maxElementIdx = j;
                }
            }
            if(i != maxElementIdx) {
                System.out.println( "      " + SelectionSortArray[maxElementIdx] + " > " + SelectionSortArray[i] + ",          So SWAP");
                swap++ ;
            }
            else
                System.out.println( "      " + SelectionSortArray[maxElementIdx] + " = " + SelectionSortArray[i] + ",           So No-SWAP");
            SelectionSortArray[maxElementIdx] = SelectionSortArray[i];
            SelectionSortArray[i] = maxElement;
            System.out.print("      ");
            for(int k=0; k<sizeOfArray; k++) {
                System.out.print(SelectionSortArray[k] + " ");
            }
            System.out.println("      Swaps = "+ swap +"\n\n      }\n");
        }

    }

}

class QuickSort{
    private int sizeOfArray;

    QuickSort(int sizeOfArray) {
        this.sizeOfArray = sizeOfArray;
        System.out.println("\n---- Hey You have choosen Quick Sort for sorting your Elements ----");
        System.out.println("The Worst Case Time Complexity of Quick sort is O(Nlog(N)) .");
    }

    public void enteringElements(Scanner sc, int quickSortArray[]) {

        for(int i=0; i<sizeOfArray; i++) {
            if(i==0)
                System.out.print("Enter the 1st Integer : ");
            else if(i==1)
                System.out.print("Enter the 2nd Integer : ");
            else if(i==2) 
                System.out.print("Enter the 3rd Integer : ");
            else
                System.out.print("Enter the " + (i+1) + "th Integer : ");
            quickSortArray[i] = sc.nextInt();
        }
    }

    public void sortingQuickSortAscendingOrder (int start, int quickSortArray[], int end) {
        if(start < end) {
            int pivotElement = partioningAscending(quickSortArray, start, end);
            sortingQuickSortAscendingOrder(start, quickSortArray, pivotElement-1);
            sortingQuickSortAscendingOrder(pivotElement+1, quickSortArray, end);
        }
    }

    public void sortingQuickSortDescendingOrder (int start, int quickSortArray[], int end) {
        if(start < end) {
            int pivotElement = partioningDescending(quickSortArray, start, end);
            sortingQuickSortDescendingOrder(start, quickSortArray, pivotElement-1);
            sortingQuickSortDescendingOrder(pivotElement+1, quickSortArray, end);
        }
    }

    public int partioningAscending(int quickSortArray[], int start, int end) {
        int pivot = quickSortArray[end];
        int low = start-1;
        System.out.println("Pivot Element : " + pivot);
        for(int i=start; i<= end; i++) {
            if(pivot > quickSortArray[i]) {
                low++;
                swapElements(quickSortArray, i, low);
            }
        }
        swapElements(quickSortArray, (low+1), end);

        printElements(quickSortArray);
        System.out.println();

        return (low+1);
    }

    public int partioningDescending(int quickSortArray[], int start, int end) {
        int pivot = quickSortArray[end];
        int low = start-1;
        System.out.println("Pivot Element : " + pivot);
        for(int i=start; i<= end; i++) {
            if(pivot < quickSortArray[i]) {
                low++;
                swapElements(quickSortArray, i, low);
            }
        }
        swapElements(quickSortArray, (low+1), end);

        printElements(quickSortArray);
        System.out.println();

        return (low+1);
    }

    public void swapElements(int quickSortArray[], int i, int j) {
        int tempVariable = quickSortArray[i];
        quickSortArray[i] = quickSortArray[j];
        quickSortArray[j] = tempVariable;
    }

    public void printElements(int quickSortArray[]) {
        for(int i=0; i<quickSortArray.length; i++) {
            System.out.print(quickSortArray[i] + " ");
        }
        System.out.println();
    }

}

class CountSort{
    private int sizeOfArray;

    CountSort(int sizeOfArray) {
        this.sizeOfArray = sizeOfArray;
    }

    public void enteringElements (Scanner sc, int CountSortArray[]) {
        int i = 0;
        while(i < sizeOfArray){
            if(i==0)
                System.out.print("Enter the 1st Integer : ");
            else if(i==1)
                System.out.print("Enter the 2nd Integer : ");
            else if(i==2) 
                System.out.print("Enter the 3rd Integer : ");
            else
                System.out.print("Enter the " + (i+1) + "th Integer : ");
                
            int element = sc.nextInt();
            CountSortArray[element]++;
            i++;
        }
    }

    public void sortingCountSortAscendingOrder(int CountSortArray[]) {

        System.out.println("Started Sorting the Elements in ASCENDING ORDER!");

        for(int i=0; i<99999; i++) {
            if(CountSortArray[i] > 0) {
                while(CountSortArray[i] !=0) {
                    System.out.print(i + " ");
                    CountSortArray[i]--;
                }
            }
        }

    }

    public void sortingCountSortDescendingOrder(int CountSortArray[]) {

        System.out.println("Started Sorting the Elements in DESCENDING ORDER!");
        
        for(int i=99999-1; i>=0; i--) {
            if(CountSortArray[i] > 0) {
                while(CountSortArray[i] !=0) {
                    System.out.print(i + " ");
                    CountSortArray[i]--;
                }
            }
        }
    }

    

}

class Sorting_String{
    private int sizeOfArray;

    Sorting_String(int sizeOfArray) {
        this.sizeOfArray = sizeOfArray;
        System.out.println("\n---- Hey You have choosen to Sort the Strings ----");
        System.out.println("---- The Worst Case Time Complexity of Radix sort is O(Nlog(N)) . ----");
    }

    public void enteringElements(Scanner sc, String stringArray[]) {
        for(int i=0; i<sizeOfArray; i++) {
            if(i==0)
                System.out.print("Enter the 1st String : ");
            else if(i==1)
                System.out.print("Enter the 2nd String : ");
            else if(i==2) 
                System.out.print("Enter the 3rd String : ");
            else
                System.out.print("Enter the " + (i+1) + "th String : ");
            stringArray[i] = sc.next();
        }
    }

    public void sortingStringAscendingOrder(String stringArray[]) {
        Arrays.sort(stringArray);
        PrintElements(stringArray);
    }

    public void sortingStringDescendingOrder(String stringArray[]) {
        Arrays.sort(stringArray);
        int i=0, j = sizeOfArray-1;
        while(i < j) {
            swapElements(stringArray, i, j);
            i++;
            j--;
        }
        PrintElements(stringArray);
    }
    public void PrintElements(String StringArray[]) {
        for(int i=0; i<sizeOfArray; i++)
            System.out.println(StringArray[i] + "  ");
    }

    public void swapElements(String StringArray[], int i, int j) {
        String tempVariable = StringArray[i];
        StringArray[i] = StringArray[j];
        StringArray[j] = tempVariable;
    }
}

class Sorting_Character{

    Sorting_Character() {
        System.out.println("\n---- Hey You have choosen to Sort the Characters ----");
    }

    public void enteringElements(Scanner sc, char charArray[], int sizeOfArray) {
        for(int i=0; i<sizeOfArray; i++) {
            if(i==0)
                System.out.print("Enter the 1st Character : ");
            else if(i==1)
                System.out.print("Enter the 2nd Character : ");
            else if(i==2) 
                System.out.print("Enter the 3rd Character : ");
            else
                System.out.print("Enter the " + (i+1) + "th Character : ");
            charArray[i] = sc.next().charAt(0);
        }
    }
    public void sortingCharacterAscendingOrder(char charArray[], int sizeOfArray) {
        System.out.println("We Are using BUbble Sort to sort these Characters !!!"); 

        for(int i=0; i<sizeOfArray-1; i++) {
            System.out.println("\nPass " + (i+1) + " : \n");
            for(int j=0; j<(sizeOfArray-i-1); j++) {
                int element1 = (int)(charArray[j]);
                int element2 = (int)(charArray[j+1]);
                if(element1 > element2)
                    swapElements(charArray, j, j+1);
            }
            printElements(charArray, sizeOfArray);
        }
    }

    public void sortingcharacterDescendingOrder(char charArray[], int sizeOfArray) {
        System.out.println("We Are using BUbble Sort to sort these Characters !!!"); 
        
        for(int i=0; i<sizeOfArray-1; i++) {
            System.out.print("\nPass " + (i+1) + " : \n");
            for(int j=0; j<(sizeOfArray-i-1); j++) {
                int element1 = (int)(charArray[j]);
                int element2 = (int)(charArray[j+1]);
                if(element1 < element2)
                    swapElements(charArray, j, j+1);
            }
            printElements(charArray, sizeOfArray);
        }
    }


    public void swapElements(char charArray[], int i, int j) {
        char tempVariable = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = tempVariable;
    }

    public void printElements(char charArray[], int sizeOfArray) {
        System.out.print("------>> ");
        for(int i=0; i<sizeOfArray; i++) 
            System.out.print(charArray[i] + " ");
        System.out.println();
    }

}

public class SortingProject {

    public static void Linear_Search(Scanner sc, int sizeOfArray, int [] SearchArray){
        
        System.out.print("\nEnter the key to search : ");
        int key = sc.nextInt();
        for(int i=0; i<sizeOfArray; i++) {
            if(key == SearchArray[i]) {
                System.out.println(SearchArray[i] + " == " + key);
                System.out.println("    Hey The key : " + key + " is Found at index : " + i + " then return....\n");
                return;
            }
            else {
                System.out.println(SearchArray[i] + " != " + key + ", so increment the value to the next index....");
            }
        }
        System.out.println("\nSorry Broo Element Not found in Your Array\n");
    }

    public static void Binary_Search(Scanner sc, int end, int [] SearchArray) {
        
        System.out.print("\nEnter the key to search : ");
        int key = sc.nextInt();
        System.out.println();
        int start = 0;
        while(start <= end) {
            int middleEleIdx = (start + end)/2;
            if(SearchArray[middleEleIdx] == key) {
                System.out.println("----->>  Array[middleElement] ( " + SearchArray[middleEleIdx] + " ) == key ( " + key + " ) , at Index " + middleEleIdx + "\n\n");
                return;
            }
            else if(SearchArray[middleEleIdx] < key) {
                System.out.println("----->>  Array[middleElement] ( " + SearchArray[middleEleIdx] + " ) < key ( " + key + ") , So Updating start Index to (MidElementIndex+1): " + (middleEleIdx+1));
                start = middleEleIdx+1;
            }
            else {
                System.out.println("----->>  Array[middleElement] ( " + SearchArray[middleEleIdx] + " ) > key ( " + key + " ) , So Updating end Index to (MidElementIndex+1): " + (middleEleIdx+1));
                end = middleEleIdx-1;
            }
        }
        System.out.println("\nSorry Broo Element Not found in Your Array\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n~~~~~~~~~~->>>  Welcome to the Algo Simulator  <<<-~~~~~~~~~~\n");

        System.out.println("Choose any one : "); 
        System.out.println("    Press 1 : For Sorting");
        System.out.println("    Press 2 : For Searching");
        System.out.print("\nPlease Enter the Value :  ");

        int choose;

        do{
             choose = sc.nextInt();
            if(choose == 1) {
                System.out.println("Which Algorithm you need to use for SORTING ?\n\n");

                System.out.println("*****----- Integers -----*****\n");
                System.out.println("-->> Press 1 for BUBBLE Sort");
                System.out.println("-->> Press 2 for INSERTION Sort");
                System.out.println("-->> Press 3 for SELECTION Sort");
                System.out.println("-->> Press 4 for QUICK Sort");
                System.out.println("-->> Press 5 for COUNT Sort");

                System.out.println("*****----- String ------*****\n");
                System.out.println("-->> Press 6 for Soting the strings\n");

                System.out.println("*****----- Character -----*****\n");
                System.out.println("-->> Press 7 for Soting the Characters\n");

                System.out.print("Please press the key * :  ");

                boolean checkChoice = true;
                do{
                    int choiceOfSort = sc.nextInt();
                    switch(choiceOfSort) {
                        case 1:
                            checkChoice = true;
                            BubbleSort bubblesort = new BubbleSort();
                            System.out.println("Enter how many Elements do you have ?");
                            int sizeOfArray = sc.nextInt();
                            

                            int bubbleSortArray[] = new int[sizeOfArray];

                            bubblesort.enteringElements(sc, sizeOfArray, bubbleSortArray);
                            System.out.print("If you want to perform Ascending Order press 1. \nFor Descending Order press 2. : ");
                            
                            int OrderChoice;
                            do {

                                OrderChoice = sc.nextInt();
                                System.out.println();
                                if(OrderChoice == 1) {
                                    bubblesort.sortingBubbleSortAscendingOrder(bubbleSortArray, sizeOfArray);
                                }
                                else if (OrderChoice == 2) {
                                    bubblesort.sortingBubbleSortDescendingOrder(bubbleSortArray, sizeOfArray);
                                }
                                else {
                                    System.out.println("You have entered invalid Order of Sorting\nEnter again");
                                }

                            } while (OrderChoice != 1 && OrderChoice != 2);

                            break;
                        case 2:
                            checkChoice = true;
                            InsertionSort insertionsort = new InsertionSort();

                            System.out.println("Enter how many Elements do you have ?");
                            sizeOfArray = sc.nextInt();

                            int insertionSortArray[] = new int[sizeOfArray];

                            insertionsort.enteringElements(sc, sizeOfArray, insertionSortArray);
                            System.out.print("If you want to perform Ascending Order press 1. \nFor Descending Order press 2. : ");

                            // OrderChoice;
                            do {

                                OrderChoice = sc.nextInt();
                                System.out.println();
                                if(OrderChoice == 1) {
                                    insertionsort.sortingInsertionSortAscendingOrder(insertionSortArray, sizeOfArray);
                                }
                                else if (OrderChoice == 2) {
                                    insertionsort.sortingInsertionSortDescendingOrder(insertionSortArray, sizeOfArray);
                                }
                                else {
                                    System.out.println("You have entered invalid Order of Sorting\nEnter again");
                                }

                            } while (OrderChoice != 1 && OrderChoice != 2);

                            break;
                        case 3:
                            checkChoice = true;    
                            SelectionSort selectionsort = new SelectionSort();

                            System.out.println("\nEnter how many Elements do you have ?");
                            sizeOfArray = sc.nextInt();

                            int SelectionSortArray[] = new int[sizeOfArray];

                            selectionsort.enteringElements(sc, sizeOfArray, SelectionSortArray);
                            System.out.print("If you want to perform Ascending Order press 1. \nFor Descending Order press 2. : ");

                            do {

                                OrderChoice = sc.nextInt();
                                System.out.println();
                                if(OrderChoice == 1) {
                                    selectionsort.sortingSelectionSortAscendingOrder(SelectionSortArray, sizeOfArray);
                                }
                                else if (OrderChoice == 2) {
                                    selectionsort.sortingSelectionSortDescendingOrder(SelectionSortArray, sizeOfArray);
                                }
                                else {
                                    System.out.println("You have entered invalid Order of Sorting\nEnter again");
                                }

                            } while (OrderChoice != 1 && OrderChoice != 2);

                            break;
                        
                        case 4:
                            checkChoice = true;
                            
                            System.out.println("Enter how many Elements do you have ?");
                            sizeOfArray = sc.nextInt();
                            QuickSort quicksort = new QuickSort(sizeOfArray);

                            int quickSortArray[] = new int[sizeOfArray];

                            quicksort.enteringElements(sc, quickSortArray);

                            System.out.print("If you want to perform Ascending Order press 1. \nFor Descending Order press 2. : ");
                            
                            do {

                                OrderChoice = sc.nextInt();
                                System.out.println();
                                if(OrderChoice == 1) {
                                    quicksort.sortingQuickSortAscendingOrder(0,quickSortArray, sizeOfArray-1);
                                }
                                else if (OrderChoice == 2) {
                                    quicksort.sortingQuickSortDescendingOrder(0, quickSortArray, sizeOfArray-1);
                                }
                                else {
                                    System.out.println("You have entered invalid Order of Sorting\nEnter again");
                                }

                            } while (OrderChoice != 1 && OrderChoice != 2);

                            break;
                        case 5:
                            checkChoice = true;
                            System.out.println("---- Hey You have choosen Count Sort for sorting your Elements ----");
                            System.out.println("The Worst Case Time Complexity of Count sort is O(N + K) .\n");
                            System.out.println("Enter how many Elements do you have ?");
                            sizeOfArray = sc.nextInt();
                            CountSort countsort = new CountSort(sizeOfArray);
                            int CountSortArray[] = new int[99999];

                            countsort.enteringElements(sc, CountSortArray);
                            System.out.print("If you want to perform Ascending Order press 1. \nFor Descending Order press 2. : ");

                            do {

                                OrderChoice = sc.nextInt();
                                System.out.println();
                                if(OrderChoice == 1) {
                                    countsort.sortingCountSortAscendingOrder(CountSortArray);
                                }
                                else if (OrderChoice == 2) {
                                    countsort.sortingCountSortDescendingOrder(CountSortArray);
                                }
                                else {
                                    System.out.println("You have entered invalid Order of Sorting\nEnter again");
                                }

                            } while (OrderChoice != 1 && OrderChoice != 2);

                            break;
                        case 6:
                            checkChoice = true;

                            System.out.println("Enter how many Elements do you have ?");
                            sizeOfArray = sc.nextInt();

                            Sorting_String sortingString = new Sorting_String(sizeOfArray);
                            String StringArray[] = new String[sizeOfArray];

                            sortingString.enteringElements(sc, StringArray);
                            System.out.print("If you want to perform Ascending Order press 1. \nFor Descending Order press 2. : ");

                            do {

                                OrderChoice = sc.nextInt();
                                System.out.println();
                                if(OrderChoice == 1) {
                                    sortingString.sortingStringAscendingOrder(StringArray);
                                }
                                else if (OrderChoice == 2) {
                                    sortingString.sortingStringDescendingOrder(StringArray);
                                }
                                else {
                                    System.out.println("You have entered invalid Order of Sorting\nEnter again");
                                }
                            } while (OrderChoice != 1 && OrderChoice != 2);

                            break;

                        case 7:
                            checkChoice = true;
                            Sorting_Character sortingcharacter = new Sorting_Character();
                            
                            System.out.println("Enter how many Elements do you have ?");
                            sizeOfArray = sc.nextInt();

                            char charArray[] = new char[sizeOfArray];

                            sortingcharacter.enteringElements(sc, charArray, sizeOfArray);
                            System.out.print("If you want to perform Ascending Order press 1. \nFor Descending Order press 2. : ");
                            do {

                                OrderChoice = sc.nextInt();
                                System.out.println();
                                if(OrderChoice == 1) {
                                    sortingcharacter.sortingCharacterAscendingOrder(charArray, sizeOfArray);
                                }
                                else if (OrderChoice == 2) {
                                    sortingcharacter.sortingcharacterDescendingOrder(charArray, sizeOfArray);
                                }
                                else {
                                    System.out.println("You have entered invalid Order of Sorting\nEnter again");
                                }
                            } while (OrderChoice != 1 && OrderChoice != 2);

                            break;

                        default:
                            checkChoice = false;
                            System.out.print("** Sorry you have entered a wrong option, please enter a valid input again :  ");
                    }
                }while(!checkChoice);
            }
            else if(choose == 2) {
                System.out.println("Hey you are trying for Search then check it .....\n");
                System.out.println("   press 1 : For Linear Search");
                System.out.print("   press 2 : For Binary Search :  ");
                int search = sc.nextInt();
                switch(search) {
                    case 1 :
                        System.out.print("Enter the size of Linear Search Array  :  ");
                        int sizeOfArray = sc.nextInt();
                        int SearchArray[] = new int[sizeOfArray];
                        for(int i=0; i<sizeOfArray; i++) {
                            if(i==0)
                                System.out.print("\nEnter the 1st Integer : ");
                            else if(i==1)
                                System.out.print("Enter the 2nd Integer : ");
                            else if(i==2) 
                                System.out.print("Enter the 3rd Integer : ");
                            else
                                System.out.print("Enter the " + (i+1) + "th Integer : ");
                            SearchArray[i] = sc.nextInt();
                        }
                        Linear_Search(sc, sizeOfArray, SearchArray);
                        break;
                    case 2 :

                        System.out.print("Enter the size of Binary Search Array  :  ");
                        sizeOfArray = sc.nextInt();
                        int BSearchArray[] = new int[sizeOfArray];
                        for(int i=0; i<sizeOfArray; i++) {
                            if(i==0)
                                System.out.print("\nEnter the 1st Integer : ");
                            else if(i==1)
                                System.out.print("Enter the 2nd Integer : ");
                            else if(i==2) 
                                System.out.print("Enter the 3rd Integer : ");
                            else
                                System.out.print("Enter the " + (i+1) + "th Integer : ");
                            BSearchArray[i] = sc.nextInt();
                        }

                        Binary_Search(sc, sizeOfArray-1, BSearchArray);
                        break;
                    default :
                    System.out.println("You Entered Invalid Input , So we are Exiting .....");
                }

            }
            else {
                System.out.println("Invalid Entry please Try Again !!!");
            }   
        }while(choose != 1 && choose !=2);

        sc.close();
    }
}
