import java.util.Scanner;
public class Chatbot
{
        private String username;
        public Chatbot(String username)
        {
            this.username=username;
        }
        public String response(String userquery)
        {
            if(userquery.toLowerCase().contains("hello")||userquery.toLowerCase().contains("hyy"))
            return "hello "+username+" !";
            else if(userquery.toLowerCase().contains("how are you")||userquery.toLowerCase().contains("how r u?")||userquery.toLowerCase().contains("how are u?"))
            return "i am fine";
            else if(userquery.toLowerCase().contains("who is your devloper?")||userquery.toLowerCase().contains("devloper"))
            return "Karan Goswami ";
            else if(userquery.toLowerCase().contains("your one friend name")||userquery.toLowerCase().contains("brother"))
            return "Raj Chauhan";
            else
            return "invalid enter";
        }
        public static void main(String[] args)
        {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter your username ");
            String username=scanner.nextLine();
            Chatbot chatbot=new Chatbot(username);
            while(true)
            {
                System.out.println("Your queries pass here .. ");
                String userquery=scanner.nextLine();
                String response=chatbot.response(userquery);
                System.out.println("Chatbot "+response);
            }
        }
}
