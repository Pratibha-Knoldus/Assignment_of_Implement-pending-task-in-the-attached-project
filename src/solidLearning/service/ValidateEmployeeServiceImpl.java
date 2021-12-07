package solidLearning.service;


import solidLearning.entity.Employee;

public class ValidateEmployeeServiceImpl implements ValidateEmployeeService{
    @Override
    public boolean validateEmployee(Employee e) {
        if(e.getId() <=0){
            return false;
        }
        if(e.getName() == null || e.getName().isEmpty()){
            return false;
        }
        return true;
    }
}
