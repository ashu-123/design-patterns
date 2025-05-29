package memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    private List<Memento> savedArticles = new ArrayList<>();

    public void addMemento(Memento memento) { this.savedArticles.add(memento); }

    public Memento getMemento(int index) { return this.savedArticles.get(index); }
}
