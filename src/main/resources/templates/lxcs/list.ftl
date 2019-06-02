<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>cuishou</title>
</head>
<body>
    <p>
        <#list wsxdAllocateGroupScopeList as wsxdAllocateGroupScope>
            <br>${wsxdAllocateGroupScope.appOrgName}---${wsxdAllocateGroupScope.departmentName}---<#if wsxdAllocateGroupScope.hasCommonPool == '0'>是<#else>否</#if>
        </#list>
    </p>
</body>
</html>