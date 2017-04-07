package clases;

/**
 * Created by alfred on 4/1/17.
 */

public  class Nodo<T extends Comparable<T>> {
    public T valor;
    public Nodo<T> hijoDer;
    public Nodo<T> hijoIzq;
    public Nodo(T valor){
        this.valor = valor;
    }
    public void insertar(T valor) {
        if (valor.compareTo(this.valor) < 0){
            if(hijoIzq == null){
                hijoIzq = new Nodo<T>(valor);
            } else {
                hijoIzq.insertar(valor);
            }
        }
        else if (valor.compareTo(this.valor) > 0){
            if(hijoDer == null){
                hijoDer = new Nodo<T>(valor);
            } else {
                hijoDer.insertar(valor);
            }
        }
    }
    public void imprimir(){
        System.out.print("valor: " + valor + "; ");
        System.out.print("{izq: ");
        if(hijoIzq!=null)hijoIzq.imprimir();
        System.out.print(", der: ");
        if(hijoDer!=null)hijoDer.imprimir();
        System.out.print("}");
    }
}