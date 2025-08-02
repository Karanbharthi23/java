import java.io.BufferedWriter;
//header files badhi complasary che add krvi
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
public class bufhanler {
        public static void main(String[] args)throws Exception
        {
            
            System.out.println("This is File Handling created by @karanbharthi_13");
             FileWriter fw=new FileWriter("abc.txt");//pela sadi file banavani
             BufferedWriter/*write no object banvo */ bw=new BufferedWriter(fw);//pachi ene buffer ma convert krvani
             bw.write("more queries contact at ig: @karanbharthi_13");//aa ey file ma write thyu che
             bw.close();//ane close krvi farjiyat che to j read krva dese nahi nakar infinite ma jase write krva
            FileReader fr=new FileReader("abc.txt");//file ma thi read krva buffer ma add krva
            BufferedReader /*bufferr reader no object banavo*/br=new BufferedReader(fr);//ene buffer ma convert krva etle bufferr ma avi jaai
            System.out.println(br.readLine());//akhi line buffer thi read krva
        }
}
