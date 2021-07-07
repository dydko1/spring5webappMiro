package guru.springframework.oneToMany.repository;

import guru.springframework.oneToMany.model.Employee;

import java.util.List;

/**
 * Created by gkatzioura on 6/3/16.
 */
public interface EmployeeRepositoryCustom {

    List<Employee> getFirstNamesLikeAndBonusBigger(String firstName, Double bonusAmount);

}