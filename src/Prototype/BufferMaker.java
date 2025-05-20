package Prototype;

// Class with a factory method
public class BufferMaker {
    private ImageBW imgBw; private ImageRGB imgrgb;

    // Create instances of these objects only once
    public BufferMaker(){
        imgBw = new ImageBW();
        imgrgb = new ImageRGB();
    }

    // Create multiple instances by cloning of objects
    public ImageBuffer makeImageBuffer(char imgtyp) throws CloneNotSupportedException{
        switch(imgtyp){
            case 'b' : return imgBw.clone();
            case 'c' : return imgrgb.clone();
            default : return null;
        }
    }
}
