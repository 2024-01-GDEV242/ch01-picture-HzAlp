/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Alper Hiz
 * @version 2024.01.29
 * 
 * //as it shows it is just a regular picture which has tree , road , a car
 * // person and also door.
 * 
 */
public class Picture
{
    private Square road;
    private Square roadLine;
    private Square road2;
    private Square sky;
    
    private Square treeBase;
    private Square treeTrunk;
    private Triangle tree;
    private Triangle treeLayer;
    
    private Square wall;
    private Square window;
    private Triangle roof;
    private Square door1;
    private Square door2;
    
    
    private Square carBody1;
    private Square carBody2;
    private Circle tire1;
    private Circle tire2;
    private Square carWin1;
    private Square carWin2;
    
    private Circle sun;
    
    private Person person;
    private Square shoe1;
    private Square shoe2;

    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        road= new Square ();
        road2= new Square ();
        roadLine= new Square ();
        
        sky = new Square ();
        
        treeBase =new Square();
        tree = new Triangle();
        treeLayer = new Triangle();
        
        carBody1= new Square ();
        carBody2= new Square ();
        carWin1= new Square ();
        carWin2= new Square ();
        
        tire1= new Circle();
        tire2= new Circle();
        
        
        
        wall = new Square();
        door1 = new Square();
        door2 = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        
        person= new Person();
        shoe1 = new Square();
        shoe2 = new Square();


        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            sky.changeSize(500);
            sky.moveHorizontal(-310);
            sky.moveVertical(-120);
            sky.changeColor("lightBlue");
            sky.makeVisible();   
    
            carBody1.changeSize(50);
            carBody1.moveHorizontal(20);
            carBody1.moveVertical(60);
            carBody1.changeColor("lightRed");
            carBody1.makeVisible();
            
            carBody2.changeSize(50);
            carBody2.moveHorizontal(45);
            carBody2.moveVertical(60);
            carBody2.changeColor("lightRed");
            carBody2.makeVisible();
            
            
            carWin1.changeSize(20);
            carWin1.moveHorizontal(30);
            carWin1.moveVertical(70);
            carWin1.changeColor("gray");
            carWin1.makeVisible();
            
            carWin2.changeSize(20);
            carWin2.moveHorizontal(65);
            carWin2.moveVertical(70);
            carWin2.changeColor("gray");
            carWin2.makeVisible();
            
            tire1.changeSize(20);
            tire1.moveHorizontal(100);
            tire1.moveVertical(120);
            tire1.changeColor("darkGray");
            tire1.makeVisible();
            
            tire2.changeSize(20);
            tire2.moveHorizontal(150);
            tire2.moveVertical(120);
            tire2.changeColor("darkGray");
            tire2.makeVisible();
        
            treeBase.moveHorizontal(-250);
            treeBase.moveVertical(60);
            treeBase.changeColor("brown");
            treeBase.makeVisible();

            tree.moveHorizontal(-120);
            tree.moveVertical(-100);
            tree.changeSize(160,140);
            tree.changeColor("green");
            tree.makeVisible();
            
            treeLayer.moveHorizontal(-120);
            treeLayer.moveVertical(-100);
            treeLayer.changeSize(100,130);
            treeLayer.changeColor("green");
            treeLayer.makeVisible();
            
            
            
    
            wall.moveHorizontal(-140);
            wall.moveVertical(-10);
            wall.changeSize(120);
            wall.changeColor("lightBrown");
            wall.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(10);
            window.changeSize(40);
            window.makeVisible();
            
            door1.changeColor("gray");
            door1.moveHorizontal(-70);
            door1.moveVertical(50);
            door1.changeSize(35);
            door1.makeVisible();
            
            door2.changeColor("gray");
            door2.moveHorizontal(-70);
            door2.moveVertical(76);
            door2.changeSize(35);
            door2.makeVisible();
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-90);
            roof.makeVisible();
            roof.changeColor("brown");

            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(145);
            sun.moveRight();
            sun.moveRight();
            sun.moveRight();
            sun.moveRight();
            sun.moveRight();
            sun.moveUp();
            sun.moveUp();
            sun.moveUp();
            sun.moveUp();
            sun.moveUp();
            sun.makeVisible();
            
            
            person.makeVisible();

            
            shoe1.makeVisible();
            shoe1.changeSize(8);
            shoe1.changeColor("yellow");
            shoe1.moveVertical(107);
            shoe1.moveHorizontal(-42);


            shoe2.makeVisible();
            shoe2.changeSize(8);
            shoe2.moveVertical(107);
            shoe2.moveHorizontal(-22);

            shoe2.changeColor("yellow");
            
            road.changeSize(502);
            road.moveHorizontal(-310);
            road.moveVertical(110);
            road.changeColor("black");
            road.makeVisible();
            
            roadLine.changeSize(502);
            roadLine.moveHorizontal(-310);
            roadLine.moveVertical(140);
            roadLine.changeColor("white");
            roadLine.makeVisible();
           
            road2.changeSize(502);
            road2.moveHorizontal(-310);
            road2.moveVertical(145);
            road2.changeColor("black");
            road2.makeVisible();


            
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        sky.changeColor("white");
        carBody1.changeColor("black");
        carBody2.changeColor("black");
        carWin1.changeColor("black");
        carWin2.changeColor("black");
        tire1.changeColor("black");
        tire2.changeColor("black");
        treeBase.changeColor("black");
        tree.changeColor("black");
        treeLayer.changeColor("black");
        wall.changeColor("black");
        window.changeColor("white");
        door1.changeColor("white");
        door2.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
        person.makeVisible();
        shoe1.changeColor("white");
        shoe2.changeColor("white"); 
        road.changeColor("black");
        roadLine.changeColor("white");
        road2.changeColor("black");
       
        
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        
        
        
        
        
        
        
        
        sky.changeColor("lightBlue");
        carBody1.changeColor("lightRed");
        carBody2.changeColor("lightRed");
        carWin1.changeColor("gray");
        carWin2.changeColor("gray");
        tire1.changeColor("darkGray");
        tire2.changeColor("darkGray");
        treeBase.changeColor("brown");
        tree.changeColor("green");
        treeLayer.changeColor("green");
        wall.changeColor("lightBrown");
        window.changeColor("black");
        door1.changeColor("gray");
        door2.changeColor("gray");
        roof.changeColor("brown");
        sun.changeColor("yellow");
        person.makeVisible();
        shoe1.changeColor("yellow");
        shoe2.changeColor("yellow"); 
        road.changeColor("black");
        roadLine.changeColor("white");
        road2.changeColor("black");
        
        
        
    }
}
