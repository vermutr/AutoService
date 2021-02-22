package executeWork.stuff;


import lombok.*;
import model.DefaultModel;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee extends DefaultModel {
    private String name;
    private String surname;
    private Profession profession;
    private EmployeeStatus employeeStatus;
}
