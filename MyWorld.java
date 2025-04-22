import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        Human human = new Human();
        addObject(human, 100, 100);
    }
}
