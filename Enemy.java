import greenfoot.*;

public class Enemy extends Actor {
    public Enemy() {
        setImage("Enemy.png");
    }
    
    public void act() {
        move(-2);
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}