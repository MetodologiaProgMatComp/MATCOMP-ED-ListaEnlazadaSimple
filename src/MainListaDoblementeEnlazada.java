import ListaDoblementeEnlazada.ElementoLDE;
import ListaDoblementeEnlazada.ListaDoblementeEnlazada;

public class MainListaDoblementeEnlazada {
    public static void main(String[]  args){
        ListaDoblementeEnlazada l = new ListaDoblementeEnlazada();

        l.add("Primer Elemento");
        l.add("Segundo Elemento");
        ElementoLDE elementoLDE = l.getElemento(1);
        System.out.println(elementoLDE.getData());
        System.out.println("Datos detallados");
        System.out.println(elementoLDE);
        l.add("Entre el primer y el segundo elemento");
        ElementoLDE elementoLDE1 = l.getElemento(2);
        System.out.println(elementoLDE1.getData());
        System.out.println("Datos detallados");
        System.out.println(elementoLDE1);
        Object o = new Object();
        l.add("Al final");

    }
}
