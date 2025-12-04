package Projects;

import java.util.Scanner;
public class KBC_Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("welcome to KBC_Quiz");
        System.out.println("Press Enter to continue...");
        sc.nextLine();


        System.out.println("read instructions carefully!!!!");
        System.out.println("1. total no. of Ques = 3");
        System.out.println("2. for each Ques there will be 4 options");
        System.out.println("3. three life lines will be given");
        System.out.println("4. one wrong answer and your game will be quit !!! ");
        System.out.println("5. kindly enter valid inputs---");
        System.out.println("give answer in alphabet- A,B,C,D");

        System.out.println("Press Enter to continue...");
        sc.nextLine();


        int count=0;

        // sample question Start here //

        System.out.println("Q1.Which Data Type is used to store Integer Value ");
        System.out.println("A. Integer");
        System.out.println("B. Boolean");
        System.out.println("C. Character");
        System.out.println("D. Double");
        System.out.println("lifeline to Use :");
        System.out.println("lifeline 1 : 50-50");
        System.out.println("lifeline 2 : flip the question");
        System.out.println("lifeline 3 : need hint");
        System.out.println("Enter - 1: (for lifeline 1) 2: (for lifeline 2)  3:(for lifeline 3) ");


        char lifeline = sc.next().charAt(0);
        if (lifeline == '1' && count<2) {
            System.out.println("A.integer");
            System.out.println("B.Double");
           if(count<2) {
               System.out.println("lifeline left-");
               System.out.println("lifeline 2 : flip the question");
               System.out.println("lifeline 3 : need hint");
               System.out.println("Enter - 2: for (lifeline2) 3: for(lifeline3)");
               count++;
           }

            char lifeline_a = sc.next().charAt(0);
            if (lifeline_a == '2' && count<2 ) {
                System.out.println("Q1.How many access specifiers are in java");
                System.out.println("A. 3");
                System.out.println("B. 1");
                System.out.println("C. 4");
                System.out.println("D. 2");
                count++;


                char opt = sc.next().charAt(0);

                if (opt == 'A') {
                    System.out.println("correct answer");
                } else {
                    System.out.println("wrong answer");
                    System.out.println("Oops!! Game Quiet");
                    return;

                }


            } else if (lifeline_a == '3' && count<2) {
                System.out.println("1+1+1=?");
                count++;

                char opt1 = sc.next().charAt(0);
                if (opt1 == 'A') {
                    System.out.println("correct answer");
                } else {
                    System.out.println("wrong answer");
                    System.out.println("Oops!! Game Quiet");
                    return;
                }


            } else if (lifeline_a == 'A') {
                System.out.println("correct answer");
            } else {
                System.out.println("wrong answer");
                System.out.println("Oops!! Game Quiet");
                return;
            }


        } else if (lifeline == '2' && count<2) {
            System.out.println("Q1.How many access specifiers are in java");
            System.out.println("A. 3");
            System.out.println("B. 1");
            System.out.println("C. 4");
            System.out.println("D. 2");
            count++;

            if(count<2){
            System.out.println("lifeline left-");

            System.out.println("lifeline 1 : 50-50");

            System.out.println("lifeline 3 : need hint");
            System.out.println("Enter - 1: (for lifeline 1)  3:(for lifeline 3) "); }
            int lifeline_b = sc.next().charAt(0);
            if (lifeline_b == '1' && count<2) {
                System.out.println("A.3");
                System.out.println("C.4");
                count++;

                char opt1 = sc.next().charAt(0);
                if (opt1 == 'A') {
                    System.out.println("correct answer");
                } else {
                    System.out.println("wrong answer");
                    System.out.println("Oops!! Game Quiet");
                    return;
                }
            } else if (lifeline_b == '3' && count<2) {
                System.out.println(" Hint : 1+1+1=?");
                count++;


                char opt2 = sc.next().charAt(0);
                if (opt2 == 'A') {
                    System.out.println("correct answer");
                } else {
                    System.out.println("wrong answer");
                    System.out.println("Oops!! Game Quiet");
                    return;
                }

            } else if (lifeline_b == 'A') {

                System.out.println("correct answer");
            } else {
                System.out.println("wrong answer");
                System.out.println("Oops!! Game Quiet");
                return;
            }


        } else if (lifeline == '3' && count<2) {
            System.out.println("Hint: 1+1+1=?");
            if(count<2){
            System.out.println("lifeline left- ");
            System.out.println("lifeline 1 : 50-50");
            System.out.println("lifeline 2 : flip the question");
            count++; }

            char lifeline_c = sc.next().charAt(0);
            if (lifeline_c == '1' && count<2) {
                System.out.println(" A.3");
                System.out.println(" B.4");
                count++;

                char opt1 = sc.next().charAt(0);
                if (opt1 == 'A') {
                    System.out.println("correct answer");
                } else {
                    System.out.println("wrong answer");
                    System.out.println("Oops!! Game Quiet");
                    return;
                }
            } else if (lifeline_c == '2' && count<2) {
                System.out.println("Q1.How many access specifiers are in java");
                System.out.println("A. 3");
                System.out.println("B. 1");
                System.out.println("C. 4");
                System.out.println("D. 2");
                count++;


                char opt2 = sc.next().charAt(0);

                if (opt2 == 'A') {
                    System.out.println("correct answer");

                } else {
                    System.out.println("wrong answer");
                    System.out.println("Oops!! Game Quiet");
                    return;
                }
            } else if (lifeline_c == 'A') {
                System.out.println("correct answer");
            } else {
                System.out.println("wrong answer");
                System.out.println("Oops!! Game Quiet");
                return;
            }
        } else if (lifeline == 'A') {
            System.out.println("correct answer");
        } else {
            System.out.println("wrong answer");
            System.out.println("Oops!! Game Quiet");
            return;


        }

        sc.nextLine();
        System.out.println("press enter to continue");
        sc.nextLine();

        //Sample question End here //


        // Question 2 start here //
        System.out.println("Q2.what is the ASCII value of alphabet D ");
        System.out.println("A. 65");
        System.out.println("B. 69");
        System.out.println("C. 68");
        System.out.println("D. 66");
        if(count<2) {
            System.out.println("lifeline to Use :");
            System.out.println("lifeline 1 : 50-50");
            System.out.println("lifeline 2 : flip the question");
            System.out.println("lifeline 3 : need hint");
            System.out.println("Enter - 1: (for lifeline 1) 2: (for lifeline 2)  3:(for lifeline 3) ");
        }
        char lifeline1 = sc.next().charAt(0);
        if (lifeline1 == '1' && count<2) {
            System.out.println("A.65");
            System.out.println("C.68");

            if(count<2){
            System.out.println("lifeline left-");
            System.out.println("lifeline 2 : flip the question");
            System.out.println("lifeline 3 : need hint");
            System.out.println("Enter - 2: for (lifeline2) 3: for(lifeline3)");
            count++;  }

            char lifeline_a1 = sc.next().charAt(0);
            if (lifeline_a1 == '2' && count<2) {
                System.out.println("Q2.How many access specifiers are in java");
                System.out.println("A. 3");
                System.out.println("B. 1");
                System.out.println("C. 4");
                System.out.println("D. 2");
                count++;


                char opt = sc.next().charAt(0);

                if (opt == 'A') {
                    System.out.println("correct answer");
                } else {
                    System.out.println("wrong answer");
                    System.out.println("Oops!! Game Quiet");
                    return;
                }


            } else if (lifeline_a1 == '3' && count<2) {
                System.out.println("1+1+1=?");
                count++;

                char opt1 = sc.next().charAt(0);
                if (opt1 == 'A') {
                    System.out.println("correct answer");
                } else {
                    System.out.println("wrong answer");
                    System.out.println("Oops!! Game Quiet");
                    return;
                }


            } else if (lifeline_a1 == 'C') {
                System.out.println("correct answer");
            } else {
                System.out.println("wrong answer");
                System.out.println("Oops!! Game Quiet");
                return;
            }


        } else if (lifeline1 == '2' && count<2) {
            System.out.println("Q2.How many access specifiers are in java");
            System.out.println("A. 3");
            System.out.println("B. 1");
            System.out.println("C. 4");
            System.out.println("D. 2");
            count++;

            if(count<2){
            System.out.println("lifeline left-");

            System.out.println("lifeline 1 : 50-50");

            System.out.println("lifeline 3 : need hint");
            System.out.println("Enter - 1: (for lifeline 1)  3:(for lifeline 3) "); }
            int lifeline_b1 = sc.next().charAt(0);
            if (lifeline_b1 == '1' && count<2) {
                System.out.println("A.3");
                System.out.println("C.4");
                count++;

                char opt1 = sc.next().charAt(0);
                if (opt1 == 'A') {
                    System.out.println("correct answer");
                } else {
                    System.out.println("wrong answer");
                    System.out.println("Oops!! Game Quiet");
                    return;
                }
            } else if (lifeline_b1 == '3' && count<2) {
                System.out.println(" Hint : 1+1+1=?");
                count++;


                char opt2 = sc.next().charAt(0);
                if (opt2 == 'A') {
                    System.out.println("correct answer");
                } else {
                    System.out.println("wrong answer");
                    System.out.println("Oops!! Game Quiet");
                    return;
                }

            } else if (lifeline_b1 == 'A') {

                System.out.println("correct answer");
            } else {
                System.out.println("wrong answer");
                System.out.println("Oops!! Game Quiet");
                return;
            }


        } else if (lifeline1 == '3' && count<2) {
            System.out.println("Hint: 60+8=?");

            if(count<2){
            System.out.println("lifeline left- ");
            System.out.println("lifeline 1 : 50-50");
            System.out.println("lifeline 2 : flip the question");
            count++; }

            char lifeline_c1 = sc.next().charAt(0);
            if (lifeline_c1 == '1' && count<2) {
                System.out.println(" A.65");
                System.out.println(" C.68");
                count++;

                char opt1 = sc.next().charAt(0);
                if (opt1 == 'C') {
                    System.out.println("correct answer");
                } else {
                    System.out.println("wrong answer");
                    System.out.println("Oops!! Game Quiet");
                    return;
                }
            } else if (lifeline_c1 == '2' && count<2) {
                System.out.println("Q2.How many access specifiers are in java");
                System.out.println("A. 3");
                System.out.println("B. 1");
                System.out.println("C. 4");
                System.out.println("D. 2");
                count++;

                char opt2 = sc.next().charAt(0);

                if (opt2 == 'A') {
                    System.out.println("correct answer");

                } else {
                    System.out.println("wrong answer");
                    return;
                }
            } else if (lifeline_c1 == 'C') {
                System.out.println("correct answer");
            } else {
                System.out.println("wrong answer");
                System.out.println("Oops!! Game Quiet");
                return;
            }
        } else if (lifeline1 == 'C') {
            System.out.println("correct answer");
        } else {
            System.out.println("wrong answer");
            System.out.println("Oops!! Game Quiet");
            return;
        }
        sc.nextLine();
        System.out.println("press enter to continue");
        sc.nextLine();


        //Ques 2 end here //

        //Ques 3 start here //

        System.out.println("Q3. which keyword makes the java not full object oriented programming language ");
        System.out.println("A. return");
        System.out.println("B. static");
        System.out.println("C. void");
        System.out.println("D. close");

        if(count<2){
        System.out.println("lifeline to Use :");
        System.out.println("lifeline 1 : 50-50");
        System.out.println("lifeline 2 : flip the question");
        System.out.println("lifeline 3 : need hint");
        System.out.println("Enter - 1: (for lifeline 1) 2: (for lifeline 2)  3:(for lifeline 3) "); }
        char lifeline2 = sc.next().charAt(0);
        if (lifeline2 == '1' && count<2) {
            System.out.println("B.static");
            System.out.println("C.void");

            if(count<2){
            System.out.println("lifeline left-");
            System.out.println("lifeline 2 : flip the question");
            System.out.println("lifeline 3 : need hint");
            System.out.println("Enter - 2: for (lifeline2) 3: for(lifeline3)"); }

            char lifeline_a2 = sc.next().charAt(0);
            if (lifeline_a2== '2' && count<2) {
                System.out.println("Q3. what is the o/p of the code - ");
                System.out.println("System.out.println(5+'5')");

                System.out.println("A. 10");
                System.out.println("B. 5+5");
                System.out.println("C. 5");
                System.out.println("D. 55");


                char opt = sc.next().charAt(0);

                if (opt == 'D') {
                    System.out.println("correct answer");
                } else {
                    System.out.println("wrong answer");
                    System.out.println("Oops!! Game Quiet");
                    return;
                }


            } else if (lifeline_a2 == '3' && count<2) {
                System.out.println("fixed hoon move nahi karta?");

                char opt1 = sc.next().charAt(0);
                if (opt1 == 'B') {
                    System.out.println("correct answer");
                } else {
                    System.out.println("wrong answer");
                    System.out.println("Oops!! Game Quiet");
                    return;
                }



            } else if (lifeline_a2 == 'B') {
                System.out.println("correct answer");
            } else {
                System.out.println("wrong answer");
                return;
            }


        } else if (lifeline2== '2' && count<2) {
            System.out.println("Q3. what is the o/p of the code - ");
            System.out.println("System.out.println(5+'5')");

            System.out.println("A. 10");
            System.out.println("B. 5+5");
            System.out.println("C. 5");
            System.out.println("D. 55");

           if(count<2){
            System.out.println("lifeline left-");

            System.out.println("lifeline 1 : 50-50");

            System.out.println("lifeline 3 : need hint");
            System.out.println("Enter - 1: (for lifeline 1)  3:(for lifeline 3) "); }
            int lifeline_b2 = sc.next().charAt(0);
            if (lifeline_b2 == '1') {
                System.out.println("B.5+5");
                System.out.println("D.55");

                char opt1 = sc.next().charAt(0);
                if (opt1 == 'D') {
                    System.out.println("correct answer");
                } else {
                    System.out.println("wrong answer");
                    System.out.println("Oops!! Game Quiet");
                    System.out.println("Oops!! Game Quiet");
                    return;
                }
            } else if (lifeline_b2 == '3' && count<2) {
                System.out.println(" Hint : 5*11?");


                char opt2 = sc.next().charAt(0);
                if (opt2 == 'D') {
                    System.out.println("correct answer");
                } else {
                    System.out.println("wrong answer");
                    System.out.println("Oops!! Game Quiet");
                    return;
                }

            } else if (lifeline_b2 == 'D') {

                System.out.println("correct answer");
            } else {
                System.out.println("wrong answer");
                System.out.println("Oops!! Game Quiet");
                return;
            }


        } else if (lifeline2 == '3' && count<2) {
            System.out.println("Hint: fixed hoon move nahi karta ?");

            if(count<2){
            System.out.println("lifeline left- ");
            System.out.println("lifeline 1 : 50-50");
            System.out.println("lifeline 2 : flip the question"); }

            char lifeline_c2 = sc.next().charAt(0);
            if (lifeline_c2== '1' && count<2) {
                System.out.println(" B.static");
                System.out.println(" C.void");

                char opt1 = sc.next().charAt(0);
                if (opt1 == 'B') {
                    System.out.println("correct answer");
                } else {
                    System.out.println("wrong answer");
                    System.out.println("Oops!! Game Quiet");
                    return;
                }
            } else if (lifeline_c2== '2' && count<2) {
                System.out.println("Q3. what is the o/p of the code - ");
                System.out.println("System.out.println(5+'5')");

                System.out.println("A. 10");
                System.out.println("B. 5+5");
                System.out.println("C. 5");
                System.out.println("D. 55");


                char opt2 = sc.next().charAt(0);

                if (opt2 == 'D') {
                    System.out.println("correct answer");

                } else {
                    System.out.println("wrong answer");
                    System.out.println("Oops!! Game Quiet");
                    return;
                }
            } else if (lifeline_c2 == 'B') {
                System.out.println("correct answer");
            } else {
                System.out.println("wrong answer");
                return;
            }
        } else if (lifeline2 == 'B') {
            System.out.println("correct answer");
        } else {
            System.out.println("wrong answer");
            System.out.println("Oops!! Game Quiet");
            return;
        }
        sc.nextLine();
        System.out.println("press enter to continue");
        sc.nextLine();

        // Q3 end here //
    }
}

