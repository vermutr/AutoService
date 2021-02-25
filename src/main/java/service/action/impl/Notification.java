package service.action.impl;

import service.action.Action;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notification implements Action {

    private String message;

    @Override
    public void doSomething() {
        System.out.println(message);
    }

    @Override
    public String toString() {
        return  message;
    }
}
