package Prototype;

public class MarsRover {
    public static void main(String[] args) {
        ImageBuffer[] mars = new ImageBuffer[5];
        BufferMaker bufferMaker = new BufferMaker();

        int i = 0;

        try{
            mars[i++] = bufferMaker.makeImageBuffer('b');
            mars[i++] = bufferMaker.makeImageBuffer('c');
            mars[i++] = bufferMaker.makeImageBuffer('b');
            mars[i++] = bufferMaker.makeImageBuffer('c');
            mars[i++] = bufferMaker.makeImageBuffer('a');
        }catch(CloneNotSupportedException e){
            System.out.println("Exception!");
        }
    }
}
