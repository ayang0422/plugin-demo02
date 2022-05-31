package icu.zheteng.tool.window;

import com.intellij.openapi.project.ProjectManager;
import icu.zheteng.dialog.SampleDialogWrapper;
import icu.zheteng.notify.MyNotifier;

import javax.swing.*;

/**
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年05月24日
 */
public class FirstToolWindow {
    private JPanel rootPane;
    private JLabel hello;
    private JButton wrapperBtn;
    private JButton popBtn;
    private JButton errNotifyBtn;
    private JButton warnNotifyBtn;

    public FirstToolWindow() {
        wrapperBtn.addActionListener(a -> {
            boolean showAndGet = new SampleDialogWrapper("test", "this is first dialog").showAndGet();
            if (showAndGet) {
                new SampleDialogWrapper("test", "press OK").showAndGet();
            } else {
                new SampleDialogWrapper("test", "press CANCEL OR CLOSE").showAndGet();
            }
        });

        popBtn.addActionListener(a -> {
            PopupWindow window = new PopupWindow();
            window.popup();
        });

        errNotifyBtn.addActionListener(a ->
                MyNotifier.notifyError(ProjectManager.getInstance().getDefaultProject(), "error test!!!"));

        warnNotifyBtn.addActionListener(a ->
                MyNotifier.notifyWarning(ProjectManager.getInstance().getDefaultProject(), "warning test"));
    }

    public JComponent getContent() {
        return rootPane;
    }
}
