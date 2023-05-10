package start_First_Program;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class HospitalDAO {
	
	private MongoClient mongoClient;
	private MongoDatabase database;
	private MongoCollection<Document> collection;

	public HospitalDAO() {
		mongoClient = new MongoClient("localhost", 27017);
		database = mongoClient.getDatabase("Hospital");
		collection = database.getCollection("HospitalDetails");
	}
	
	

	public void insertDocument(Document doc) {
		
		collection.insertOne(doc);
	}
	
	public boolean getDetails(String emailid)
	{
		System.err.println(collection.count());
		Document filterDoc=new Document();
		filterDoc.put("emailid", emailid);
		FindIterable<Document> iter = collection.find(filterDoc); 
		
		System.out.println(iter.first());
		
//		findDocumentById(emailid);
//		
//		FindIterable<Document> result=collection.find(getDetails);
//		Document user=result.first();
//		System.out.println(user);
//		
//		MongoCursor<Document> cursor = collection.find(getDetails).iterator();
//		
//		if(cursor.hasNext())
//		{
//			Document doc=cursor.next();
//			String pass=doc.getString("password");
//			return true;
//		}
	return false;
	}

//	public DBObject findDocumentById(String mail) {
//
//		
//	    BasicDBObject query = new BasicDBObject();
//	    query.put("emailid", mail);
//	    DBObject dbObj = (DBObject) collection.find(query).first();
//	    return dbObj;
//	}
}
