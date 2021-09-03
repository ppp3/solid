

public class IoC
{

  public static void main(String[] args)
  {
    
    User user=new User(new MySqlDatabase());
    user.add("MySQL");
    
    user=new User(new OraclelDatabase());
    user.add("Oracle");
    
  }

}

public class User
{
  Database database;
  
  public User(Database database)
  {
    this.database=database;  
  }
  
  public void add(String data)
  {
    database.persist(data);
  }
}

public class MySqlDatabase implements Database
{
    void persist(String data)
    {
     System.out.println("MySql has persisted: "+data); 
    }
}


public class OracleDatabase implements Database
{
    void persist(String data)
    {
     System.out.println("MySql has persisted: "+data); 
    }
}

public interface Database
{
  void persist(String);
}
