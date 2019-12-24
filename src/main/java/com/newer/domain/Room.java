package com.newer.domain;

import java.io.Serializable;

/**
 * @author shining
 */
public class Room implements Serializable{

    private Integer roomId;   //房间号码
    private String roomType;  //房间类型
    private Integer price;    //房间单价
    private String roomState; //房间状态

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getRoomState() {
        return roomState;
    }

    public void setRoomState(String roomState) {
        this.roomState = roomState;
    }
}
