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

package com.rknowsys.eapp.hrm.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.rknowsys.eapp.hrm.model.JobTitles;
import com.rknowsys.eapp.hrm.service.JobTitlesLocalServiceUtil;

/**
 * @author Rknowsys
 * @generated
 */
public abstract class JobTitlesActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public JobTitlesActionableDynamicQuery() throws SystemException {
		setBaseLocalService(JobTitlesLocalServiceUtil.getService());
		setClass(JobTitles.class);

		setClassLoader(com.rknowsys.eapp.hrm.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("id");
	}
}