package epam.task.datalex.academi.dao;


public class DAOFabric {

    public static IDAO getInstance(){
        return new DAOxml();
    }
}
