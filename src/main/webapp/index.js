// 一般直接写在一个js文件中
layui.use([ 'layer', 'form', 'element', 'table' ], function() {

	var layer = layui.layer, form = layui.form, elemet = layui.elemet, table = layui.table;
	
	table.render({
		elem: '#demo',
		url: 'test/getGridData',
		height: 'full-150',
		loading: true,
		page: true,
		cols: [[
	        {field: 'id', title: 'ID', width: 180, sort: true, fixed: 'left'},
	        {field: 'username', title: '用户名', width: 180, sort: true, fixed: 'left'},
	        {field: 'gender', title: '性别', width: 180, sort: true, fixed: 'left'},
	        {field: 'city', title: '城市', width: 180, sort: true, fixed: 'left'},
	        {field: 'point', title: '点数', width: 180, sort: true, fixed: 'left',
	        	template: '{{= d.id}}'
	        }
        ]]
	});

});
