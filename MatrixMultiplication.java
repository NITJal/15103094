import java.util.*;
public class MatrixMultiplication {

	public static void main(String args[]){
		int i,j,k,mat1,n1,mat2,n2;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the dimensions of matrix1::>");
		m1=sc.nextInt();
		n1=sc.nextInt();
		System.out.println("Enter the dimensions of matrix2::>");
		m2=sc.nextInt();
		n2=sc.nextInt();
		int mat1[][]=new int[mat1][n1];
		int mat2[][]=new int[mat2][n2];
		int result[][]=new int[mat1][n2];
		if(n1!=m2){
			System.out.println("Matrix multiplication isn't possible");
		}
		else{
			System.out.println("Enter Matrix1 element :");
			for(i=0;i<m1;i++){
				for(j=0;j<n1;j++){
					mat1[i][j]=sc.nextInt();
				}
			}
			System.out.println("Enter Matrix2 element :");
			for(i=0;i<m2;i++){
				for(j=0;j<n2;j++){
					mat2[i][j]=sc.nextInt();
				}
			}
			for(i=0;i<m1;i++){
				for(j=0;j<n2;j++){
					int sum=0;
					for(k=0;k<n1;k++){
						sum+=mat1[i][k]*mat2[k][j];
					}
					result[i][j]=sum;
				}
			}
			System.out.println("The product is :");
			for(int m=0;m<m1;m++){
				for(int n=0;n<n2;n++){
					System.out.print(result[m][n]+" "); 
				}
				System.out.println();
			}
			
		}
		
		
	}
}
