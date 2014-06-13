(function(){
	window.test1 = function() {
		console.log('test1');
	};
})();


(function(w){
	w.test2 = function() {
		console.log('test2');
	};
})(window);


$(function(w){
	w.test3 = function() {
		console.log('test3');
	};
}(window));


//最保险的声明方式
$(function(){
	window.test4 = function() {
		console.log('test4');
	};
});

