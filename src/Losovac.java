import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class Losovac {
    /**
     * Vnitřní kolekce čísel
     */
    private ArrayList<Integer> cisla;
    /**
     * Generátor náhodných čísel
     */
    private Random random;

    /**
     * Vytvoří nový losovač
     */
    public Losovac() {
        random = new Random();
        cisla = new ArrayList<Integer>();
    }

    /**
     * Vylosuje nové náhodné číslo a to uloží do kolekce
     *
     * @return Nové náhodné číslo
     */
    public int losuj() {
        Integer cislo = random.nextInt(100) + 1;
        cisla.add(cislo);
        return cislo;
    }

    /**
     * Vrátí textový řetězec, obsahující výpis seřazených tažených čísel
     *
     * @return Textový řetězec seřazených tažených čísel
     */
    public String vypis() {
        String vypis = "";

        Collections.sort(cisla);
        for (int cislo : cisla)
            vypis += cislo + " ";
        return vypis;
    }
}
