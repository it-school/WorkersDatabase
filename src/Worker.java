public class Worker {
    private int ID;
    private double pay;
    private String name;

    Worker(){
        ID = 1;
        pay = 1000;
        name = "Noname";
    }

    Worker(int ID, double pay, String name){
        this.ID = ID;
        this.pay = pay;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "ID=" + ID +
                ", pay=" + pay +
                ", name='" + name + '\'' +
                '}';
    }
}
