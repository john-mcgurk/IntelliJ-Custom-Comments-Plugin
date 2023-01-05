import com.intellij.ide.BrowserUtil;
import com.intellij.lang.Language;
import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.editor.CaretModel;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.vcs.actions.ShowChangeMarkerAction;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Optional;

public class ReadCommentsAction extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {

        CommentHelperToolbox toolbox = new CommentHelperToolbox(e);
        ArrayList<String[]> comments = toolbox.getInlineComments();
        ArrayList<String[]> blockComments = toolbox.getBlockComments();
        for (String[] comment : comments) {
            System.out.println("Comment found on line: " + comment[0]);
            System.out.println("Comment: " + comment[1]);
            System.out.println();
        }

        for (String[] Bcomment : blockComments) {
            System.out.println("Block Comment: " + Bcomment[2]);
            System.out.println();
        }


    }
}
