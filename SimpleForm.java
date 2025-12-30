import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SimpleForm extends JFrame implements ActionListener {

    JTextField name, email, phone;
    JTextArea address, about;
    JCheckBox h1, h2, h3;
    JButton submit;

    SimpleForm() {

        // create components
        name = new JTextField(20);
        email = new JTextField(20);
        phone = new JTextField(20);

        address = new JTextArea(3, 20);
        about = new JTextArea(4, 20);

        h1 = new JCheckBox("Reading");
        h2 = new JCheckBox("Sports");
        h3 = new JCheckBox("Music");

        submit = new JButton("Submit");

        // layout (clean FlowLayout)
        setLayout(new FlowLayout(FlowLayout.LEFT, 15, 10));

        // add components
        add(new JLabel("Name:"));
        add(name);

        add(new JLabel("Email:"));
        add(email);

        add(new JLabel("Phone:"));
        add(phone);

        add(new JLabel("Address:"));
        add(new JScrollPane(address));

        add(new JLabel("Hobbies:"));
        JPanel hobbyPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        hobbyPanel.add(h1);
        hobbyPanel.add(h2);
        hobbyPanel.add(h3);
        add(hobbyPanel);

        add(new JLabel("About You:"));
        add(new JScrollPane(about));

        add(submit);

        submit.addActionListener(this);

        // frame settings
        setTitle("Simple Form");
        setSize(300, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String hobbies = "";
        if (h1.isSelected()) hobbies += "Reading ";
        if (h2.isSelected()) hobbies += "Sports ";
        if (h3.isSelected()) hobbies += "Music ";

        JOptionPane.showMessageDialog(this,
                "Name: " + name.getText() +
                "\nEmail: " + email.getText() +
                "\nPhone: " + phone.getText() +
                "\nAddress: " + address.getText() +
                "\nHobbies: " + hobbies +
                "\nAbout: " + about.getText());
    }

    public static void main(String[] args) {
        new SimpleForm();
    }
}
