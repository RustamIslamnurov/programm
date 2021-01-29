package com.rustam.programm;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class  UsersController {

    //first develop commit

    @GetMapping()
    public String getUsers() {
        return "HTTP GET reqest was sent ";
    }
    @PostMapping()
    public String createUsers() {
        return "HTTP POST reqest was sent ";
    }
    @DeleteMapping()
    public String deleteUsers() {
        return "HTTP DELETE reqest was sent ";
    }
    @PutMapping()
    public String putUsers() {
        return "HTTP PUT reqest was sent ";
    }

}
