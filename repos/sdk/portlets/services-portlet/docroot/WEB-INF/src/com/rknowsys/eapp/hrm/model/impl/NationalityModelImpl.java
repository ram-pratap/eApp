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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.rknowsys.eapp.hrm.model.Nationality;
import com.rknowsys.eapp.hrm.model.NationalityModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Nationality service. Represents a row in the &quot;hrm_Nationality&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rknowsys.eapp.hrm.model.NationalityModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link NationalityImpl}.
 * </p>
 *
 * @author rknowsys
 * @see NationalityImpl
 * @see com.rknowsys.eapp.hrm.model.Nationality
 * @see com.rknowsys.eapp.hrm.model.NationalityModel
 * @generated
 */
public class NationalityModelImpl extends BaseModelImpl<Nationality>
	implements NationalityModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a nationality model instance should use the {@link com.rknowsys.eapp.hrm.model.Nationality} interface instead.
	 */
	public static final String TABLE_NAME = "hrm_Nationality";
	public static final Object[][] TABLE_COLUMNS = {
			{ "nationalityId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "Name", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table hrm_Nationality (nationalityId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,createDate DATE null,modifiedDate DATE null,Name VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table hrm_Nationality";
	public static final String ORDER_BY_JPQL = " ORDER BY nationality.nationalityId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY hrm_Nationality.nationalityId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rknowsys.eapp.hrm.model.Nationality"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rknowsys.eapp.hrm.model.Nationality"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rknowsys.eapp.hrm.model.Nationality"));

	public NationalityModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _nationalityId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setNationalityId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _nationalityId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Nationality.class;
	}

	@Override
	public String getModelClassName() {
		return Nationality.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("nationalityId", getNationalityId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("Name", getName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long nationalityId = (Long)attributes.get("nationalityId");

		if (nationalityId != null) {
			setNationalityId(nationalityId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String Name = (String)attributes.get("Name");

		if (Name != null) {
			setName(Name);
		}
	}

	@Override
	public long getNationalityId() {
		return _nationalityId;
	}

	@Override
	public void setNationalityId(long nationalityId) {
		_nationalityId = nationalityId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public String getName() {
		if (_Name == null) {
			return StringPool.BLANK;
		}
		else {
			return _Name;
		}
	}

	@Override
	public void setName(String Name) {
		_Name = Name;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Nationality.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Nationality toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Nationality)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		NationalityImpl nationalityImpl = new NationalityImpl();

		nationalityImpl.setNationalityId(getNationalityId());
		nationalityImpl.setGroupId(getGroupId());
		nationalityImpl.setCompanyId(getCompanyId());
		nationalityImpl.setUserId(getUserId());
		nationalityImpl.setCreateDate(getCreateDate());
		nationalityImpl.setModifiedDate(getModifiedDate());
		nationalityImpl.setName(getName());

		nationalityImpl.resetOriginalValues();

		return nationalityImpl;
	}

	@Override
	public int compareTo(Nationality nationality) {
		long primaryKey = nationality.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Nationality)) {
			return false;
		}

		Nationality nationality = (Nationality)obj;

		long primaryKey = nationality.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Nationality> toCacheModel() {
		NationalityCacheModel nationalityCacheModel = new NationalityCacheModel();

		nationalityCacheModel.nationalityId = getNationalityId();

		nationalityCacheModel.groupId = getGroupId();

		nationalityCacheModel.companyId = getCompanyId();

		nationalityCacheModel.userId = getUserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			nationalityCacheModel.createDate = createDate.getTime();
		}
		else {
			nationalityCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			nationalityCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			nationalityCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		nationalityCacheModel.Name = getName();

		String Name = nationalityCacheModel.Name;

		if ((Name != null) && (Name.length() == 0)) {
			nationalityCacheModel.Name = null;
		}

		return nationalityCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{nationalityId=");
		sb.append(getNationalityId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", Name=");
		sb.append(getName());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.rknowsys.eapp.hrm.model.Nationality");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>nationalityId</column-name><column-value><![CDATA[");
		sb.append(getNationalityId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>Name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Nationality.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Nationality.class
		};
	private long _nationalityId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private Date _createDate;
	private Date _modifiedDate;
	private String _Name;
	private Nationality _escapedModel;
}