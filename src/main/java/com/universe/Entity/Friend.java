package com.universe.Entity;

import javax.persistence.*;

/**
 * Created by boduill on 16.12.15.
 */
@Entity
@Table(name = "FRIENDS")
public class Friend {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "idGenerator")
    @TableGenerator(
            name="idGenerator",
            table="IDS",
            pkColumnName = "table_name",
            valueColumnName = "id_value",
            allocationSize=100
    )
    @Column(name = "FR_ID")
    private long id;

    @OneToOne()
    @JoinColumn(name = "ACC_ID")
    private Account accId;

    @OneToOne
    @JoinColumn(name = "ACC_ID")
    private Account friend;

    /** Allowable values : af(from account to friend),
     *                     fa(from friend to account)*/
    @Column(name = "INVITE")
    private String invite;

    /** Allowable values : wait(account or friend wait for apply),
     *                     friends(request applied)*/
    @Column(name = "STATUS")
    private String status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Account getAccId() {
        return accId;
    }

    public void setAccId(Account accId) {
        this.accId = accId;
    }

    public Account getFriend() {
        return friend;
    }

    public void setFriend(Account friend) {
        this.friend = friend;
    }

    public String getInvite() {
        return invite;
    }

    public void setInvite(String invite) {
        this.invite = invite;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
