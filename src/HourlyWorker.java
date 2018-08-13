public class HourlyWorker extends Worker {
    private int hours;

    HourlyWorker(int ID, double pay, String name, int hours){
        super(ID, pay, name);
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return super.getID() + "  " + super.getPay() + "  " + super.getName() + "  " + getHours();
    }
}
