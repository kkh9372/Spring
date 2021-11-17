package kr.co.kmarket.vo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "km_member_terms")
public class MemberTermsVo {
	
	@Id
	private int terms;
	private String privacy;
	private String location;
	private String finance;
	private String tax;
}
