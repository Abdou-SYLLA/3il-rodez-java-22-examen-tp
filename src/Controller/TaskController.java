import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaskController{
    private View vue;
    private TaskModel model;


    public TaskController(View vue, TaskModel model) {
        this.vue = vue;
        this.model = model;
    }

    class AjouterButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nom = vue.getNom().getText();
            String desc = vue.getDescription().getText();
            String dateEch = vue.getDateEcheance().getText();
            model.ajouter(new Task(nom,desc,dateEch));
        }
    }
}