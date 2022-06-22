import java.awt.*;

public abstract class GameObject {
    protected float x, y;
    protected float velX, velY;
    protected ID id;

    public GameObject(float x, float y, ID id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public abstract void tick();
    public abstract void render(Graphics g);

    public float getX() {
        return x;
    }

    public GameObject setX(float x) {
        this.x = x;
        return this;
    }

    public float getY() {
        return y;
    }

    public GameObject setY(float y) {
        this.y = y;
        return this;
    }

    public float getVelX() {
        return velX;
    }

    public GameObject setVelX(float velX) {
        this.velX = velX;
        return this;
    }

    public float getVelY() {
        return velY;
    }

    public GameObject setVelY(float velY) {
        this.velY = velY;
        return this;
    }

    public ID getId() {
        return id;
    }

    public GameObject setId(ID id) {
        this.id = id;
        return this;
    }
}
