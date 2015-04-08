import java.awt.Color;

/**
 * Class BallDemo - a short demonstration showing animation with the 
 * Canvas class. 
 *
 * @author Jordan Bailey
 * @version 2015.March
 *
 * @author Jordan Bailey
 * @version 2015.March
 */

public class BallDemo   
{
    private Canvas myCanvas;

    /**
     * Create a BallDemo object. Creates a fresh canvas and makes it visible.
     */
    public BallDemo()
    {
        myCanvas = new Canvas("Ball Demo", 600, 500);
    }
  
    /**
     * Simulate the bouncing balls
     */
    public void bounce()
    {
        // crate and show the balls
        BoxBall ball = new BoxBall(50, 50, 16, Color.BLUE, ground, myCanvas);
        ball.draw();
        BoxBall ball2 = new BoxBall(70, 80, 20, Color.RED, ground, myCanvas);
        ball2.draw();
        BoxBall ball3 = new BoxBall(70, 80, 20, Color.RED, ground, myCanvas);
        ball2.draw();
        BoxBall ball4 = new BoxBall(70, 80, 20, Color.RED, ground, myCanvas);
        ball2.draw();
        BoxBall ball5 = new BoxBall(70, 80, 20, Color.RED, ground, myCanvas);
        ball2.draw();
        BoxBall ball6 = new BoxBall(70, 80, 20, Color.RED, ground, myCanvas);
        ball2.draw();        
        BoxBall ball7 = new BoxBall(70, 80, 20, Color.RED, ground, myCanvas);
        ball2.draw();
        BoxBall ball8 = new BoxBall(70, 80, 20, Color.RED, ground, myCanvas);
        ball2.draw();
        BoxBall ball9 = new BoxBall(70, 80, 20, Color.RED, ground, myCanvas);
        ball2.draw();
        BoxBall ball10 = new BoxBall(70, 80, 20, Color.RED, ground, myCanvas);
        ball2.draw();
    }
}
