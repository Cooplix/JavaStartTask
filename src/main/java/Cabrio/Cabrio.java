package Cabrio;

public class Cabrio {
    private String carName;
    private String carBrend;
    private boolean isMove = false;
    private boolean isRoofOpen;

    public Cabrio(String carName, String carBrend, boolean isRoofOpen) {
        this.carName = carName;
        this.carBrend = carBrend;
        this.isRoofOpen = isRoofOpen;
    }

    public void setMove(boolean move) {
        isMove = move;
    }

    public void run() {
        if(!isMove) {
            System.out.printf("%s run...\n", carName);
            isMove = true;
        } else {
            System.out.printf("%s now running\n", carName);
        }
    }

    public void stop() {
        if(isMove) {
            System.out.printf("%s stopped\n", carName);
            this.isMove = false;
        } else {
            System.out.printf("Can't stop, %s is stopped\n", carName);
        }
    }

}
