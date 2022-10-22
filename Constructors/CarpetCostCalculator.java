class Floor{
    double width;
    double length;
    Floor(double width, double length){
        if (width < 0)
            this.width = 0;
        else
            this.width = width;

        if (length < 0)
            this.length = 0;
        else
            this.length = length;
    }

    public double getArea(){
        return width * length;
    }
}

class Carpet{
    double cost;
    public Carpet (double cost) {
        if (cost < 0)
            this.cost = 0;
        else
            this.cost = cost;
    }

    public double getCost () {
        return cost;
    }
}

class Calculator {
    Floor floor1;
    Carpet carpet1;

    Calculator (Floor floor1, Carpet carpet1){
        this.floor1 = floor1;
        this.carpet1 = carpet1;
    }

    public double getTotalCost(){
        return floor1.getArea() * carpet1.getCost();
    }
}

public class CarpetCostCalculator {
    public static void main(String[] args) {
        Carpet carpet1 = new Carpet(3.5);
        Floor floor1 = new Floor(2.75, 4.0);
        Calculator calculator1 = new Calculator(floor1, carpet1);
        System.out.println("total = " + calculator1.getTotalCost());
        carpet1 = new Carpet(1.5);
        floor1 = new Floor(5.4, 4.5);
        calculator1 = new Calculator(floor1, carpet1);
        System.out.println("total = " + calculator1.getTotalCost());
    }
}
