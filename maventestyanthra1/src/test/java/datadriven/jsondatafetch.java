package datadriven;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.mysql.cj.xdevapi.JsonParser;

public class jsondatafetch {
	public static void main(String[] args) throws IOException, ParseException {
		
		//step1 convert the json file in to the json object
		FileReader fr=new FileReader("./commondata.json");
		
		//step2 convert json object in to java object
		JSONParser jp=new JSONParser();
		Object jobj = jp.parse(fr);
		
		//step3 use Hashmap to read the data
		HashMap hp=(HashMap)jobj;
		String value = (String) hp.get("url");
		System.out.println(value);
		
	}

}
