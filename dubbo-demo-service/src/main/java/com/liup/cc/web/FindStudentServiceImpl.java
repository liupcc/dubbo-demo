package com.liup.cc.web;

import org.springframework.stereotype.Service;

import com.liup.cc.request.StudentReq;
import com.liup.cc.response.StudentResp;

@Service
public class FindStudentServiceImpl implements FindStudentService
{
    
    public StudentResp findStudents(StudentReq studentReq)
    {
        StudentResp st = new StudentResp();
        st.setStatus(1);
        st.setMsg("111");
        System.out.println("111");
        return st;
    }
    
}
