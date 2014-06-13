(function(){
    var version = "1.0";
    var author = "viewsoft.me";
    
	function ajax(){
		console.log("Make a ajax!");
	}
	function random() {
		console.log("Make a random number!");
	}
	window.version = version;
	window.author = version;
	window.ajax = ajax;
	window.random = random;
})();