
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
    
    public String toString(){
        String finalElements = "";
        if (this.elements.isEmpty()){
            return ("The collection " + this.name + " is empty.");
        }  else {
            for (String element : this.elements){
                finalElements += "\n" + element;
            }
        }
        
        if (this.elements.size() > 1){
            return "The collection " + this.name + " has " + this.elements.size() + 
                   " elements:" + finalElements;
        } else {
            return ("The collection " + this.name + " has 1 element:" + finalElements);
        }
    }
}
