package entity;

import entity.Employee;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-02-15T21:30:16")
@StaticMetamodel(Dept.class)
public class Dept_ { 

    public static volatile SingularAttribute<Dept, String> deptName;
    public static volatile SingularAttribute<Dept, Integer> deptId;
    public static volatile CollectionAttribute<Dept, Employee> employeeCollection;

}