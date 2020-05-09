package com.liup.cc.web;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.liup.cc.request.StudentReq;
import com.liup.cc.response.StudentResp;

@Path("student")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_HTML,
    MediaType.TEXT_PLAIN, MediaType.TEXT_XML})
@Produces({
    MediaType.APPLICATION_JSON + "; " + MediaType.CHARSET_PARAMETER + "=UTF-8",
    MediaType.TEXT_XML + "; " + MediaType.CHARSET_PARAMETER + "=UTF-8"})
public interface FindStudentService
{
    @POST
    @Path("findStudent")
    StudentResp findStudents(StudentReq studentReq);
}
