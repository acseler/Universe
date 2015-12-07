package com.universe.Entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by boduill on 01.12.15.
 */
@Entity
@Table(name = "FRIENDS")
public class Friends {

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "USER_ID")
    private long userId;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "USER_ID")
    private List<Account> friendsIds;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public List<Account> getFriendsIds() {
        return friendsIds;
    }

    public void setFriendsIds(List<Account> friendsIds) {
        this.friendsIds = friendsIds;
    }
}
