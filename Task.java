public abstract class Task implements Assignable {
    private String title;
    private Date dueDate;
    private Boolean status;
    private int priority;
    private Task[] tasks;

    public void setProject() {

    }

    public void getProject() {

    }

    public void setDueDate() {

    }

    public Date getDueDate() {

    }

    public void setStatus() {

    }

    public boolean getStatus() {

    }
    public void setPriority() {

    }

    public int getPriority() {

    }
    //task with the highest priority and if they match then check status
    public Task priorityTask() {
        Task maxTask = null;
        return maxTask;
    }

}