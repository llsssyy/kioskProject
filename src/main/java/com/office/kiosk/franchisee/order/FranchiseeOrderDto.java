package com.office.kiosk.franchisee.order;

import lombok.Data;

@Data
public class FranchiseeOrderDto {
	
	//프렌차이즈 오더
	private int fco_no;			
	private int fco_ori_no;		
	private int fco_packaging;
	private int fco_menu_cnt;
	private String fco_menu_option;
	private int fco_menu_option_price;
	private int fco_total_price;
	private String pm_type;
	private String fco_reg_date;
	private String fco_mod_date;
	
 
//	FC_MENU_NO  

	
	//프렌차이즈 메뉴
	private int fc_menu_no;
	private String fc_menu_name;
	private String fc_menu_text;
	private int fc_menu_price;
	private String fc_menu_img_name;
	private int fc_menu_quantity;
	private String fc_menu_reg_date;
	private String fc_menu_mod_date;
	
	//카테고리
	private int fcmc_no;
	private int fcmc_p_no;
	private String fcmc_name;
	private String fcmc_reg_date; 
	private String fcmc_mod_date;
	
// fcs_no int	
	
	//프렌차이즈 가게 정보
	private int fcs_no;
	private String fcs_name;
	private String fcs_location;
	private String fcs_phone;
	private String fcs_reg_date;
	private String fcs_mod_date;
		
//	FCM_NO int 
		
	//프렌차이즈 멤버
	private int fcm_no;
	private String fcm_id;
	private String fcm_pw;
	private String fcm_name;
	private String fcm_phone;
	private String fcm_mail;
	private int fcm_approval;
	private String fcm_reg_date;
	private String fcm_mod_date;
	
	
}
