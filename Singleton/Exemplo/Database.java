
public final class Database {
	
	private static Database DBinstance = null;
	
	private Database() {}

	public static Database getInstance() {    //Cria o objeto caso ele ainda não tenha sido criado
			if(DBinstance == null){
			DBinstance = new Database();
		} 	
	return DBinstance;  // Retona o objeto do Singleton
	}
	
	public void getConnection() {
		System.out.println("You are now connected to the database.");
 }
}

