package com.rknowsys.eapp;

import java.io.IOException;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.rknowsys.eapp.hrm.model.Education;
import com.rknowsys.eapp.hrm.service.EducationLocalServiceUtil;

/**
 * Portlet implementation class EducationAction
 */
public class EducationAction extends MVCPortlet {
	
		Date date=new Date();
		public void saveEducation(ActionRequest actionRequest,
				ActionResponse actionResponse) throws IOException,
				PortletException, SystemException {
			ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
			try {
				Education educations = EducationLocalServiceUtil
						.createEducation(CounterLocalServiceUtil.increment());
				String id = ParamUtil.getString(actionRequest, "educationId");
				String eduLevel=ParamUtil.getString(actionRequest, "education_level");
				System.out.println("id == " + id);
				if (id == "" || id == null) {
									educations.setCreateDate(date);
					educations.setModifiedDate(date);
					educations.setCompanyId(themeDisplay.getCompanyId());
					educations.setGroupId(themeDisplay.getCompanyGroupId());
					educations.setUserId(themeDisplay.getUserId());
					educations.setEduLevel(eduLevel);
					educations = EducationLocalServiceUtil.addEducation(educations);
				} 		} catch (SystemException e) {
				
				e.printStackTrace();
			}

		}
		public void updateEducation(ActionRequest actionRequest,
				ActionResponse actionResponse) throws IOException,
				PortletException, SystemException {
			ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
			
				String id = ParamUtil.getString(actionRequest, "educationId");
				String eduLevel=ParamUtil.getString(actionRequest, "education_level");
				System.out.println("id == " + id);
					Education educations;
					try {
						educations = EducationLocalServiceUtil.getEducation(Long.parseLong(id));
						educations.setCreateDate(date);
						educations.setModifiedDate(date);
						educations.setCompanyId(themeDisplay.getCompanyId());
						educations.setGroupId(themeDisplay.getCompanyGroupId());
						educations.setUserId(themeDisplay.getUserId());
						educations.setEduLevel(eduLevel);
						educations = EducationLocalServiceUtil.updateEducation(educations);

					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (PortalException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}						
			}

		

		/**
		 * <p>
		 * This method deletes the Educations record from database based on
		 * Educations record Id
		 * </p>
		 * 
		 * @param resourceRequest
		 * @param resourceResponse
		 * @throws IOException
		 * @throws PortletException
		 * @throws SystemException
		 * @throws PortalException
		 * @throws NumberFormatException
		 */
		public void serveResource(ResourceRequest resourceRequest,
				ResourceResponse resourceResponse) throws IOException
	           {
			if (resourceRequest.getResourceID().equals("deleteEducation")) {
	System.out.println("deleting thes educations");
		
		String[] idsArray = ParamUtil.getParameterValues(resourceRequest,
						"educationIds");
							System.out.println(idsArray.length);
							
							for (int i = 0; i <= idsArray.length-1; i++) {
					
						
								try
								 {
							 try {
								EducationLocalServiceUtil.deleteEducation(Long.parseLong(idsArray[i]));
							} catch (PortalException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (SystemException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
								 }
								 catch(NumberFormatException e)
								 {
								 }
							 }

									} 
							
					
							
					}
					
				
				
			

		
		public void editEducation(ActionRequest actionRequest,
				ActionResponse actionResponse) throws IOException,
				PortletException, NumberFormatException, PortalException,
				SystemException {
			String educationId = ParamUtil.getString(actionRequest, "educationId");
			Education educations = EducationLocalServiceUtil.getEducation(Long
					.parseLong(educationId));

			actionRequest.setAttribute("editEducation", educations);
			actionResponse.setRenderParameter("jspPage",
					"/html/educationaction/editEducation.jsp");
		}

	 

	}

 


