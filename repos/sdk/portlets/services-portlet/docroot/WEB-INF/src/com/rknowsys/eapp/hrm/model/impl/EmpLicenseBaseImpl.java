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

package com.rknowsys.eapp.hrm.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.rknowsys.eapp.hrm.model.EmpLicense;
import com.rknowsys.eapp.hrm.service.EmpLicenseLocalServiceUtil;

/**
 * The extended model base implementation for the EmpLicense service. Represents a row in the &quot;emp_license&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EmpLicenseImpl}.
 * </p>
 *
 * @author rknowsys
 * @see EmpLicenseImpl
 * @see com.rknowsys.eapp.hrm.model.EmpLicense
 * @generated
 */
public abstract class EmpLicenseBaseImpl extends EmpLicenseModelImpl
	implements EmpLicense {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a emp license model instance should use the {@link EmpLicense} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EmpLicenseLocalServiceUtil.addEmpLicense(this);
		}
		else {
			EmpLicenseLocalServiceUtil.updateEmpLicense(this);
		}
	}
}