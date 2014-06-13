(function(w){
	var name = "A blog";
	function saveBlog() {
		console.log(name+" is saved into mysql db!");
	}
	w.saveBlog = saveBlog;
})(window);