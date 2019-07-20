
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ejercicio1();
	    //ejercicio2();
		 ejercicio3() ; 
		 
	}

	public static void ejercicio1() {
		System.out.print("Ingresar arreglo: ");
		int arr=Entrada.entero();
		int[] array=new int[arr];
		for(int i=0;i<array.length;i++) {
			array[i]=Entrada.entero();
			}
		System.out.print("Arreglo ingresado es: ");
		for (int g=0;g<array.length;g++) {
		System.out.print( +array[g] +", " );
		}
		System.out.println();
		System.out.println("Ingresar numero: ");
		int ing=Entrada.entero();
		boolean p=false;
		int pos=0;
		
		for(int e=0;e<array.length;e++) {
			if(array[e]==ing) {
				pos=e;
				p=true;
			}
		}
		if(p==true) {
			System.out.println("El numero esta en la posicion: " +pos);
		}else {
			System.out.println("El numero no esta en la relacion: ");
		}
		
		
	}
	
	// ejercicio 2
	public static void ejercicio2() {
		System.out.print("ingrese un numero: ");
		int a=Entrada.entero();
		Imprimirtriangulo(a);
		Imprimirrectangulo(a,a-2);
		
		
		
	}
	
	public static void Imprimirtriangulo(int n) {
		for(int i=0;i<n;i++) {
			for(int e=0;e<n-i;e++) {
				System.out.print(" ");
			}
			Imprimirlinea(i+1); 
		}
	}
	
	public static void Imprimirlinea(int n) {
		for(int i=0;i<n;i++) {
			System.out.print("* ");
		}
		
		System.out.println();
	}
	
	public static void Imprimircola(int n) {
		for(int i=0;i<n;i++) {
			for(int e=0;e<n-i;e++) {
				System.out.print(" ");
			}
		}
	}
	
	public static void Imprimirrectangulo(int alto, int ancho) {
		for(int e=0;e<alto;e++) {
		for(int i=0;i<3;i++) {
			System.out.print(" ");
			
		    }
		Imprimirlinea(ancho);
		}
		
	}
	
	//Ejercicio 3
	public static void ejercicio3() {
	
	int [] a= {1,2,3,1,
			   4,5,6,1,
			   7,8,9,1,
			   1,1,1,1};
	int [] b= { 1,2,3,1,
			    4,5,6,1,
			    7,8,9,1,
			    1,1,1,1};
	int size = (int)Math.sqrt(a.length);
	for(int i=0;i<size;i++) {
		for(int e=0;e<size;e++) {
			System.out.print(a[i*size+e] +"\t");
		}
		System.out.println();
      }
	System.out.println();
	int size2 = (int)Math.sqrt(b.length);
	for(int i=0;i<size2;i++) {
		for(int e=0;e<size2;e++) {
			System.out.print(a[i*size2+e] +"\t");
		}
		System.out.println();
      }
	}
}
