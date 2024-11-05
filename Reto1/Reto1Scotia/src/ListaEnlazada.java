public class ListaEnlazada {
    Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    public void agregar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (this.cabeza == null) {
            this.cabeza = nuevoNodo;
        } else {
            Nodo actual = this.cabeza;

            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }

    public void eliminar(int valor) {
        Nodo actual = this.cabeza;
        Nodo previo = null;

        while (actual != null) {
            if (actual.getValor() == valor) {
                if (previo == null) {
                    this.cabeza = actual.getSiguiente();
                    break;
                } else {
                    previo.setSiguiente(actual.getSiguiente());
                    break;
                }
            }
            previo = actual;
            actual = actual.getSiguiente();
        }
    }

    public boolean buscar(int valor) {
        Nodo actual = this.cabeza;
        while (actual != null) {
            if (actual.getValor() == valor) {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    public String obtener(int valor) {
        Nodo actual = this.cabeza;
        String posiciones = "";
        int indice = 0;

        while (actual != null) {

            if (actual.getValor() == valor) {
                posiciones += indice + " ";
            }
            actual = actual.getSiguiente();
            indice++;

        }
        return posiciones;
    }

   public void imprimir() {
        if (this.cabeza == null) {
            System.out.println("Lista vacia");
        } else {
            Nodo actual = this.cabeza;
            String mensaje = "";
            while (actual != null) {
                mensaje += actual.getValor() + "  ";
                actual = actual.getSiguiente();
            }

            System.out.println(mensaje);
        }
    }
}
