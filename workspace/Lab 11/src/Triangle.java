
public class Triangle {
public static void main(String[]args){
	System.out.println(tri(5));
}
public static int tri(int n){
	if (n==0)
		return 1;
		else 
			return tri(n-1)+n;
	
}
}
