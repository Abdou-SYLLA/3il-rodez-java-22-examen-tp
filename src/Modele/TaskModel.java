import java.util.ArrayList;
import java.util.List;

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


    @Override
    public void ajouter(Task task) {
        tasks.add(task);
    }

    @Override
    public void supprimer(Task task){
        tasks.remove(task);
    }
}