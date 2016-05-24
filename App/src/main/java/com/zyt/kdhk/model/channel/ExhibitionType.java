package com.zyt.kdhk.model.channel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;;

/**
 * @author vector.huang
 * @date 2016/5/24
 */
@Entity
@Table(name = "DDHK_ExhibitionType", schema = "dbo", catalog = "KoudaiDBV19")
public class ExhibitionType {
    private int bigint;
    private int BitFlag;
    private int OrderId;
    private String Name;
    @Id
    @GeneratedValue
    public int getBigint() {
        return bigint;
    }

    public void setBigint(int bigint) {
        this.bigint = bigint;
    }
    public int getBitFlag() {
        return BitFlag;
    }

    public void setBitFlag(int BitFlag) {
        this.BitFlag = BitFlag;
    }
    public int getOrderId() {
        return OrderId;
    }

    public void setOrderId(int OrderId) {
        this.OrderId = OrderId;
    }
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
}