package singleton;

import java.util.Arrays;
import java.util.LinkedList;

public class Singleton {

    private static Singleton firstInstance = null;

    String[] scrabbleLetters = {
            "A", "A", "A", "A", "A", "A", "A", "A", "A",  // 9 As
            "B", "B",                                     // 2 Bs
            "C", "C",                                     // 2 Cs
            "D", "D", "D", "D",                           // 4 Ds
            "E", "E", "E", "E", "E", "E", "E", "E", "E", "E", "E", "E", // 12 Es
            "F", "F",                                     // 2 Fs
            "G", "G", "G",                                // 3 Gs
            "H", "H",                                     // 2 Hs
            "I", "I", "I", "I", "I", "I", "I", "I", "I",  // 9 Is
            "J",                                          // 1 J
            "K",                                          // 1 K
            "L", "L", "L", "L",                           // 4 Ls
            "M", "M",                                     // 2 Ms
            "N", "N", "N", "N", "N", "N",                 // 6 Ns
            "O", "O", "O", "O", "O", "O", "O", "O",       // 8 Os
            "P", "P",                                     // 2 Ps
            "Q",                                          // 1 Q
            "R", "R", "R", "R", "R", "R",                 // 6 Rs
            "S", "S", "S", "S",                           // 4 Ss
            "T", "T", "T", "T", "T", "T",                 // 6 Ts
            "U", "U", "U", "U",                           // 4 Us
            "V", "V",                                     // 2 Vs
            "W", "W",                                     // 2 Ws
            "X",                                          // 1 X
            "Y", "Y",                                     // 2 Ys
            "Z",                                          // 1 Z
            " ", " "                                      // 2 blanks (represented as spaces)
    };

    private LinkedList<String> letters = new LinkedList<>(Arrays.asList(scrabbleLetters));

    static boolean firstThread = true;

    private Singleton() { }

    public static Singleton getInstance() {

        if(firstInstance==null) {
            if(firstThread) {
                firstThread = false;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            synchronized (Singleton.class) {
                if(firstInstance==null) {
                    firstInstance = new Singleton();
                }
            }
        }
        return firstInstance;
    }

    public LinkedList<String> getLetters() { return firstInstance.letters; }

    public LinkedList<String> getTiles(int numOfTiles) {
        var tilesRequested = new LinkedList<String>();
        for(int i=0;i<numOfTiles;i++) {
            tilesRequested.add(firstInstance.letters.remove(0));
        }

        return tilesRequested;
    }
}
