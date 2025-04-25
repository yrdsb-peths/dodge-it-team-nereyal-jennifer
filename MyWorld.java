import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        Human human = new Human();
        addObject(human, 100, 100);
        
        Bee bee = new Bee();
        addObject(bee, 500, 300);
        
        BackgroundTest background = new BackgroundTest();
        addObject(background, 600, 600);
    }
}
