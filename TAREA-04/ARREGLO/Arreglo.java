import java.util.Scanner;

public class Arreglo {
    int[] arreglo;
    int elemento;

    public void agregarArreglo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("cantidad de valores ingresar");
        int cantidad = scan.nextInt();
        this.arreglo = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("digite valor");
            arreglo[i] = scan.nextInt();
        }
    }

    public void mostrarArreglo() {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }

    }

    public void buscarElemento() {
        Scanner scan = new Scanner(System.in);
        System.out.print("que valor desea buscar: ");
        int indice = -1;
        int valor = scan.nextInt();
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valor) {
                indice = i;
                break;
            }
        }
        if (indice >= 0) {
            System.out.println("se encontro el valor");
        } else {
            System.out.println("no se encontro el valor");
        }


    }

    public void editarElemento() {
        Scanner scan = new Scanner(System.in);
        System.out.println("que valor desea editar");
        int indice = -1;
        int antiguo = scan.nextInt();
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == antiguo) {
                indice = i;
                break;
            }
        }
        if (indice >= 0) {
            System.out.println("por cual valor desea remplazar");
            int nuevo = scan.nextInt();
            this.arreglo[indice] = nuevo;
            System.out.println("se cambio correctamente");
        } else {
            System.out.println("no se encuentra el valor");
        }
    }

    public void eliminarElemento() {
        Scanner scan = new Scanner(System.in);
        System.out.print("que valor desea borrar: ");
        int indice = -1;
        int numero = scan.nextInt();
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numero) {
                indice = i;
                break;
            }
        }
        if (indice >= 0) {
            int[] copia = this.arreglo;
            this.arreglo = new int[copia.length -1];
            int x = 0;
            for (int i = 0; i < copia.length; i++) {
                if (i == indice){
                    continue;
                }
                this.arreglo[x]=copia[i];
                x++;

            }
            System.out.println("se elimino correctamente");
        } else {
            System.out.println("no se encuentra el valor");
        }

    }

    public static void main(String[] args) {
        Arreglo matriz = new Arreglo();
        matriz.agregarArreglo();
        matriz.mostrarArreglo();
        matriz.buscarElemento();
        matriz.editarElemento();
        matriz.mostrarArreglo();
        matriz.eliminarElemento();
        matriz.mostrarArreglo();
    }
}
