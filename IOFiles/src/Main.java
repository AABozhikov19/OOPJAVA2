import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
   String path="C:\\Users\\AABozhikov19\\IdeaProjects\\IOFiles\\example.txt";
   String outPath="C:\\Users\\AABozhikov19\\IdeaProjects\\IOFiles\\example1.txt";
   FileInputStream stream=null;
   int a=0;
        FileOutputStream outStream=null;
 try {
     outStream=new FileOutputStream(outPath);
      stream= new FileInputStream(path);
      int oneBite=stream.read();
      while(oneBite>=0)
      {
          a+=oneBite;
          System.out.print(oneBite+" ");
          oneBite=stream.read();
      }
     System.out.println(a);
 }catch(FileNotFoundException e)
 {
     System.out.println(e.getMessage());
 } catch (IOException e) {
     System.out.println(e.getMessage());
 }finally
 {
     if(stream!=null)
     {
         stream.close();
     }
     if(outStream!=null)
     {
         outStream.close();
     }
 }
    }
}