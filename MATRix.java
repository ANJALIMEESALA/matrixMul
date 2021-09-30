public class Main{
public static void main(String[] args)
{
int a[][] ={ {1,3,4},{2,4,3},{3,4,5}}; // matrix "a" of size 3x3 
int b[][] = {{1,3,4},{2,4,3},{1,2,4}}; // matrix "b" of size 3x3
int m[][] = new int[3][3]; // creating solution martix of sise 3x3
for(int i=0;i<3;i++)// loop for index of a[][]
{
for(int j=0;j<3;j++)// loop for index of b[][]
{
m[i][j]=0;
for(int k=0;k<3;k++) // loop for index of m[][]
{
m[i][j] = m[i][j] + a[i][k]*b[k][j];
}
System.out.println(m[i][j]+" ");
}
}
}
}
********************************
