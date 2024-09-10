package patterns.creational.Prototype.Abstract;

public interface Document extends Cloneable {
    Document clone();
    void printContent();

}
