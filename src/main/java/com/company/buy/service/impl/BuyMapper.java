package com.company.buy.service.impl;

import java.util.List;

import com.company.buy.service.BuyVO;

public interface BuyMapper {
	public List<BuyVO> getSearchBuy(BuyVO vo);	//구매내역 상세조회
	public BuyVO getViewBuy(BuyVO vo);	//뷰 단건조회
	public int deleteBuy(BuyVO vo);		//구매내역 한건 삭제	
	public List<BuyVO> getBuy(BuyVO vo);		//쇼핑몰구매내역 단건조회 for 구매평작성
	public int insertReview3(BuyVO vo); //구매평등록시 데이터 업데이트

	//결제 설정 
	public int insertBuy2(BuyVO vo); //구매상세정보 추가
	//장바구니 다중 insert
	public int insertCartBuy(List<BuyVO> list);
}
