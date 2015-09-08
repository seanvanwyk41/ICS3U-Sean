/*
 * Name: Quiz
 * Date: 12-06-2015 (DD-MM-YYYY)
 * Version: v1.1
 * Author: Sean van Wyk
 * Description: Program to run a quiz to test the user
 */
package edu.hdsb.gwss.sevw.ics3u.PerformanceTask;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;

/**
 *
 * @author Sean
 */
public class QuizSean extends javax.swing.JFrame {

    /**
     * Creates new form Quiz
     */
    //variables
    int questionTotal = 10;
    int score = 0;
    boolean answered = false;
    int questionNum = 0;

    //Initializing Objects
    File file = new File("performanceTaskQuestionList.xml");
    Builder builder = new Builder();
    Document doc = null;
    Element questions;

    //Create new array list for questions order
    List<Integer> questionList = new ArrayList();

    public QuizSean() {

        initComponents();

        //File Builder
        try {
            doc = builder.build(file);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Getting Elements of the file
        questions = doc.getRootElement();

        //populate question List 
        for (int i = 0; i < questions.getChildElements().size(); i++) {
            questionList.add(i);
        }

        //randomise questions list
        Collections.shuffle(questionList);

        //first button press
        this.buttonSubmitActionPerformed(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        multipleCoiceAnswers = new javax.swing.ButtonGroup();
        buttonA = new javax.swing.JRadioButton();
        buttonB = new javax.swing.JRadioButton();
        buttonC = new javax.swing.JRadioButton();
        buttonD = new javax.swing.JRadioButton();
        labelAOption = new javax.swing.JLabel();
        labelBOption = new javax.swing.JLabel();
        labelCOption = new javax.swing.JLabel();
        labelDOption = new javax.swing.JLabel();
        labelQuestion = new javax.swing.JLabel();
        lableQNumber = new javax.swing.JLabel();
        buttonSubmit = new javax.swing.JButton();
        labelScore = new javax.swing.JLabel();
        lableScoreNum = new javax.swing.JLabel();
        labelAskQuestion = new javax.swing.JLabel();
        labelResults = new javax.swing.JLabel();
        buttonEnd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 0));

        multipleCoiceAnswers.add(buttonA);
        buttonA.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        buttonA.setText("a.");

        multipleCoiceAnswers.add(buttonB);
        buttonB.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        buttonB.setText("b.");

        multipleCoiceAnswers.add(buttonC);
        buttonC.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        buttonC.setText("c.");

        multipleCoiceAnswers.add(buttonD);
        buttonD.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        buttonD.setText("d.");

        labelAOption.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        labelAOption.setText("Qa");

        labelBOption.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        labelBOption.setText("Qb");

        labelCOption.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        labelCOption.setText("Qc");

        labelDOption.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        labelDOption.setText("Qd");

        labelQuestion.setText("Question Number:");

        lableQNumber.setText("0");

        buttonSubmit.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        buttonSubmit.setText("Submit");
        buttonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubmitActionPerformed(evt);
            }
        });

        labelScore.setText("Score");

        lableScoreNum.setText("0");

        labelAskQuestion.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        labelAskQuestion.setText("Question Text");

        labelResults.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        labelResults.setText("result");

        buttonEnd.setText("End");
        buttonEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEndActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelResults, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelAskQuestion)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelDOption))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelCOption))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonA)
                                    .addComponent(buttonB))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelAOption)
                                    .addComponent(labelBOption)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelQuestion)
                                    .addComponent(labelScore, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lableScoreNum)
                                    .addComponent(lableQNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonEnd))
                            .addComponent(buttonSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(343, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonEnd)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelScore)
                            .addComponent(lableScoreNum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lableQNumber))
                        .addGap(18, 18, 18)))
                .addComponent(labelAskQuestion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonA)
                    .addComponent(labelAOption))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelBOption)
                    .addComponent(buttonB, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonC)
                    .addComponent(labelCOption))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonD)
                    .addComponent(labelDOption))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSubmit)
                .addGap(40, 40, 40)
                .addComponent(labelResults)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEndActionPerformed

        new QuizResultsSean(score).setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_buttonEndActionPerformed

    private void buttonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubmitActionPerformed
       //Create element location shortcuts
        Element questionLoc = questions.getChildElements().get((int) questionList.get(questionNum));
        Element choicesLoc = questionLoc.getFirstChildElement("choices");
        
        //get question and answer from file
        String answer = questionLoc.getFirstChildElement("Answer").getValue();
        String question = questionLoc.getFirstChildElement("Asks").getValue();
        
        //creating a list and shuffeling it
        List<String> questionOrderList = Arrays.asList("a","b","c","d");
        Collections.shuffle(questionOrderList);
        
        //creating a string for multiple choice answers
        String one = choicesLoc.getFirstChildElement(questionOrderList.get(0)).getValue();
        String two = choicesLoc.getFirstChildElement(questionOrderList.get(1)).getValue();
        String three = choicesLoc.getFirstChildElement(questionOrderList.get(2)).getValue();
        String four = choicesLoc.getFirstChildElement(questionOrderList.get(3)).getValue();
        String result;
        String chosen;
        
        //Get answered value
        if (answered) {
            buttonSubmit.setText("Next Question");
            if (buttonA.isSelected()) {
                chosen = questionOrderList.get(0);
            } else if (buttonB.isSelected()) {
                chosen = questionOrderList.get(1);
            } else if (buttonC.isSelected()) {
                chosen = questionOrderList.get(2);
            } else if (buttonD.isSelected()) {
                chosen = questionOrderList.get(3);
            } else {
                chosen = "wrong";
            }

            //if the answer is correct
            if (chosen.equals(answer)) {
                
                //is correct
                result = "Correct";
                score++;
                lableScoreNum.setText("" + score);
            } else {
                //is incorrect
                result = "Incorrect";
            }
            labelResults.setText("The Correct answer is:" + answer + "Your answer is " + result);
            questionNum++;
            answered = false;

        } else if (questionNum > 9) {
            
            //go to results
            new QuizResultsSean(score).setVisible(true);
            this.setVisible(false);
            this.dispose();
        } else {
            labelResults.setText("");
            
            //Set question Details
            multipleCoiceAnswers.clearSelection();
            labelAskQuestion.setText(question);
            lableQNumber.setText("" + (questionNum + 1));
            labelAOption.setText(one);
            labelBOption.setText(two);
            labelCOption.setText(three);
            labelDOption.setText(four);
            answered = true;

        }
    }//GEN-LAST:event_buttonSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(QuizSean.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizSean.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizSean.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizSean.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizSean().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton buttonA;
    private javax.swing.JRadioButton buttonB;
    private javax.swing.JRadioButton buttonC;
    private javax.swing.JRadioButton buttonD;
    private javax.swing.JButton buttonEnd;
    private javax.swing.JButton buttonSubmit;
    private javax.swing.JLabel labelAOption;
    private javax.swing.JLabel labelAskQuestion;
    private javax.swing.JLabel labelBOption;
    private javax.swing.JLabel labelCOption;
    private javax.swing.JLabel labelDOption;
    private javax.swing.JLabel labelQuestion;
    private javax.swing.JLabel labelResults;
    private javax.swing.JLabel labelScore;
    private javax.swing.JLabel lableQNumber;
    private javax.swing.JLabel lableScoreNum;
    private javax.swing.ButtonGroup multipleCoiceAnswers;
    // End of variables declaration//GEN-END:variables
}
