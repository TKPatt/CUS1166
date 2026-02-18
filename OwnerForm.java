import javax.swing.*;

public class OwnerForm {
    private JPanel panel1;
    private JTextField OwnerIDTextField;
    private JTextField VehicleMakeTextField;
    private JTextField VehicleModelTextField;
    private JTextField ResidencyTimeTextField;
    private JButton backButton;
    private JButton clearButton;
    private JButton submitButton;
    private JTextField VehicleYearTextField;

    public OwnerForm() {
        backButton.addActionListener(e -> {
            JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(panel1);
            frame.setTitle("VCRTS - Select Role");
            frame.setContentPane(new SelectRole().getPanel());
            frame.pack();
            frame.setLocationRelativeTo(null);
        });
        clearButton.addActionListener(e -> {
            OwnerIDTextField.setText("");
            VehicleMakeTextField.setText("");
            VehicleModelTextField.setText("");
            ResidencyTimeTextField.setText("");
            VehicleYearTextField.setText("");
        });
        submitButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(panel1,"Submit button is working");
            //TODO: add logging function
        });
    }


    public JPanel getPanel() {
        return panel1;
    }
}