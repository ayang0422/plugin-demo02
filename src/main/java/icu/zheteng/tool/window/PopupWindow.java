package icu.zheteng.tool.window;

import com.intellij.openapi.project.ProjectManager;
import com.intellij.openapi.ui.popup.JBPopup;
import com.intellij.openapi.ui.popup.JBPopupFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年05月25日
 */
public class PopupWindow {
    private JPanel panel1;
    private JLabel popup;
    private JPanel root;
    private JPanel popupPanel;
    private JButton errNotifyBtn;

    public PopupWindow() {
        root.setPreferredSize(new Dimension(600, 400));
    }

    /**
     * 弹出
     */
    public void popup() {
        JBPopup jbPopup = JBPopupFactory.getInstance().createComponentPopupBuilder(root, popupPanel)
                .setProject(ProjectManager.getInstance().getDefaultProject())
                .setResizable(true)
                .setMovable(true)

                .setModalContext(false)
                .setRequestFocus(true)
                .setBelongsToGlobalPopupStack(true)
                .setDimensionServiceKey(null, "DOC_VIEW_POPUP", true)
                .setLocateWithinScreenBounds(false)
                // 单击外部时取消弹窗
                .setCancelOnClickOutside(false)
                // 在其他窗口打开时取消
                .setCancelOnOtherWindowOpen(false)
                .setCancelOnWindowDeactivation(false)
                .createPopup();
        jbPopup.showCenteredInCurrentWindow(ProjectManager.getInstance().getDefaultProject());
    }
}
