package com.vector.jinterface.db.model.gossip;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author vector.huang
 * @date 2016年2月26日 下午5:20:32
 */
@Entity
@Table(name = "GossipImage", schema = "dbo", catalog = "KoudaiDBV19")
public class GossipImage {

	private int id;
	private Gossip gossip;
	private String url;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "gossipId")
	public Gossip getGossip() {
		return gossip;
	}

	public void setGossip(Gossip gossip) {
		this.gossip = gossip;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
