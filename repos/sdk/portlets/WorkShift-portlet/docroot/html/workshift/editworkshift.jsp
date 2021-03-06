<%@page import="com.rknowsys.eapp.hrm.model.Workshift"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@ include file="/html/workshift/init.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Workshift</title>
<portlet:actionURL var="saveworkshift" name="saveWorkshift">
</portlet:actionURL>
<portlet:resourceURL var="deleteworkshift" id="deleteWorkshift" />
<portlet:renderURL var="listview">
	<portlet:param name="mvcPath" value="/html/workshift/editworkshift.jsp" />
</portlet:renderURL>
<style type="text/css">
.table-first-header {
	width: 10%;
}

.table-last-header {
	width: 15%;
}
</style>
<script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script>
var selectedEmps = new Array;
$(document).ready(function() {
    $('#btnRight').click(function(e) {
        var selectedOpts = $('#lstBox1 option:selected');
        if (selectedOpts.length == 0) {
            alert("Nothing to move.");
            e.preventDefault();
        }

        $('#lstBox2').append($(selectedOpts).clone());
        $(selectedOpts).remove();
        e.preventDefault();
    });

    $('#btnLeft').click(function(e) {
        var selectedOpts = $('#lstBox2 option:selected');
        if (selectedOpts.length == 0) {
            alert("Nothing to move.");
            e.preventDefault();
        }

        $('#lstBox1').append($(selectedOpts).clone());
        $(selectedOpts).remove();
        e.preventDefault();
    });
    
    $('#<portlet:namespace/>save').click(function(element) {

        var allAssignedOpts = $('#lstBox2 option');
        if (allAssignedOpts.length != 0) {
        	     $("#lstBox2 option").each  ( function() {
        	    	 $('#lstBox2 option').prop('selected', true);
        	     });
        }
        var allAvailableOpts = $('#lstBox1 option');
        if (allAvailableOpts.length != 0) {
        	     $("#lstBox1 option").each  ( function() {
        	    	 $('#lstBox1 option').prop('selected', true);
        	     });
        }

    });
});

</script>
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
			  var d = confirm("Are you sure you want to delete the selected workshift ?");
		  if(d){
		   var url = '<%=deleteworkshift%>';
          A.io.request(url,
         {
          data: {  
                <portlet:namespace />workshiftIds: idArray,   
                 },
          on: {
               success: function() { 
                   alert('Records deleted successfully.');
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
    var node = A.one('#edit');
    node.on(
      'click',
      function() {
         A.one('#editjobeditdelete').hide();
         A.one('#editWorkshiftForm').show();
                     
      }
    );
  }
);

AUI().ready('event', 'node', function(A){

  A.one('#editjobeditdelete').hide();
 
 });

AUI().use(
  'aui-node',
  function(A) {
    var node = A.one('#editcancel');
    node.on(
      'click',
      function() {
      	 A.one('#editjobeditdelete').show();
         A.	one('#editWorkshiftForm').hide();
         A.one("#editworkshift").set("value","");
      	A.one("#editworkshiftTime").set("value","");
      }
    );																																
  }
);

</aui:script>

<aui:script>
YUI().use(
  'aui-timepicker',
  function(Y) {
    new Y.TimePicker(
      {
        trigger: '#fromWorkHours',
        popover: {
          zIndex: 1
        },
        mask:'%H:%M',
        on: {
          selectionChange: function(event) {
            document.<portlet:namespace />addworkshiftForm_1.<portlet:namespace />duration.value = event.newSelection;
          }
        }
      }
    );
    new Y.TimePicker(
      {
        trigger: '#toWorkHours',
        mask:'%H:%M',
        popover: {
          zIndex: 1
        },
        on: {
          selectionChange: function(event) {
            document.<portlet:namespace />addworkshiftForm_1.<portlet:namespace />duration.value = event.newSelection;
          }
        }
      }
    );
  }
);
</aui:script>

</head>
<body>
	<jsp:useBean id="editworkshift"
		type="com.rknowsys.eapp.hrm.model.Workshift" scope="request" />
			
	<div id="editjobeditdelete" class="span12">
		<a href="#" id="edit">edit</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="#"
			id="delete">Delete</a>
	</div>
	
	<div id="editWorkshiftForm">
		<aui:form name="workshiftForm" action="<%=saveworkshift.toString()%>">
			<aui:input name="shiftId" type="hidden" id="shiftId"
				value="<%=editworkshift.getShiftId()%>" />
				<aui:fieldset label="Edit Work Shift">
					<label>Edit Work Shift</label>
					<% WorkshiftBean workshiftExt = new WorkshiftBean(editworkshift); %>
					<input name="<portlet:namespace/>workshiftName" id="workshiftName"
					    type="text" value="<%=editworkshift.getWorkshiftName() %>">
					<label>From</label>
					<input name="<portlet:namespace/>fromWorkHours" id="fromWorkHours"
						type="text" value="<%=workshiftExt.getFormattedFromWorkHoursStr() %>">
                    <label>To</label>
					<input name="<portlet:namespace/>toWorkHours" id="toWorkHours"
						type="text" value="<%=workshiftExt.getFormattedToWorkHoursStr() %>">
<table style='width:370px;'>
    <tr>
				<td style='width: 160px;'><b>Available Employees</b><br /> <select
					multiple="multiple" id="lstBox1" name="<portlet:namespace/>lstBox1">
						        	<jsp:useBean id="unassignedemployees"
		class="java.util.ArrayList" scope="request" />
        
        						<%
 								if (unassignedemployees != null) {
							    for (Object employee : unassignedemployees) {
								    System.out.println("Employee # " + employee);
								%>
									<option value="<%=((Employee)employee).getEmployeeId()%>"> <%=((Employee)employee).getFirstName() + " " + ((Employee)employee).getMiddleName() + " " + ((Employee)employee).getLastName() %></option>
								<%
							        }
        						}
							%>
				</select></td>
				<td style='width:50px;text-align:center;vertical-align:middle;'>
        <input type='button' id='btnRight' value ='  >  '/>
        <br/><input type='button' id='btnLeft' value ='  <  '/>
    </td>
    <td style='width:160px;'>
        <b>Assigned Employees</b><br/>
        <select multiple="multiple" name="<portlet:namespace />lstBox2" id="lstBox2"> 
        	<jsp:useBean id="shiftemployees"
		class="java.util.ArrayList" scope="request" />
        
        						<%
 								if (shiftemployees != null) {
							    for (Object employee : shiftemployees) {
								    System.out.println("Employee # " + employee);
								%>
									<option value="<%=((Employee)employee).getEmployeeId()%>"> <%=((Employee)employee).getFirstName() + " " + ((Employee)employee).getMiddleName() + " " + ((Employee)employee).getLastName() %></option>
								<%
							        }
        						}
							%>
        </select>
    </td>
</tr>
</table>						
		<aui:button-row>
			<aui:button name="save" type="submit" />
			<aui:button type="reset" value="Cancel" id="editcancel"></aui:button>
		</aui:button-row>
		</aui:fieldset>
		</aui:form>
	</div>
	
	<div>
		<label style="color: white">.</label>
	</div>
</body>
<%
PortletURL iteratorURL = renderResponse.createRenderURL();
iteratorURL.setParameter("mvcPath", "/html/workshift/editworkshift.jsp");
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
  com.liferay.portal.kernel.dao.search.SearchContainer<Workshift> searchContainer;
%>
<liferay-ui:search-container orderByCol="<%=sortByCol %>" orderByType="<%=sortByType %>" rowChecker="<%= new RowChecker(renderResponse) %>"  delta="5" emptyResultsMessage="No records is available for Workshift."   deltaConfigurable="true"   iteratorURL="<%=iteratorURL%>">
		<liferay-ui:search-container-results>
				
		<%
            List<Workshift> workshiftList = WorkshiftLocalServiceUtil.getWorkshifts(searchContainer.getStart(), searchContainer.getEnd());
            System.out.println("list size == " + workshiftList.size());
            OrderByComparator orderByComparator = CustomComparatorUtil.getWorkshiftOrderByComparator(sortByCol, sortByType);         
  
           Collections.sort(workshiftList,orderByComparator);
  
          results = workshiftList;
          
            System.out.println("results == " +results);
           
     
               total = WorkshiftLocalServiceUtil.getWorkshiftsCount();
               System.out.println("total == " +total);
               pageContext.setAttribute("results", results);
               pageContext.setAttribute("total", total);
               
 %>
	</liferay-ui:search-container-results>
<liferay-ui:search-container-row className="Workshift"
			keyProperty="shiftId" modelVar="workshift" rowVar="curRow"
			escapedModel="<%=true%>">
			<% WorkshiftBean workshiftExt = new WorkshiftBean(workshift); %>
			<liferay-ui:search-container-column-text orderable="<%=true%>"
				name="Shift Name" property="workshiftName"
				orderableProperty="workshiftName" />
			<liferay-ui:search-container-column-text orderable="<%=false%>"
				name="From" value="<%= workshiftExt.getFormattedFromWorkHoursStr()%>" />
			<liferay-ui:search-container-column-text orderable="<%=false%>"
				name="To" value="<%=workshiftExt.getFormattedToWorkHoursStr()%>"  />
			<liferay-ui:search-container-column-text orderable="<%=false%>"
				name="Duration" value="<%=workshiftExt.getFormattedDurationStr()%>" />
			<liferay-ui:search-container-column-jsp name="Edit"
				path="/html/workshift/edit.jsp" />

		</liferay-ui:search-container-row>
	<liferay-ui:search-iterator/>
	
</liferay-ui:search-container>
</html>