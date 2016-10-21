package com.roncoo.adminlte.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.roncoo.adminlte.bean.entity.RcDataDictionaryList;
import com.roncoo.adminlte.bean.entity.RcEmailAccountInfo;
import com.roncoo.adminlte.service.DataDictionaryListService;
import com.roncoo.adminlte.service.EmailAccountInfoService;
import com.roncoo.adminlte.util.base.Page;

/**
 * 邮件账号逻辑功能
 * 
 * @author LYQ
 */
@Component
public class EmailAccountInfoBiz {

	@Autowired
	private EmailAccountInfoService emailAccountInfoService;
	
	@Autowired
	private DataDictionaryListService dictionaryListService;

	/**
	 * 分页查询
	 * 
	 * @param pageCurrent
	 * @param pageSize
	 * @return
	 */
	public Page<RcEmailAccountInfo> listForPage(int pageCurrent, int pageSize) {
		return emailAccountInfoService.listForPage(pageCurrent, pageSize);
	}

	/**
	 * 添加
	 * 
	 * @param rcEmailAccountInfo
	 */
	public void save(RcEmailAccountInfo info) {
		emailAccountInfoService.save(info);
	}
	
	/**
	 * 根据id删除
	 * @param id
	 */
	public void deleteById(Long id){
		emailAccountInfoService.deleteById(id);
	}
	
	/**
	 * 获取下拉选项
	 * @param fieldCode
	 * @return
	 */
	public List<RcDataDictionaryList> listForFieldCode(String fieldCode){
		return dictionaryListService.listForFieldCode(fieldCode);
		
	}
}