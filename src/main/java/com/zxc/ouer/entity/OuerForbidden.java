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
    private String wxId;
    private String phone;
    private Byte handleTag;
    private Byte deleteTag;

    public OuerForbidden(String robotName, String friendName, String wxId, String phone) {
        this.robotName = robotName;
        this.friendName = friendName;
        this.wxId = wxId;
        this.phone = phone;
    }

}
