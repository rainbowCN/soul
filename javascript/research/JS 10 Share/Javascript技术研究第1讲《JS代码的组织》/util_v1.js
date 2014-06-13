(function(){
	function util() {
		this.version = "1.0";
		this.author = "viewsoft.me";
		this.ajax = function() {
			console.log("Make a ajax from util_v1!");
		}
		this.random = function() {
			console.log("Make a random number!");
		}
	}
	window.util_v1 = util;
})();