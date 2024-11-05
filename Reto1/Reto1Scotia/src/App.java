public class App {
    public static void main(String[] args) throws Exception {
        ListaEnlazada lista = new ListaEnlazada();

        lista.agregar(10);
        lista.agregar(20);
        lista.agregar(30);
        lista.agregar(40);
        lista.imprimir();
        System.out.println(".................");

        lista.eliminar(40);
        lista.imprimir();
        System.out.println(".................");

        System.out.println(lista.buscar(20) ? " Encontrado" : " No encontrado");
        System.out.println(lista.buscar(40) ? " Encontrado" : " No encontrado");
        System.out.println(lista.buscar(50) ? " Encontrado" : " No encontrado");


        lista.imprimir();
        System.out.println("------------------");

        lista.agregar(10);

        System.out.println(lista.obtener(10));

        System.out.println("------------------");

        lista.imprimir();

    }


}
