public class WallArea {
    private double width;
    private double height;

    public WallArea () {

    }

    public WallArea (double width, double height){
        if (width < 0){
            width = 0;
        }

        if (height < 0){
            height = 0;
        }

        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0){
            width = 0;
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0){
            height = 0;
        }
        this.height = height;
    }

    public double getArea(){
        return getWidth() * getHeight();
    }

    public static void main(String[] args) {
        WallArea wall1 = new WallArea(5, 4);
        System.out.println("area = " + wall1.getArea());
        wall1.setHeight(-1.5);
        System.out.println("Width = " + wall1.getWidth());
        System.out.println("height = " + wall1.getHeight());
        System.out.println("area = " + wall1.getArea());
    }
}