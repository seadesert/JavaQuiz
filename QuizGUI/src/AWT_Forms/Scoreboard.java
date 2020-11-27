package AWT_Forms;

import Class.QuizQuestion;
import Class.Quiz;
import java.awt.*;
import java.awt.Font.*;
import java.awt.event.*;


//Single word answer Form
public class Scoreboard extends Frame
{

    
    Scoreboard(Quiz q1)
    {

        //Display the form always on the center of the screen
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint();

        //Calculate the center
        int dx = centerPoint.x - 500 / 2;
        int dy = centerPoint.y - 400 / 2;
        setLocation(dx, dy);


        Label title = new Label("Score Board - " + q1.Quiz_Name);
        Label title1 = new Label("Score: "+ q1.score + "/" + q1.score_max);

        
        Button create = new Button("Close");
         
        title.setBounds(200, 50, 200, 20);
        title1.setBounds(220, 200, 100, 20);
        create.setBounds(200, 350, 100, 30);

        add(title);
        add(title1);
        add(create);

        MouseListener m1 = new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent me) 
            {
                dispose();
            }

            @Override
            public void mousePressed(MouseEvent me) {
              }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) 
            {
                
             }
            
        };
        create.addMouseListener(m1);
        
        //Defualt size for the quiz question is set to 500 x 400 px;
        setSize(500, 400);
        setLayout(null);
        setVisible(true);
        setResizable(false);

    }
    
//    //for testing purpose TODO: Remove main function
//    public static void main(String args[])
//    {
//        QuizQuestion q2 = new QuizQuestion();
//        Quiz q1 = new Quiz();
//        Scoreboard form = new Scoreboard(q1);
//    }



}