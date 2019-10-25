package com.dzkj.pojo;
/*
 * 省份 城市相关实体类
 * 
 */
public class Region {
			private Integer Region_id;
			private Integer Region_Code;
			private String  Region_Name;
			private Integer Parent_Id;
			private Integer Region_Level;
			private Integer Region_Order;
			private String  Region_Name_EN;
			private String  Region_ShopTName_EN;
			public Integer getRegion_id() {
				return Region_id;
			}
			public void setRegion_id(Integer region_id) {
				Region_id = region_id;
			}
			public Integer getRegion_Code() {
				return Region_Code;
			}
			public void setRegion_Code(Integer region_Code) {
				Region_Code = region_Code;
			}
			public String getRegion_Name() {
				return Region_Name;
			}
			public void setRegion_Name(String region_Name) {
				Region_Name = region_Name;
			}
			public Integer getParent_Id() {
				return Parent_Id;
			}
			public void setParent_Id(Integer parent_Id) {
				Parent_Id = parent_Id;
			}
			public Integer getRegion_Level() {
				return Region_Level;
			}
			public void setRegion_Level(Integer region_Level) {
				Region_Level = region_Level;
			}
			public Integer getRegion_Order() {
				return Region_Order;
			}
			public void setRegion_Order(Integer region_Order) {
				Region_Order = region_Order;
			}
			public String getRegion_Name_EN() {
				return Region_Name_EN;
			}
			public void setRegion_Name_EN(String region_Name_EN) {
				Region_Name_EN = region_Name_EN;
			}
			public String getRegion_ShopTName_EN() {
				return Region_ShopTName_EN;
			}
			public void setRegion_ShopTName_EN(String region_ShopTName_EN) {
				Region_ShopTName_EN = region_ShopTName_EN;
			}
			public Region(Integer region_id, Integer region_Code, String region_Name, Integer parent_Id,
					Integer region_Level, Integer region_Order, String region_Name_EN, String region_ShopTName_EN) {
				super();
				Region_id = region_id;
				Region_Code = region_Code;
				Region_Name = region_Name;
				Parent_Id = parent_Id;
				Region_Level = region_Level;
				Region_Order = region_Order;
				Region_Name_EN = region_Name_EN;
				Region_ShopTName_EN = region_ShopTName_EN;
			}
			public Region() {
				super();
			}
			
			
}
