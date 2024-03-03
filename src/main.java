/*
  Programa principal de prueba
 */
import es.uah.matcomp.ed.lineales.lista.simple.ElementoLS;
import es.uah.matcomp.ed.lineales.lista.simple.ListaSimple;

public class main {
    public static void main(String[]args){
        ListaSimple <String> l = new ListaSimple<String>();

        l.add("Primer elemento");
        l.add("Segundo elemento");
        ElementoLS elemento = l.getElemento(1);
        System.out.println(elemento.getData());
        System.out.println("Datos detallados");
        System.out.println(elemento);
        l.add("entre el primero y el segundo");

    }
}
