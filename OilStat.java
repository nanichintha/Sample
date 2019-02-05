public class OilStations {
	public static void main(String[] args) {
		int[][] arr = {{2,3},{1,5},{4,6},{1,4},{4,5}};
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
		for(int i=0;i<arr1.length;i++) {
		    for(int j=0;j<arr1.length;j++) {
		        if(arr2[i]==arr1[j]){
		            if(arr2[i]!=1&&arr1[j]!=1){
		                max-=1;
		            }
		            break;
		        }
		    }
		}
		System.out.println(max);
	}

}
