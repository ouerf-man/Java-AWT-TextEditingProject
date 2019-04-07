import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FontFrame extends Frame{
	
	Panel pNorth = new Panel(new GridBagLayout());
	Panel pSouth = new Panel();
	Button bSubmit = new Button("confirm");
	List dropListFontName = new List(3,false) ;
	List dropListFontStyle= new List(3,false) ;
	List dropListFontSize= new List(5,false) ;
	Label lbFont ;
	public FontFrame(){
		dropListFontName.add("TimesRoman");dropListFontName.add("Helvetica");dropListFontName.add("Courier");
		dropListFontStyle.add("Plain");dropListFontStyle.add("Bold");dropListFontStyle.add("Italic");
		dropListFontSize.add("4");dropListFontSize.add("8");dropListFontSize.add("12");dropListFontSize.add("20");
		dropListFontSize.add("50");
		
		lbFont = new Label("Font : ");

		pNorth.add(lbFont);
		  pNorth.add(dropListFontName);
      		  pNorth.add(dropListFontStyle);
      		  pNorth.add(dropListFontSize);
   
		pSouth.add(bSubmit);
		this.add(pNorth);
		this.add(pSouth,BorderLayout.PAGE_END);
		this.setSize(600,200);
		this.setVisible(true);
		this.setResizable(false);
		bSubmit.addActionListener(new MyActionListenerForFont() );
	
		this.addWindowListener(new WindowAdapter() {
       
      		  public void windowClosing(WindowEvent e) {
            			 
               		 	dispose();
      		  }
		});
	}

}