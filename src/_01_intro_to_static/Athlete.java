package _01_intro_to_static;

public class Athlete {
	static int nextBibNumber = 1;
    static String raceLocation = "California";
    static String raceStartTime = "6.00am";

    String name;
    int speed;
    int bibNumber;

    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
        this.bibNumber = nextBibNumber;
        nextBibNumber++;
    }
    
    

    public static void main(String[] args) {
        //create two athletes
        //print their names, bibNumbers, and the location of their race. 
    Athlete Bob = new Athlete("Bob",10);
    Athlete John = new Athlete("John", 15);
    System.out.println(Bob.bibNumber);
    System.out.println(John.bibNumber);
    }

}
