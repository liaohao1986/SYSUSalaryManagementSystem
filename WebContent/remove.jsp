<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
		<title>中山大学教职工工资系统</title>
		<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
		<link rel="stylesheet" href="css/index.css">
		<script type="text/javascript" src="js/jquery.js"></script>
		<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="js/index.js"></script>
</head>
<body>
	<div class="container">
		<form class="form-horizontal">
			<fieldset>
				<legend><font size="5" color="blue"><b>用户查询</b></font></legend>
				<div class="control-group">
					<label class="control-label" for="workerid">职工号:</label>
					<div class="controls">
						<input type="text"  id="workerid"/>
					</div>
				</div>
				
				<div class="control-group">
					<label class="control-label" for="name">姓名:</label>
					<div class="controls">
						<input type="text" id="name"/>
					</div>
				</div>
				
				<div class="control-group">
					<label class="control-label" for="apartment">部门:</label>
					<div class="controls">
						<input type="text"  id="apartment" />
					</div>
				</div>
				
				<div class="control-group">
					<label class="control-label" for="yesorno">是否进行工资减员:</label>
					<div class="controls">
					<select id="yesorno"><option selected="selected" value="是">是</option><option value="否">否</option></select>
					</div>
				</div>
				
				<div class="form-actions">
					<a class="btn btn-primary">查询</a>
				</div>
				</legend>
			</fieldset>
		 </form>
	</div>

	<div class="container">
		<form class="form-horizontal">
		<fieldset>
		    <h2>待减员列表</h2>
			<table class="table table-bordered table-striped">
				<thead>
					<tr>
						<th>姓名</th>
						<th>性别</th>
						<th>职工号</th>
						<th>单位</th>
						<th>离校时间</th>
						<th>离校原因</th>
						<th>业务处理</th>
					</tr>
					
				</thead>
				
				<tbody>
					<s:iterator value="resultList" id="" status="st">  
					<tr >
					 <td><s:property value=""/></td>
					 <td><s:property value=""/></td>
					 <td><s:property value=""/></td>
					 <td><s:property value=""/></td>
					 <td><s:property value=""/></td>
					 <td><s:property value=""/></td>
					 <td>
						 <a href="stopsalary.jsp" target="mainFrame"><font color="blue" size="3">停薪</font></a>/<a><font color="blue" size="3">取消工资关系</font></a>
					 </td>
					</tr>
					</s:iterator>
					 
				</tbody>
			</table>
		<fieldset>
		</form>
	</div>
</body>
</html>