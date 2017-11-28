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
	JSONObject jsonObject = new JSONObject();
	Map<String, Object> jsonMap = new HashMap<String, Object>();
	public List<Sectiune> sectiune;
	
	public JSONBuilder(String patToFile) {
		this.path = patToFile;
		
		this.parseJson();
	}
	
	public void iterateChildren(JSONArray children, Sectiune sectiune) throws Exception {
		  Iterator<JSONObject> iterator = children.iterator();
		  Element el = null;
          while (iterator.hasNext()) {	
			  JSONObject childObj = iterator.next();
			  String classType = (String) childObj.get("class");
        	  if (classType.equals("Section")) {
        		  Sectiune s = new Sectiune((String) childObj.get("title"));
        		  sectiune.add(s);
        		  if (childObj.get("children") != null) {
        			  iterateChildren((JSONArray) childObj.get("children"), sectiune);
        		  }
        	  } else {
        		  switch(classType) {
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
    	}
	
	public void parseJson() {
		JSONParser parser = new JSONParser();
		JSONArray children;
		JSONArray children2;
		Sectiune sectiune;
		int depth = 0;
		try {
			Object obj = parser.parse(new FileReader(this.path));
			jsonObject = (JSONObject) obj;
			  String classType = (String) jsonObject.get("class");
			  if(depth == 0 && classType.equals("Section")) {
//				  String titlu = (String) jsonObject.get("title");
//		          System.out.println("\n\nTitlu: " + titlu);
		          
		          Carte carte = new Carte(jsonObject.get("title").toString());
		          children = (JSONArray) jsonObject.get("children");
		          Iterator<JSONObject> iterator = children.iterator();
		          while (iterator.hasNext()) {	
					  JSONObject childObj = iterator.next();
					  
//		        	  System.out.println(childObj.get("class"));
//		        	  System.out.println(childObj.get("title"));
//		        	  
		        	  if (childObj.get("class").equals("Section")) {
				          Sectiune s = new Sectiune((String) childObj.get("title"));
				          
				          if (childObj.get("children") != null) {
		        			  iterateChildren((JSONArray) childObj.get("children"), s);
		        		  }
				          
				          carte.addCapitol(s);
		        	  }
			  }
		         
		      carte.print();
//	          System.out.println(children);
	          
//	          Iterator<JSONObject> iterator1 = children.iterator();
//	          while (iterator1.hasNext()) {	
//				  JSONObject childObj = iterator1.next();
//				  
//	        	  System.out.println(childObj.get("class"));
//	        	  System.out.println(childObj.get("title"));
//	        	  
//	        	  children2 = (JSONArray) childObj.get("children");
//	        	  if(children2 != null) {
//	        		  Iterator<JSONObject> iterator2 = children2.iterator();
//	        		  while(iterator2.hasNext()) {
//	        			  JSONObject childObj2 = iterator2.next();
//		        		  
//		        		  String childObj2Class = (String)childObj2.get("class");
//		        		  if(childObj2Class.equals("Paragraph")) {
//		        			  System.out.println(childObj2.get("text"));
//		        		  } else if(childObj2Class.equals("ImageProxy")) {
//		        			  System.out.println("image: " + childObj2.get("url"));
//		        		  }
//		        		  System.out.println();
//	        		  }
//	        		  
//	        	  }
//	        	
//	          }
			  }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void buildPart() {
		// TODO Auto-generated method stub
		
	}
}

