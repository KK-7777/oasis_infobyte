import java.util.*;
import java.util.HashMap;
public class Main{


        HashMap<String,Integer> data=new HashMap <String,Integer>();
        Scanner sc=new Scanner(System.in);
        public void login(){
            data.put("Manav",110);
            data.put("Sahil",114);
            data.put("Keshav",111);
            data.put("Aman",112);
            data.put("Nakul",113);
            System .out.println("*****Welcome To Oasis Infobyte***** ");
            System.out.println("Enter USER ID :");
            String userID=sc.nextLine();
            System.out.println("Enter PASSWORD :");
            int password=sc.nextInt();
            if (data.containsKey(userID) && data.get(userID)==password){
                System.out.println("Successfully Logged-in!");
                menu();
            }
            else{
                System.out.println("Invalid login!,Try again..");
                login();
            }
        }
        public void menu(){
            System.out.println("\nSelect any one !");
            System.out.println("1.UPDATE PROFILE AND PASSWORD\n2.START THE EXAM\n3.LOGOUT");
            System.out.println("Enter your option :");
            int op=sc.nextInt();
            switch(op){
                case 1 : data=update();
                    menu();
                    break;
                case 2 : writeExam();
                    menu();
                    break;
                case 3 : System.exit(0);
                    break;
                default: System.out.println("Invalid option!");
            }
        }
        public HashMap<String,Integer> update(){
            System.out.println("UPDATE PROFILE");
            System.out.println("Enter username : ");
            Scanner in=new Scanner(System.in);
            String uid=in.nextLine();
            if (data.containsKey(uid)){
                System.out.println("Enter new password : ");
                int newpwd=sc.nextInt();
                data.replace(uid,newpwd);
            }
            else{
                System.out.println("User doesn't exists");
            }
            System.out.println("Profile updated successfully!!");
            return data;
        }
        public void writeExam(){
            long start=System.currentTimeMillis();
            long end1=start+15*1000;
            long end2=start+30*1000;
            int score1=0,score2=0;
            int cnt1=0,cnt2=0;
            char ans;
            System.out.println("Start the exam!");
            System.out.println("You have just 15 seconds to answer each question in section 1.");
            System.out.println("You have just 30 seconds to answer each question in section 2.");
            System.out.println("Each question in section 1 takes 5 marks for correct answer and -1 mark for wrong answer.");
            System.out.println("Each question in section 2 takes 10 marks for correct answer and -1 mark for wrong answer.");
            System.out.println(" Best Wishesh for your exam !!");
            while(System.currentTimeMillis()<end1){
                System.out.println("**Section 1**");
                System.out.println("Who developed Java?");
                System.out.println("a.James Gosling\nb.Dennins Rithce\nc.Guido Van Rossum\nd.Bjarne Stroustrup");
                System.out.println("Enter your answer:");
                ans=sc.next().charAt(0);
                if(ans=='a'){
                    cnt1+=1;
                }
                System.out.println("2.Name the Java IDE’s?");
                System.out.println("a.Vs Code\nb.Notepad\nc.Eclipse and NetBeans\nd.None");
                System.out.println("Enter your answer:");
                ans=sc.next().charAt(0);
                if(ans=='c'){
                    cnt1+=1;
                }
                System.out.println("3.What is the reason java stands unique from other languages?");
                System.out.println("a.Platform Dependent\nb.Platform Indepedent\nc.Simple and Easy\nd.None");
                System.out.println("Enter your answer:");
                ans=sc.next().charAt(0);
                if(ans=='b'){
                    cnt1+=1;
                }
                System.out.println("4.Correct syntax for the compilation of a java program:");
                System.out.println("a.javac filename.java\nb.java filename.java\nc.java filename\nd.javac filename");
                System.out.println("Enter your answer:");
                ans=sc.next().charAt(0);
                if(ans=='a'){
                    cnt1+=1;
                }
                System.out.println("5.Automatic type conversion is possible in which of the possible cases?");
                System.out.println("a.Byte To Int\nb.Int to Long\nc.Long to Int\nd.None");
                System.out.println("Enter your answer:");
                ans=sc.next().charAt(0);
                if(ans=='b'){
                    cnt1+=1;
                }
                break;
            }
            while(System.currentTimeMillis()<end2){
                System.out.println("**Section 2**");
                System.out.println("6.Guess the output...");
                System.out.println("public static void main(Sting args[]){\n\tint x=5;\n\tint y=x++ + ++x;\n\tSystem.out.println('''Value of y''');\n}");
                System.out.println("a.10\nb.11\nc.12\nd.13");
                System.out.println("Enter your answer:");
                ans=sc.next().charAt(0);
                if(ans=='c') {
                    score2+=10;
                    cnt2+=1;
                }
                else
                    score2-=2;
                break;
            }
            System.out.println("You have completed the exam!!");
            score1=cnt1*5-((4-cnt1)*1);
            System.out.println("Number of correct answers in section1 :"+cnt1);
            System.out.println("Number of correct answers in section2 :"+cnt2);
            System.out.println("Your score in section1 :"+score1);
            System.out.println("Your score in section2 :"+score2);
            System.out.println("Your total score is :"+(score1+score2));
        }
        public static void main(String[] args){
       Main can=new Main();
            can.login();
        }
    }
