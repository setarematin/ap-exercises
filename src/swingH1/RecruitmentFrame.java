package swingH1;

/**
 * Created by sity on 31/01/2020.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Created by sity on 31/01/2020.
 */
public class RecruitmentFrame extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel nameLbl = new JLabel("name");
    JLabel familyLbl = new JLabel("family");
    JLabel phoneLbl = new JLabel("phone");
    JLabel jobLbl = new JLabel("job");
    JLabel ageLbl = new JLabel("age");
    JLabel resumeLbl = new JLabel("resume");

    JTextField nameTextField = new JTextField();
    JTextField familyTextField = new JTextField();
    JTextField phoneTextField = new JTextField();
    JTextField jobTextField = new JTextField();
    JTextField ageTextField = new JTextField();
    JTextArea resumeTextField = new JTextArea();
    JButton sendButton = new JButton("Send");


    RecruitmentFrame() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();

    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        nameLbl.setBounds(50, 150, 100, 30);
        familyLbl.setBounds(50, 200, 100, 30);
        phoneLbl.setBounds(50, 250, 100, 30);
        jobLbl.setBounds(50, 300, 100, 30);
        ageLbl.setBounds(50, 350, 100, 30);
        resumeLbl.setBounds(50, 400, 100, 30);

        nameTextField.setBounds(150, 150, 150, 30);
        familyTextField.setBounds(150, 200, 150, 30);
        phoneTextField.setBounds(150, 300, 150, 30);
        jobTextField.setBounds(150, 350, 150, 30);
        ageTextField.setBounds(150, 400, 150, 30);
        resumeTextField.setBounds(150, 450, 150, 150);
        sendButton.setBounds(50, 650, 100, 30);

    }

    public void addComponentsToContainer() {
        container.add(nameLbl);
        container.add(familyLbl);
        container.add(phoneLbl);
        container.add(jobLbl);
        container.add(ageLbl);
        container.add(resumeLbl);
        container.add(nameTextField);
        container.add(familyTextField);
        container.add(phoneTextField);
        container.add(jobTextField);
        container.add(ageTextField);
        container.add(resumeTextField);
        container.add(sendButton);

    }

    public void addActionEvent() {
        sendButton.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] a) {
        RecruitmentFrame frame = new RecruitmentFrame();
        frame.setTitle("Recruitment Form");
        frame.setVisible(true);
        frame.setBounds(10, 10, 370, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

    }
}