package Pilas;
import java.util.Stack;
public class BuscadorPila {
    private int capacidad, cima;
    Stack<String> pila = new Stack<>();
    String info = "";

    public BuscadorPila(int capacidad) {
        this.capacidad = capacidad;
        this.cima = -1;
    }

    public void agregar(String info) {
        if (lleno()) {
            System.out.println("El Historial se encuentra lleno");
            return;
        }
        cima++;
        pila.push(info);
        System.out.println("La busqueda '" + info + "' ha sido almacenada");
    }

    public String quitar() {
        if (vacio()) {
            System.out.println("El Historial se encuentra vacio");
            return null;
        }
        info = pila.pop();
        cima--;
        System.out.println("La busqueda '" + info + "' ha sido eliminada");
        return info;
    }

    public String limite() {
        if (vacio()) {
            System.out.println("El Historial se encuentra vacio");
            return null;
        }
        System.out.println(pila.peek());
        return pila.peek();
    }

    public void mostrarPila() {
        if (vacio()) {
            System.out.println("El Historial se encuentra vacio");
            return;
        }
        System.out.println(pila);
    }

    public boolean vacio() {
        return cima == -1;
    }

    public boolean lleno() {
        return cima == capacidad - 1;
    }
}
