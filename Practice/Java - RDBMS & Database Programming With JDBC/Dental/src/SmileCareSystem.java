import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class SmileCareSystem {

    public static void main(String[] args) {
        // Set Look and Feel to System Default for a cleaner look
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.invokeLater(() -> {
            new AppointmentGUI();
        });
        
        System.out.println("SmileCare Dental Clinic System is running...");
    }
}