package model;


import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Employees extends DefaultModel{
    private String name;
    private String surname;
    private Profession profession;
    private EmployeesStatus employeesStatus;
}
