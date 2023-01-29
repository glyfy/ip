package tasks;

public abstract class Task {
    protected String description;
    protected boolean isDone;
    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {

        return (isDone ? "X" : " "); // mark done task with X
    }

    public void updateState() {

        this.isDone = !this.isDone;
    }

    /**
     * Returns description of task
     * @return task description
     */
    public String getDescription(){
        return this.description;
    }

    /**
     * Returns String representation of task to be output in terminal
     * @return String representation of task
     */
    @Override
    public String toString() {

        return (this.isDone ? "[X] " : "[ ] ") + this.description;
    }

    /**
     * Returns boolean which states whether task is marked
     * @return marked status of task
     */
    public Boolean isDone(){
        return this.isDone;
    }

    /**
     * Generates a String representation of task to be stored in harddrive
     * @return String representation of task
     */
    public abstract String toFileString();
}
