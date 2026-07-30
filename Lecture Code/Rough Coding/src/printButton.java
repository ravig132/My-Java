import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class printButton extends JFrame implements ActionListener {


    JButton printingButton ;

    printButton(){

        JFrame frame = new JFrame();
        // Get screen dimensions
        int width = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;

        printingButton = new JButton("Print");
        printingButton.setBounds(300,300,200,35);
        printingButton.setForeground(Color.WHITE);
        printingButton.setBackground(Color.BLACK);
        printingButton.setFont(new Font("System", Font.BOLD,18));
        printingButton.addActionListener(e -> printComponent(frame));
        frame.add(printingButton);





        // Set bounds to full screen

        frame.setLayout(null);
        frame.setLocation(0,0);
        frame.setBounds(0, 0, width, height);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main (String [] args ){
        new printButton();

    }

    public static void printComponent(Component component) {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable((Graphics g, PageFormat pf, int pageIndex) -> {
            if (pageIndex > 0) return Printable.NO_SUCH_PAGE;

            Graphics2D g2d = (Graphics2D) g;
            g2d.translate(pf.getImageableX(), pf.getImageableY());
            component.printAll(g2d);
            return Printable.PAGE_EXISTS;
        });

        if (job.printDialog()) {
            try {
                job.print();
            } catch (PrinterException ex) {
                ex.printStackTrace();
            }
        }
    }

}
