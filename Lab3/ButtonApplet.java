package Lab3;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
<applet code="ButtonApplet" width="500" height="500">
</applet>
*/
public class ButtonApplet extends Applet {
    private String message = "Press a button to change color";

    @Override
    public void init() {
        // Set the background color of the applet
        setBackground(Color.WHITE);

        // Create buttons
        Button redButton = new Button("Red");
        Button blueButton = new Button("Blue");

        // Set the button's size and position (optional, for better appearance)
        redButton.setBounds(50, 50, 60, 30);
        blueButton.setBounds(150, 50, 60, 30);

        // Add buttons to the applet
        add(redButton);
        add(blueButton);

        Choice choice = new Choice();
        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");
        choice.setBounds(50, 100, 200, 30);
        add(choice);

        CheckboxGroup group = new CheckboxGroup();
        Checkbox radioButton1 = new Checkbox("Option 1", group, false);
        radioButton1.setBounds(50, 180, 100, 30);
        Checkbox radioButton2 = new Checkbox("Option 2", group, false);
        radioButton2.setBounds(150, 180, 100, 30);
        add(radioButton1);
        add(radioButton2);

        Canvas canvas = new Canvas();
        canvas.setBounds(50, 200, 200, 200);
        canvas.setBackground(Color.GRAY);
        add(canvas);

//        FileDialog fileDialog = new FileDialog((Frame)null, "Choose a File");
//        fileDialog.setVisible(true);


        // Button event listeners
        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Change message and background color to red
                message = "Background is now Red!";
                setBackground(Color.RED);
                repaint();  // Trigger the paint method to update the display
            }
        });

        blueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Change message and background color to blue
                message = "Background is now Blue!";
                setBackground(Color.BLUE);
                repaint();  // Trigger the paint method to update the display
            }
        });

        // Set layout to null for absolute positioning of components
        setLayout(null);
    }

    @Override
    public void paint(Graphics g) {
        // Draw the message in the center of the applet
        g.setColor(Color.BLACK);
        g.drawString(message, 50, 150);
    }
}