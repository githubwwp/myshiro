// 一般直接写在一个js文件中
layui.use([ 'layer', 'form', 'element', 'table', 'jquery' ], function() {

	var layer = layui.layer, form = layui.form, elemet = layui.elemet, table = layui.table;
	var $ = layui.jquery;
	
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
	
	var obj = {};
	 $.getJSON('../../start/json/menu.js', function(rst){
     	obj = rst;
     	
     	var allList = []; // 所有导航菜单
    	var data = obj.data;
    	for(var i=0; i< data.length; i++){
    		// 第一层
    		var o1 = data[i];
    		o1.id = 'a' + i;
    		o1.pid = 'root';
    		
    		var list = o1.list;
    		if(list && list.length > 0){
    			// 第二层
    			for(var j =0; j< list.length; j++){
    				var o2 = list[j];
    				o2.pid = o1.id;
    				o2.id = o1.id + '_b' + j; 
    				allList.push(o2);
    				
    				var list2 = o2.list;
    				if(list2 && list2.length > 0){
    					// 第三层
    					for(var k =0; k< list2.length; k++){
    						var o3 = list2[k];
    						o3.pid = o2.id;
    						o3.id = o2.id + '_c' + k; 
    						
    						o2.list = null;
    						allList.push(o3);
    					}
    				}
    			}
    		}
    		o1.list = null;
    		allList.push(o1);
    	}
    	
    	$.ajax({
    		url: 'test/handleNavData',
    		method: 'post',
    		data: {data: JSON.stringify(allList)},
    		success: function(rst){
    			console.log(rst);
    		}
    	});
     });
	
	
});
