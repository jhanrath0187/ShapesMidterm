import java.io.File;
import java.io.IOException;

public class TestPic
{
    public static void main(String[] args)
    {
        // Get a reference to the canvas for this drawing and set its title.
        Canvas pic = Canvas.getCanvas();
        pic.setTitle("Shapes Constructor Test Picture");
        
        // Draw my picture
        //horizontal min/max: -310, 430
        //vertical min/max: -120, 420
        //default dimesions are 30x30 at (370,180)
        
        //colors: #d64b4b #bf3a55 #903f5c #7a3a64 #632b58
        
        //create objects and make them visible:
        
        //rectangles
        Rect r = new Rect();
        r.makeVisible();
        Rect r2=new Rect();
        r2.makeVisible();
        Rect r3=new Rect();
        r3.makeVisible();
        
        //rectangle movements
        r.moveVertical(-120);
        r.moveHorizontal(-310);
        r.changeSize(600,800);
        r.changeColor("#632b58");
        
        r2.moveVertical(280);
        r2.moveHorizontal(-310);
        r2.changeSize(200,800);
        r2.changeColor("#d64b4b");
        
        r3.changeColor("#903f5c");
        //circles
        Circle c=new Circle();
        c.makeVisible();
        
        //object movements
        c.changeColor("#7a3a64");
        
        //triangles
        Triangle t=new Triangle();
        t.makeVisible();
        t.changeColor("#bf3a55");
        
        //experimental for loop
        //for (int i=0;i<=5;i++){
        //    r3.moveUp();  
        //}

        // Save the picture to a file
        String filename = "testpic.png";
        try {
            pic.saveToFile(new File(filename));
            System.out.println("Picture saved to " + filename);
        } catch (IOException e) {
            System.err.println(e);
            System.err.println("Could not save file.");
        }
    }
}