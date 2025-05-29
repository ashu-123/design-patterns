package memento;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestMemento extends JFrame{

    private JButton saveButton, undoButton, redoButton;
    private JTextArea article = new JTextArea(60, 40);
    Caretaker caretaker = new Caretaker();
    Originator originator = new Originator();

    int saveFiles = 0, currentArticle = 0;
    public static void main(String[] args) {
        new TestMemento();
    }

    public TestMemento() {
        this.setSize(750, 780);
        this.setTitle("Memento design pattern");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel();
        jPanel.add(new JLabel("Article"));
        jPanel.add(article);

        saveButton = new JButton("Save");
        saveButton.addActionListener(new ButtonListener());

        redoButton = new JButton("Redo");
        redoButton.addActionListener(new ButtonListener());

        undoButton = new JButton("Undo");
        undoButton.addActionListener(new ButtonListener());

        jPanel.add(saveButton);
        jPanel.add(redoButton);
        jPanel.add(undoButton);

        this.add(jPanel);
        this.setVisible(true);
    }
    class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==saveButton) {
                String textInTextArea = article.getText();
                originator.set(textInTextArea);
                caretaker.addMemento(originator.storeInMemento());
                saveFiles++;
                currentArticle++;

                System.out.println("Save files count = " + saveFiles);
                undoButton.setVisible(true);
            }
            else {
                if (e.getSource()==undoButton) {
                    if(currentArticle>=1) {
                        currentArticle--;
                        String articleToDisplay = originator.restoreFromMemento(caretaker.getMemento(currentArticle));
                        article.setText(articleToDisplay);
                        redoButton.setVisible(true);
                    }
                    else {
                        undoButton.setVisible(false);
                    }
                }
                else if(e.getSource() == redoButton) {
                    if((saveFiles-1)> currentArticle) {
                        currentArticle++;
                        String articleToDisplay = originator.restoreFromMemento(caretaker.getMemento(currentArticle));
                        article.setText(articleToDisplay);
                        undoButton.setVisible(true);
                    }
                    else {
                        redoButton.setVisible(false);
                    }
                }
            }
        }
    }

}
