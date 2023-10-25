//Principio de Inversion de dp
public interface Base {

    public void insert(String statement);
    public void select(String statement);
    public void delete(String statement);
    public void update(String statement);
}