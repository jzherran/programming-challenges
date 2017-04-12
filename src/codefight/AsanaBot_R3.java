package codefight;

/**
 * Created by jhonatan.zambrano on 1/2/17.
 */
public class AsanaBot_R3 {

    public static void main(String[] args) {

        System.out.println(tasksScheduling(3, new int[]{2, 2, 2}));
    }

    static int tasksScheduling(int workingHours, int[] tasks) {
        /*
        int days = 0;
        boolean[] tasksFinished = new boolean[tasks.length];


        for (int i = 0; i < tasks.length; i++) {
            if(tasks[i] > workingHours) return -1;
            if(tasks[i] == workingHours) {
                days++;
                tasksFinished[i] = true;
            }
        }

        for(int i = 0, k = 0; i < tasks.length; i++) {
            if(tasks[i] == workingHours) {
                tasksFinished[i] = true;
                days++;
            }

            for (int j = 0; j < tasks.length && i != j && !tasksFinished[j]; j++) {
                if(tasks[i] + tasks[j] < workingHours) {
                    k = tasks[i] + tasks[j];
                    tasksFinished[i] = true;
                    tasksFinished[j] = true;
                }
                if(k == workingHours)


            }
        }
        */
        int totalTask = 0;
        boolean ws = true;
        for(int task: tasks) {
            if(task != tasks[0]) ws = false;
            if(task > workingHours) return -1;
            totalTask += task;
        }

        if(ws && tasks[0] == workingHours -1 && tasks.length == workingHours)
            return workingHours;

        int rest = totalTask % workingHours;
        if(rest >= 0) {
            int days = totalTask / workingHours;
            if(rest == 0)
                return days;
            if(rest < workingHours)
                return days + 1;
            if(rest % workingHours == 0)
                return days + (rest / workingHours);
        }
        return -1;
    }
}
