
public class OilStations {
	public static void main(String[] args) {
		int[][] arr = {{1,10},{5,20},{1,3},{2,8}};
		int[] arr1 = new int[arr.length];
		int[] arr2 = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			arr1[i] = arr[i][0];
		}
		for(int i=0;i<arr.length;i++) {
			arr2[i] = arr[i][1];
		}
		int count=0,max=0;
		for(int i=0;i<arr1.length;i++) {
			int m=arr1[i];
			int n=arr2[i];
			for(int p=0;p<arr1.length;p++) {
				if(n>arr1[p]&&(arr2[p]>n||arr2[p]<n))
					count++;
			}
			if(max<count) {
				max=count;
			}
			count=0;
		}
		System.out.println(max);
	}

}
