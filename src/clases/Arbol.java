package clases;

/**
 * Created by alfred on 4/1/17.
 */
public class Arbol<T extends Comparable<T>> {
    public Nodo<T> raiz;
    public Arbol() {

    }
    public void agregar(T valor){
        if (raiz == null){
            raiz = new Nodo<T>(valor);
        } else {
            raiz.insertar(valor);
        }
    }

    public void print(){
        raiz.imprimir();
    }

    public static void main(String[] args) {
        Arbol<Integer> arbol = new Arbol<Integer>();
        arbol.agregar(100);
        arbol.agregar(50);
        arbol.agregar(60);
        arbol.agregar(160);
        arbol.agregar(10);
        arbol.print();
    }

}
