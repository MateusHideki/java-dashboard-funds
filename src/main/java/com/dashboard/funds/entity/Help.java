package com.dashboard.funds.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teste123")
public class Help {

	@Id
	@Column(name = "TOPIC")
	private String TOPIC;

	@Column(name = "SEQ")
	private Double SEQ;

	@Column(name = "INFO")
	private String INFO;

	public String getTOPIC() {
		return TOPIC;
	}

	public void setTOPIC(String tOPIC) {
		TOPIC = tOPIC;
	}

	public Double getSEQ() {
		return SEQ;
	}

	public void setSEQ(Double sEQ) {
		SEQ = sEQ;
	}

	public String getINFO() {
		return INFO;
	}

	public void setINFO(String iNFO) {
		INFO = iNFO;
	}

	@Override
	public String toString() {
		return "Help [TOPIC=" + TOPIC + ", SEQ=" + SEQ + ", INFO=" + INFO + "]";
	}

}
