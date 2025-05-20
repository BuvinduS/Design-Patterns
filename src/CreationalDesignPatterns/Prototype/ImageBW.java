package CreationalDesignPatterns.Prototype;

public class ImageBW extends ImageBuffer{
    @Override
    public ImageBuffer clone() throws CloneNotSupportedException {
        log("Cloning an image buffer for black and white");
        return (ImageBuffer) super.clone();
    }
}
