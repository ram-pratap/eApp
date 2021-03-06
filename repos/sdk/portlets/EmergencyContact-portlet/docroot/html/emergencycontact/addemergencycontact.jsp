<%@ include file="/html/emergencycontact/init.jsp"%>
<%@page import="com.rknowsys.eapp.hrm.service.EmergencyContactLocalServiceUtil"%>
<%@page import="com.rknowsys.eapp.hrm.model.EmergencyContact"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>emergencycontact</title>
<portlet:actionURL var="saveemergencycontact" name="saveEmergencyContact">
</portlet:actionURL>
<portlet:resourceURL var="deleteemergencycontact" id="deleteEmergencyContact"/>
<portlet:renderURL var="listview">
	<portlet:param name="mvcPath" value="/html/emergencycontact/addemergencycontact.jsp" />
</portlet:renderURL>
<style type="text/css">
.table-first-header {
	width: 10%;
}
.table-last-header {
	width: 15%;
}
</style>
<aui:script>
AUI().use(
  'aui-node',
  function(A) {
    var node = A.one('#delete');
    node.on(
      'click',
      function() {
     var idArray = [];
      A.all('input[type=checkbox]:checked').each(function(object) {
      idArray.push(object.get("value"));
    
        });
       if(idArray==""){
			  alert("Please select records!");
		  }else{
			  var d = confirm("Are you sure you want to delete the selected Work Experience ?");
		  if(d){
		   var url = '<%=deleteemergencycontact%>';
          A.io.request(url,
         {
          data: {  
                <portlet:namespace />emergencycontactIds: idArray,  
                 },
          on: {
               success: function() { 
                   alert('deleted successfully');
                   window.location='<%=listview%>';
              },
               failure: function() {
                  
                 }
                }
                 }
                );
		  																		
		  console.log(idArray);
	  
      return true;
  }
  else
    return false;
}             
      }
    );
  }
);
</aui:script>
<aui:script>
AUI().use(
  'aui-node',
  function(A) {
    var node = A.one('#add');
    node.on(
      'click',
      function() {
         A.one('#emergencycontactadddelete').hide();
         A.one('#addEmergencyContactForm').show();
                     
      }
    );
  }
);

 AUI().ready('event', 'node', function(A){

  A.one('#addEmergencyContactForm').hide();
 });

AUI().use(
  'aui-node',
  function(A) {
    var node = A.one('#cancel');
    node.on(
      'click',
      function() {
         A.one('#emergencycontactadddelete').show();
         A.one('#addEmergencyContactForm').hide();
                     
      }
    );
  }
);

</aui:script>
</head>

<body>
	<div id="emergencycontactadddelete" class="span12">
		<a href="#" id="add">Add</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="#" id="delete">Delete</a>

	</div>
	<div  id="addEmergencyContactForm">
	<aui:form name="myForm" action="<%=saveemergencycontact.toString()%>">
		<aui:input name="emergencycontactId" type="hidden" id="emergencycontactId" />
		
		<div class="span12">
			<div class="span2">
				<label>Name *</label>
		</div>
		<div class="span3">		
		 <aui:input name="name" type="text" label="" />
			</div>
		</div>

		<div class="span12">
			<div class="span2">
				<label>Relationship *</label>
		</div>
		<div class="span3">		
		 <aui:input name="relationship" type="text" label="" />
			</div>
		</div>

		<div class="span12">
			<div class="span2">
				<label>Home Telephone</label>
		</div>
		<div class="span3">		
		 <aui:input name="homeTelephone" type="text" label="" />
			</div>
		</div>

		<div class="span12">
			<div class="span2">
				<label>Mobile</label>
		</div>
		<div class="span3">		
		 <aui:input name="mobile" type="text" label="" />
			</div>
		</div>

		<div class="span12">
			<div class="span2">
				<label>Work Telephone</label>
		</div>
		<div class="span3">		
		 <aui:input name="workTelephone" type="text" label="" />
			</div>
		</div>


		<aui:button type="submit" value="Submit" />
		<aui:button  type="reset" value="Cancel" id ="cancel"/>
		
	</aui:form>
	</div>

	 <div><label style="color: white" >.</label></div>
	
</body>

<%

	PortletURL iteratorURL = renderResponse.createRenderURL();
	iteratorURL.setParameter("mvcPath", "/html/emergencycontact/addemergencycontact.jsp");
	RowChecker rowChecker = new RowChecker(renderResponse);
	
	PortalPreferences portalPrefs = PortletPreferencesFactoryUtil.getPortalPreferences(request); 
	String sortByCol = ParamUtil.getString(request, "orderByCol"); 
	String sortByType = ParamUtil.getString(request, "orderByType"); 
	System.out.println("sortByCol == " +sortByCol);
	System.out.println("sortByType == " +sortByType);
	if (Validator.isNotNull(sortByCol ) && Validator.isNotNull(sortByType )) { 
		System.out.println("if block...");
	 
	portalPrefs.setValue("NAME_SPACE", "sort-by-col", sortByCol); 
	portalPrefs.setValue("NAME_SPACE", "sort-by-type", sortByCol); 
	 
	} else { 
	 
		sortByType = portalPrefs.getValue("NAME_SPACE", "sort-by-type ", "asc");   
	}
	
	System.out.println("after....");
	System.out.println("sortByCol == " +sortByCol);
	System.out.println("sortByType == " +sortByType);

%>
<%!
  com.liferay.portal.kernel.dao.search.SearchContainer<EmergencyContact> searchContainer;
%>
<div>
<liferay-ui:search-container orderByCol="<%=sortByCol %>"
	orderByType="<%=sortByType %>"
	rowChecker="<%= new RowChecker(renderResponse) %>" delta="4"
	emptyResultsMessage="No records is available for Emergency Contacts."
	deltaConfigurable="true" iteratorURL="<%=iteratorURL%>">
	
	<liferay-ui:search-container-results>

		<%
		  List<EmergencyContact> emergencyContactList = EmergencyContactLocalServiceUtil.getEmergencyContacts(searchContainer.getStart(), searchContainer.getEnd());
		  System.out.println("list size == " +emergencyContactList.size());
		  OrderByComparator orderByComparator = CustomComparatorUtil.getEmergencyContactOrderByComparator(sortByCol, sortByType);         
		
		  Collections.sort(emergencyContactList,orderByComparator);
		
		  results = emergencyContactList;
		
		  System.out.println("results == " +results);
		
		  total = EmergencyContactLocalServiceUtil.getEmergencyContactsCount();
		  System.out.println("total == " +total);
		  pageContext.setAttribute("results", results);
		  pageContext.setAttribute("total", total);
 %>

	</liferay-ui:search-container-results>

	<liferay-ui:search-container-row className="EmergencyContact"
		keyProperty="emergencyContactId" modelVar="emergencyContact" rowVar="curRow"
		escapedModel="<%= true %>">

		<liferay-ui:search-container-column-text orderable="<%=false %>"
			name="Name" property="name" />
		<liferay-ui:search-container-column-text orderable="<%=false %>" 
			name="Relationship"  property="relationship" />
		<liferay-ui:search-container-column-text orderable="<%=false %>" 
			name="Home Telephone"  property="homeTelephone" />
		<liferay-ui:search-container-column-text orderable="<%=false %>" 
			name="Mobile"  property="mobile" />
		<liferay-ui:search-container-column-text orderable="<%=false %>" 
			name="Work Telephone"  property="workTelephone" />

		<liferay-ui:search-container-column-jsp name="Edit"
			path="/html/emergencycontact/edit.jsp" />	

	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator />

</liferay-ui:search-container>
</div>

</html>