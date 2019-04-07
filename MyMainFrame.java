import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyMainFrame extends Frame{
	static boolean NEW_FILE; // true if we open a new file 
	static String OPENED_FILE_NAME;
	static Panel pSouth = new Panel();
	static TextArea ta = new TextArea("");
	static FindFrame findFrame ;
	static ReplaceFrame replaceFrame ;
	static ColorFrame colorFrame;
	static FontFrame fontFrame;
	MyMenuBar menu = new MyMenuBar();
	public MyMainFrame(){
			this.setMenuBar(menu);
			this.add(pSouth);
			pSouth.setBackground(Color.gray);
			pSouth.setSize(800,700);
			this.add(ta);
			ta.setVisible(false);
			pSouth.setBackground(Color.gray);
			this.setBounds(10,10,801,700);
			this.addWindowListener(new WindowAdapter(){
								public void windowClosing(WindowEvent e){
										System.exit(0);
								}
							});
			init(this);
			this.setVisible(true);
	}

	private void init (MyMainFrame mmf){
			menu.mNew.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					MyMainFrame.pSouth.setVisible(false);
					MyMainFrame.ta.setVisible(true);
					mmf.setSize(800,700);
					MyMainFrame.NEW_FILE=true;
				}
			});


			menu.mOpen.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					MyMainFrame.NEW_FILE = false;
					FileDialog fd = new FileDialog((Frame)MyMainFrame.pSouth.getParent());
					fd.setVisible(true);
					String nomFichier = fd.getFile();
					String repFichier = fd.getDirectory();
					String nomComplet= repFichier + nomFichier ;
					System.out.println("Nom Fichier : " + nomFichier );
					System.out.println("Répertoire de Fichier :" + repFichier ) ;
					System.out.println("Nom Complet : " + nomComplet);
					MyMainFrame.OPENED_FILE_NAME=nomComplet;
					try { 
						File file = new File(nomComplet);
						int size = (int) file.length();
						System.out.println("le taille du fichier est :" +size+" bytes");
	
						MyMainFrame.pSouth.setVisible(false);
						MyMainFrame.ta.setVisible(true);
						mmf.setSize(800,700);
	
					
						FileInputStream in = new FileInputStream(file); 
						byte data[] = new byte[size];
						in.read(data);
						String s = new String(data);
						MyMainFrame.ta.setText(s);
		
					}catch(FileNotFoundException e2){System.out.println(e2);}
						catch(IOException e3){System.out.println(e3);}
				}
			});	


			menu.mSave.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ea){
					if (MyMainFrame.NEW_FILE){
						FileDialog fileDialog = new FileDialog((Frame)MyMainFrame.pSouth.getParent(),"chose your file",FileDialog.SAVE);
						fileDialog.setVisible(true);
						File file = new File(fileDialog.getFile());
						try{
							FileOutputStream os = new FileOutputStream(file);
							os.write(MyMainFrame.ta.getText().getBytes());
							os.flush();
							os.close();
						}
						catch(FileNotFoundException e){}
						catch(SecurityException e1){}
						catch(IOException e2){}
		
						MyMainFrame.OPENED_FILE_NAME = fileDialog.getFile();
						MyMainFrame.NEW_FILE=false;
	
					}	
					else 	{
						 File file = new File(MyMainFrame.OPENED_FILE_NAME);

						try{
							FileOutputStream os = new FileOutputStream(file);
							os.write(MyMainFrame.ta.getText().getBytes());
							os.flush();
							os.close();
						}
						catch(FileNotFoundException e){}
						catch(SecurityException e1){}
						catch(IOException e2){}
	
					}
				}
			});	


			menu.mExit.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					System.exit(0);
				}
			});
		

			menu.mFind.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					 MyMainFrame.findFrame = new FindFrame();
				}
			});

			menu.mReplace.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					 MyMainFrame.replaceFrame = new ReplaceFrame();
				}
			});

			menu.mFont.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					 MyMainFrame.fontFrame = new FontFrame();
				}
			});

			menu.mColor.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					 MyMainFrame.colorFrame = new ColorFrame();
				}
			});
	
	}
}