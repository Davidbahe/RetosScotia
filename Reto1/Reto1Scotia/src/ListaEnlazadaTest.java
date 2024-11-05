import static org.junit.jupiter.api.Assertions.*;

class ListaEnlazadaTest {

    @org.junit.jupiter.api.Test
    void agregarUnSoloValor() {
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregar(1);
        assertEquals(1, lista.cabeza.getValor());
        assertNull(lista.cabeza.getSiguiente());
    }

    @org.junit.jupiter.api.Test
    void agregarVariosValores() {
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        assertEquals(1, lista.cabeza.getValor());
        assertEquals(2, lista.cabeza.getSiguiente().getValor());
        assertNotNull(lista.cabeza.getSiguiente().getSiguiente());
    }

    @org.junit.jupiter.api.Test
    void eliminarTodo(){
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);
        lista.eliminar(1);
        lista.eliminar(2);
        lista.eliminar(3);
        assertNull(lista.cabeza);
    }

    @org.junit.jupiter.api.Test
    void eliminarUno(){
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);

        lista.eliminar(2);

        assertEquals(1, lista.cabeza.getValor());
        assertEquals(3, lista.cabeza.getSiguiente().getValor());
    }

    @org.junit.jupiter.api.Test
    void buscar() {
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);

        assertTrue(lista.buscar(1));
        assertTrue(lista.buscar(2));
        assertTrue(lista.buscar(3));
        assertFalse(lista.buscar(4));
    }

    @org.junit.jupiter.api.Test
    void obtener() {
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregar(2);
        lista.agregar(4);
        lista.agregar(1);

        lista.agregar(2);

        String mensajeEsperado = "0 3 ";

        assertEquals(mensajeEsperado, lista.obtener(2));
        assertEquals("",lista.obtener(3));
    }
}