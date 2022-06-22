import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{
    public boolean keys[] = new boolean[4];
    //keys 0 = true right
    //keys 1 = true left
    //keys 2 = true up
    //keys 3 = true down




    public void keyPressed(KeyEvent e){
        int key  = e.getKeyCode();
        if (key == KeyEvent.VK_D) {keys[0] = true;}
        if (key == KeyEvent.VK_A) {keys[1] = true;}
        if (key == KeyEvent.VK_W) {keys[3] = true;}
        if (key == KeyEvent.VK_S) {keys[2] = true;}
    }

    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_D) {keys[0] = false;}
        if (key == KeyEvent.VK_A) {keys[1] = false;}
        if (key == KeyEvent.VK_W) {keys[3] = false;}
        if (key == KeyEvent.VK_S) {keys[2] = false;}
    }

}
