public class Camera {
    private int x, y;
    private Handler handler;
    private GameObject tempPlayer;

    public Camera(int x, int y, Handler handler){
        this.x = x;
        this.y = y;
        this.handler = handler;
    }

    public void findPlayer(){
        for (int i = 0; i < handler.object.size(); i++) {
            if (handler.object.get(i).getId() == ID.Player){
                tempPlayer = handler.object.get(i);
                break;
            }
        }
    }

    public void tick(){
        if (tempPlayer != null){
            x = (int) ((int) tempPlayer.x - Game.WIDTH/2.2);
            y = (int) ((int) tempPlayer.y - Game.HEIGHT/2.3);
        } else findPlayer();

    }

    public int getX() {
        return x;
    }

    public Camera setX(int x) {
        this.x = x;
        return this;
    }

    public int getY() {
        return y;
    }

    public Camera setY(int y) {
        this.y = y;
        return this;
    }
}
