package org.example.web.services;

import org.example.web.model.AppResData;
import org.springframework.stereotype.Service;

@Service
public class AppServiceImpl implements AppService {

    @Override
    public AppResData processRequest(Integer input) {
        boolean isThreeMultiple = isMultipleOf(input, 3);
        boolean isFiveMultiple = isMultipleOf(input, 5);
        if(isThreeMultiple && isFiveMultiple) {
            return new AppResData("GN");
        } else if (isThreeMultiple) {
            return new AppResData("G");
        } else if(isFiveMultiple) {
            return new AppResData("N");
        } else {
            return new AppResData(String.valueOf(input));
        }
    }

    private boolean isMultipleOf(Integer input, int num) {
        if(input%num==0)
            return true;
        return false;
    }
}
