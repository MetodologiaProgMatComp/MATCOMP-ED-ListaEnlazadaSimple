package es.uah.matcomp.ed.lineales.lista.simple;

/**
 * Programar la lista simplemente enlazada.
 */
public class ListaSimple<S> {
    private ElementoLS[] data;
    private int maximo;
    public boolean isVacia() {
        if (data.length == 0) {
            return true;
        }
        return false;
    }
    public  void vaciar() {
        ElementoLS [] data;
    }

    protected int add (ElementoLS el) {
        data[data.length -1] = el;
        return data.length;
    }
    public void add (String s) {
        ElementoLS elementoLS = new ElementoLS();
        elementoLS.setData(s);
    }
    public void add (Object o) {
        ElementoLS elementoLS = new ElementoLS();
        elementoLS.setData(o);
        this.add(elementoLS);
    }
    public void insertElement (String s, int posicion){
        ElementoLS elementoLS = new ElementoLS();
        elementoLS.setData(new String());
        this.insertElement(elementoLS, posicion);
    }
    public void insertElement (Object o, int posicion) {
        ElementoLS elementoLS = new ElementoLS();
        elementoLS.setData(new Object());
        this.insertElement(elementoLS, posicion);
    }
    public void remove (int posicion) {
        data[posicion] = null;
    }
    public int getNumeroElementos(){
        int i = 0;
        int j = 0;
        while (i < data.length){
            if (data[i] != null){
                j ++;
            }
            i++;
        }
        return j;
    }
    public int getPosicion(ElementoLS el){
        int i=0;
        while (el!=data[i]) {
            i++;
        }
        return i;
    }
    public ElementoLS getPrimero(){
        ElementoLS j;
        j = data[0];
        return j;
    }
    public ElementoLS getUltimo(){
        int i = data.length;
        ElementoLS j;
        j = data[i];
        return j;
    }
    protected ElementoLS getSiguiente(ElementoLS el){
        int i = getPosicion(el);
        i++;
        ElementoLS j = data[i];
        return j;
    }
    public ElementoLS getElemento(int posicion) {
        ElementoLS j = data[posicion];
        return j;
    }
}
