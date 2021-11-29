import java.util.Random;

public class QuizGame {


    static double usersAnswer, correctAnswer;
    static String displayProblem = "";
    static JPanel panel;
    static JButton newProblem, checkAnswer;
    static JTextField answerInput;
    static JLabel showProblem;
    static JRadioButton addition, subtraction, multiplication, division;
    static JTextField


    public static void main(String[] args) {

        new QuizGame();
        // createProblem();
        // getUserAnswer();
        //checkAnswer();

    }

    public QuizGame() {

        JFrame frame = new JFrame("Quiz Game");
        frame.setSize(300, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();
        addition = new JRadiobutton("Addition");
        subtraction = new JRadiobutton("Subtraction");
        multiplication = new JRadiobutton("Multiplication");
        division = new JRadiobutton("Division");
        ButtonGroup radios = new ButtonGroup();
        showProblem = new JButton("Give me a problem");
        showProblem = new JLabel("PLACEHOLDER TEXT");
        checkAnswerButton = new JButton("Am I right?");
        showResults = new JLabel("Placeholder Text");
        answerInput = new JTextField(10);

        addition.setBounds(100, 10, 200, 30);
        subtraction.setBounds(100, 40, 200, 30);
        multiplication.setBounds(100, 70, 200, 30);
        division.setBounds(100, 100, 200, 30);
        newProblemButton.setBounds(75, 130, 150, 25);
        showProblem.setBounds(75, 130, 150, 25);
        answerInput.setBounds(75, 190, 150, 25);
        checkAnswer.setBounds(75, 190, 150, 25);
        showResults.setBounds(75, 220, 150, 25);

        radios.add(addition);
        radios.add(subtraction);
        radios.add(multiplication);
        radios.add(division);

       newProblemButton.addActionListener

        panel.add(addition);
        panel.add(subtraction);
        panel.add(multiplication);
        panel.add(division);
        panel.add(newProblemButton);
        panel.add(showProblem);
        panel.add(answerInput);
        panel.add(showbutton);
        panel.add(checkAnswerButton);
        panel.add(showResults);

        frame.add(panel);
        panel.setLayout;
        frame.setVisible(true);

    }

    private class ProblemChoiceListener implements ActionListener {

        public void actionPerformed(Actionevent actionevent) {
            if(addition.isselected()){
                addProblem();
        }
            if(subProblem.isselected()){
                subProblem();
            }
       }         if(multProblem.isselected()){
            multProblem();

       }   if(divProblem.isselected()){
            divProblem();

  public static void showResults(){
        JOptionPane.showMessageDialog(null, displayProblem);
    }
    public static void checkAnswer(){
        if(useranswer = correctAnswer){
            showResults.set("You are correct");
        }else{
            showResults.setText("Incorrect. Try harder.");
        }
        showResults();
    }

    public static void getUserAnswer(){

        userAnswer = Double.parseDouble(answerInput.getText));
    }

    public static void createProblem(){
        int choice = Integer.parseInt(JOptionPane.showInputDialog("Choose: \nAddition(1)\nSubtraction(2)\nMultiplication(3)\nDivision(3)")

        if(choice <= 4){
          if(choice >= 1) {
          }
              if(choice == 1) {
                  addProblem();
              }
              if(choice == 2) {
                  SubtractProblem();
                  }
                  if(choice == 3) {
                      multiProblem();
                  }
                  if(choice == 4){
                      dividProblem();
              }

          }

    }else{
              JOptionPane.showMessageDialog(null, "Invalid input, run program again.");
              System.exit(0);
          }

    public static void addProblem(){

        int number1 = randomNum();
        int number2 = randomNum();

        correctAnswer = number1 + number2;
       displayProblem = number1 + "+" + number2;

     }
    public static void subProblem(){

        int number1 = randomNum();
        int number2 = randomNum();

        correctAnswer = number1 - number2;
        displayProblem = number1 + "-" + number2;

    }
    public static void multProblem(){

        int number1 = randomNum();
        int number2 = randomNum();

        correctAnswer = number1 * number2;
        displayProblem = number1 + "x" + number2;



    }public static void divideProblem(){


            int number1 = randomNum();
            int number2 = randomNum();

            correctAnswer = (double)number1 / number2;
            correctAnswer = (double)(Math.round(correctAnswer * 100)/100.0;

            System.out.println(correctAnswer);
            displayProblem = number1 + "/" + number2;

        }
    //Helper Method
    public static int randomNum(){
        Random random = new Random();
        return random.nextInt(210) + 1;
    }

    public static int input(String message){

        return Double.parseDouble(JOptionPane.showInputDialog(message));
    }

}
