(function(){
	var name = "James";
	function saveUser() {
		console.log(name+" is saved into mysql db!");
	}
	window.saveUser = saveUser;
})();