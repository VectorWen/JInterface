package com.zyt.kdhk.model.channel;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;;

/**
 * @author vector.huang
 * @date 2016/5/24
 */
@Entity
@Table(name = "DDHK_Exhibition", schema = "dbo", catalog = "KoudaiDBV19")
public class Exhibition {
    private int bigint;
    private String ExhPropertyName;
    private String Keywords;
    private String Email;
    private String DescText;
    private Date Modified;
    private String Name_Cn;
    private String Telephone;
    private String Organizer;
    private float Lng;
    private String Name_En;
    private float RenQiValue;
    private int SortId;
    private String ShowDate;
    private int IdInExcel;
    private String Name_Big5;
    private Date Created;
    private String OpenTime;
    private String StationName;
    private String LittleTips;
    private String Address_Big5;
    private String Address_Cn;
    private String OfflineMapName;
    private int Replies;
    private String TicketInfo;
    private String TrafficRoutes;
    private String CoverImageName;
    private long StationId;
    private Date EndDate;
    private Date BeginDate;
    private long ExhTypeId;
    private float Score;
    private String TicketGuidance;
    private String HallName;
    private String WebSite;
    private int Likes;
    private float Lat;
    private int Favorites;
    private String Location;
    @Id
    @GeneratedValue
    public int getBigint() {
        return bigint;
    }

    public void setBigint(int bigint) {
        this.bigint = bigint;
    }
    public String getExhPropertyName() {
        return ExhPropertyName;
    }

    public void setExhPropertyName(String ExhPropertyName) {
        this.ExhPropertyName = ExhPropertyName;
    }
    public String getKeywords() {
        return Keywords;
    }

    public void setKeywords(String Keywords) {
        this.Keywords = Keywords;
    }
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    public String getDescText() {
        return DescText;
    }

    public void setDescText(String DescText) {
        this.DescText = DescText;
    }
    public Date getModified() {
        return Modified;
    }

    public void setModified(Date Modified) {
        this.Modified = Modified;
    }
    public String getName_Cn() {
        return Name_Cn;
    }

    public void setName_Cn(String Name_Cn) {
        this.Name_Cn = Name_Cn;
    }
    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
    }
    public String getOrganizer() {
        return Organizer;
    }

    public void setOrganizer(String Organizer) {
        this.Organizer = Organizer;
    }
    public float getLng() {
        return Lng;
    }

    public void setLng(float Lng) {
        this.Lng = Lng;
    }
    public String getName_En() {
        return Name_En;
    }

    public void setName_En(String Name_En) {
        this.Name_En = Name_En;
    }
    public float getRenQiValue() {
        return RenQiValue;
    }

    public void setRenQiValue(float RenQiValue) {
        this.RenQiValue = RenQiValue;
    }
    public int getSortId() {
        return SortId;
    }

    public void setSortId(int SortId) {
        this.SortId = SortId;
    }
    public String getShowDate() {
        return ShowDate;
    }

    public void setShowDate(String ShowDate) {
        this.ShowDate = ShowDate;
    }
    public int getIdInExcel() {
        return IdInExcel;
    }

    public void setIdInExcel(int IdInExcel) {
        this.IdInExcel = IdInExcel;
    }
    public String getName_Big5() {
        return Name_Big5;
    }

    public void setName_Big5(String Name_Big5) {
        this.Name_Big5 = Name_Big5;
    }
    public Date getCreated() {
        return Created;
    }

    public void setCreated(Date Created) {
        this.Created = Created;
    }
    public String getOpenTime() {
        return OpenTime;
    }

    public void setOpenTime(String OpenTime) {
        this.OpenTime = OpenTime;
    }
    public String getStationName() {
        return StationName;
    }

    public void setStationName(String StationName) {
        this.StationName = StationName;
    }
    public String getLittleTips() {
        return LittleTips;
    }

    public void setLittleTips(String LittleTips) {
        this.LittleTips = LittleTips;
    }
    public String getAddress_Big5() {
        return Address_Big5;
    }

    public void setAddress_Big5(String Address_Big5) {
        this.Address_Big5 = Address_Big5;
    }
    public String getAddress_Cn() {
        return Address_Cn;
    }

    public void setAddress_Cn(String Address_Cn) {
        this.Address_Cn = Address_Cn;
    }
    public String getOfflineMapName() {
        return OfflineMapName;
    }

    public void setOfflineMapName(String OfflineMapName) {
        this.OfflineMapName = OfflineMapName;
    }
    public int getReplies() {
        return Replies;
    }

    public void setReplies(int Replies) {
        this.Replies = Replies;
    }
    public String getTicketInfo() {
        return TicketInfo;
    }

    public void setTicketInfo(String TicketInfo) {
        this.TicketInfo = TicketInfo;
    }
    public String getTrafficRoutes() {
        return TrafficRoutes;
    }

    public void setTrafficRoutes(String TrafficRoutes) {
        this.TrafficRoutes = TrafficRoutes;
    }
    public String getCoverImageName() {
        return CoverImageName;
    }

    public void setCoverImageName(String CoverImageName) {
        this.CoverImageName = CoverImageName;
    }
    public long getStationId() {
        return StationId;
    }

    public void setStationId(long StationId) {
        this.StationId = StationId;
    }
    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date EndDate) {
        this.EndDate = EndDate;
    }
    public Date getBeginDate() {
        return BeginDate;
    }

    public void setBeginDate(Date BeginDate) {
        this.BeginDate = BeginDate;
    }
    public long getExhTypeId() {
        return ExhTypeId;
    }

    public void setExhTypeId(long ExhTypeId) {
        this.ExhTypeId = ExhTypeId;
    }
    public float getScore() {
        return Score;
    }

    public void setScore(float Score) {
        this.Score = Score;
    }
    public String getTicketGuidance() {
        return TicketGuidance;
    }

    public void setTicketGuidance(String TicketGuidance) {
        this.TicketGuidance = TicketGuidance;
    }
    public String getHallName() {
        return HallName;
    }

    public void setHallName(String HallName) {
        this.HallName = HallName;
    }
    public String getWebSite() {
        return WebSite;
    }

    public void setWebSite(String WebSite) {
        this.WebSite = WebSite;
    }
    public int getLikes() {
        return Likes;
    }

    public void setLikes(int Likes) {
        this.Likes = Likes;
    }
    public float getLat() {
        return Lat;
    }

    public void setLat(float Lat) {
        this.Lat = Lat;
    }
    public int getFavorites() {
        return Favorites;
    }

    public void setFavorites(int Favorites) {
        this.Favorites = Favorites;
    }
    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }
}