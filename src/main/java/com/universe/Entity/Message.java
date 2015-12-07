package com.universe.Entity;

import javax.persistence.*;

/**
 * Created by boduill on 30.11.15.
 */
@Entity
@Table(name = "messages")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "idGenerator")
    @TableGenerator(
            name="idGenerator",
            table="IDS",
            pkColumnName = "table_name",
            valueColumnName = "id_value",
            allocationSize=100
    )
    @Column(name = "MESS_ID")
    private long messageId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "FROM_USER")
    private Account fromUser;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "TO_USER")
    private Account toUser;

    @Column(name = "TEXT_MESSAGE", nullable = false)
    private String textMessage;

    public long getMessageId() {
        return messageId;
    }

    public void setMessageId(long messageId) {
        this.messageId = messageId;
    }

    public Account getFromUser() {
        return fromUser;
    }

    public void setFromUser(Account fromUser) {
        this.fromUser = fromUser;
    }

    public Account getToUser() {
        return toUser;
    }

    public void setToUser(Account toUser) {
        this.toUser = toUser;
    }

    public String getTextMessage() {
        return textMessage;
    }

    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }
}
