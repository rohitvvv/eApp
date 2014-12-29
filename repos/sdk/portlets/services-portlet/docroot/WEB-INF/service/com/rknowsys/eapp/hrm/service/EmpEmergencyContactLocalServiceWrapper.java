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
 * Provides a wrapper for {@link EmpEmergencyContactLocalService}.
 *
 * @author rknowsys
 * @see EmpEmergencyContactLocalService
 * @generated
 */
public class EmpEmergencyContactLocalServiceWrapper
	implements EmpEmergencyContactLocalService,
		ServiceWrapper<EmpEmergencyContactLocalService> {
	public EmpEmergencyContactLocalServiceWrapper(
		EmpEmergencyContactLocalService empEmergencyContactLocalService) {
		_empEmergencyContactLocalService = empEmergencyContactLocalService;
	}

	/**
	* Adds the EmpEmergencyContact to the database. Also notifies the appropriate model listeners.
	*
	* @param empEmergencyContact the EmpEmergencyContact
	* @return the EmpEmergencyContact that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rknowsys.eapp.hrm.model.EmpEmergencyContact addEmpEmergencyContact(
		com.rknowsys.eapp.hrm.model.EmpEmergencyContact empEmergencyContact)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empEmergencyContactLocalService.addEmpEmergencyContact(empEmergencyContact);
	}

	/**
	* Creates a new EmpEmergencyContact with the primary key. Does not add the EmpEmergencyContact to the database.
	*
	* @param empEmergencyContactId the primary key for the new EmpEmergencyContact
	* @return the new EmpEmergencyContact
	*/
	@Override
	public com.rknowsys.eapp.hrm.model.EmpEmergencyContact createEmpEmergencyContact(
		long empEmergencyContactId) {
		return _empEmergencyContactLocalService.createEmpEmergencyContact(empEmergencyContactId);
	}

	/**
	* Deletes the EmpEmergencyContact with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param empEmergencyContactId the primary key of the EmpEmergencyContact
	* @return the EmpEmergencyContact that was removed
	* @throws PortalException if a EmpEmergencyContact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rknowsys.eapp.hrm.model.EmpEmergencyContact deleteEmpEmergencyContact(
		long empEmergencyContactId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _empEmergencyContactLocalService.deleteEmpEmergencyContact(empEmergencyContactId);
	}

	/**
	* Deletes the EmpEmergencyContact from the database. Also notifies the appropriate model listeners.
	*
	* @param empEmergencyContact the EmpEmergencyContact
	* @return the EmpEmergencyContact that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rknowsys.eapp.hrm.model.EmpEmergencyContact deleteEmpEmergencyContact(
		com.rknowsys.eapp.hrm.model.EmpEmergencyContact empEmergencyContact)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empEmergencyContactLocalService.deleteEmpEmergencyContact(empEmergencyContact);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _empEmergencyContactLocalService.dynamicQuery();
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
		return _empEmergencyContactLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rknowsys.eapp.hrm.model.impl.EmpEmergencyContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _empEmergencyContactLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rknowsys.eapp.hrm.model.impl.EmpEmergencyContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _empEmergencyContactLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
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
		return _empEmergencyContactLocalService.dynamicQueryCount(dynamicQuery);
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
		return _empEmergencyContactLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.rknowsys.eapp.hrm.model.EmpEmergencyContact fetchEmpEmergencyContact(
		long empEmergencyContactId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empEmergencyContactLocalService.fetchEmpEmergencyContact(empEmergencyContactId);
	}

	/**
	* Returns the EmpEmergencyContact with the primary key.
	*
	* @param empEmergencyContactId the primary key of the EmpEmergencyContact
	* @return the EmpEmergencyContact
	* @throws PortalException if a EmpEmergencyContact with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rknowsys.eapp.hrm.model.EmpEmergencyContact getEmpEmergencyContact(
		long empEmergencyContactId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _empEmergencyContactLocalService.getEmpEmergencyContact(empEmergencyContactId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _empEmergencyContactLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the EmpEmergencyContacts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rknowsys.eapp.hrm.model.impl.EmpEmergencyContactModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of EmpEmergencyContacts
	* @param end the upper bound of the range of EmpEmergencyContacts (not inclusive)
	* @return the range of EmpEmergencyContacts
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rknowsys.eapp.hrm.model.EmpEmergencyContact> getEmpEmergencyContacts(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empEmergencyContactLocalService.getEmpEmergencyContacts(start,
			end);
	}

	/**
	* Returns the number of EmpEmergencyContacts.
	*
	* @return the number of EmpEmergencyContacts
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getEmpEmergencyContactsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empEmergencyContactLocalService.getEmpEmergencyContactsCount();
	}

	/**
	* Updates the EmpEmergencyContact in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param empEmergencyContact the EmpEmergencyContact
	* @return the EmpEmergencyContact that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rknowsys.eapp.hrm.model.EmpEmergencyContact updateEmpEmergencyContact(
		com.rknowsys.eapp.hrm.model.EmpEmergencyContact empEmergencyContact)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _empEmergencyContactLocalService.updateEmpEmergencyContact(empEmergencyContact);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _empEmergencyContactLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_empEmergencyContactLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _empEmergencyContactLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public EmpEmergencyContactLocalService getWrappedEmpEmergencyContactLocalService() {
		return _empEmergencyContactLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedEmpEmergencyContactLocalService(
		EmpEmergencyContactLocalService empEmergencyContactLocalService) {
		_empEmergencyContactLocalService = empEmergencyContactLocalService;
	}

	@Override
	public EmpEmergencyContactLocalService getWrappedService() {
		return _empEmergencyContactLocalService;
	}

	@Override
	public void setWrappedService(
		EmpEmergencyContactLocalService empEmergencyContactLocalService) {
		_empEmergencyContactLocalService = empEmergencyContactLocalService;
	}

	private EmpEmergencyContactLocalService _empEmergencyContactLocalService;
}