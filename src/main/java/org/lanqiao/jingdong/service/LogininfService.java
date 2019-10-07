package org.lanqiao.jingdong.service;

import org.lanqiao.jingdong.entity.LoginInf;


import javax.servlet.http.HttpServletResponse;


public interface LogininfService {
    public boolean checkuser(LoginInf loginInf, HttpServletResponse response);
}
