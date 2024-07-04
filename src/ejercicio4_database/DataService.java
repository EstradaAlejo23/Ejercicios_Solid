package ejercicio4_database;

public class DataService{

    private DataStorage dataBase = new DataBase();

    public void saveDataBase(String data){
        dataBase.save(data);
    }
}
