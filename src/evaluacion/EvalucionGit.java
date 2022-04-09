package evaluacion;

public class EvalucionGit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hola mundo");
		
		int a=5, b=7;
		int factorial=1;
		
		System.out.println("La suma de "+a+" y "+b+" es "+(a+b));
		System.out.println();
		
		System.out.println("El pequeño cocodrilo\npara aprender sus cantares");
		System.out.println("usa las aguas del Nilo\ncon sus notas musicales");
		
		for(int i=b; i>0; i--)
		{
			factorial=factorial*i;
		}
		
		System.out.println("\nEl factorial de "+b+" es "+factorial);
	}

}
