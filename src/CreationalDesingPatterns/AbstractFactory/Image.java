package CreationalDesingPatterns.AbstractFactory;

public class Image {
    public Image(){}
    public Image(String fname){}
}

interface BlurFilter{
    public Image apply(Image img);
}
interface EdgeDetectFilter{
    public Image apply(Image img);
}
interface SharpenFilter{
    public Image apply(Image img);
}