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

package com.rknowsys.eapp.hrm.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.rknowsys.eapp.hrm.model.ImmigrationDocument;
import com.rknowsys.eapp.hrm.service.base.ImmigrationDocumentLocalServiceBaseImpl;

/**
 * The implementation of the ImmigrationDocument local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.rknowsys.eapp.hrm.service.ImmigrationDocumentLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author rknowsys
 * @see com.rknowsys.eapp.hrm.service.base.ImmigrationDocumentLocalServiceBaseImpl
 * @see com.rknowsys.eapp.hrm.service.ImmigrationDocumentLocalServiceUtil
 */
public class ImmigrationDocumentLocalServiceImpl
	extends ImmigrationDocumentLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.rknowsys.eapp.hrm.service.ImmigrationDocumentLocalServiceUtil} to access the ImmigrationDocument local service.
	 */
	public List<ImmigrationDocument> getEmployeeImmigrationDocuments(long employeeId)
		    throws PortalException, SystemException {

		    return immigrationDocumentPersistence.findByemployeeId(employeeId);
		}
}