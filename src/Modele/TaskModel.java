import java.utils.List;

public class TaskModel implements AjoutTask, SupprimerTask{
    private  List<Task> tasks;

    public TaskModel(List<Task> tasks) {
        this.tasks = tasks;
    }

    public TaskModel() {
        tasks = new ArrayList<>();
    }

    public List<Task> getTasks() {
        return tasks;
    }


    public ajouter(Task task){
        task.add(task);
    }

    public void supprimer(Task task){
        task.remove(task);
    }

}