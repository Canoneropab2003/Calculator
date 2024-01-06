package pabscalcu;
import java.text.DecimalFormat;

public class MidtermPabs extends javax.swing.JFrame {
  private static final DecimalFormat df = new DecimalFormat("0.00");
  private boolean operatorTyped = false;
  private boolean decimalAdded = false; 
  private boolean operator = false;
    public MidtermPabs() {
        initComponents();
       
    CON.setVisible(false);
    }
   public void calcu(){
      String expression = text.getText();
    try {
        double result = evaluateExpression(expression);
        String formattedResult;

        if (result == (int) result) {
            formattedResult = String.format("%d", (int) result);
            decimalAdded = false;
        } else {
            formattedResult = String.format("%.2f", result);
            decimalAdded = true;
        }

        text.setText(formattedResult);
    } catch (Exception ex) {
       text.setText("");
    }
        operator = false;
  }
   
  private boolean isOperator(String input) {
    return "+-*/".contains(input);
  }
  
   public void BinaryToDeci() {
    String binaryValue = input.getText();
    try {
        if (binaryValue.contains(".")) {
            String[] parts = binaryValue.split("\\.");
            if (parts.length == 2) {
                int intPart = Integer.parseInt(parts[0], 2);
                double fractionalPart = 0.0;
                for (int i = 0; i < parts[1].length(); i++) {
                    char c = parts[1].charAt(i);
                    if (c == '1') {
                        fractionalPart += 1.0 / Math.pow(2, i + 1);
                    }
                }
                double decimalValue = intPart + fractionalPart;
                output.setText(Double.toString(decimalValue));
            } else {
                output.setText("Invalid Binary");
            }
        } else {
            int decimalValue = Integer.parseInt(binaryValue, 2);
            output.setText(Integer.toString(decimalValue));
        }
    } catch (NumberFormatException ex) {
        output.setText("Invalid Binary");
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CON = new javax.swing.JPanel();
        input = new javax.swing.JTextField();
        zero2 = new javax.swing.JButton();
        one2 = new javax.swing.JButton();
        delete2 = new javax.swing.JButton();
        clear2 = new javax.swing.JButton();
        equal2 = new javax.swing.JButton();
        calculator = new javax.swing.JButton();
        binary = new javax.swing.JLabel();
        decimal = new javax.swing.JLabel();
        output = new javax.swing.JLabel();
        equal4 = new javax.swing.JButton();
        calcu = new javax.swing.JPanel();
        text = new javax.swing.JTextField();
        zero = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        four = new javax.swing.JButton();
        one = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        five = new javax.swing.JButton();
        two = new javax.swing.JButton();
        point = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        six = new javax.swing.JButton();
        three = new javax.swing.JButton();
        times = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        converter = new javax.swing.JButton();
        equal1 = new javax.swing.JButton();
        equal3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(345, 520));
        setResizable(false);

        CON.setBackground(new java.awt.Color(0, 51, 51));
        CON.setPreferredSize(new java.awt.Dimension(345, 520));
        CON.setLayout(null);

        input.setBackground(new java.awt.Color(0, 153, 153));
        input.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        input.setForeground(new java.awt.Color(255, 255, 255));
        input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputMouseClicked(evt);
            }
        });
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });
        CON.add(input);
        input.setBounds(10, 30, 310, 50);

        zero2.setBackground(new java.awt.Color(0, 51, 51));
        zero2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        zero2.setForeground(new java.awt.Color(255, 255, 255));
        zero2.setText("0");
        zero2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        zero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zero2ActionPerformed(evt);
            }
        });
        CON.add(zero2);
        zero2.setBounds(130, 170, 110, 90);

        one2.setBackground(new java.awt.Color(0, 51, 51));
        one2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        one2.setForeground(new java.awt.Color(255, 255, 255));
        one2.setText("1");
        one2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        one2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                one2ActionPerformed(evt);
            }
        });
        CON.add(one2);
        one2.setBounds(10, 170, 110, 90);

        delete2.setBackground(new java.awt.Color(51, 51, 51));
        delete2.setForeground(new java.awt.Color(255, 255, 255));
        delete2.setText("DLT");
        delete2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete2ActionPerformed(evt);
            }
        });
        CON.add(delete2);
        delete2.setBounds(250, 170, 70, 90);

        clear2.setBackground(new java.awt.Color(51, 51, 51));
        clear2.setForeground(new java.awt.Color(255, 255, 255));
        clear2.setText("CLR");
        clear2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear2ActionPerformed(evt);
            }
        });
        CON.add(clear2);
        clear2.setBounds(250, 270, 70, 130);

        equal2.setBackground(new java.awt.Color(0, 51, 51));
        equal2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        equal2.setForeground(new java.awt.Color(255, 255, 255));
        equal2.setText(".");
        equal2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        equal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equal2ActionPerformed(evt);
            }
        });
        CON.add(equal2);
        equal2.setBounds(130, 270, 110, 60);

        calculator.setBackground(new java.awt.Color(51, 51, 51));
        calculator.setForeground(new java.awt.Color(255, 255, 255));
        calculator.setText("CALCULATOR");
        calculator.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        calculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorActionPerformed(evt);
            }
        });
        CON.add(calculator);
        calculator.setBounds(10, 340, 230, 60);

        binary.setBackground(new java.awt.Color(255, 255, 255));
        binary.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        binary.setForeground(new java.awt.Color(255, 255, 255));
        binary.setText("Binary");
        CON.add(binary);
        binary.setBounds(10, 10, 70, 20);

        decimal.setBackground(new java.awt.Color(255, 255, 255));
        decimal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        decimal.setForeground(new java.awt.Color(255, 255, 255));
        decimal.setText("Decimal");
        CON.add(decimal);
        decimal.setBounds(10, 90, 60, 20);

        output.setBackground(new java.awt.Color(0, 51, 51));
        output.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        output.setForeground(new java.awt.Color(255, 255, 255));
        CON.add(output);
        output.setBounds(10, 110, 310, 50);

        equal4.setBackground(new java.awt.Color(0, 51, 51));
        equal4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        equal4.setForeground(new java.awt.Color(255, 255, 255));
        equal4.setText("=");
        equal4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        equal4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equal4ActionPerformed(evt);
            }
        });
        CON.add(equal4);
        equal4.setBounds(10, 270, 110, 60);

        calcu.setBackground(new java.awt.Color(0, 51, 51));
        calcu.setPreferredSize(new java.awt.Dimension(345, 520));
        calcu.setLayout(null);

        text.setBackground(new java.awt.Color(0, 153, 153));
        text.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        text.setForeground(new java.awt.Color(255, 255, 255));
        text.setCaretColor(new java.awt.Color(0, 0, 0));
        text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textActionPerformed(evt);
            }
        });
        calcu.add(text);
        text.setBounds(10, 30, 310, 70);

        zero.setBackground(new java.awt.Color(0, 51, 51));
        zero.setForeground(new java.awt.Color(255, 255, 255));
        zero.setText("0");
        zero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });
        calcu.add(zero);
        zero.setBounds(10, 350, 70, 50);

        plus.setBackground(new java.awt.Color(0, 102, 102));
        plus.setForeground(new java.awt.Color(255, 255, 255));
        plus.setText("+");
        plus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });
        calcu.add(plus);
        plus.setBounds(10, 410, 70, 50);

        seven.setBackground(new java.awt.Color(0, 51, 51));
        seven.setForeground(new java.awt.Color(255, 255, 255));
        seven.setText("7");
        seven.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });
        calcu.add(seven);
        seven.setBounds(10, 170, 70, 50);

        four.setBackground(new java.awt.Color(0, 51, 51));
        four.setForeground(new java.awt.Color(255, 255, 255));
        four.setText("4");
        four.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });
        calcu.add(four);
        four.setBounds(10, 230, 70, 50);

        one.setBackground(new java.awt.Color(0, 51, 51));
        one.setForeground(new java.awt.Color(255, 255, 255));
        one.setText("1");
        one.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });
        calcu.add(one);
        one.setBounds(10, 290, 70, 50);

        minus.setBackground(new java.awt.Color(0, 102, 102));
        minus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        minus.setForeground(new java.awt.Color(255, 255, 255));
        minus.setText("-");
        minus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });
        calcu.add(minus);
        minus.setBounds(90, 410, 70, 50);

        eight.setBackground(new java.awt.Color(0, 51, 51));
        eight.setForeground(new java.awt.Color(255, 255, 255));
        eight.setText("8");
        eight.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });
        calcu.add(eight);
        eight.setBounds(90, 170, 70, 50);

        five.setBackground(new java.awt.Color(0, 51, 51));
        five.setForeground(new java.awt.Color(255, 255, 255));
        five.setText("5");
        five.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });
        calcu.add(five);
        five.setBounds(90, 230, 70, 50);

        two.setBackground(new java.awt.Color(0, 51, 51));
        two.setForeground(new java.awt.Color(255, 255, 255));
        two.setText("2");
        two.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });
        calcu.add(two);
        two.setBounds(90, 290, 70, 50);

        point.setBackground(new java.awt.Color(0, 51, 51));
        point.setForeground(new java.awt.Color(255, 255, 255));
        point.setText(".");
        point.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointActionPerformed(evt);
            }
        });
        calcu.add(point);
        point.setBounds(90, 350, 70, 50);

        divide.setBackground(new java.awt.Color(0, 102, 102));
        divide.setForeground(new java.awt.Color(255, 255, 255));
        divide.setText("/");
        divide.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });
        calcu.add(divide);
        divide.setBounds(170, 410, 70, 50);

        nine.setBackground(new java.awt.Color(0, 51, 51));
        nine.setForeground(new java.awt.Color(255, 255, 255));
        nine.setText("9");
        nine.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });
        calcu.add(nine);
        nine.setBounds(170, 170, 70, 50);

        six.setBackground(new java.awt.Color(0, 51, 51));
        six.setForeground(new java.awt.Color(255, 255, 255));
        six.setText("6");
        six.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });
        calcu.add(six);
        six.setBounds(170, 230, 70, 50);

        three.setBackground(new java.awt.Color(0, 51, 51));
        three.setForeground(new java.awt.Color(255, 255, 255));
        three.setText("3");
        three.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });
        calcu.add(three);
        three.setBounds(170, 290, 70, 50);

        times.setBackground(new java.awt.Color(0, 102, 102));
        times.setForeground(new java.awt.Color(255, 255, 255));
        times.setText("X");
        times.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        times.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timesActionPerformed(evt);
            }
        });
        calcu.add(times);
        times.setBounds(250, 410, 70, 50);

        delete.setBackground(new java.awt.Color(51, 51, 51));
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("DLT");
        delete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        calcu.add(delete);
        delete.setBounds(130, 110, 110, 50);

        clear.setBackground(new java.awt.Color(51, 51, 51));
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("CLR");
        clear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        calcu.add(clear);
        clear.setBounds(10, 110, 110, 50);

        converter.setBackground(new java.awt.Color(51, 51, 51));
        converter.setForeground(new java.awt.Color(255, 255, 255));
        converter.setText("CONVERTER");
        converter.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        converter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                converterActionPerformed(evt);
            }
        });
        calcu.add(converter);
        converter.setBounds(170, 350, 150, 50);

        equal1.setBackground(new java.awt.Color(0, 102, 102));
        equal1.setForeground(new java.awt.Color(255, 255, 255));
        equal1.setText("=");
        equal1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        equal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equal1ActionPerformed(evt);
            }
        });
        calcu.add(equal1);
        equal1.setBounds(250, 110, 70, 140);

        equal3.setBackground(new java.awt.Color(0, 102, 102));
        equal3.setForeground(new java.awt.Color(255, 255, 255));
        equal3.setText("+/-");
        equal3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        equal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equal3ActionPerformed(evt);
            }
        });
        calcu.add(equal3);
        equal3.setBounds(250, 260, 70, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(calcu, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(CON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(calcu, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(CON, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textActionPerformed

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputActionPerformed

    private void converterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_converterActionPerformed
    calcu.setVisible(false);
    CON.setVisible(true);
    input.setText("");
    output.setText("");
    decimalAdded = false;
    }//GEN-LAST:event_converterActionPerformed

    private void calculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatorActionPerformed
    calcu.setVisible(true);
    CON.setVisible(false);
    text.setText("");
    decimalAdded = false;
    }//GEN-LAST:event_calculatorActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
     text.setText(text.getText() + "8");
     operator = false;  
    }//GEN-LAST:event_eightActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        text.setText(text.getText() + "0");
         operator = false;
    }//GEN-LAST:event_zeroActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        text.setText(text.getText() + "1");
        operator = false;    
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
     text.setText(text.getText() + "2");
     operator = false;  
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
    text.setText(text.getText() + "3");
    operator = false;  
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
    text.setText(text.getText() + "4");
    operator = false;  
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
     text.setText(text.getText() + "5");
     operator = false;  
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
    text.setText(text.getText() + "6");
    operator = false;  
    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
      text.setText(text.getText() + "7");
      operator = false;  
    }//GEN-LAST:event_sevenActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
       text.setText(text.getText() + "9");
       operator = false;  
    }//GEN-LAST:event_nineActionPerformed

    private void pointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointActionPerformed
          if (!decimalAdded) {
            text.setText(text.getText() + ".");
            decimalAdded = true;
         }
    }//GEN-LAST:event_pointActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int length = text.getText().length();
        int num = text.getText().length()-1;
        String store;
        if (length >0){
            StringBuilder back = new StringBuilder (text.getText());
            back.deleteCharAt(num);
            store = back.toString();
            text.setText(store);
        }
         decimalAdded = false;
         operator = false;
    }//GEN-LAST:event_deleteActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        text.setText("");
        decimalAdded = false;
        operator = false;
    }//GEN-LAST:event_clearActionPerformed

    private void one2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_one2ActionPerformed
     input.setText(input.getText() + "1");
    }//GEN-LAST:event_one2ActionPerformed

    private void zero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zero2ActionPerformed
     input.setText(input.getText() + "0");
    }//GEN-LAST:event_zero2ActionPerformed

    private void delete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete2ActionPerformed
        int length = input.getText().length();
        int num = input.getText().length()-1;

        String store;

        if (length >0){
            StringBuilder back = new StringBuilder (input.getText());
            back.deleteCharAt(num);
            store = back.toString();
            input.setText(store);
        }
        decimalAdded = false;
    }//GEN-LAST:event_delete2ActionPerformed

    private void clear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear2ActionPerformed
        input.setText("");
        output.setText("");
        decimalAdded = false;
    }//GEN-LAST:event_clear2ActionPerformed

    private void equal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equal2ActionPerformed
      if (! input.getText().contains(".")){
        input.setText(input.getText()+equal2.getText());
      }
    }//GEN-LAST:event_equal2ActionPerformed

    private void inputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputMouseClicked
        output.setText("");
    }//GEN-LAST:event_inputMouseClicked

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
    if (!operator) {
        text.setText(text.getText() + "+");
        operator = true;
    }
        decimalAdded = false;
    }//GEN-LAST:event_plusActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
    if (!operator) {
        text.setText(text.getText() + "-");
        operator = true;
    }
        decimalAdded = false;
    }//GEN-LAST:event_minusActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
     if (!operator) {
        if(text.getText().equals("")){
           operator = false; 
        }else{
        text.setText(text.getText() + "/");
        operator = true;
        }
    }
        decimalAdded = false;
        
    }//GEN-LAST:event_divideActionPerformed

    private void timesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timesActionPerformed
     if (!operator) {
        if(text.getText().equals("")){
           operator = false; 
        }else{
        text.setText(text.getText() + "*");
        operator = true;
        }
    }
        decimalAdded = false;
   ;
    }//GEN-LAST:event_timesActionPerformed

    private void equal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equal1ActionPerformed
         calcu();
    }//GEN-LAST:event_equal1ActionPerformed

    private void equal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equal3ActionPerformed
    try {
    String input = text.getText();
        int lastIndex = -1;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                lastIndex = i;
            }
        }
        if (lastIndex != -1) {
            String beforeOperator = input.substring(0, lastIndex + 1);
            String afterOperator = input.substring(lastIndex + 1);
            if (afterOperator.contains(".")) {
                double number = Double.parseDouble(afterOperator);
                number = -number;
                afterOperator = String.valueOf(number);
            } else {
                int number = Integer.parseInt(afterOperator);
                number = -number;
                afterOperator = String.valueOf(number);
            }
            String updatedInput = beforeOperator + afterOperator;
            text.setText(updatedInput.replaceAll("--", ""));
        } else { 
            if (input.startsWith("-")) { 
                text.setText(input.substring(1));
            } else { 
                text.setText("-" + input);
            }
        }
    } catch (NumberFormatException ex) { // Handle NumberFormatException
    }
    }//GEN-LAST:event_equal3ActionPerformed

    private void equal4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equal4ActionPerformed
       BinaryToDeci();
       decimalAdded = false;
    }//GEN-LAST:event_equal4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MidtermPabs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MidtermPabs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MidtermPabs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MidtermPabs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MidtermPabs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CON;
    private javax.swing.JLabel binary;
    private javax.swing.JPanel calcu;
    private javax.swing.JButton calculator;
    private javax.swing.JButton clear;
    private javax.swing.JButton clear2;
    private javax.swing.JButton converter;
    private javax.swing.JLabel decimal;
    private javax.swing.JButton delete;
    private javax.swing.JButton delete2;
    private javax.swing.JButton divide;
    private javax.swing.JButton eight;
    private javax.swing.JButton equal1;
    private javax.swing.JButton equal2;
    private javax.swing.JButton equal3;
    private javax.swing.JButton equal4;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JTextField input;
    private javax.swing.JButton minus;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton one2;
    private javax.swing.JLabel output;
    private javax.swing.JButton plus;
    private javax.swing.JButton point;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JTextField text;
    private javax.swing.JButton three;
    private javax.swing.JButton times;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    private javax.swing.JButton zero2;
    // End of variables declaration//GEN-END:variables
 private static double evaluateExpression(String expression) {
        try {
            return new Object() {
                int pos = -1, ch;

                void nextChar() {
                    ch = (++pos < expression.length()) ? expression.charAt(pos) : -1;
                }

                boolean eat(int charToEat) {
                    while (Character.isWhitespace(ch)) nextChar();
                    if (ch == charToEat) {
                        nextChar();
                        return true;
                    }
                    return false;
                }

                double parse() {
                    nextChar();
                    double x = parseExpression();
                    if (pos < expression.length()) throw new RuntimeException("Unexpected: " + (char) ch);
                    return x;
                }

                double parseExpression() {
                    double x = parseTerm();
                    for (; ; ) {
                        if (eat('+')) x += parseTerm(); // addition
                        else if (eat('-')) x -= parseTerm(); // subtraction
                        else return x;
                    }
                }

                double parseTerm() {
                    double x = parseFactor();
                    for (; ; ) {
                        if (eat('*')) x *= parseFactor(); // multiplication
                        else if (eat('/')) x /= parseFactor(); // division
                        else return x;
                    }
                }

                double parseFactor() {
                    if (eat('+')) return parseFactor(); // unary plus
                    if (eat('-')) return -parseFactor(); // unary minus

                    double x;
                    int startPos = this.pos;
                    if (eat('(')) { // parentheses
                        x = parseExpression();
                        eat(')');
                    } else if (Character.isDigit(ch) || ch == '.') { // numbers
                        while (Character.isDigit(ch) || ch == '.') nextChar();
                        x = Double.parseDouble(expression.substring(startPos, this.pos));
                    } else {
                        throw new RuntimeException("Unexpected: " + (char) ch);
                    }

                    return x;
                }
            }.parse();
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid expression: " + expression);
        }
    }
}
