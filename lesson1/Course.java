package lesson1;

public class Course {

    String result;
    private int run;
    private int bike;
    private int swim;

    public Course(int run, int bike, int swim) {
        this.run = run;
        this.bike = bike;
        this.swim = swim;
    }

    public String doIt(Team team){
        result = "№ группы: "+ team.getName()+ " " + '\n';
        for(Party party: team.getPeoples()){
            result += "Имя участника: " + party.getName()+ " " + '\n';
            int value = party.getCanRun();
            int value2 = party.getCanBike();
            int value3 = party.getCanSwim();
            testRun(value);
            testBike(value2);
            testSwim(value3);
        }

        return result;
    }

    private void testRun(int value){
        if(value>=run) result += "Бег - пробежал "+ '\n';
    }

    private void testBike(int value2){
        if(value2>=bike) result += "Велосипед - проехал "+ '\n';
    }

    private void testSwim(int value3){
        if(value3>=swim) result += "Плавание - проплыл "+ '\n';
    }

}
