package SafeVarArgsAnnotationEnhancements;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sum(1,2,3,4,5);
		sum(1,2,3,4,5,7,8,9,10);
		sum(1,2,3,4,5,7,8,9,10,11,12,13,14,15);
	}
	
	//Var arg Method	1.4v
	//internally var arg Method converted into array
	public static void sum(int... i) {
		System.out.println("Var arg Method");
		int sum=-0;
		for (int j : i) {
			sum=sum+j;
		}
		System.out.println(sum);
	}
}
