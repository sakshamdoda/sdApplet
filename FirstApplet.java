import java.applet.Applet;
import java.applet.AppletContext;
import java.applet.AudioClip;
import java.net.MalformedURLException;
import java.net.URL;



public class FirstApplet extends Applet
{
	AudioClip clip=null;
	
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