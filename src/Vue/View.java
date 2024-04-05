
import javax.swing.*;

import java.awt.*;


class View extends JFrame  {
    TaskModel modele;

    private JTextArea nom = new JTextArea("Nom");
    private JTextArea description = new JTextArea("description");
    private JTextArea dateEcheance = new JTextArea("dateEcheance");

    private JButton ajouter = new JButton("Ajouter");
    private JButton supprimer = new JButton("Supprimer");


    View(TaskModel modele) {
        this.modele = modele;
        JPanel lesBoutons = new JPanel();
        JPanel textPannel = new JPanel();


        lesBoutons.add(ajouter);
        lesBoutons.add(supprimer);
        textPannel.add(nom);
        textPannel.add(description);
        textPannel.add(dateEcheance);

        add(lesBoutons, BorderLayout.NORTH);
        add(textPannel, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(200,200);
        pack();
        setVisible(true);
    }

    public JButton getAjouter() {
        return ajouter;
    }

    public JButton getSupprimer() {
        return supprimer;
    }

    public TaskModel getModele() {
        return modele;
    }

    public JTextArea getNom() {
        return nom;
    }

    public JTextArea getDescription() {
        return description;
    }

    public JTextArea getDateEcheance() {
        return dateEcheance;
    }

    public static void main(String[] args) {
        TaskModel model = new TaskModel();
        View view = new View(model);
        TaskController controller = new TaskController( view,model);


        JFrame frame = new JFrame("Gestionnaire de tache");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setFocusable(true);
        frame.requestFocusInWindow();
    }
}