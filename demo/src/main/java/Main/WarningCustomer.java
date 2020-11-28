package Main;

import javax.swing.*;
import javax.transaction.*;
import javax.transaction.xa.XAResource;
import java.awt.*;

public class WarningCustomer extends JFrame {

    private JPanel warningP;
    private JLabel textL, iconL;

    private Transaction aTrans = new Transaction() {
        @Override
        public void commit() throws RollbackException, HeuristicMixedException, HeuristicRollbackException, SecurityException, IllegalStateException, SystemException {

        }

        @Override
        public boolean delistResource(XAResource xaResource, int i) throws IllegalStateException, SystemException {
            return false;
        }

        @Override
        public boolean enlistResource(XAResource xaResource) throws RollbackException, IllegalStateException, SystemException {
            return false;
        }

        @Override
        public int getStatus() throws SystemException {
            return 0;
        }

        @Override
        public void registerSynchronization(Synchronization synchronization) throws RollbackException, IllegalStateException, SystemException {

        }

        @Override
        public void rollback() throws IllegalStateException, SystemException {

        }

        @Override
        public void setRollbackOnly() throws IllegalStateException, SystemException {

        }
    }; //access my class Transaction as global declaration

    public WarningCustomer(){

        Container pane = getContentPane();
        warningP = new JPanel(null);
        warningP.setBackground(Color.WHITE);

        ImageIcon warningImage = new ImageIcon("../images/warning_icon.GIF");
        iconL = new JLabel(warningImage);
        iconL.setBounds(20, 35, 50, 50);
        warningP.add(iconL);

        textL = new JLabel("");
        textL.setText("please complete all details");
        textL.setFont(new Font("Serif", Font.BOLD, 15));
        textL.setForeground(Color.RED);
        textL.setBounds(80, 48, 200, 20);
        warningP.add(textL);
        pane.add(warningP);
    }
}

