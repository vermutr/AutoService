package service.action.impl;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import service.action.Action;
import lombok.Data;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
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
