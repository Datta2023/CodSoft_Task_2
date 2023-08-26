import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentGradeCalculatorProject {
    private JTextField txtStudentName;
    private JTextField txtMarks1;
    private JTextField txtMarks2;
    private JTextField txtMarks3;
    private JTextField txtTotal;

    public static void main(String[] args) {
        JFrame frame = new JFrame("StudentGradeCalculatorProject");
        frame.setContentPane(new StudentGradeCalculatorProject().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JTextField txtAverage;
    private JButton calculateButton;
    private JPanel Main;
    private JTextField txtGrade;

    public StudentGradeCalculatorProject() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int marks1,marks2,marks3,Total;
                double Average;
                marks1=Integer.parseInt(txtMarks1.getText());
                marks2=Integer.parseInt(txtMarks2.getText());
                marks3=Integer.parseInt(txtMarks3.getText());
                Total=marks1+marks2+marks3;
                txtTotal.setText(String.valueOf(Total));
                Average=Total/3;
                txtAverage.setText(String.valueOf(Average));
                if(Average>50){
                    txtGrade.setText("Pass");
                }
                else{
                    txtGrade.setText("Fail");
                }

            }
        });
    }
}
