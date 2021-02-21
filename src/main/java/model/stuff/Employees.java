package model.stuff;


import lombok.*;
import model.DefaultModel;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employees extends DefaultModel {
    private String name;
    private String surname;
    private Profession profession;
    private EmployeesStatus employeesStatus;
}
