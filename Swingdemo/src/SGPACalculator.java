import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SGPACalculator extends JFrame implements ActionListener {

    JLabel titleLabel, subjectLabel, creditLabel, gradePointLabel, resultLabel;
    JTextField[] subjectFields, creditFields, gradePointFields;
    JButton calculateButton;

    public SGPACalculator() {
        setTitle("SGPA Calculator");
        setSize(400, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        titleLabel = new JLabel("SGPA Calculator");
        titleLabel.setBounds(140, 10, 150, 20);
        panel.add(titleLabel);

        subjectLabel = new JLabel("Subject");
        creditLabel = new JLabel("Credit");
        gradePointLabel = new JLabel("Grade Point");

        subjectLabel.setBounds(50, 50, 80, 20);
        creditLabel.setBounds(150, 50, 80, 20);
        gradePointLabel.setBounds(270, 50, 100, 20);

        panel.add(subjectLabel);
        panel.add(creditLabel);
        panel.add(gradePointLabel);

        subjectFields = new JTextField[8];
        creditFields = new JTextField[8];
        gradePointFields = new JTextField[8];

        int startY = 80;
        for (int i = 0; i < 8; i++) {
            subjectFields[i] = new JTextField();
            creditFields[i] = new JTextField();
            gradePointFields[i] = new JTextField();

            subjectFields[i].setBounds(30, startY, 100, 20);
            creditFields[i].setBounds(140, startY, 100, 20);
            gradePointFields[i].setBounds(260, startY, 80, 20);

            panel.add(subjectFields[i]);
            panel.add(creditFields[i]);
            panel.add(gradePointFields[i]);

            startY += 30;
        }

        calculateButton = new JButton("Calculate SGPA");
        calculateButton.setBounds(120, 350, 150, 30);
        calculateButton.addActionListener(this);
        panel.add(calculateButton);

        resultLabel = new JLabel();
        resultLabel.setBounds(130, 310, 200, 20);
        panel.add(resultLabel);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double totalCredits = 0;
        double totalGradePoints = 0;

        for (int i = 0; i < 8; i++) {
            if (!subjectFields[i].getText().isEmpty() && !creditFields[i].getText().isEmpty() && !gradePointFields[i].getText().isEmpty()) {
                double credit = Double.parseDouble(creditFields[i].getText());
                double gradePoint = Double.parseDouble(gradePointFields[i].getText());

                totalCredits += credit;
                totalGradePoints += (credit * gradePoint);
            }
        }

        if (totalCredits > 0) {
            double sgpa = totalGradePoints / totalCredits;
            resultLabel.setText("Your SGPA: " + String.format("%.2f", sgpa));
        } else {
            resultLabel.setText("Please enter valid data for subjects.");
        }
    }

    public static void main(String[] args) {
        new SGPACalculator();
    }
}

