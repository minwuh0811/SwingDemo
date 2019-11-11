import javax.swing.*;
import java.awt.*;

public class SimpleApp extends JFrame {
    //JFrame jFrame; // bakgrundsfönstret. Hela UI byggs inom ett Jframe
    //JComponent jComponent; // baskontrollen; ärvda kalsser är tex JButton, JPanel, JLable
    //JPanel jPanel;
    //JButton jButton;
    //JLabel jLabel;

    private JLabel label;
    private JPanel panel;
    private JButton button;
    public SimpleApp(){
        //super("En enkel applikation"); eller
        super();
        this.setTitle("En enkel applikation");
        Container contentPane=getContentPane();
        panel=new JPanel();
        label=new JLabel("Starttext");
        button=new JButton("Ändra text");
        panel.add(label);
        panel.add(button);
        contentPane.add(panel);
        setSize(400,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame simpleApp =new SimpleApp();

    }




}
