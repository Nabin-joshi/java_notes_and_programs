import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

 class MulticastEvent extends JPanel implements ActionListener {

    private int cnt = 0;
    private JButton closeAllButton;

    public MulticastEvent() {

        JButton jButton = new JButton("New");

        add(jButton);

        jButton.addActionListener(this);

        closeAllButton = new JButton("Close all");

        add(closeAllButton);
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        CloseFrame closeFrame = new CloseFrame();

        cnt++;

        closeFrame.setTitle("Window " + cnt);

        closeFrame.setSize(200, 150);

        closeFrame.setLocation(30 * cnt, 30 * cnt);

        closeFrame.setVisible(true);

        closeAllButton.addActionListener(closeFrame);
    }

    private static void showUI() {

        JFrame jFrame = new JFrame();

        jFrame.setTitle("Multicast");

        jFrame.setSize(700, 500);

        jFrame.addWindowListener(new WindowAdapter() {

            @Override

            public void windowClosing(WindowEvent event) {

                System.exit(0);

            }

        });

        Container cPane = jFrame.getContentPane();

        cPane.add(new MulticastEvent());

        jFrame.setVisible(true);
    }

    class CloseFrame extends JFrame implements ActionListener {

        @Override

        public void actionPerformed(ActionEvent evt) {

            setVisible(false);

        }
    }

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {

            @Override

            public void run() {

                showUI();

            }

        });
    }
}