package ListaDoblementeEnlazada;

public class ListaDoblementeEnlazada {
    private ElementoLDE primero;
    private ElementoLDE ultimo;
    public boolean isVacia(){
        if (primero == null){
            return true;
        }
        return false;
    }
    public void vaciar(){
        primero = null;
    }
    protected int add (ElementoLDE el){
        if (primero == null){
            primero = el;
        }
        else{
            ultimo.insertarmeEn(el);
        }
        ultimo = el;
        ElementoLDE posicion = primero;
        int contador = 0;
        while (posicion.getSiguiente() != null){
            contador ++;
            posicion = posicion.getSiguiente();
        }
        return contador;
    }
    public void add (String s){
        ElementoLDE elementoLDE = new ElementoLDE();
        elementoLDE.setData(s);
        this.add(elementoLDE);
    }
    public void add (Object o){
        ElementoLDE elementoLDE = new ElementoLDE();
        elementoLDE.setData(o);
        this.add(elementoLDE);
    }
    public void insert (String s, int posicion){
        ElementoLDE elementoLDE = new ElementoLDE();
        elementoLDE.setData(s);
        int contador = 0;
        ElementoLDE actual = primero;
        while (contador < posicion){
            actual = actual.getSiguiente();
            contador ++;
        }
        actual.insertarmeEn(elementoLDE);
    }
    public void insert(Object o, int posicion){
        ElementoLDE elementoLDE = new ElementoLDE();
        elementoLDE.setData(o);
        int contador = 0;
        ElementoLDE actual = primero;
        while (contador < posicion){
            actual = actual.getSiguiente();
            contador ++;
        }
        actual.insertarmeEn(elementoLDE);
    }
    public int del (int posicion){
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
    public int getPosicion(ElementoLDE el){
        int i=0;
        while (el!=data[i]) {
            i++;
        }
        return i;
    }
    public ElementoLDE getPrimero(){
        ElementoLDE j;
        j = data[0];
        return j;
    }
    public ElementoLDE getUltimo(){
        int i = data.length;
        ElementoLDE j;
        j = data[i];
        return j;
    }
    public ElementoLDE getSiguiente(ElementoLDE el){
        int i = getPosicion(el);
        i++;
        ElementoLDE j = data[i];
        return j;
    }
    public ElementoLDE getAnterior(ElementoLDE el){
        int i = getPosicion(el);
        i--;
        ElementoLDE j = data[i];
        return j;
    }
    public ElementoLDE getElemento(int posicion){
        ElementoLDE j = data[posicion];
        return j;
    }
}
