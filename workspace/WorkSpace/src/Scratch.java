
public class Scratch {
	public static void main(String [] args){
		int [] arr = new int[5];
		arr[0]=10;
		arr[1]=5;
		arr[2]=2;
		arr[3]=3;
		arr[4]=8;
		
		myFunc(arr);
		
		
	}
	public static int myFunc(int [] arr)
	{
		for(int i =0;i<arr.length-1;i++)
		{
			System.out.println("Iteration");
			int min = i;
			for(int j=i;j<arr.length;j++)
			{
				for(int k =0;k<arr.length;k++)
				{
					System.out.print(arr[k] + " ");
				}
				System.out.println("");
				if(arr[j]<arr[min])
					min=j;
				int temp = arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
		return 0;
			
	}
}
