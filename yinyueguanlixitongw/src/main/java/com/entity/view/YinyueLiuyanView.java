package com.entity.view;

import com.entity.YinyueLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 音乐留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yinyue_liuyan")
public class YinyueLiuyanView extends YinyueLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 yinyue
			/**
			* 音乐编号
			*/
			private String yinyueUuidNumber;
			/**
			* 音乐名称
			*/
			private String yinyueName;
			/**
			* 音乐类型
			*/
			private Integer yinyueTypes;
				/**
				* 音乐类型的值
				*/
				private String yinyueValue;
			/**
			* 封面
			*/
			private String yinyuePhoto;
			/**
			* 音乐
			*/
			private String yinyueMusic;
			/**
			* 赞
			*/
			private Integer zanNumber;
			/**
			* 踩
			*/
			private Integer caiNumber;
			/**
			* 音乐详情
			*/
			private String newsContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public YinyueLiuyanView() {

	}

	public YinyueLiuyanView(YinyueLiuyanEntity yinyueLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, yinyueLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
















				//级联表的get和set yinyue

					/**
					* 获取： 音乐编号
					*/
					public String getYinyueUuidNumber() {
						return yinyueUuidNumber;
					}
					/**
					* 设置： 音乐编号
					*/
					public void setYinyueUuidNumber(String yinyueUuidNumber) {
						this.yinyueUuidNumber = yinyueUuidNumber;
					}

					/**
					* 获取： 音乐名称
					*/
					public String getYinyueName() {
						return yinyueName;
					}
					/**
					* 设置： 音乐名称
					*/
					public void setYinyueName(String yinyueName) {
						this.yinyueName = yinyueName;
					}

					/**
					* 获取： 音乐类型
					*/
					public Integer getYinyueTypes() {
						return yinyueTypes;
					}
					/**
					* 设置： 音乐类型
					*/
					public void setYinyueTypes(Integer yinyueTypes) {
						this.yinyueTypes = yinyueTypes;
					}


						/**
						* 获取： 音乐类型的值
						*/
						public String getYinyueValue() {
							return yinyueValue;
						}
						/**
						* 设置： 音乐类型的值
						*/
						public void setYinyueValue(String yinyueValue) {
							this.yinyueValue = yinyueValue;
						}

					/**
					* 获取： 封面
					*/
					public String getYinyuePhoto() {
						return yinyuePhoto;
					}
					/**
					* 设置： 封面
					*/
					public void setYinyuePhoto(String yinyuePhoto) {
						this.yinyuePhoto = yinyuePhoto;
					}

					/**
					* 获取： 音乐
					*/
					public String getYinyueMusic() {
						return yinyueMusic;
					}
					/**
					* 设置： 音乐
					*/
					public void setYinyueMusic(String yinyueMusic) {
						this.yinyueMusic = yinyueMusic;
					}

					/**
					* 获取： 赞
					*/
					public Integer getZanNumber() {
						return zanNumber;
					}
					/**
					* 设置： 赞
					*/
					public void setZanNumber(Integer zanNumber) {
						this.zanNumber = zanNumber;
					}

					/**
					* 获取： 踩
					*/
					public Integer getCaiNumber() {
						return caiNumber;
					}
					/**
					* 设置： 踩
					*/
					public void setCaiNumber(Integer caiNumber) {
						this.caiNumber = caiNumber;
					}

					/**
					* 获取： 音乐详情
					*/
					public String getNewsContent() {
						return newsContent;
					}
					/**
					* 设置： 音乐详情
					*/
					public void setNewsContent(String newsContent) {
						this.newsContent = newsContent;
					}










				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
