<%@ page import="cargo.DocumentType" %>



<div class="fieldcontain ${hasErrors(bean: documentTypeInstance, field: 'title', 'error')} required">
	<label for="title">
		<g:message code="documentType.title.label" default="Title" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="title" maxlength="50" required="" value="${documentTypeInstance?.title}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: documentTypeInstance, field: 'persianTitle', 'error')} required">
	<label for="persianTitle">
		<g:message code="documentType.persianTitle.label" default="Persian Title" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="persianTitle" maxlength="50" required="" value="${documentTypeInstance?.persianTitle}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: documentTypeInstance, field: 'critical', 'error')} ">
	<label for="critical">
		<g:message code="documentType.critical.label" default="Critical" />
		
	</label>
	<g:checkBox name="critical" value="${documentTypeInstance?.critical}" />
</div>

