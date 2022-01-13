package Homework1;


public class Human implements Move {
    private String name;
    private int distance;
    private int height;


    public Human(String name, int distance, int height) {
        this.name = name;
        this.distance = distance;
        this.height = height;

    }
//    public static void runAndJump(Object[] participants, Object[] let) {
//        for (int i = 0; i < participants.length; i++) {
//            for (int j = 0; j < let.length; j++) {
//                if ((participants[i] instanceof Human) && (let[j] instanceof Treadmill)) {
//                    if (((Human) participants[i]).distance >= ((Treadmill) let[j]).distance) {
//                        System.out.println("The man " + ((Human) participants[i]).name + " run the distance");
//                    }
//                    else {System.out.println(" The " + ((Human) participants[i]).name + " could not run");
//                        break;}
//                } else if ((participants[i] instanceof Human) && (let[j] instanceof Wall)) {
//                    if (((Human) participants[i]).height >= ((Wall) let[j]).height)
//                    {System.out.println("The man " + ((Human) participants[i]).name + " jump on the let");
//                    }
//                else {System.out.println(" The " + ((Human) participants[i]).name + " could not jump");
//                    break;
//                }}
//            }
//        }

    @Override
    public boolean run(Treadmill treadmill) {
        if (distance >= treadmill.getDistance()) {
            System.out.println("Human " + name + " run " + treadmill.getDistance());
            return true;
        } else {
            System.out.println("Human " + name + " could not run "+ treadmill.getDistance());
            return false;
        }

    }


    @Override
    public boolean jump(Wall wall) {
        if (height <= wall.getHeight()) {
            System.out.println("Human " + name + " jump "+wall.getHeight());
            return true;}
        else {
            System.out.println("Human " + name + "could not jump "+wall.getHeight());
            return false;
        }

    }
}
























