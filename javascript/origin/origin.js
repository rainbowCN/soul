/*!
 * FJA JavaScript Library v0.1
 * http://fja.com/
 *
 * Copyright 2012 FJA Foundation and other contributors
 * Released under the MIT license
 * http://fja.org/license
 *
 * Date: Mon Feb 18 2013 16:22:00 GMT-0800
 */

function FJA(vArg) { 
	//Save selected elements
	this.elements=[];
	
	//Get elements by class selector
	this.getElementByClass = function(oParent, sClass) {
		var elements = oParent.getElementsByTagName('*');
		var result = [];
		var i=0;
		for(i=0; i<elements.length; i++) {
			if(elements[i].className == sClass) {
				result.push(elements[i]);
			}
		}
		return result;
	};
	
	this.addFJAEvent = function(obj, sEv, fn) {
		if(obj.attachEvent) {
			obj.attachEvent('on'+sEv, function (){
				fn.call(obj);
			});
		} else {
			obj.addEventListener(sEv, fn, false);
		}
	}	
	
	switch (typeof vArg) {
		case 'string':
		       switch(vArg.charAt(0)) {
		       		case '#': //ID selector
		       			var obj = document.getElementById(vArg.substring(1)); 	
		      			this.elements.push(obj);
		      			break;
					case '.': //Class selector
						this.elements = this.getElementByClass(document, vArg.substring(1));
						break;
					default:  //Tag selector
						this.elements = document.getElementsByTagName(vArg); 		      			
		       }
		
	};
	
	this.click = function(fn) {
		var i = 0;
		for(i=0; i<this.elements.length; i++) {
			this.addFJAEvent(this.elements[i], 'click', fn);
		}
	};
	
	
}

function $(vArg) {
	return new FJA(vArg);
}