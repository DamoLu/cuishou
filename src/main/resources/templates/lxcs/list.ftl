<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>cuishou</title>
</head>
<body>
    <table id="listTable">
            <tr>
                <th>组名: ${wsxdAllocateGroup.groupName}</th>
                <th>处理人员: ${wsxdAllocateGroup.odvsName}</th>
                <th>逾期天数: ${wsxdAllocateGroup.maxOverdueDay}</th>
                <th>机构: ${wsxdAllocateGroup.appOrgEnum.getName()}</th>
            </tr>
    </table>
</body>
</html>