package pms.common;

import javax.swing.JOptionPane;

public class PopUp {

    public static int deleteConfirmation(String what) {
        return JOptionPane.showConfirmDialog(null, "Are you sure you want to delete " + what, "Delete Confirmation", JOptionPane.YES_NO_OPTION);
    }

    public static void deleteSuccess(String what) {
        JOptionPane.showMessageDialog(null, what + " has been Deleted Successfuly", "Record Deleted", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void updateSuccess(String what) {
        JOptionPane.showMessageDialog(null, what + " Information has been updated", "Change Saved", JOptionPane.INFORMATION_MESSAGE);
    }

    public static int cancelConfirmation() {
        return JOptionPane.showConfirmDialog(null, "Are you sure you want to Cancel this Operation", "Cancel Confirmation", JOptionPane.YES_NO_OPTION);
    }

    public static void connectionError() {
        JOptionPane.showMessageDialog(null, "There is a connection issue with the Server", "Connection Error", JOptionPane.INFORMATION_MESSAGE);
    }

    // General Pop Up messages
    public static void showErrorMessage(String what, String headerMessage) {
        JOptionPane.showMessageDialog(null, what, headerMessage, JOptionPane.ERROR_MESSAGE);
    }

    public static void showWarningMessage(String what, String headerMessage) {
        JOptionPane.showMessageDialog(null, what, headerMessage, JOptionPane.WARNING_MESSAGE);
    }
    
    public static void showGenericError() {
        JOptionPane.showMessageDialog(null, "Something is not right!! Please try again", "!!! ERROR !!!", JOptionPane.ERROR_MESSAGE);
    }

    public static int confirmationDialog(String what, String header) {
        return JOptionPane.showConfirmDialog(null, what, header, JOptionPane.YES_NO_OPTION);
    }

    public static void infoDialog(String what, String header) {
        JOptionPane.showMessageDialog(null, what, header, JOptionPane.INFORMATION_MESSAGE);
    }

}
