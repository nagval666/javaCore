package lesson1;

public class Main {

    public static void main(String[] args) {

        Party[] party = new Party[3];
        party[0] = new Party("Sergey", 9000, 15000, 1000);
        party[1] = new Party("Aleksandr", 12000, 15000, 1000);
        party[2] = new Party("Dmitriy", 9000, 15000, 900);
        Team team = new Team("RUS", party);

        Course course = new Course(10000,15000,1000);
        String result = course.doIt(team);
        System.out.println(result);
    }


}
