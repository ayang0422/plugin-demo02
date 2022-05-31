package icu.zheteng.dialog;

import com.intellij.openapi.ui.DialogWrapper;

import javax.annotation.Nullable;
import javax.swing.*;
import java.awt.*;

/**
 * @author yangpeng
 * @version 1.0.0
 * @date 2022年05月25日
 */
public class SampleDialogWrapper extends DialogWrapper {

    private String msg;

    public SampleDialogWrapper(String title,String msg) {
        // use current window as parent
        super(true);
        this.msg = msg;
        setTitle(title);
        init();
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        JPanel dialogPanel = new JPanel(new BorderLayout());

        JLabel label = new JLabel(msg);
        label.setPreferredSize(new Dimension(100, 100));
        dialogPanel.add(label, BorderLayout.CENTER);

        return dialogPanel;
    }
}
