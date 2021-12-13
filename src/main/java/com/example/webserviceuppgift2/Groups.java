package com.example.webserviceuppgift2;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
public class Groups {
    String id;
    String groupName;
    String members;

    public Groups(String groupName, String members) {
        this.id = UUID.randomUUID().toString();
        this.groupName = groupName;
        this.members = members;
    }
}
