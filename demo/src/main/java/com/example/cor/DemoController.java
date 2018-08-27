package com.example.cor;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class DemoController {

    @RequestMapping(path = "/rajesh", method = RequestMethod.POST)
    public ResponseEntity<String> getd(@RequestBody User user) {
        return new ResponseEntity<String>("rajesh", HttpStatus.OK);
    }
}
