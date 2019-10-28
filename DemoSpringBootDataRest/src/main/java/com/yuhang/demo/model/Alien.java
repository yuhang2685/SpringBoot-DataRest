package com.yuhang.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//YH: @Entity specifies the class is eligible for data base
@Entity
public class Alien {
		// YH: @Id specifies the primary key
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO) 
		private int aid;
		private String aname;
		private int points;
		public int getAid() {
			return aid;
		}
		public void setAid(int aid) {
			this.aid = aid;
		}
		public String getAname() {
			return aname;
		}
		public void setAname(String aname) {
			this.aname = aname;
		}
		public int getPoints() {
			return points;
		}
		public void setPoints(int points) {
			this.points = points;
		}
		@Override
		public String toString() {
			return "Alien [aid=" + aid + ", aname=" + aname + ", points=" + points + "]";
		}

}
