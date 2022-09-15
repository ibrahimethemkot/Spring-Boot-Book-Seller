package com.sha.springbootbookseller.service;

import com.sha.springbootbookseller.model.User;

public interface IAuthenticationService {

    public User signInAndReturnJWT(User signInRequest);

}
