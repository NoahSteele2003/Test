import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[]args){

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        String question;
        int value;
        String response;
        response = "yes";
        value = (int)(Math.random()*100);

        System.out.println("What is your question?");
        question = keyboard.nextLine();
        int questions = 1;

        if (value>=0 && value<=10){ System.out.println("yes");}
        else if (value>10 && value<=20){System.out.println("No");}
        else if (value>20 && value<=30){System.out.println("The future looks promising");}
        else if (value>30 && value<=40){System.out.println("All signs point to no");}
        else if (value>40 && value<=50){System.out.println("It is guaranteed");}
        else if (value>50 && value<=60){System.out.println("It is impossible");}
        else if (value>60 && value<=70){System.out.println("Definitely yes");}
        else if (value>70 && value<=80){System.out.println("It will never happen");}
        else if (value>80 && value<=90){System.out.println("For sure!");}
        else if (value>90 && value<=100){System.out.println("Definitely not");}

        System.out.println("Would you like to ask another question?");
        response = keyboard.nextLine();

        while(response.equals("yes")){
            questions++;
            if(questions==2){
                System.out.println("What is your question?");
                question = keyboard.nextLine();
                value = (int)(Math.random()*100);}
            if(questions>2){
                System.out.println("What is your question?");
                question = keyboard.nextLine();
                question = keyboard.nextLine();
                value = (int)(Math.random()*100);
            }


            if (value>=0 && value<=10){ System.out.println("yes");}
        else if (value>10 && value<=20){System.out.println("No");}
        else if (value>20 && value<=30){System.out.println("The future looks promising");}
        else if (value>30 && value<=40){System.out.println("All signs point to no");}
        else if (value>40 && value<=50){System.out.println("It is guaranteed");}
        else if (value>50 && value<=60){System.out.println("It is impossible");}
        else if (value>60 && value<=70){System.out.println("Definitely yes");}
        else if (value>70 && value<=80){System.out.println("It will never happen");}
        else if (value>80 && value<=90){System.out.println("For sure!");}
        else if (value>90 && value<=100){System.out.println("Definitely not");}
        System.out.println("Would you like to ask another question?");
        response = keyboard.next();}

        if(response.equals("no")){
            System.out.println("ok");
        }














    }}












