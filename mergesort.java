package array;
import java.util.Arrays;
public class mergesort {
	public static void main(String[]args)
	{
		int[] arr1= {1,2,3};
		int[] arr2= {4,5,6};
		int[] merged=Arrays.copyOf(arr1,arr1.length+arr2.length);
		for(int i=0;i<arr2.length;i++)
		{
			merged[arr1.length+i]=arr2[i];
		}
		System.out.println("merged array:"+Arrays.toString(merged));
	}

}
