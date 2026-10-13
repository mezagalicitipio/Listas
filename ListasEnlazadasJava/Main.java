public class Main {

    public static void main(String[] args) {

        ListaEnlazada lista = new ListaEnlazada();

        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);
        lista.agregar(40);

        System.out.println("Mi lista enlazada:");

        lista.mostrar();
    }
}
