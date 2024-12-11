package pack1;

import java.awt.* ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Start extends JFrame implements ActionListener{
	
	JLabel qno,question;
	JRadioButton opt1,opt2,opt3,opt4;
	JButton nxt,lifeline,sbmt;
	String[][] useranswers=new String[10][1];
	String questions[][]= new String [10][5];
	String answers[][]=new String[10][2];
	ButtonGroup goption;
	public static int timer=15;
	public static int ans_given=0;
	public static int count=0;
	public static int score=0;
	
	String name;
	
	Start(String name){
		this.name=name;
		setBounds(200,0,950,700);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		qno=new JLabel();
		qno.setBounds(100,100,50,30);
		qno.setFont(new Font ("Tahoma",Font.PLAIN,24));
		add(qno);
		
		question=new JLabel();
		question.setBounds(150,100,900,30);
		question.setFont(new Font ("Tahoma",Font.PLAIN,24));
		add(question);
		
		questions[0][0] = " What is the size of the int data type in Java?";
        questions[0][1] = "16 bits ";
        questions[0][2] = "32 bits";
        questions[0][3] = "64 bits";
        questions[0][4] = "Platform-dependent";

        questions[1][0] = "Which of the following is not a Java keyword?";
        questions[1][1] = "Static";
        questions[1][2] = "Try";
        questions[1][3] = "String";
        questions[1][4] = "Void";

        questions[2][0] = "What is the default value of a local variable?";
        questions[2][1] = "null";
        questions[2][2] = "0";
        questions[2][3] = "Depends on data type";
        questions[2][4] = "None";

        questions[3][0] = "Which of the following is not a principle of Object-Oriented";
        questions[3][1] = "Encapsulation";
        questions[3][2] = "Abstraction";
        questions[3][3] = "Inheritance ";
        questions[3][4] = "Compilation";

        questions[4][0] = " What does the super keyword do?";
        questions[4][1] = "Refers to the immediate superclass object";
        questions[4][2] = "Refers to the current class object";
        questions[4][3] = "Is used to call a static method";
        questions[4][4] = "Is used to call the final method";

        questions[5][0] = "Which of the following is true about interfaces in Java?";
        questions[5][1] = "Interfaces can have constructors";
        questions[5][2] = "An interface can implement another interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Interfaces cannot be extended";

        questions[6][0] = "Which of the following is not a checked exception in Java?";
        questions[6][1] = "IOException";
        questions[6][2] = "SQLException";
        questions[6][3] = "ArithmeticException";
        questions[6][4] = "fileNotFoundException";

        questions[7][0] = "What is the purpose of the finally block in exception handling?";
        questions[7][1] = "To handle exceptions";
        questions[7][2] = "To execute code regardless of whether an exception occurs";
        questions[7][3] = "To catch checked exceptions only";
        questions[7][4] = "To terminate the program";

        questions[8][0] = "Which of the following classes implements the List interface?";
        questions[8][1] = "HashMap";
        questions[8][2] = "TreeSet";
        questions[8][3] = "LinkedList";
        questions[8][4] = "PriorityQueue";

        questions[9][0] = "What is the difference between HashMap and HashTable?";
        questions[9][1] = "HashMap is thread-safe, while HashTable is not";
        questions[9][2] = "HashTable is thread-safe, while HashMap is not";
        questions[9][3] = "Both are thread-safe";
        questions[9][4] = "None of the above";	
        
        answers[0][1] = "32 bits";
        answers[1][1] = "String";
        answers[2][1] = "None";
        answers[3][1] = "Compilation";
        answers[4][1] = "Refers to the immediate superclass object";
        answers[5][1] = "An interface can extend another interface";
        answers[6][1] = "ArithmeticException";
        answers[7][1] = "To execute code regardless of whether an exception occurs";
        answers[8][1] = "LinkedList";
        answers[9][1] = "HashTable is thread-safe, while HashMap is not";
		
        opt1=new JRadioButton();
        opt1.setBounds(100,170,500,30);
        opt1.setBackground(Color.DARK_GRAY);
        opt1.setForeground(Color.WHITE);
        opt1.setFont(new Font("Serif",Font.PLAIN,20));
        add(opt1);
        
        opt2=new JRadioButton();
        opt2.setBounds(100,210,500,30);
        opt2.setBackground(Color.DARK_GRAY);
        opt2.setForeground(Color.WHITE);
        opt2.setFont(new Font("Serif",Font.PLAIN,20));
        add(opt2);
        
        opt3=new JRadioButton();
        opt3.setBounds(100,250,500,30);
        opt3.setBackground(Color.DARK_GRAY);
        opt3.setForeground(Color.WHITE);
        opt3.setFont(new Font("Serif",Font.PLAIN,20));
        add(opt3);
        
        opt4=new JRadioButton();
        opt4.setBounds(100,290,500,30);
        opt4.setBackground(Color.DARK_GRAY);
        opt4.setForeground(Color.WHITE);
        opt4.setFont(new Font("Serif",Font.PLAIN,20));
        add(opt4);
        
       goption=new ButtonGroup();
       goption.add(opt1);
       goption.add(opt2);
       goption.add(opt3);
       goption.add(opt4);
        

       nxt=new  JButton("Next");
       nxt.setBounds(200,350,150,40);
       nxt.setBackground(Color.DARK_GRAY);
       nxt.setForeground(Color.WHITE);
       nxt.setFont(new Font("Tahhoma",Font.PLAIN,25));
       nxt.addActionListener(this);
       add(nxt);
       
       lifeline=new  JButton("Lifeline");
       lifeline.setBounds(400,350,150,40);
       lifeline.setBackground(Color.DARK_GRAY);
       lifeline.setForeground(Color.WHITE);
       lifeline.setFont(new Font("Tahhoma",Font.PLAIN,25));
       lifeline.addActionListener(this);
       add(lifeline);
       
       sbmt=new  JButton("Submit");
       sbmt.setBounds(600,350,150,40);
       sbmt.setBackground(Color.DARK_GRAY);
       sbmt.setForeground(Color.WHITE);
       sbmt.setFont(new Font("Tahhoma",Font.PLAIN,25));
       sbmt.setEnabled(false);
       sbmt.addActionListener(this);
       add(sbmt);
       
       
       start(count);
       
       
        setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	         
		if(e.getSource()==nxt) {
		repaint();
		
		opt1.setEnabled(true);
    	opt2.setEnabled(true);
    	opt3.setEnabled(true);
    	opt4.setEnabled(true);
		
		ans_given=1;
		if(goption.getSelection()==null) {
    		useranswers[count][0]="";
    	}
    	else {
    		useranswers[count][0]=goption.getSelection().getActionCommand();
    	}
		
		if(count==8) {
			nxt.setEnabled(false);
			sbmt.setEnabled(true);
		}
		
		count++;
		start(count);
		}
		else if(e.getSource()==lifeline) {
			if(count==2 || count==4 || count==6 || count==8 || count==9)
			{
				opt2.setEnabled(false);
				opt3.setEnabled(false);
			}
			else {
				opt1.setEnabled(false);
				opt4.setEnabled(false);
			}
			lifeline.setEnabled(false);
			
		}
		else if(e.getSource()==sbmt){
			ans_given=1;
			if(goption.getSelection()==null) {
	    		useranswers[count][0]="";
	    	}
	    	else {
	    		useranswers[count][0]=goption.getSelection().getActionCommand();
	    	}
    		
    		for(int i=0; i<useranswers.length;i++) {
    			if(useranswers[i][0].equals(answers[i][1])) {
    				score+=10;
    			}
    			else {
    				score+=0;
    			}
    			
    		}
    		setVisible(false);
    		new Score(name,score);
    	}
	}
	

	public void paint(Graphics g) {
		super.paint(g);
		String time="Time left "+timer+" seconds";
	    g.setColor(Color.RED);
	    g.setFont(new Font("Tahoma",Font.BOLD,22));
	    
	    
	    if(timer>0) {
	    	g.drawString(time, 690, 550);
	    	
	    }
	    else {
	    	g.drawString("Times up!!", 690, 550);
	    }
	    timer--;
	    try {
	    	Thread.sleep(1000);
	    	repaint();
	    }
	    catch(Exception e) {
	    	e.printStackTrace();
	    }
	    
	    if(ans_given==1) {
	    	ans_given=0;
	    	timer=15;
	    }
	    else if(timer<0) {
	    	timer=15;
	    	opt1.setEnabled(true);
	    	opt2.setEnabled(true);
	    	opt3.setEnabled(true);
	    	opt4.setEnabled(true);
	    	
	    	if(count==8) {
				nxt.setEnabled(false);
				sbmt.setEnabled(true);
			}
	    	
	    	if(count==9) {//Submit button
	    		
	    		if(goption.getSelection()==null) {
		    		useranswers[count][0]="";
		    	}
		    	else {
		    		useranswers[count][0]=goption.getSelection().getActionCommand();
		    	}
	    		
	    		for(int i=0; i<useranswers.length;i++) {
	    			if(useranswers[i][0].equals(answers[i][1])) {
	    				score+=10;
	    			}
	    			else {
	    				score+=0;
	    			}
	    			
	    		}
	    		setVisible(false);
	    		new Score(name,score);
	    	}
	    	else { //nxt button
	    	
	    	if(goption.getSelection()==null) {
	    		useranswers[count][0]="";
	    	}
	    	else {
	    		useranswers[count][0]=goption.getSelection().getActionCommand();
	    	}
	    	count++;
	    	start(count);
	    }
	    }
	}
	
	
	public void  start(int count) {
		qno.setText(""+(count + 1)+". ");
		question.setText(questions[count][0]);
		opt1.setText(questions[count][1]);
		opt1.setActionCommand(questions[count][0]);
		
		opt2.setText(questions[count][2]);
		opt2.setActionCommand(questions[count][2]);
		
		opt3.setText(questions[count][3]);
		opt3.setActionCommand(questions[count][3]);
		
		opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);
        
        goption.clearSelection();
	}
	
public static void main(String[] args) {
	new Start("User");
}


}

