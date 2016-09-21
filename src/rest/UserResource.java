package rest;

import java.sql.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import dao.UserDAO;
import dto.User;

@Path("/user")
public class UserResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayPlainTextHello() {
        return "Hello World User Resource!";
    }

    //create
    @GET
    @Path("/createuser")
    @Produces(MediaType.TEXT_PLAIN)
    @SuppressWarnings("static-access")
    public boolean save(@QueryParam("id") String id,
            @QueryParam("username") String username,
            @QueryParam("password") String password,
            @QueryParam("email") String email) throws Exception {
        Date date = new Date(0);
        User newuser = new User(id, username, password, email, date, date);
        return new UserDAO().createUser(newuser);
    }

//read

    @SuppressWarnings("static-access")
    @GET
    @Path("/readuser")
    @Produces({ MediaType.APPLICATION_JSON })
    public User getUserById(@QueryParam("id") String id) throws Exception {
        return new UserDAO().getUser(id);
    }

//update

//    @SuppressWarnings("static-access")
//    @GET
//    @Path("/createuser")
//    @Produces({ MediaType.APPLICATION_JSON })
//    public User getUserById(@QueryParam("id") String id,
//            @QueryParam("password") String password) throws Exception {
//        return new UserDAO().verifyUser(id, password);
//    }
//
////destroy
//
////verify
//    @SuppressWarnings("static-access")
//    @GET
//    @Path("/update")
//    @Consumes({ "text/plain" })
//    public boolean update(@QueryParam("id") String username,
//            @QueryParam("password") String password,
//            @QueryParam("email") String email, @QueryParam("phone") String phone)
//            throws Exception {
//        Appuser updateUser = new Appuser(username, password, phone, email);
//        return new UserDAO().updateUser(updateUser);
//    }
//
//    @SuppressWarnings("static-access")
//    @GET
//    @Path("/updateDate")
//    @Consumes({ "text/plain" })
//    public boolean update(@QueryParam("id") String username,
//            @QueryParam("email") String email) throws Exception {
//
//        return new UserDAO().updateUserDate(username, email);
//    }
//
//    @SuppressWarnings("static-access")
//    @GET
//    @Path("/checkEmail")
//    @Produces({ MediaType.APPLICATION_JSON })
//    public Appuser check(@QueryParam("email") String email) throws Exception {
//        return new UserDAO().checkEmail(email);
//    }
//
//    @SuppressWarnings("static-access")
//    @GET
//    @Path("/deleteuser")
//    @Consumes({ "text/plain" })
//    public boolean delete(@QueryParam("id") String username) throws Exception {
//        return new UserDAO().delete(username);
//    }
}
