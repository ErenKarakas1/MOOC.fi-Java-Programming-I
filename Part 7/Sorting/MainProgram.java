
public class MainProgram {
    
    /* This is not an optimized solution!!! You could find the "index of smallest"
    and "index of smallest from a given starting point" much easier. Since the course 
    warned about taking instructions literally and requested all these methods back
    to back, I thought we had to use the old ones to build newer ones. You can still
    use the solution below to see the model solution if you want.
    */
    
    public static void main(String[] args) {
        int[] numbers = {-1,3,1,2};
        MainProgram.sort(numbers);
    }
    
    public static int smallest(int[] array){
        int smallest = array[0];
        for (int value : array){
            if (value < smallest){
                smallest = value;
            }
        } 
        return smallest;
    }
    public static int indexOfSmallest(int[] array){
        int smallest = smallest(array);
        for (int i = 0; i < array.length; i++){
            if (array[i] == smallest){
                return i;
            }
        }
        return -1;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int length = table.length - startIndex;
        int[] newArray = new int[length];
        int x = startIndex;
        
        for (int i = 0; i < length; i++){
            newArray[i] = table[x];
            x++;
        }
        return indexOfSmallest(newArray)+startIndex;
    }
    
    public static void swap(int[] array, int index1, int index2){
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }
    
    public static void sort(int[] array){
        for (int i = 0; i < array.length; i++){
            swap(array, indexOfSmallestFrom(array, i), i);
            for (int nums : array){
                System.out.print(nums);
            }
            System.out.println("");
        }
    }
}
