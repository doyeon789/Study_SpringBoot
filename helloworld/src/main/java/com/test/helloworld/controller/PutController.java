package com.test.helloworld.controller;

import com.test.helloworld.dto.MemberDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/put-api")
public class PutController {

    // http://localhost:8080/api/v1/put-api/default
    @PutMapping("/default")
    public String putMethod(){
        return "Hello World";
    }

    // http://localhost:8080/api/v1/put-api/member
    @PutMapping("/memeber")
    public String postMember(@RequestBody Map<String, Object> putData){
        StringBuilder sb = new StringBuilder();

        putData.forEach((key, value) -> sb.append(key).append(" : ").append(value).append("\n"));

        return sb.toString();
    }

    // http://localhost:8080/api/v1/put-api/member1
    @PutMapping("/member1")
    public String postMemberDTO1(@RequestBody MemberDTO memberDTO){
        return memberDTO.toString();
    }

    // http://localhost:8080/api/v1/put-api/member2
    @PutMapping("/member2")
    public MemberDTO postMember2(@RequestBody MemberDTO memberDTO){
        return memberDTO;
    }

    // http://localhost:8080/api/v1/put-api/member3
    @PutMapping("/member3")
    public ResponseEntity<MemberDTO> postMember3(@RequestBody MemberDTO memberDTO){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(memberDTO);
    }

}
