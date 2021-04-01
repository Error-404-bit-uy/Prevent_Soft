package com.bit.preventsoft.relations;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.bit.preventsoft.models.Apr;
import com.bit.preventsoft.models.User;

import java.util.List;

public class UsersWithDocs {


        @Embedded
        public User user;
        @Relation(
                parentColumn = "userId",
                entityColumn = "creatorId"
        )
        public List<Apr> documents;

    public UsersWithDocs() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Apr> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Apr> documents) {
        this.documents = documents;
    }
}
