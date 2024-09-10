package patterns.creational.Singleton.SharedResource;
//Db is a database object
public class Db {
    private static Db db;
    private static int counter=1;

    // Synchronized method to ensure thread safety

    public static synchronized  Db  getInstance(){
        if(db==null){
            System.out.println("Database Object created for "+counter+++" time");
            db=new Db();
            return db;
        }
        return db;
    }

    public void executeQuery(String query){
        System.out.println("Executing query : "+query);
    }
}
