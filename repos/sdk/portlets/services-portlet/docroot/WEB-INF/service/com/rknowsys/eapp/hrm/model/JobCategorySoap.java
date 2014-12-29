/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.rknowsys.eapp.hrm.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author rknowsys
 * @generated
 */
public class JobCategorySoap implements Serializable {
	public static JobCategorySoap toSoapModel(JobCategory model) {
		JobCategorySoap soapModel = new JobCategorySoap();

		soapModel.setJobCategoryId(model.getJobCategoryId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setUserId(model.getUserId());
		soapModel.setJobcategory(model.getJobcategory());

		return soapModel;
	}

	public static JobCategorySoap[] toSoapModels(JobCategory[] models) {
		JobCategorySoap[] soapModels = new JobCategorySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static JobCategorySoap[][] toSoapModels(JobCategory[][] models) {
		JobCategorySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new JobCategorySoap[models.length][models[0].length];
		}
		else {
			soapModels = new JobCategorySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static JobCategorySoap[] toSoapModels(List<JobCategory> models) {
		List<JobCategorySoap> soapModels = new ArrayList<JobCategorySoap>(models.size());

		for (JobCategory model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new JobCategorySoap[soapModels.size()]);
	}

	public JobCategorySoap() {
	}

	public long getPrimaryKey() {
		return _jobCategoryId;
	}

	public void setPrimaryKey(long pk) {
		setJobCategoryId(pk);
	}

	public long getJobCategoryId() {
		return _jobCategoryId;
	}

	public void setJobCategoryId(long jobCategoryId) {
		_jobCategoryId = jobCategoryId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getJobcategory() {
		return _jobcategory;
	}

	public void setJobcategory(String jobcategory) {
		_jobcategory = jobcategory;
	}

	private long _jobCategoryId;
	private long _companyId;
	private long _groupId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _userId;
	private String _jobcategory;
}