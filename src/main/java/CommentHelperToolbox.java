import com.intellij.lang.Language;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.editor.Editor;
import java.util.ArrayList;

public class CommentHelperToolbox {
    String CurrentClassCode;
    Editor editor;
    int LineCount;
    String[] lines;
    ArrayList<String[]> inLineComments = new ArrayList<>();
    ArrayList<String[]> blockComments = new ArrayList<>();

    public CommentHelperToolbox(AnActionEvent e) {
        editor = e.getRequiredData(CommonDataKeys.EDITOR);
        CurrentClassCode = editor.getDocument().getText();
        LineCount = editor.getDocument().getLineCount();
        lines = CurrentClassCode.split("\\r?\\n");
        System.out.println("Reading Document...");
        System.out.println("Line count: "+ LineCount);
        System.out.println("Current Doc Length: " + CurrentClassCode.length());
        readBlockComments();
        readLineComments();
        System.out.println("Comments Found: " + inLineComments.size());
        System.out.println("Block comments found: " + blockComments.size());

    }

    public void readLineComments() {
        int index =0;
        for (String line: lines) {
            if (line.length() > 2 && line.contains("//")){
                String[] lineDetails = {Integer.toString(index+1), line.split("//")[1]};
                inLineComments.add(lineDetails);
            }
            index++;
        }

    }

    /*
    Function Name: readBlockComments
    Purpose:
    Date:
    Author:
    Return Type:
     */
    public void readBlockComments() {
        //TODO: Store line start index and line finish index
        String[] blockComment = CurrentClassCode.split("/\\*");
        System.out.println("Tester..| " + blockComment.length);
        for (int i =1; i<blockComment.length; i++) {
            String[] the_blockComment = {"0","0", blockComment[i].split("\\*/")[0]};
            blockComments.add(the_blockComment);
        }

    }

    public ArrayList<String[]> getBlockComments() {
        return blockComments;
    }
    public ArrayList<String[]> getInlineComments() {
        return inLineComments;
    }

    public String getDocumentName(){
        return String.valueOf(editor.getDocument());
    }
}
