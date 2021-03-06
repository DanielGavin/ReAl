package real.Objects.GUI;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class FileChooserSave extends JFileChooser 
{
    @Override
    public void approveSelection() 
    {
        File f = getSelectedFile();
        
        if (f.exists()) 
        {
            int result = JOptionPane.showConfirmDialog(this,
                    "The file exists. Do you wish to overwrite?", "Existing file",
                    JOptionPane.YES_NO_CANCEL_OPTION);
            
            switch (result) 
            {
                case JOptionPane.YES_OPTION:
                    super.approveSelection();
                    return;
                case JOptionPane.CANCEL_OPTION:
                    super.cancelSelection();
                    return;
                default:
                    return;
            }
        }
        
        super.approveSelection();
    }
}
