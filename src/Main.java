import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList();
        Worker worker1 = new Worker();
        System.out.println(worker1.getID() + "  " +  worker1.getPay() + "  " +  worker1.getName());
        Worker worker2 = new Worker(2, 2000, "Vasia");
        System.out.println(worker2.getID() + "  " +  worker2.getPay() + "  " +  worker2.getName());
        workers.add(worker1);
        workers.add(worker2);

        FixedWorker fixedWorker = new FixedWorker(2, 2000, "Vasia", 3);
        workers.add(fixedWorker);
        System.out.println(fixedWorker.toString());

        HourlyWorker hourlyWorker = new HourlyWorker(4, 3000, "Fedor", 100);
        System.out.println(hourlyWorker.toString());
        workers.add(hourlyWorker);
        for (Worker w: workers) {
            System.out.println(w.toString());
        }



    }

}
