package glud.auth.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/test1")
    @PreAuthorize("hasRole('Admin_client_role')")
    public String helloAdminTest(){
        // Redirección en caso de logeo exitoso. Solo construyo la autenticación
        return "Hello Admin";
    }

    @GetMapping("/test2")
    @PreAuthorize("hasRole('User_client_role') or hasRole('Admin_client_role')")
    public String helloUserTest(){
        // Redirección en caso de logeo exitoso. Solo construyo la autenticación
        return "Hello User";
    }
}
