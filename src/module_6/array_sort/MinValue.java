package module_6.array_sort;

public class MinValue {

    public int findMin (int [] array)
    {
        int minimum = array[0];

        for (int i = 1; i < array.length; i++)
        {
            if(minimum > array[i])
            {
                minimum = array[i];
            }
        }
        return minimum;
    }
}
