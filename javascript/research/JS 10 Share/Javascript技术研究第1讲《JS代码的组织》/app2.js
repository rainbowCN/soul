/**
(function(){
	window.saveUser();
	saveBlog();
	
	var util_v1 = new window.util_v1();
	util_v1.ajax();
	
	test1();
	test2();
	test3(); //当$(function(){window.test3=fn});时，报错！
	test4();
})();
**/

/**
(function(w){
	w.saveUser();
	saveBlog();
	
	var util_v1 = new w.util_v1();
	util_v1.ajax();
	
	test1();
	test2();
	test3(); //当$(function(){window.test3=fn});时，报错！
	test4();
})(window);
*/

/**
$(function(w){
	w.saveUser();
	saveBlog();
	
	var util_v1 = new w.util_v1();
	util_v1.ajax();
	
	test1();
	test2();
	test3(); //当$(function(){window.test3=fn});时，报错！
	test4();
}(window));
*/

//最保险的方式
$(function(){
	window.saveUser();
	saveBlog();
	
	var util_v1 = new window.util_v1();
	util_v1.ajax();
	
	test1();
	test2();
	test3();
	test4();
});

//note: 当在$(function(){window.test=fn;});赋值到window时，只能在$(function(){})中调用到window.test！
//ques:
/**Q1
$(function(){
 	window.test = function(){
 		alert('test');
 	};
});
// ok
$(function(){
 	test();
 });

// fail 
$(function(w){
 	w.test();
}(window));

// fail 
(function(){
 	test();
})();
*/
 


