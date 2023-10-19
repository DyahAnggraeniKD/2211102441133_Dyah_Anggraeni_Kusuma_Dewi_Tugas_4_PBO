import greenfoot.*;

public class Carrot extends Actor {

    public Carrot() {
        setImage("Carrot.png");
    }
    
    public void act() {
        move(1);
        CheckForCollision();
    }
    
    public void CheckForCollision() {
        Actor Player = getOneIntersectingObject(Player.class);
        if (Player != null) {
            ((Player) Player).increaseScore();
            getWorld().removeObject(this);
        }
    }
}



