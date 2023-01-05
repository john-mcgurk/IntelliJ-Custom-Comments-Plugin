import com.intellij.openapi.actionSystem.AnActionEvent;
import java.io.*;
import java.util.ArrayList;
import java.io.File;
import java.io.FileOutputStream;

public class WriteDocumentation {
    public void testwritedocument(AnActionEvent e) throws Exception {
        CommentHelperToolbox toolbox = new CommentHelperToolbox(e);
        ArrayList<String[]> comments = toolbox.getInlineComments();
        String testpath="java/testfile.txt";
        FileWriter write = new FileWriter( testpath , true);
        PrintWriter print_line = new PrintWriter( write );
        String title=toolbox.getDocumentName();
        print_line.println("<!DOCTYPE html>");
        print_line.println("<html>");
        print_line.println("<head></head>");
        print_line.println("<body>");
        print_line.print("<h1 style=textaligin:center>");
        print_line.print(title);
        print_line.println("</h1>");
        for(String[] comment : comments){
            print_line.println("<p1>comment:"+comment+"</p1>");
        }
        print_line.println("</body>");
        print_line.println("/html");
        print_line.close();
        write.close();
    }

    public void writedocument(AnActionEvent e) throws IOException{

    }


    public void createdocument(AnActionEvent e) throws IOException {
        CommentHelperToolbox toolbox = new CommentHelperToolbox(e);
        ArrayList<String[]> comments = toolbox.getInlineComments();
        //XWPFDocument document = new XWPFDocument();
        FileOutputStream out = new FileOutputStream( new File("desktop/documentation.docx"));
        // document.write(out);
        out.close();
        System.out.println("documentation succesfully written successfully written writting pending");
    }

 /*   public void writetodocument(XWPFDocument x,AnActionEvent e,FileOutputStream out){
        CommentHelperToolbox toolbox = new CommentHelperToolbox(e);
        ArrayList<String[]> comments = toolbox.getInlineComments();
        XWPFParagraph paragraph = x.createParagraph();
        for(String[] comment:comments){
            XWPFRun run = paragraph.createRun();
            run.setText(comment);
            x.write(out);
       }*/

}
