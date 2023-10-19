import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class MyWorld extends World {
    private int currentLevel = 1;
    
    public MyWorld() {
        super(800, 600, 1);
        prepare();
    }
    
    public void prepare() {
        // Tambahkan inisialisasi objek dan karakter utama untuk level pertama di sini
        addObject(new Player(), getWidth() / 2, getHeight() - 30);
        addObject(new Carrot(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
    }
}



