package executeWork.stuff;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
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
