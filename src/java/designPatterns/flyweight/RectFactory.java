package flyweight;

import java.awt.*;
import java.util.HashMap;

public class RectFactory {

    private static final HashMap<Color, MyRect> rectsByColor = new HashMap<>();

    public static MyRect getRect(Color color) {
        MyRect myRect = rectsByColor.get(color);

        if(myRect == null) {
            myRect = new MyRect(color);
            rectsByColor.put(color, myRect);
        }
        return myRect;
    }
}
