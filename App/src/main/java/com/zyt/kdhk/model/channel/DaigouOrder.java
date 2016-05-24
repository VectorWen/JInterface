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
@Table(name = "DDHK_DaigouOrder", schema = "dbo", catalog = "KoudaiDBV19")
public class DaigouOrder {
    private int bigint;
    private String Finished;
    private String Products;
    private String Modified;
    private String Address;
    private String BuyerRefundTime;
    private long DgUserId;
    private String DeliverTime;
    private String OrderNo;
    private String Created;
    private String SellerRefundTime;
    private float TotalPrice;
    private int StatusId;
    private String ReceiveTime;
    private long BuyUserId;
    private int Likes;
    private String PayTime;
    private String Notes;
    @Id
    @GeneratedValue
    public int getBigint() {
        return bigint;
    }

    public void setBigint(int bigint) {
        this.bigint = bigint;
    }
    public String getFinished() {
        return Finished;
    }

    public void setFinished(String Finished) {
        this.Finished = Finished;
    }
    public String getProducts() {
        return Products;
    }

    public void setProducts(String Products) {
        this.Products = Products;
    }
    public String getModified() {
        return Modified;
    }

    public void setModified(String Modified) {
        this.Modified = Modified;
    }
    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    public String getBuyerRefundTime() {
        return BuyerRefundTime;
    }

    public void setBuyerRefundTime(String BuyerRefundTime) {
        this.BuyerRefundTime = BuyerRefundTime;
    }
    public long getDgUserId() {
        return DgUserId;
    }

    public void setDgUserId(long DgUserId) {
        this.DgUserId = DgUserId;
    }
    public String getDeliverTime() {
        return DeliverTime;
    }

    public void setDeliverTime(String DeliverTime) {
        this.DeliverTime = DeliverTime;
    }
    public String getOrderNo() {
        return OrderNo;
    }

    public void setOrderNo(String OrderNo) {
        this.OrderNo = OrderNo;
    }
    public String getCreated() {
        return Created;
    }

    public void setCreated(String Created) {
        this.Created = Created;
    }
    public String getSellerRefundTime() {
        return SellerRefundTime;
    }

    public void setSellerRefundTime(String SellerRefundTime) {
        this.SellerRefundTime = SellerRefundTime;
    }
    public float getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(float TotalPrice) {
        this.TotalPrice = TotalPrice;
    }
    public int getStatusId() {
        return StatusId;
    }

    public void setStatusId(int StatusId) {
        this.StatusId = StatusId;
    }
    public String getReceiveTime() {
        return ReceiveTime;
    }

    public void setReceiveTime(String ReceiveTime) {
        this.ReceiveTime = ReceiveTime;
    }
    public long getBuyUserId() {
        return BuyUserId;
    }

    public void setBuyUserId(long BuyUserId) {
        this.BuyUserId = BuyUserId;
    }
    public int getLikes() {
        return Likes;
    }

    public void setLikes(int Likes) {
        this.Likes = Likes;
    }
    public String getPayTime() {
        return PayTime;
    }

    public void setPayTime(String PayTime) {
        this.PayTime = PayTime;
    }
    public String getNotes() {
        return Notes;
    }

    public void setNotes(String Notes) {
        this.Notes = Notes;
    }
}