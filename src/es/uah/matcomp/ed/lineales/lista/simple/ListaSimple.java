package es.uah.matcomp.ed.lineales.lista.simple;

/**
 * Programar la lista simplemente enlazada.
 */
public class ListaSimple {
    private ElementoLS [] data;
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
    protected void add (ElementoLS el) {
        data[data.length -1] = el;
    }
    public void add (String s, int i) {
        ElementoLS elementoLS = new ElementoLS();
        elementoLS.setData(new Object());
        this.add(elementoLS);
    }
    public void add (Object o) {
        ElementoLS elementoLS = new ElementoLS();
        elementoLS.setData(o);
        this.add(elementoLS);
    }
    public void setElement (String s, int posicion){
        ElementoLS elementoLS = new ElementoLS();
        elementoLS.setData(new String());
        this.setElement(elementoLS, posicion);
    }
    public void setElement (Object o, int posicion) {
        ElementoLS elementoLS = new ElementoLS();
        elementoLS.setData(new Object());
        this.setElement(elementoLS, posicion);
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
