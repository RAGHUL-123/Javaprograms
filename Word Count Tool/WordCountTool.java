import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WordCountTool extends JFrame {
    private JTextArea textArea;
    private JLabel wordLabel, charLabel;
    private JButton clearButton;

    public WordCountTool() {
        setTitle("Word & Character Counter");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                updateCounts();
            }
        });
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 3));

        wordLabel = new JLabel("Words: 0");
        charLabel = new JLabel("Characters: 0");
        clearButton = new JButton("Clear");

        clearButton.addActionListener(e -> {
            textArea.setText("");
            updateCounts();
        });

        panel.add(wordLabel);
        panel.add(charLabel);
        panel.add(clearButton);
        add(panel, BorderLayout.SOUTH);
    }

    private void updateCounts() {
        String text = textArea.getText().trim();
        int wordCount = text.isEmpty() ? 0 : text.split("\\s+").length;
        int charCount = text.length();
        wordLabel.setText("Words: " + wordCount);
        charLabel.setText("Characters: " + charCount);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            WordCountTool frame = new WordCountTool();
            frame.setVisible(true);
        });
    }
}
