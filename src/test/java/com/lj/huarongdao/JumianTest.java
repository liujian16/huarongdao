package com.lj.huarongdao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class JumianTest {

	@Test
	public void testChildrenJumian() {
		Jumian j = new Jumian("HCCZHCCZGG1YM00YM111".toCharArray());
		List<Jumian> children = j.childrenJumian();
		children.stream().forEach(System.out::println);
		
	}

	
	@Test
	public void testFirstZeroBelowMaochao() {
		Jumian j = new Jumian("HCCZHCCZMGGYM11Y0011".toCharArray());
		List<Jumian> children = j.childrenJumian();
		children.stream().forEach(System.out::println);
		
	}

	@Test
	public void testFirstZeroOnLeftSideOfGuanyu() {
		Jumian j = new Jumian("HCCZHCCZ0GGYM11YM011".toCharArray());
		List<Jumian> children = j.childrenJumian();
		children.stream().forEach(System.out::println);
		
		
	}
	@Test
	public void testBothZerosOnLeftSideOfCaocao(){
		Jumian j = new Jumian("0CCZ0CCZHMGGHM1Y111Y".toCharArray());
		List<Jumian> children = j.childrenJumian();
		children.stream().forEach(System.out::println);
		
	}
	@Test
	public void testBothZeroOnLeftSideOfZhangfei() {
		Jumian j = new Jumian("CC0ZCC0ZHMGGHM1Y111Y".toCharArray());
		List<Jumian> children = j.childrenJumian();
		children.stream().forEach(System.out::println);
		
	}
	@Test
	public void testBothZeroOnUpSideOfCaocao() {
		Jumian j = new Jumian("H00ZHCCZMCCYMGGY1111".toCharArray());
		List<Jumian> children = j.childrenJumian();
		children.stream().forEach(System.out::println);
		
	}
	
	@Test
	public void testBothZeroOnUpSideOfGuanyu() {
		Jumian j = new Jumian("HCCZHCCZM00YMGGY1111".toCharArray());
		List<Jumian> children = j.childrenJumian();
		children.stream().forEach(System.out::println);
		
	}
	
	@Test
	public void testFirstZeroOnUpSideOfZu() {
		Jumian j = new Jumian("HCCZHCCZMGGYM00Y1111".toCharArray());
		List<Jumian> children = j.childrenJumian();
		children.stream().forEach(System.out::println);
		
	}
	@Test
	public void testFirstZeroOnUpSideOfMaochao() {
		Jumian j = new Jumian("HCCZHCCZ0GGYM11YM101".toCharArray());
		List<Jumian> children = j.childrenJumian();
		children.stream().forEach(System.out::println);
	}
	@Test
	public void testBothZeroOnRightSideOfMaochao() {
		Jumian j = new Jumian("HCCZHCCZGG1YM01YM011".toCharArray());
		List<Jumian> children = j.childrenJumian();
		children.stream().forEach(System.out::println);
	}
	
	@Test
	public void testFirstZeroOnRightSideOfGuanyu() {
		Jumian j = new Jumian("HCCZHCCZGG01M11YM10Y".toCharArray());
		List<Jumian> children = j.childrenJumian();
		children.stream().forEach(System.out::println);
	}
	
	@Test
	public void testFirstZeroOnRightSideOfZu() {
		Jumian j = new Jumian("HCCZHCCZGG1YM10YM110".toCharArray());
		List<Jumian> children = j.childrenJumian();
		children.stream().forEach(System.out::println);
	}
	
	@Test
	public void testBothZeroOnRightSideOfCaocao() {
		Jumian j = new Jumian("HCC0HCC0GGYZM1YZM111".toCharArray());
		List<Jumian> children = j.childrenJumian();
		children.stream().forEach(System.out::println);
		
	}
	
	@Test
	public void testSecondZeroOnDownSideOfZu() {
		Jumian j = new Jumian("HCCZHCCZMGGYM11Y1001".toCharArray());
		List<Jumian> children = j.childrenJumian();
		children.stream().forEach(System.out::println);
		
	}
	
}
