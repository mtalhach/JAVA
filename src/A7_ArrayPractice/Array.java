package A7_1_ArrayPractice;

public class Array {

    public static int findIndex(int[] arr,int index){
        if(arr==null)
            return -1;
        int length = arr.length;
        int i=0;
        while (i<length){
            if(arr[i]==index)
                return i;
            else i++;
        }
        return -1;
    }

}
