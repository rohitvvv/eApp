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

package com.rknowsys.eapp.hrm.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EmpDirectDepositLocalService}.
 *
 * @author rknowsys
 * @see EmpDirectDepositLocalService
 * @generated
 */
public class EmpDirectDepositLocalServiceWrapper
	implements EmpDirectDepositLocalService,
		ServiceWrapper<EmpDirectDepositLocalService> {
	public EmpDirectDepositLocalServiceWrapper(
		EmpDirectDepositLocalService empDirectDepositLocalService) {
		_empDirectDepositLocalService = empDirectDepositLocalService;
	}

	/**
	* Adds the emp direct deposit to the database. Also notifies the appropriate model listeners.
	*
	* @param empDirectDeposit the emp direct deposit
	* @return the emp direct deposit that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rknowsys.eapp.hrm.model.EmpDirectDeposit addEmpDirectDeposit(
		com.rknowsys.eapp.hrm.model.EmpDirectDeposit empDirectDeposit)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empDirectDepositLocalService.addEmpDirectDeposit(empDirectDeposit);
	}

	/**
	* Creates a new emp direct deposit with the primary key. Does not add the emp direct deposit to the database.
	*
	* @param empDirectDepositId the primary key for the new emp direct deposit
	* @return the new emp direct deposit
	*/
	@Override
	public com.rknowsys.eapp.hrm.model.EmpDirectDeposit createEmpDirectDeposit(
		long empDirectDepositId) {
		return _empDirectDepositLocalService.createEmpDirectDeposit(empDirectDepositId);
	}

	/**
	* Deletes the emp direct deposit with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param empDirectDepositId the primary key of the emp direct deposit
	* @return the emp direct deposit that was removed
	* @throws PortalException if a emp direct deposit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rknowsys.eapp.hrm.model.EmpDirectDeposit deleteEmpDirectDeposit(
		long empDirectDepositId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _empDirectDepositLocalService.deleteEmpDirectDeposit(empDirectDepositId);
	}

	/**
	* Deletes the emp direct deposit from the database. Also notifies the appropriate model listeners.
	*
	* @param empDirectDeposit the emp direct deposit
	* @return the emp direct deposit that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rknowsys.eapp.hrm.model.EmpDirectDeposit deleteEmpDirectDeposit(
		com.rknowsys.eapp.hrm.model.EmpDirectDeposit empDirectDeposit)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empDirectDepositLocalService.deleteEmpDirectDeposit(empDirectDeposit);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _empDirectDepositLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empDirectDepositLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rknowsys.eapp.hrm.model.impl.EmpDirectDepositModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _empDirectDepositLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rknowsys.eapp.hrm.model.impl.EmpDirectDepositModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empDirectDepositLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empDirectDepositLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empDirectDepositLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.rknowsys.eapp.hrm.model.EmpDirectDeposit fetchEmpDirectDeposit(
		long empDirectDepositId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empDirectDepositLocalService.fetchEmpDirectDeposit(empDirectDepositId);
	}

	/**
	* Returns the emp direct deposit with the primary key.
	*
	* @param empDirectDepositId the primary key of the emp direct deposit
	* @return the emp direct deposit
	* @throws PortalException if a emp direct deposit with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rknowsys.eapp.hrm.model.EmpDirectDeposit getEmpDirectDeposit(
		long empDirectDepositId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _empDirectDepositLocalService.getEmpDirectDeposit(empDirectDepositId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _empDirectDepositLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the emp direct deposits.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rknowsys.eapp.hrm.model.impl.EmpDirectDepositModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of emp direct deposits
	* @param end the upper bound of the range of emp direct deposits (not inclusive)
	* @return the range of emp direct deposits
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rknowsys.eapp.hrm.model.EmpDirectDeposit> getEmpDirectDeposits(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empDirectDepositLocalService.getEmpDirectDeposits(start, end);
	}

	/**
	* Returns the number of emp direct deposits.
	*
	* @return the number of emp direct deposits
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getEmpDirectDepositsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empDirectDepositLocalService.getEmpDirectDepositsCount();
	}

	/**
	* Updates the emp direct deposit in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param empDirectDeposit the emp direct deposit
	* @return the emp direct deposit that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rknowsys.eapp.hrm.model.EmpDirectDeposit updateEmpDirectDeposit(
		com.rknowsys.eapp.hrm.model.EmpDirectDeposit empDirectDeposit)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empDirectDepositLocalService.updateEmpDirectDeposit(empDirectDeposit);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _empDirectDepositLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_empDirectDepositLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _empDirectDepositLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public EmpDirectDepositLocalService getWrappedEmpDirectDepositLocalService() {
		return _empDirectDepositLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedEmpDirectDepositLocalService(
		EmpDirectDepositLocalService empDirectDepositLocalService) {
		_empDirectDepositLocalService = empDirectDepositLocalService;
	}

	@Override
	public EmpDirectDepositLocalService getWrappedService() {
		return _empDirectDepositLocalService;
	}

	@Override
	public void setWrappedService(
		EmpDirectDepositLocalService empDirectDepositLocalService) {
		_empDirectDepositLocalService = empDirectDepositLocalService;
	}

	private EmpDirectDepositLocalService _empDirectDepositLocalService;
}