import java.io.FileWriter;
import java.io.StringReader;

class write {
  public static void main(String args[]) {

    // creates a multiline string using + operator
    // the string is a Java Program
    String program = "i am venkatesh ";
     try {
       // Creates a Writer using FileWriter
       FileWriter output = new FileWriter("testfile.java");

       // Writes the program to file
       output.write(program);
       System.out.println("Data is written to the file.");

       // Closes the writer
       output.close();
     }
     catch (Exception e) {
       e.getStackTrace();
     }
  }
}