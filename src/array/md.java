package array;

public class md {
public static void main(String[] args) {
	//3*4 multidimensional arrays
		//  0  1  2  3
	    //0 10 20 30 100
		//1 40 50 60 500 
		//2 70 80 90 1000
		
	
	int a[][]= {{10,20,-40,1400},{40,50,60,500},{1200,80,90,1000}};
	
	for(int i=0;i<=2;i++) {
		for(int j=0;j<=3;j++) 
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println("");
		
	}
	System.out.println("----------------");
	
		int max=a[0][0];//500
		int min=a[0][0]; //10
		
		for(int m=0;m<=2;m++) //2          outer loop for row only
		{
			for(int j=0;j<=3;j++) //1      inner loop for cols
			{
			if(a[m][j]>max)//
				max=a[m][j];
			else if(a[m][j]<min)//
				min=a[m][j];
			}
	}
		System.out.println("largest is:"+ max);
		System.out.println("smallest is:"+ min);

}
}
