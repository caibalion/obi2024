package fase2;
import java.util.Scanner;
public class danca {
	public static void main(String[] args) {
		int n,m,p;
		String o;
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		m=input.nextInt();
		p=input.nextInt();
		
		int danca [][] = new int[n][m];
		preencher(danca);
		mostrar(danca);
		
		while (p>0){
			p--;
		}
	}
	
	public static void preencher(int[][] m) {
		int i, j, cont = 1;
		
		for(i=0;i<m.length;i++) {
			for(j=0;j<m[i].length;j++) {
				m[i][j] = cont;
				cont++;
			}
		}
	}
	
	public static void mostrar(int[][] m) {
		int i,j;
		
		for(i=0;i<m.length;i++) {
			for(j=0;j<m[i].length;j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}
}
