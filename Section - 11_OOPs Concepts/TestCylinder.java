
// Only Creation 
class Cylinder{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if(radius < 0){
            radius = 0;
        }
        else{
            this.radius = radius;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if(height < 0){
            height = 0;
        }
        else{
            this.height = height;
        }
    }
    
        
    //Constructors
    Cylinder(){
        radius = 0;
        height =0;
    }
    
    Cylinder(int r){
        radius = r;
    }
    
    Cylinder(int r, int h){
        radius = r;
        height = h;
    }
}