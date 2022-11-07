package org.example.web.services;

import org.example.web.model.AppResData;
import org.springframework.stereotype.Service;

public interface AppService {
    AppResData processRequest(final Integer input);
}
