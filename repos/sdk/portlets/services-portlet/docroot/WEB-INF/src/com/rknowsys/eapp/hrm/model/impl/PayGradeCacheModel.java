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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.rknowsys.eapp.hrm.model.PayGrade;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PayGrade in entity cache.
 *
 * @author rknowsys
 * @see PayGrade
 * @generated
 */
public class PayGradeCacheModel implements CacheModel<PayGrade>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{payGradeId=");
		sb.append(payGradeId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", paygradeName=");
		sb.append(paygradeName);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PayGrade toEntityModel() {
		PayGradeImpl payGradeImpl = new PayGradeImpl();

		payGradeImpl.setPayGradeId(payGradeId);
		payGradeImpl.setCompanyId(companyId);
		payGradeImpl.setGroupId(groupId);

		if (createDate == Long.MIN_VALUE) {
			payGradeImpl.setCreateDate(null);
		}
		else {
			payGradeImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			payGradeImpl.setModifiedDate(null);
		}
		else {
			payGradeImpl.setModifiedDate(new Date(modifiedDate));
		}

		payGradeImpl.setUserId(userId);

		if (paygradeName == null) {
			payGradeImpl.setPaygradeName(StringPool.BLANK);
		}
		else {
			payGradeImpl.setPaygradeName(paygradeName);
		}

		payGradeImpl.resetOriginalValues();

		return payGradeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		payGradeId = objectInput.readLong();
		companyId = objectInput.readLong();
		groupId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		userId = objectInput.readLong();
		paygradeName = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(payGradeId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(userId);

		if (paygradeName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(paygradeName);
		}
	}

	public long payGradeId;
	public long companyId;
	public long groupId;
	public long createDate;
	public long modifiedDate;
	public long userId;
	public String paygradeName;
}