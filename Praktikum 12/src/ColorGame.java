    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;

    public class ColorGame extends JFrame {
        private JPanel colorPanel;
        private JButton blackButton;
        private JButton whiteButton;
        private JButton redButton;
        private JButton greenButton;
        private JButton blueButton;
        private JLabel resultLabel;

        public ColorGame() {
            setTitle("Color Game");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(600, 250);
            setLayout(new BorderLayout());

            colorPanel = new JPanel();
            colorPanel.setBackground(generateRandomColor());
            add(colorPanel, BorderLayout.CENTER);

            blackButton = new JButton("BLACK");
            whiteButton = new JButton("WHITE");
            redButton = new JButton("RED");
            greenButton = new JButton("GREEN");
            blueButton = new JButton("BLUE");

            ActionListener buttonListener = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JButton clickedButton = (JButton) e.getSource();
                    String pickedColor = clickedButton.getText();
                    checkColor(pickedColor);
                }
            };

            blackButton.addActionListener(buttonListener);
            whiteButton.addActionListener(buttonListener);
            redButton.addActionListener(buttonListener);
            greenButton.addActionListener(buttonListener);
            blueButton.addActionListener(buttonListener);

            JPanel buttonPanel = new JPanel();
            buttonPanel.setLayout(new GridLayout(1, 5));
            buttonPanel.add(blackButton);
            buttonPanel.add(whiteButton);
            buttonPanel.add(redButton);
            buttonPanel.add(greenButton);
            buttonPanel.add(blueButton);
            add(buttonPanel, BorderLayout.SOUTH);

            resultLabel = new JLabel();
            resultLabel.setHorizontalAlignment(SwingConstants.CENTER);
            add(resultLabel, BorderLayout.NORTH);

            setVisible(true);
        }

        private Color generateRandomColor() {
            String[] colorOptions = {"black", "white", "red", "green", "blue"};
            String randomColor = colorOptions[(int) (Math.random() * colorOptions.length)];

            switch (randomColor) {
                case "black":
                    return Color.BLACK;
                case "white":
                    return Color.WHITE;
                case "red":
                    return Color.RED;
                case "green":
                    return Color.GREEN;
                case "blue":
                    return Color.BLUE;
                default:
                    return Color.BLACK;
            }
        }

        private void checkColor(String pickedColor) {
            Color backgroundColor = colorPanel.getBackground();
            Color pickedColorObj = convertToColor(pickedColor.toLowerCase());

            if (pickedColorObj != null) {
                if (pickedColorObj.equals(backgroundColor)) {
                    resultLabel.setText("Correct! You picked the right color.");
                    colorPanel.setBackground(generateRandomColor());
                } else {
                    resultLabel.setText("Wrong! Try again.");
                }
            } else {
                resultLabel.setText("Invalid color option. Please try again.");
            }
        }

        private Color convertToColor(String colorName) {
            switch (colorName) {
                case "black":
                    return Color.BLACK;
                case "white":
                    return Color.WHITE;
                case "red":
                    return Color.RED;
                case "green":
                    return Color.GREEN;
                case "blue":
                    return Color.BLUE;
                default:
                    return null;
            }
        }
    }
