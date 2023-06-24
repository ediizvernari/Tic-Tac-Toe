import javax.swing.*;
import java.awt.*;


public class GameFrame extends JFrame {

    MyButton[] button = new MyButton[9];
    private boolean xturn = true;
    private boolean xwin = false, owin = false;

    public class MyButton extends JButton {

        public MyButton(String s) {
            super();
        }

        public void pressaction() {
            if (xturn) {
                this.setText("X");
                this.setEnabled(false);
                xturn = false;
            } else {
                this.setText("O");
                this.setEnabled(false);
                xturn = true;
            }
            verify();
        }
    }

    public GameFrame() {
        this.setSize(800, 600);
        this.setTitle("Tic Tac Toe");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(3, 3));
        for (int i = 0; i < 9; i++) {
            button[i] = new MyButton(String.valueOf(i + 1));
            int finalI = i;
            button[i].addActionListener(e -> button[finalI].pressaction());
            this.add(button[i]);
        }
        this.setVisible(true);
    }

    public void verify() {
        if (this.button[0].getText().equals("X") && this.button[1].getText().equals("X") &&
                this.button[2].getText().equals("X")) {
            System.out.println("X won");
            for (int i = 0; i < 9; i++) {
                this.button[i].setEnabled(false);
            }
        }

        if (this.button[3].getText().equals("X") && this.button[4].getText().equals("X") &&
                this.button[5].getText().equals("X")) {
            System.out.println("X won");
            for (int i = 0; i < 9; i++) {
                this.button[i].setEnabled(false);
            }
        }

        if (this.button[6].getText().equals("X") && this.button[7].getText().equals("X") &&
                this.button[8].getText().equals("X")) {
            System.out.println("X won");
            for (int i = 0; i < 9; i++) {
                this.button[i].setEnabled(false);
            }
        }

        if (this.button[1].getText().equals("X") && this.button[4].getText().equals("X") &&
                this.button[7].getText().equals("X")) {
            System.out.println("X won");
            for (int i = 0; i < 9; i++) {
                this.button[i].setEnabled(false);
            }
        }

        if (this.button[0].getText().equals("X") && this.button[3].getText().equals("X") &&
                this.button[6].getText().equals("X")) {
            System.out.println("X won");
            for (int i = 0; i < 9; i++) {
                this.button[i].setEnabled(false);
            }
        }

        if (this.button[2].getText().equals("X") && this.button[5].getText().equals("X") &&
                this.button[8].getText().equals("X")) {
            System.out.println("X won");
            for (int i = 0; i < 9; i++) {
                this.button[i].setEnabled(false);
            }
        }

        if (this.button[0].getText().equals("X") && this.button[4].getText().equals("X") &&
                this.button[8].getText().equals("X")) {
            System.out.println("X won");
            for (int i = 0; i < 9; i++) {
                this.button[i].setEnabled(false);
            }
        }

        if (this.button[2].getText().equals("X") && this.button[4].getText().equals("X") &&
                this.button[6].getText().equals("X")) {
            System.out.println("X won");
            for (int i = 0; i < 9; i++) {
                this.button[i].setEnabled(false);
            }
        }


        if (this.button[0].getText().equals("O") && this.button[1].getText().equals("O") &&
                this.button[2].getText().equals("O")) {
            System.out.println("O won");
            for (int i = 0; i < 9; i++) {
                this.button[i].setEnabled(false);
            }
        }

        if (this.button[3].getText().equals("O") && this.button[4].getText().equals("O") &&
                this.button[5].getText().equals("O")) {
            System.out.println("O won");
            for (int i = 0; i < 9; i++) {
                this.button[i].setEnabled(false);
            }
        }

        if (this.button[6].getText().equals("O") && this.button[7].getText().equals("O") &&
                this.button[8].getText().equals("O")) {
            System.out.println("O won");
            for (int i = 0; i < 9; i++) {
                this.button[i].setEnabled(false);
            }
        }

        if (this.button[1].getText().equals("O") && this.button[4].getText().equals("O") &&
                this.button[7].getText().equals("O")) {
            System.out.println("O won");
            for (int i = 0; i < 9; i++) {
                this.button[i].setEnabled(false);
            }
        }

        if (this.button[0].getText().equals("O") && this.button[3].getText().equals("O") &&
                this.button[6].getText().equals("O")) {
            System.out.println("O won");
            for (int i = 0; i < 9; i++) {
                this.button[i].setEnabled(false);
            }
        }

        if (this.button[2].getText().equals("O") && this.button[5].getText().equals("O") &&
                this.button[8].getText().equals("O")) {
            System.out.println("O won");
            for (int i = 0; i < 9; i++) {
                this.button[i].setEnabled(false);
            }
        }

        if (this.button[0].getText().equals("O") && this.button[4].getText().equals("O") &&
                this.button[8].getText().equals("O")) {
            System.out.println("O won");
            for (int i = 0; i < 9; i++) {
                this.button[i].setEnabled(false);
            }
        }

        if (this.button[2].getText().equals("O") && this.button[4].getText().equals("O") &&
                this.button[6].getText().equals("O")) {
            System.out.println("O won");
            for (int i = 0; i < 9; i++) {
                this.button[i].setEnabled(false);
            }
        }
    }
}


