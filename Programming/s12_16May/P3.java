package s12_16May;


// WJP to find all the leader in the array
// Current Element is greater then all other elements further it
// a = {8,7,4,3,5,2} 
// 8 > {7,4,3,5,2} 		--> True
// 7 > {4,3,5,2}		--> True
// 4 > {3,5,2}			--> False
// 3 > {5,2}			--> False
// 5 > {2}				--> True
// 2 > {}				--> True

public class P3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {8,7,4,3,5,2};
		for(int i = 0 ; i < a.length; i++) {
			boolean isLeader = true;
			for(int j = i+1; j < a.length; j++) {
				if(a[i] < a[j]) {
					isLeader = false;
					break;
				}
			}
			if(isLeader){
				System.out.print(a[i] + " ");
			}
		}
	}

}
