/*
 * Name: Quiz
 * Date: 10-06-2015 (DD-MM-YYYY)
 * Version: v0.3
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
    int questionNum=10;
    int score = 1;
    
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

        //Loop for first 10 values in a randomized list
        for (int i = 0; i < questionNum; i++) {

            //create element location shortcuts
            Element questionLoc = questions.getChildElements().get(questionList.get(i));
            Element choicesLoc = questionLoc.getFirstChildElement("choices");

            //output Question Values
            System.out.println("Question " + (i + 1));
            System.out.println(questionLoc.getFirstChildElement("number").getValue());
            System.out.println(questionLoc.getFirstChildElement("Asks").getValue());
            System.out.println(questionLoc.getFirstChildElement("Answer").getValue());
            System.out.println("a. " + choicesLoc.getFirstChildElement("a").getValue());
            System.out.println("b. " + choicesLoc.getFirstChildElement("b").getValue());
            System.out.println("c. " + choicesLoc.getFirstChildElement("c").getValue());
            System.out.println("d. " + choicesLoc.getFirstChildElement("d").getValue());
            System.out.println("---------------------------------");

        }

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
        lableCompleted = new javax.swing.JLabel();
        lableScoreNum = new javax.swing.JLabel();
        labelCompletedNum = new javax.swing.JLabel();
        progressQuiz = new javax.swing.JProgressBar();
        labelAskQuestion = new javax.swing.JLabel();
        labelResults = new javax.swing.JLabel();
        labelProgressbar = new javax.swing.JLabel();
        buttonEnd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonA.setText("a.");

        buttonB.setText("b.");

        buttonC.setText("c.");

        buttonD.setText("d.");

        labelAOption.setText("Qa");

        labelBOption.setText("Qb");

        labelCOption.setText("Qc");

        labelDOption.setText("Qd");

        labelQuestion.setText("Question Number:");

        lableQNumber.setText("0");

        buttonSubmit.setText("Submit");

        labelScore.setText("Score");

        lableCompleted.setText("Questions completed");

        lableScoreNum.setText("0");

        labelCompletedNum.setText("0");
        labelCompletedNum.setToolTipText("");

        labelAskQuestion.setText("Question Text");

        labelResults.setText("result");

        labelProgressbar.setText("Progress");

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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(progressQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelScore, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95)
                                .addComponent(lableScoreNum))
                            .addComponent(labelAskQuestion)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelResults, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lableCompleted)
                                .addGap(18, 18, 18)
                                .addComponent(labelCompletedNum, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addComponent(labelBOption))))
                        .addGap(71, 71, 71)
                        .addComponent(labelQuestion)
                        .addGap(18, 18, 18)
                        .addComponent(lableQNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonEnd)
                        .addGap(25, 25, 25))))
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(labelProgressbar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lableQNumber)
                    .addComponent(buttonEnd))
                .addGap(5, 5, 5)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSubmit)
                    .addComponent(labelResults))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelScore)
                    .addComponent(lableScoreNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lableCompleted)
                    .addComponent(labelCompletedNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelProgressbar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(progressQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEndActionPerformed

        new QuizResultsSean(score).setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_buttonEndActionPerformed

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
    private javax.swing.JLabel labelCompletedNum;
    private javax.swing.JLabel labelDOption;
    private javax.swing.JLabel labelProgressbar;
    private javax.swing.JLabel labelQuestion;
    private javax.swing.JLabel labelResults;
    private javax.swing.JLabel labelScore;
    private javax.swing.JLabel lableCompleted;
    private javax.swing.JLabel lableQNumber;
    private javax.swing.JLabel lableScoreNum;
    private javax.swing.ButtonGroup multipleCoiceAnswers;
    private javax.swing.JProgressBar progressQuiz;
    // End of variables declaration//GEN-END:variables
}
