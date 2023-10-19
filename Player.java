import greenfoot.*; 

public class Player extends Actor {
    private int score = 0;
    
    public Player() {
        setImage("Player.png");
    }
    
    public void act() {
        move(3);
        checkForCollision();
    }
    
    private void checkForCollision() {
         Actor object = getOneIntersectingObject(Carrot.class);
         if (object != null) {
             increaseScore();
             getWorld().removeObject(object);
         }
    }
    
    public void increaseScore() {
        score += 10;
        getWorld().showText("Score: " + score, 50, 25);
    }
}