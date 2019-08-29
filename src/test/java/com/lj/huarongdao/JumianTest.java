package com.lj.huarongdao;


import static org.junit.Assert.assertThat;

import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class JumianTest {

	@Test
	public void testChildrenJumian() {
		Jumian j = new Jumian("HCCZHCCZGG1YM00YM111".toCharArray());
		List<Jumian> children = j.childrenJumian();
		//children.stream().forEach(System.out::println);
		Jumian expect1 = new Jumian("HCCZHCCZGG1YM01YM101".toCharArray());
		assertThat(children, CoreMatchers.hasItem(expect1));
		Jumian expect2 = new Jumian("HCCZHCCZGG1YM10YM011".toCharArray());
		assertThat(children, CoreMatchers.hasItem(expect2));
		Jumian expect3 = new Jumian("HCCZHCCZGG0YM01YM111".toCharArray());
		assertThat(children, CoreMatchers.hasItem(expect3));
		
	}

	
	@Test
	public void testFirstZeroBelowMaochao() {
		Jumian j = new Jumian("HCCZHCCZ0GGYM11YM011".toCharArray());
		List<Jumian> children = j.childrenJumian();
		Jumian expect1 = new Jumian("0CCZHCCZHGGYM11YM011".toCharArray());
		assertThat(children, CoreMatchers.hasItem(expect1));
		Jumian expect2 = new Jumian("HCCZHCCZGG0YM11YM011".toCharArray());
		assertThat(children, CoreMatchers.hasItem(expect2));
		Jumian expect3 = new Jumian("HCCZHCCZMGGYM11Y0011".toCharArray());
		assertThat(children, CoreMatchers.hasItem(expect3));
		Jumian expect4 = new Jumian("HCCZHCCZ0GGYM01YM111".toCharArray());
		assertThat(children, CoreMatchers.hasItem(expect4));
		Jumian expect5 = new Jumian("HCCZHCCZ0GGYM11YM101".toCharArray());
		assertThat(children, CoreMatchers.hasItem(expect5));
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
	
	@Test
	public void testKeyi() {
		Jumian j = new Jumian("HCCZHCCZMGGYM01Y1110".toCharArray());
		List<Jumian> children = j.childrenJumian();
		children.stream().forEach(System.out::println);
	
	}
	
	@Test
	public void testKeyi2() {
		Jumian j = new Jumian("HCCZHCCZM100MGGY111Y".toCharArray());
		List<Jumian> children = j.childrenJumian();
		children.stream().forEach(System.out::println);
	
	}
	
	
	
}
