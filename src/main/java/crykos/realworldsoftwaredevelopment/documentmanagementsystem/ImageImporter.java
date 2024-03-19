package crykos.realworldsoftwaredevelopment.documentmanagementsystem;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ImageImporter implements Importer {
    @Override
    public Document importFile(File file) throws IOException {
        final Map<String, String> attribute = new HashMap<>();
        final BufferedImage bufferedImage = ImageIO.read(file);
        attribute.put(AttributeConstants.PATH, file.getPath());
        attribute.put(AttributeConstants.WIDTH, String.valueOf(bufferedImage.getWidth()));
        attribute.put(AttributeConstants.HEIGHT, String.valueOf(bufferedImage.getHeight()));
        attribute.put(AttributeConstants.TYPE, "IMAGE");

        return new Document(attribute);
    }
}
