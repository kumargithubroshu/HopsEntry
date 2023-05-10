package start_First_Program;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class CustomerDAO {

	private MongoClient mongoClient;
	private MongoDatabase database;
	private MongoCollection<Document> collection;

	public CustomerDAO() {
		mongoClient = new MongoClient("localhost", 27017);
		database = mongoClient.getDatabase("Customer");
		collection = database.getCollection("CustomerDetails");
	}

	public void insertDocument(Document doc) {
		collection.insertOne(doc);
	}

	public List<Document> getAllDocuments() {

		FindIterable<Document> find = collection.find();

		List<Document> student = new ArrayList<>();

		for (Document d : find) {

			student.add(d);

		}

		return student;
	}
	
	public void deleteCustome(int id)
	{
		Document deleteQDocument=new Document("id",id);
		collection.deleteOne(deleteQDocument);
	}
	
	public void updateCustomer(int id, String name,String email, int age)
	{
		
		
		Document updateDocument=new Document("id", id);
		Document updateDocument2=new Document("$set",new Document("fname",name).append("email",email).append("age",age));
		collection.updateOne(updateDocument, updateDocument2);
	}
	
	public Document getid(int id)
	{
		Document getId=new Document("id",id);
		FindIterable<Document> result=collection.find(getId);
		Document user = result.first();
		return user;
		
	}
	

//	public Document findDocument(String key, String value)
//	{
//		return collection.find(new Document(key, value)).first();
//	}

}
