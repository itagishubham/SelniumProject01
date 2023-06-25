package javaPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

public class ConnectoMongo {
	
	
	
	
	
	MongoClient mongclient ; 
	
	
	public static void main(String[] args) {
	new ConnectoMongo().connectTomongo();
	}
	//connection to mongo
	public void connectTomongo()
	{
		mongclient = MongoClients.create("mongodb://localhost:27017");
		
		//connecting to database
		MongoDatabase database = mongclient.getDatabase("MyFirstDataBase");
		MongoIterable<String> listOfDb = mongclient.listDatabaseNames();
		for(String st : listOfDb) {
			System.out.println(st);
			
		}
		
		
		//database.createCollection("customer_ArrayInsetion");
		MongoCollection getCollection = database.getCollection("customer_ArrayInsetion");
//		Document doc = new Document();
//		Map<String , String> data = new HashMap<String , String>();
//		data.put("House", "Belagavi");
//		data.put("City", "Belagum");
//		data.put("State", "Karanataka");
//		data.put("currentLocation ", "Bangalore" );
//		
//		
//		
//		List<String> skills = new ArrayList<String>();
//		skills.add("manual");
//		skills.add("perforamnce");
//		
//		doc.put("BioData", data);
//		doc.put("Name", "Shubam");
//		doc.put("skills2", skills);
//		//new String[] {"mannualTesting ","Automation testing ","Perforamnce Testing ","API automation"}
//		doc.put("Skills", "Prof");
//		
//		getCollection.insertOne(doc);
		
		Document doc1 = new Document("Name","Shubham").append("age", "24").append("Salary", "talisLAtha");
		Document doc2= new Document("Name","Raju").append("age","32").append("Address", "ShaitanGalli");
		List<Document> docList= new ArrayList<Document>();
		
		docList.add(doc1);
		docList.add(doc2);
	//	docList.add(doc);
		getCollection.insertMany(docList);
		
		
		
		
		
		
		
		
		
	}

}
