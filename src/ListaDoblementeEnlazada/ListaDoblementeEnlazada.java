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
        ElementoLDE actual = primero;
        int contador = 0;
        while (contador < posicion){
            actual = actual.getSiguiente();
            contador ++;
        }
        if (actual != null){
            actual.getAnterior() = this.getAnterior();
            this.getAnterior() = actual;
            actual.getSiguiente() = this;
        }
    }
    public int getNumeroElementos(){
        ElementoLDE posicion = primero;
        int contador = 0 ;
        if (primero != null){
            while (posicion.getSiguiente() != ultimo){
                contador ++;
            }
        }
        return contador;
    }
    public int getPosicion(ElementoLDE el){
        ElementoLDE posicion = primero;
        int contador = 0;
        while (posicion.getSiguiente() != el){
            contador ++;
            el = el.getSiguiente();
        }
        return contador;
    }
    public ElementoLDE getPrimero(){
        return this.primero;

    }
    public ElementoLDE getUltimo(){
        return this.ultimo;

    }
    public ElementoLDE getSiguiente(ElementoLDE el){
        return el.getSiguiente();
    }
    public ElementoLDE getAnterior(ElementoLDE el){
        return el.getAnterior();
    }
    public ElementoLDE getElemento(int posicion){
        ElementoLDE actual = primero;
        int contador = 0;
        while (contador < posicion){
            actual = actual.getSiguiente();
            contador ++;
        }
        return actual;
    }
}
