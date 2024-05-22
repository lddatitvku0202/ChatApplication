package testing;

import swing.blurHash.BlurHash;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author RAVEN
 */
public class Test {

    public static void main(String[] args) {
        try {
            BufferedImage image = ImageIO.read(new File("D:\\JavaNetBeans\\img\\pic.jpg"));
            String blurhashStr = BlurHash.encode(image);
            System.out.println(blurhashStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
