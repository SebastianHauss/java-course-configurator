import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private List<Element> elements;

    public Course(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void addElement(Element element) {
        this.elements.add(element);
    }

    public void clear() {
        this.elements.clear();
    }

    public void print() {
        if (this.elements.isEmpty()) {
            System.out.println("Course: " + this.name);
            System.out.println("<empty>");
        } else {
            System.out.println("Course: " + this.name);
            int counter = 1;
            for (Element element : elements) {
                System.out.println(counter + ": " + element);
                counter++;
            }
        }
        System.out.println();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Element> getElements() {
        return this.elements;
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }
}
