package controller.di_ex;

public class Employee implements EmployeeI {
    private Integer id;
    private String name;
    private Department department;

    public Employee() {
    }

    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }


    public void setDepartment(Department department) {
        this.department = department;
    }
    @Override
    public String info(){
        return "사원번호:"+id+" 사원명:"+name
                +" 부서명:"+department.getName()+" 부서위치:"+department.getLocation();
    }
}
