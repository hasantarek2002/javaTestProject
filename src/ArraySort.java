import java.util.Arrays;
import java.util.Scanner;
public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		int x;
		int arr[];
		x=a.nextInt();
		arr=new int[x];
		for(int i=0; i<x; i++)
		{
			arr[i]=a.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0; i<x; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
