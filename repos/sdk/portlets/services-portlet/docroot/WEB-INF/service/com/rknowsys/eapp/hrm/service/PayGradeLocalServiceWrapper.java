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
 * Provides a wrapper for {@link PayGradeLocalService}.
 *
 * @author rknowsys
 * @see PayGradeLocalService
 * @generated
 */
public class PayGradeLocalServiceWrapper implements PayGradeLocalService,
	ServiceWrapper<PayGradeLocalService> {
	public PayGradeLocalServiceWrapper(
		PayGradeLocalService payGradeLocalService) {
		_payGradeLocalService = payGradeLocalService;
	}

	/**
	* Adds the pay grade to the database. Also notifies the appropriate model listeners.
	*
	* @param payGrade the pay grade
	* @return the pay grade that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rknowsys.eapp.hrm.model.PayGrade addPayGrade(
		com.rknowsys.eapp.hrm.model.PayGrade payGrade)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _payGradeLocalService.addPayGrade(payGrade);
	}

	/**
	* Creates a new pay grade with the primary key. Does not add the pay grade to the database.
	*
	* @param payGradeId the primary key for the new pay grade
	* @return the new pay grade
	*/
	@Override
	public com.rknowsys.eapp.hrm.model.PayGrade createPayGrade(long payGradeId) {
		return _payGradeLocalService.createPayGrade(payGradeId);
	}

	/**
	* Deletes the pay grade with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param payGradeId the primary key of the pay grade
	* @return the pay grade that was removed
	* @throws PortalException if a pay grade with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rknowsys.eapp.hrm.model.PayGrade deletePayGrade(long payGradeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _payGradeLocalService.deletePayGrade(payGradeId);
	}

	/**
	* Deletes the pay grade from the database. Also notifies the appropriate model listeners.
	*
	* @param payGrade the pay grade
	* @return the pay grade that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rknowsys.eapp.hrm.model.PayGrade deletePayGrade(
		com.rknowsys.eapp.hrm.model.PayGrade payGrade)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _payGradeLocalService.deletePayGrade(payGrade);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _payGradeLocalService.dynamicQuery();
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
		return _payGradeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rknowsys.eapp.hrm.model.impl.PayGradeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _payGradeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rknowsys.eapp.hrm.model.impl.PayGradeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _payGradeLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
		return _payGradeLocalService.dynamicQueryCount(dynamicQuery);
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
		return _payGradeLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.rknowsys.eapp.hrm.model.PayGrade fetchPayGrade(long payGradeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _payGradeLocalService.fetchPayGrade(payGradeId);
	}

	/**
	* Returns the pay grade with the primary key.
	*
	* @param payGradeId the primary key of the pay grade
	* @return the pay grade
	* @throws PortalException if a pay grade with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rknowsys.eapp.hrm.model.PayGrade getPayGrade(long payGradeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _payGradeLocalService.getPayGrade(payGradeId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _payGradeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the pay grades.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rknowsys.eapp.hrm.model.impl.PayGradeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of pay grades
	* @param end the upper bound of the range of pay grades (not inclusive)
	* @return the range of pay grades
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.rknowsys.eapp.hrm.model.PayGrade> getPayGrades(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _payGradeLocalService.getPayGrades(start, end);
	}

	/**
	* Returns the number of pay grades.
	*
	* @return the number of pay grades
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getPayGradesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _payGradeLocalService.getPayGradesCount();
	}

	/**
	* Updates the pay grade in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param payGrade the pay grade
	* @return the pay grade that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rknowsys.eapp.hrm.model.PayGrade updatePayGrade(
		com.rknowsys.eapp.hrm.model.PayGrade payGrade)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _payGradeLocalService.updatePayGrade(payGrade);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _payGradeLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_payGradeLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _payGradeLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public PayGradeLocalService getWrappedPayGradeLocalService() {
		return _payGradeLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedPayGradeLocalService(
		PayGradeLocalService payGradeLocalService) {
		_payGradeLocalService = payGradeLocalService;
	}

	@Override
	public PayGradeLocalService getWrappedService() {
		return _payGradeLocalService;
	}

	@Override
	public void setWrappedService(PayGradeLocalService payGradeLocalService) {
		_payGradeLocalService = payGradeLocalService;
	}

	private PayGradeLocalService _payGradeLocalService;
}