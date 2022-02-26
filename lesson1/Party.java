package lesson1;

public class Party {

    private String name;
    private int canRun;
    private int canSwim;
    private int canBike;

    public Party(String name, int canRun, int canBike, int canSwim){
        this.name = name;
        this.canRun = canRun;
        this.canBike = canBike;
        this.canSwim = canSwim;
    }

    public String getName() {
        return name;
    }
    public int getCanRun() {return canRun;}
    public int getCanSwim() {return canSwim;}
    public int getCanBike() {return canBike;}

}
