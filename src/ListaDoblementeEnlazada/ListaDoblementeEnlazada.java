package ListaDoblementeEnlazada;

import es.uah.matcomp.ed.lineales.lista.simple.ElementoLS;

public class ListaDoblementeEnlazada {
    private ElementoLDE primero;
    private ElementoLDE ultimo;
    public boolean isVacia(){
        if (data.length == 0){
            return true;
        }
        return false;
    }
    public void vaciar(){
        ElementoLDE [] data;
    }
    protected int add (ElementoLDE el){
        data[data.length -1] = el;
        return data.length;
    }
    public void add (String s){
        ElementoLDE elementoLDE = new ElementoLDE();
        elementoLDE.setData(s);
    }
    public void add (Object o){
        ElementoLDE elementoLDE = new ElementoLDE();
        elementoLDE.setData(o);
        this.add(elementoLDE);
    }
    public void insert (String s, int posicion){
        ElementoLDE elementoLDE = new ElementoLDE();
        elementoLDE.setData(new String());
        this.insert(elementoLDE, posicion);
    }
    public void insert(Object o, int posicion){
        ElementoLDE elementoLDE = new ElementoLDE();
        elementoLDE.setData(new Object());
        this.insert(elementoLDE, posicion);
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
