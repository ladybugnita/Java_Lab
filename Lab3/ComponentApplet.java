package Lab3;

import java.applet.Applet;
import java.awt.*;

/*
<applet code="ComponentApplet" width="500" height="500">
</applet>
*/

public class ComponentApplet extends Applet {
    private TextField nameField;
    private Button submitButton;
    private Label resultLabel;
    private Checkbox agreeCheckbox;

    @Override
    public void init() {
        // Set up layout and components
        setLayout(null);  // Absolute layout (no layout manager)

        // Create components
        nameField = new TextField();
        submitButton = new Button("Submit");
        resultLabel = new Label("Enter your name and click Submit");
        agreeCheckbox = new Checkbox("I agree to the terms");

        // Set bounds for components
        nameField.setBounds(50, 50, 200, 30);
        submitButton.setBounds(50, 100, 80, 30);
        resultLabel.setBounds(50, 150, 250, 30);
        agreeCheckbox.setBounds(50, 200, 200, 30);

        // Add components to applet
        add(nameField);
        add(submitButton);
        add(resultLabel);
        add(agreeCheckbox);

        // Set up button event handler
        submitButton.addActionListener(e -> {
            String name = nameField.getText();
            if (agreeCheckbox.getState()) {
                resultLabel.setText("Hello " + name + ", you agreed.");
            } else {
                resultLabel.setText("Hello " + name + ", you must agree.");
            }
        });
    }
}
