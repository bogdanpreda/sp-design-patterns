import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONBuilder implements Builder{
	private String path;

	public JSONBuilder(String patToFile) {
		this.path = patToFile;
	}
	
	public void iterateChildren(JSONArray children, Sectiune sectiune) throws Exception {
		  Iterator<JSONObject> iterator = children.iterator();
		  Element el = null;
          while (iterator.hasNext()) {	
			  JSONObject childObj = iterator.next();
			  String classType = (String) childObj.get("class");
    	  
    		  switch(classType) {
    		  case "Section":
    			  Sectiune s = new Sectiune((String) childObj.get("title"));
        		  sectiune.add(s);
        		  if (childObj.get("children") != null) {
        			  iterateChildren((JSONArray) childObj.get("children"), sectiune);
        		  }
        		  break;
    		  case "Paragraph":
    			  el = new Paragraf((String) childObj.get("text"), null);
    			  break;
    		  case "Image":
    			  el = new Imagine((String) childObj.get("url"));
    			  break;
    		  case "ImageProxy":
    			  el = new ImageProxy((String) childObj.get("url"));
    			  break;
    		  }
    		  if(el != null) {
    			  sectiune.add(el);
    		  }
          }
    	}
	public Element buildPart() {
		Sectiune sect = null;
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader(this.path));
			JSONObject jsonObject = (JSONObject) obj;
			  String classType = (String) jsonObject.get("class");
			  if(classType.equals("Section")) {
		          sect = new Sectiune(jsonObject.get("title").toString());
		          if (jsonObject.get("children") != null) {
        			  iterateChildren((JSONArray) jsonObject.get("children"), sect);
        		  }
//		       return sect;
			  }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sect;
	}
}

