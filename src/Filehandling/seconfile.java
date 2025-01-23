package Filehandling;
import java.io.*;
public class seconfile {
    public static void main(String[] args) {
try
{
 // File obj=new File("/Users/RevathiTannidi/IdeaProjects/java_learning/src/Filehandling/file.txt");
   // File obj=new File("/Users/RevathiTannidi/IdeaProjects/java_learning/src/Filehandling/book.txt");
    File obj=new File("/Users/RevathiTannidi/IdeaProjects/java_learning/src/Filehandling/run.txt");
  if(obj.createNewFile())
  {
      System.out.println("new file is created");
  }
  else {
      System.out.println(" already file exist");
  }



} catch (Exception e) {
    throw new RuntimeException(e);
}
try {
    filewriter write;
    write = new filewriter("/Users/RevathiTannidi/IdeaProjects/java_learning/src/Filehandling/run.txt");
}
    }
}
