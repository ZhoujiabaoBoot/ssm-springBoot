package com.dzkj.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsersController {
		@Autowired
		
		@RequestMapping("/information")
		public String PersonInformation() {
			return "redirect:person/information.html";
		}
		
		
		//快捷支付
		@RequestMapping("cardlist")
		public String cardlist() {
			return "cardlist";	
		}
		//订单管理
		@RequestMapping("order")
		public String order() {
			return "order";
		}
		//退款售后
		@RequestMapping("change")
		public String change() {
			return "change";
		}
		//评价商品
		@RequestMapping("comment")
		public String comment() {
			return "comment";
		}
		//我的积分
		@RequestMapping("points")
		public String points() {
			return "points";
		}
		//红包
		@RequestMapping("bonus")
		public String bonus() {
			return "bonus";
		}
		//账户余额
		@RequestMapping("walletlist")
		public String walletlist() {
			return "walletlist";
		}
		//账单明细
		@RequestMapping("bill")
		public String bill() {
			return "bill";
		}
		//收藏
		@RequestMapping("collection")
		public String collection() {
			return "collection";
		}
		//足迹
		@RequestMapping("foot")
		public String foot() {
			return "foot";
		}
		//商品咨询
		@RequestMapping("consultation")
		public String consultation() {
			return "consultation";
		}
		//意见反馈
		@RequestMapping("suggest")
		public String suggest() {
			return "suggest";
		}
		//我的消息
		@RequestMapping("news")
		public String news() {
			return "news";
		}
		//首页
		@RequestMapping("home")
		public String home() {
			return "home";
		}		
		//修改
		@RequestMapping("password")
		public String password() {
			return "password";
		}
		//支付密码立即启用
		@RequestMapping("setpay")
		public String setpay() {
			return "setpay";
		}
		//手机验证换绑
		@RequestMapping("bindphone")
		public String bindphone() {
			return "bindphone";
		}
		//邮箱验证换绑
		@RequestMapping("email")
		public String email() {
			return "email";
		}
		//实名认证
		@RequestMapping("idcard")
		public String idcard() {
			return "idcard";
		}
		//安全问题
		@RequestMapping("question")
		public String question() {
			return "question";
		}
		//优惠劵
		@RequestMapping("coupon")
		public String coupon() {
			return "coupon";
		}
}
