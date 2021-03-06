package bases;

public class Vector2D {
    public float x;
    public float y;

    public Vector2D() {
        this(0,0);

    }
    public Vector2D(float x, float y){
        this.x = x;
        this.y = y;
    }
    public void addUp(float dx, float dy){
        this.x += dx;
        this.y += dy;
    }

    public void set(float x, float y){
        this.x = x;
        this.y = y;
    }

    public void set(Vector2D other){
        set(other.x, other.y);
    }
    public void addUp(Vector2D other){
        addUp(other.x, other.y);

    }
    public void subtractBy(float dx, float dy){
        this.x -= dx;
        this.y -= dy;

    }
    public void subtractBy(Vector2D other){
        subtractBy(other.x, other.y);
    }
    public Vector2D add(float dx, float dy){
        //Vector2D newVector = new Vector2D();
        //newVector.x = this.x + dx;
        return new Vector2D(this.x + dx, this.y + dy);
    }
    public void add(Vector2D other) {
        add(other.x + this.x, other.y + this.y);
    }

    public Vector2D subtract(float dx, float dy){

        return new Vector2D(this.x - dx, this.y - dy);
    }
    public void subtract( Vector2D other){
        subtract(this.x - other.x, this.y - other.y);
    }

    public Vector2D multiply(float f){
        return new Vector2D(this.x * f, this.y * f);

    }

    public float magnitude(){
        return(float)Math.sqrt(this.x * this.x + this.y * this.y);
    }
    public Vector2D normalize(){
        float mag = magnitude();
        return new Vector2D(this.x / mag, this.y / mag);
    }
}

