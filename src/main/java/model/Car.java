package model;

import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Car extends DefaultModel{

    private int numOfDoors;

}
