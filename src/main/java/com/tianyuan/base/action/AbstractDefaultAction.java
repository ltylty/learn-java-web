package com.tianyuan.base.action;

import java.util.List;

import com.tianyuan.base.dao.PageObject;
import com.tianyuan.base.service.BaseService;

public abstract class AbstractDefaultAction<T1 ,T2> extends BaseAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected BaseService<T1, T2> baseService;
	protected T1 parameter;
	protected T2 model;
	protected List<T2> modelList;
	
	public String deleteByParameter() {
		setBaseService();
		baseService.deleteByParameter(parameter);
		return "deleteByParameter";
	}

	public String insertOrUpdateByParameter() {
		setBaseService();
    	baseService.insertOrUpdateByParameter(parameter);
		return "insertOrUpdateByParameter";
	}
    
	public String selectOneByParameter() {
		setBaseService();
    	model = baseService.selectOneByParameter(parameter);
		return "selectOneByParameter";
	}

	public String selectListByParameter() {
		setBaseService();
    	modelList = baseService.selectListByParameter(parameter, pageObject);
		return "selectListByParameter";
	}
	
	public abstract void setBaseService();

	public T1 getParameter() {
		return parameter;
	}

	public void setParameter(T1 parameter) {
		this.parameter = parameter;
	}

	public T2 getModel() {
		return model;
	}

	public void setModel(T2 model) {
		this.model = model;
	}

	public List<T2> getModelList() {
		return modelList;
	}

	public void setModelList(List<T2> modelList) {
		this.modelList = modelList;
	}
	
}
