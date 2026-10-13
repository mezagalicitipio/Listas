
public class ListaEnlazada {
    // Nodo de la lista
    class Nodo {
        int dato;
        Nodo siguiente;

        Nodo(int dato) {
            this.dato = dato;
            siguiente = null;
        }
    }
    Nodo cabeza = null;
    // Agregar un numero
    public void agregar(int numero) {
        Nodo nuevo = new Nodo(numero);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;

            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }
    // Mostrar la lista
    public void mostrar() {
        Nodo actual = cabeza;

        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
}
