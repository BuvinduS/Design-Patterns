package Prototype;

public class ImageRGB extends ImageBuffer{
    @Override
    public ImageBuffer clone() throws CloneNotSupportedException {
        log("Cloning an image buffer for color");
        return (ImageBuffer) super.clone();
    }
}
