
import java.awt.Color;

public class Editor4 {

    public static void main(String[] args) {
        // 1. Get the arguments
        String sourceFile = args[0];
        int n = Integer.parseInt(args[1]);

        // 2. Read the source image
        Color[][] sourceImage = Runigram.read(sourceFile);

        // 3. Create the target image (the grayscale version of the source)
        Color[][] targetImage = Runigram.grayScaled(sourceImage);

        // 4. Set the canvas to the size of the source image
        Runigram.setCanvas(sourceImage);

        // 5. Morph the source into the target
        Runigram.morph(sourceImage, targetImage, n);
    }
}