import java.sql.Date;
import java.util.List;

public class Project {
    private Date startDate;
    private Date endDate;
    private String name;
    private String description;
    private List<Task> tasks;

    public void removeTask(Task task) {
        task.remove();
    }

    public void addTask(String title, String desc, Boolean status, int prio) {
        
    }
}