import java.io.FileInputStream;
public class Prog71 {
public static void main(String args[]){
try{
FileInputStream fin=new FileInputStream("D:\\Technolamror.txt");
int i=fin.read();
System.out.print((char)i);
fin.close();
}catch(Exception e){System.out.println(e);}
}
}
