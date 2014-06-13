/**json类的方式*/
$(function(w){
	var util = {
		version : "1.0",
		author : "viewsoft.me",
		ajax: function() {
			console.log("Make a ajax from util_v2!");
		},
		random : function() {
			console.log("Make a random number!");
		}
	}
	w.util_v2 = util;
}(window));