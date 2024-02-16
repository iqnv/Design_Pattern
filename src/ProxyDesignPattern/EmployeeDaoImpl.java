package ProxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create() {
        System.out.println("Employee has been crated");
    }

    @Override
    public void delete() {
        System.out.println("Employee is deleted");
    }

    @Override
    public void get() {
       System.out.println("Employee has been returned");
    }
}
