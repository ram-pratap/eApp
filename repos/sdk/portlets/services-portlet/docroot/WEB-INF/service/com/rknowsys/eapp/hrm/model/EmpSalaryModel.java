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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the EmpSalary service. Represents a row in the &quot;emp_salary&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.rknowsys.eapp.hrm.model.impl.EmpSalaryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.rknowsys.eapp.hrm.model.impl.EmpSalaryImpl}.
 * </p>
 *
 * @author rknowsys
 * @see EmpSalary
 * @see com.rknowsys.eapp.hrm.model.impl.EmpSalaryImpl
 * @see com.rknowsys.eapp.hrm.model.impl.EmpSalaryModelImpl
 * @generated
 */
public interface EmpSalaryModel extends BaseModel<EmpSalary> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a emp salary model instance should use the {@link EmpSalary} interface instead.
	 */

	/**
	 * Returns the primary key of this emp salary.
	 *
	 * @return the primary key of this emp salary
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this emp salary.
	 *
	 * @param primaryKey the primary key of this emp salary
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the emp salary ID of this emp salary.
	 *
	 * @return the emp salary ID of this emp salary
	 */
	public long getEmpSalaryId();

	/**
	 * Sets the emp salary ID of this emp salary.
	 *
	 * @param empSalaryId the emp salary ID of this emp salary
	 */
	public void setEmpSalaryId(long empSalaryId);

	/**
	 * Returns the employee ID of this emp salary.
	 *
	 * @return the employee ID of this emp salary
	 */
	public long getEmployeeId();

	/**
	 * Sets the employee ID of this emp salary.
	 *
	 * @param employeeId the employee ID of this emp salary
	 */
	public void setEmployeeId(long employeeId);

	/**
	 * Returns the group ID of this emp salary.
	 *
	 * @return the group ID of this emp salary
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this emp salary.
	 *
	 * @param groupId the group ID of this emp salary
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this emp salary.
	 *
	 * @return the company ID of this emp salary
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this emp salary.
	 *
	 * @param companyId the company ID of this emp salary
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the create date of this emp salary.
	 *
	 * @return the create date of this emp salary
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this emp salary.
	 *
	 * @param createDate the create date of this emp salary
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this emp salary.
	 *
	 * @return the modified date of this emp salary
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this emp salary.
	 *
	 * @param modifiedDate the modified date of this emp salary
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the user ID of this emp salary.
	 *
	 * @return the user ID of this emp salary
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this emp salary.
	 *
	 * @param userId the user ID of this emp salary
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this emp salary.
	 *
	 * @return the user uuid of this emp salary
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this emp salary.
	 *
	 * @param userUuid the user uuid of this emp salary
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the pay grade ID of this emp salary.
	 *
	 * @return the pay grade ID of this emp salary
	 */
	public long getPayGradeId();

	/**
	 * Sets the pay grade ID of this emp salary.
	 *
	 * @param payGradeId the pay grade ID of this emp salary
	 */
	public void setPayGradeId(long payGradeId);

	/**
	 * Returns the pay grade currency ID of this emp salary.
	 *
	 * @return the pay grade currency ID of this emp salary
	 */
	public long getPayGradeCurrencyId();

	/**
	 * Sets the pay grade currency ID of this emp salary.
	 *
	 * @param payGradeCurrencyId the pay grade currency ID of this emp salary
	 */
	public void setPayGradeCurrencyId(long payGradeCurrencyId);

	/**
	 * Returns the comment of this emp salary.
	 *
	 * @return the comment of this emp salary
	 */
	@AutoEscape
	public String getComment();

	/**
	 * Sets the comment of this emp salary.
	 *
	 * @param comment the comment of this emp salary
	 */
	public void setComment(String comment);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(EmpSalary empSalary);

	@Override
	public int hashCode();

	@Override
	public CacheModel<EmpSalary> toCacheModel();

	@Override
	public EmpSalary toEscapedModel();

	@Override
	public EmpSalary toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}