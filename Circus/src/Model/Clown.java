package Model;

import java.awt.image.BufferedImage;

public class Clown extends ImageObject {

    // Private static instance of the class
    private static Clown instance;

    // Private constructor to prevent instantiation from outside the class
    private Clown(int posX, int posY, String path) {
        super(posX, posY, path, true);
    }

    // Public method to get the singleton instance
    public static Clown getInstance(int posX, int posY, String path) {
        if (instance == null) {
            instance = new Clown(posX, posY, path);
        }
        return instance;
    }
}
