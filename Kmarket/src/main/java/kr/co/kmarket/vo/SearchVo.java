package kr.co.kmarket.vo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class SearchVo {
	private String keyword;
	private int chk1 = 1;
	private int chk2;
	private int chk3;
	private int min;
	private int max;
}









