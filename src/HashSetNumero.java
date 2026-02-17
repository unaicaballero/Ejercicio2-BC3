import java.util.HashSet;
public class HashSetNumero {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(10);
        numeros.add(20);

        System.out.println("Contenido del hashSet: ");
        System.out.println(numeros);
    }
}