import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JButton;



public class FirstApplet extends Applet
{
	AudioClip clip=null;
	public FirstApplet()
	{
		JButton btn=new JButton("change color");
		btn.setBounds(50,50,100,20);
		add(btn);
		btn.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent arg0)
			{
				setBackground(Color.blue);
			}
							});
	}
	public void init()
	{
	
	URL url;
	try {
		AppletContext context=getAppletContext();
		url = new URL(getCodeBase()+ "/songname.wav");
		clip=context.getAudioClip(url);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public void start()
	{
		clip.play();
	}
	public void stop()
	{
		clip.stop();
	}
	public void destroy()
	{
		clip=null;
	}
}