package memento;

public class Originator {

    private String article;

    public void set(String newArticle) {
        System.out.println("From Originator : Current version of the article : " + newArticle);
        this.article = newArticle;
    }

    public Memento storeInMemento() {
        System.out.println("From Originator : Saving to memento");
        return new Memento(article);
    }

    public String restoreFromMemento(Memento memento) {
        article = memento.getArticle();
        System.out.println("From Originator : Previous version of the article : " + article);
        return article;
    }
}
