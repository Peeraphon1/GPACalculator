import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GPACalculator extends JFrame implements ActionListener {
    private JFrame frame;
    private JPanel mainPanel, tablePanel, buttonPanel, resultPanel;
    private JTextField courseField, creditField;
    private JLabel courseLabel, gradeLabel, creditLabel, resultLabel, gpaLabel;
    private JButton addButton, calculateButton, editButton, deleteButton;
    private JComboBox<String> gradeComboBox;
    private JTable courseTable;
    private DefaultTableModel tableModel;
    private ArrayList<String> courses = new ArrayList<>();
    private ArrayList<Integer> grades = new ArrayList<>();
    private ArrayList<Integer> credits = new ArrayList<>();
    private int selectedRow = -1;

    public GPACalculator() {
        frame = new JFrame("GPA Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        tablePanel = new JPanel();
        tablePanel.setLayout(new BorderLayout());

        String[] columnNames = {"Course", "Grade", "Credit"};
        tableModel = new DefaultTableModel(columnNames, 0);
        courseTable = new JTable(tableModel);
        courseTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        courseTable.getSelectionModel().addListSelectionListener(e -> {
            selectedRow = courseTable.getSelectedRow();
            if (selectedRow != -1) {
                courseField.setText(courses.get(selectedRow));
                gradeComboBox.setSelectedIndex(grades.get(selectedRow));
                creditField.setText(String.valueOf(credits.get(selectedRow)));
            }
        });
        JScrollPane scrollPane = new JScrollPane(courseTable);
        tablePanel.add(scrollPane);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        courseLabel = new JLabel("Course:");
        buttonPanel.add(courseLabel);

        courseField = new JTextField(10);
        buttonPanel.add(courseField);

        gradeLabel = new JLabel("Grade:");
        buttonPanel.add(gradeLabel);

        String[] grades = {"A", "B+", "B", "C+", "C", "D+", "D", "F"};
        gradeComboBox = new JComboBox<>(grades);
        buttonPanel.add(gradeComboBox);

        creditLabel = new JLabel("Credit:");
        buttonPanel.add(creditLabel);

        creditField = new JTextField(3);
        buttonPanel.add(creditField);

        addButton = new JButton("Add");
        addButton.addActionListener(this);
        buttonPanel.add(addButton);

        editButton = new JButton("Edit");
        editButton.addActionListener(this);
        buttonPanel.add(editButton);

        deleteButton = new JButton("Delete");
        deleteButton.addActionListener(this);
        buttonPanel.add(deleteButton);

        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);
        buttonPanel.add(calculateButton);

        resultPanel = new JPanel();
        resultPanel.setLayout(new FlowLayout());

        resultLabel = new JLabel("Result:  GPA is  ");
        resultPanel.add(resultLabel);

        gpaLabel = new JLabel();
        resultPanel.add(gpaLabel);

        mainPanel.add(tablePanel);
        mainPanel.add(buttonPanel);
        mainPanel.add(resultPanel);

        frame.add(mainPanel);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String course = courseField.getText();
            int grade = gradeComboBox.getSelectedIndex();
            String creditText = creditField.getText();

            if (creditText.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please enter a credit value.");
                return;
            }

            int credit = Integer.parseInt(creditText);

            courses.add(course);
            grades.add(grade);
            credits.add(credit);

            tableModel.addRow(new Object[]{course, gradeComboBox.getSelectedItem(), credit});

            courseField.setText("");
            gradeComboBox.setSelectedIndex(0);
            creditField.setText("");
        } else if (e.getSource() == editButton) {
            if (selectedRow != -1) {
                String course = courseField.getText();
                int grade = gradeComboBox.getSelectedIndex();
                String creditText = creditField.getText();

                if (creditText.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please enter a credit value.");
                    return;
                }

                int credit = Integer.parseInt(creditText);

                courses.set(selectedRow, course);
                grades.set(selectedRow, grade);
                credits.set(selectedRow, credit);

                tableModel.setValueAt(course, selectedRow, 0);
                tableModel.setValueAt(gradeComboBox.getSelectedItem(), selectedRow, 1);
                tableModel.setValueAt(credit, selectedRow, 2);

                courseField.setText("");
                gradeComboBox.setSelectedIndex(0);
                creditField.setText("");
            }
        } else if (e.getSource() == deleteButton) {
            if (selectedRow != -1) {
                courses.remove(selectedRow);
                grades.remove(selectedRow);
                credits.remove(selectedRow);

                tableModel.removeRow(selectedRow);

                courseField.setText("");
                gradeComboBox.setSelectedIndex(0);
                creditField.setText("");
            }
        } else if (e.getSource() == calculateButton) {
            double totalGradePoints = 0;
            double totalCredits = 0;

            for (int i = 0; i < grades.size(); i++) {
                int grade = grades.get(i);
                int credit = credits.get(i);

                double gradePoint;

                switch (grade) {
                    case 0:
                        gradePoint = 4.0;
                        break;
                    case 1:
                        gradePoint = 3.5;
                        break;
                    case 2:
                        gradePoint = 3.0;
                        break;
                    case 3:
                        gradePoint = 2.5;
                        break;
                    case 4:
                        gradePoint = 2.0;
                        break;
                    case 5:
                        gradePoint = 1.5;
                        break;
                    case 6:
                        gradePoint = 1.0;
                        break;
                    default:
                        gradePoint = 0.0;
                        break;
                }

                totalGradePoints += gradePoint * credit;
                totalCredits += credit;
            }

            double gpa = totalGradePoints / totalCredits;

            gpaLabel.setText(String.format("%.2f", gpa));
        }
    }



    public static void main(String[] args) {
        new GPACalculator();
    }
}