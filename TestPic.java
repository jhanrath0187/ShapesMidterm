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
        
        //colors: white #d64b4b #bf3a55 #903f5c #7a3a64 #632b58
        
        //creating objects and making them visible:
        
        //rectangles
        Rect r = new Rect();
        r.changeColor("#632b58");
        r.makeVisible();
        
        Rect r2=new Rect();
        r2.changeColor("#d64b4b");
        r2.makeVisible();
        
        //rectangle movements
        r.moveVertical(-120);
        r.moveHorizontal(-310);
        r.changeSize(600,800);

        r2.moveVertical(280);
        r2.moveHorizontal(-310);
        r2.changeSize(200,800);
        
        //circles
        Circle c=new Circle();
        c.changeColor("#7a3a64");
        c.makeVisible();
        
        Circle c2=new Circle();
        c2.changeColor("#632b58");
        c2.changeSize(50);
        c2.makeVisible();
        
        //circle movements
        c.moveHorizontal(100);
        
        c2.moveHorizontal(120);
        c2.moveVertical(10);
        
        //Arc
        Arc a=new Arc(-34,566,68,0,90,"black",true);
        
        //triAmount is the amount of triangles created.
        int triAmount=7;
        //for loop creates and positions all triangles
        Triangle tri[]= new Triangle[triAmount];
        for (int i=0; i<=triAmount; i++){ 
            tri[i]=new Triangle();
            tri[i].changeColor("white");
            tri[i].makeVisible();
            if(i<=2){//changes the pyramid color
                tri[i].changeColor("#bf3a55");
            }
            //index 0 through 2 are three pyramids
            if (i==0){
                tri[i].moveVertical(200);
                tri[i].moveHorizontal(-100);
                tri[i].changeSize(80,90);
            }
            else if(i==1){
                tri[i].moveVertical(200);
                tri[i].moveHorizontal(100);
                tri[i].changeSize(140,150);
            }
            else if(i==2){
                tri[i].moveVertical(200);
                tri[i].moveHorizontal(400);
                tri[i].changeSize(190,200);
            }
            else{
                //making 2 stars. They go in pairs of triangles.
                if (i%2==0){
                    //default size and movement
                    tri[i].changeSize(-60,70);
                    for(int moveAmnt=0; moveAmnt<=3;moveAmnt++){
                        tri[i].moveDown();
                    }
                }
                if (i==3||i==4){
                    tri[i].moveHorizontal(300);
                    tri[i].moveVertical(-100);
                    if (i==3){
                    tri[i].changeSize(30,40);
                    }
                    else{
                        tri[i].changeSize(-30,40);
                        for(int moveAmnt=0; moveAmnt<=1;moveAmnt++){
                            tri[i].moveUp();
                        }
                    }
                }
            }
        }
        
        

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