package es.uah.matcomp.ed.lineales.lista.simple;

/**
 * Programar la lista simplemente enlazada.
 */
public class ListaSimple {
    private ElementoLS [] data;
    private int maximo;
    public void isVacia() {
        Boolean data = null;
    }
    protected void add (ElementoLS el) {
        data[0] = el;
    }
    public void add (String s, int i) {
    }
    public void add (Object o) {
    }
    public void setElement (String s, int posicion){
    }
    public void setElement (Object o, int posicion) {
    }
    public void remove (int posicion) {
        data[0] = null;
    }
    public int getNumeroElementos (){
        return 0;
    }
    public int getPosicion(ElementoLS el){
        return 0;
    }
    public ElementoLS getPrimero(){
        return null;
    }
    public ElementoLS getUltimo(){
        return null;
    }
    protected ElementoLS getSiguiente(ElementoLS el){
        return null;
    }
    public ElementoLS getElemento(int posicion){
        return null;
    }
}
