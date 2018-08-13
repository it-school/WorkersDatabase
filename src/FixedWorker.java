public class FixedWorker extends Worker {
    int missedDays;

    FixedWorker(int ID, double pay, String name, int missedDays){
        super(ID, pay, name);
        this.missedDays = missedDays;
    }

    public int getMissedDays() {
        return missedDays;
    }

    public void setMissedDays(int missedDays) {
        this.missedDays = missedDays;
    }



    @Override
    public String toString() {
        return super.getID() + "  " + super.getPay() + " " + super.getName() + "  " + getMissedDays();
    }
}
