import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
// napisac metode to string ktora da komunikat czy kolekcja jest pusta, jezeli nie
    // to napisze ile ma elementow i jakie to elementy

    public String toString () {
        // string do zapisywania pozycji z listy
        String listContent = "";
        // przelatuje przez liste dodajac kazda pozycje do stringa
        for(String element : elements){
            listContent += element + "\n";
        }
        //nastepnie w zaleznosci od wielkosci listy wyswietlam komunikat
        // oraz wstawiam zawartosc listContent
        if (this.elements.size() == 1) {
            return "The collection " + this.name + " has " + this.elements.size() + " element:" + "\n" + listContent;
        }
        if (this.elements.size() > 1) {
            return "The collection " + this.name + " has " + this.elements.size() + " elements:" + "\n" + listContent;
        }
        if (this.elements.size() == 0) {
            return "The collection " + this.name + " is empty.";
        }
        return null;
        
    }
}