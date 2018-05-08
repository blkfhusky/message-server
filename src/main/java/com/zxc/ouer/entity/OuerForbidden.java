package com.zxc.ouer.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author ganglun
 * @date 2018/5/8
 */
@Data
@NoArgsConstructor
public class OuerForbidden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String robotName;
    private String friendName;
    private String wechatId;
    private String phone;
    private Integer handleTag;
    private Integer deleteTag;

    public OuerForbidden(String robotName, String friendName, String wechatId, String phone) {
        this.robotName = robotName;
        this.friendName = friendName;
        this.wechatId = wechatId;
        this.phone = phone;
    }

}
