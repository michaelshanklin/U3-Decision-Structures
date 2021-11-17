public class Prom {

    /* In order to purchase a ticket to go to prom,
    you must be a Junior or Senior, have no disciplinary
    records and have $40 to pay for it.
     */


    public static void main(String[] args) {

        int gradeLevel = Integer.parseInt(JOptionPane.showInputDialog("What grade level are you in?"));
        int disciplinary = Integer.parseInt(JOptionPane.showInputDialog("How many suspensions have you had?"));
        int money = Integer.parseInt(JOptionPane.showInputDialog("How much money do you have? Round down to the nearest $5"));

        if(grade level >= 11){

            if(disciplinary >= 1){
                System.out.printn("You can't go to prom. Be a good student.");
            }else {

                if(money is >= 40){
                    System.out.println("You can get a prom ticket");
                }else{
                    System.out.println("You can't go to prom");
                }

            }

        }else{

            System.out.println("You can't go to prom.");

        }

    }
}
