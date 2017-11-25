import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.json.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class DocumentStatVisitor implements Visitor{

	private int imageCounter = 0;
	private int paragrafCounter = 0;
	private int tabelCounter = 0;
	private int sectiuneCounter = 0;
	
	public void visitImageProxy(Imagine img) {
		
	}

	public void visitImage(Imagine img) {
		this.imageCounter++;
		
	}

	public void visitParagraf(Paragraf paragraf) {
		this.paragrafCounter++;
	}

	public void visitTabel(Tabel tabel) {
		this.tabelCounter++;
	}

	public void visitSectiune(Sectiune sectiune) {
		this.sectiuneCounter++;
	}

	public int getImageCounter() {
		return imageCounter;
	}

	public int getParagrafCounter() {
		return paragrafCounter;
	}

	public int getTabelCounter() {
		return tabelCounter;
	}

	public int getSectiuneCounter() {
		return sectiuneCounter;
	}
	
	private void writeStringToFile(String file, String msg) {
		BufferedWriter writer = null;
		try
		{
		    writer = new BufferedWriter( new FileWriter(file));
		    writer.write(msg);

		}
		catch ( IOException e)
		{
		}
		finally
		{
		    try
		    {
		        if ( writer != null)
		        writer.close( );
		    }
		    catch ( IOException e)
		    {
		    }
		}
	}
	
	public void printStatistica() {
		JSONObject counters = new JSONObject();
		
		counters.put("visitImageProxy", this.getImageCounter());
		counters.put("visitImage", this.getImageCounter());
		counters.put("visitParagraf", this.getParagrafCounter());
		counters.put("visitTabel", this.getTabelCounter());
		counters.put("visitSectiune", this.getSectiuneCounter());
		
		JSONObject jsonOutput = new JSONObject();
		jsonOutput.put("conters", counters);
		
		System.out.println(jsonOutput.toString());
		
		this.writeStringToFile("output.json", jsonOutput.toString());
		
	}

	public void visitImageProxy(ImageProxy img) {
		// TODO Auto-generated method stub
		
	}
}
