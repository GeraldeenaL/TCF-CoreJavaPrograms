package Day7_egs;
//Finding the largest element.

public class JaggedArrayDemo {

	public static void main(String[] args) {
		int [][] arr= {{18,26,739,944},{49,76,63},{79,75},{88,95,57,97,60}};
		int max=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
			
		}
		System.out.println("The Largest Element is:  "+max);

	}

}
