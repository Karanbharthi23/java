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
            if(userquery.toLowerCase().contains("hello"))
            return "hello "+username+" !";
            else if(userquery.toLowerCase().contains("how are you"))
            return "i am fine";
            else if(userquery.toLowerCase().contains("who is your devloper?"))
            return "Karan Goswami ";
            else 
            return "invaliid input entered";
        }
        public static void main(String[] args)
        {
            Scanner scanner=new Scanner(System.in);
            String username=scanner.nextLine();
            Chatbot chatbot=new Chatbot(username);
            while(true)
            {
                System.out.println("You ");
                String userquery=scanner.nextLine();
                String response=chatbot.response(userquery);
                System.out.println("Chatbot "+response);
            }
        }
}
