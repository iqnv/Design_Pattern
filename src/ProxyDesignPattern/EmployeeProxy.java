package ProxyDesignPattern;

public class EmployeeProxy implements EmployeeDao{
    EmployeeDaoImpl employeeDao;
    String user;
    public EmployeeProxy(String user) {
        this.user = user;
        employeeDao = new EmployeeDaoImpl();
    }
    @Override
    public void create() {
        if (user.equals("Admin")) {
            employeeDao.create();
        }
        else {
            System.out.println("Access Denied");
        }
    }

    @Override
    public void delete() {
        if (user.equals("Admin")) {
            employeeDao.delete();
        }
    }

    @Override
    public void get() {
        if (user.equals("Admin")) {
            employeeDao.get();
        }
    }
}
