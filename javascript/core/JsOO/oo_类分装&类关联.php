<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" 
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>javascript面向对象写法</title>
        <script type="text/javascript">
            /********* v3 ajax request by json oo start *********/ 
            var dataHandler = {
                options:'',
                reqUrl:'',
                type:'',
                xmlHttpReq:null,    
                success:function(){
                },
                fail:function(){  
                },
                init:function(opts){
                    this.options=opts;
                    this.reqUrl=this.options.reqUrl;
                    this.type=this.options.type;
                    this.reqUrl = opts.reqUrl;
                    if(window.ActiveXObject){
                        this.xmlHttpReq = new ActiveXObject("Microsoft.XMLHTTP");
                    }else if(window.XMLHttpRequest){
                        this.xmlHttpReq = new XMLHttpRequest();
                    }
                },
                request:function(){
                    self = this;
                    this.xmlHttpReq.onreadystatechange= function(){
                        self.requestCallBack();
                    }
                    this.xmlHttpReq.open(this.type, this.reqUrl, true);             
                    this.xmlHttpReq.send(null);
                },
                requestCallBack:function(){
                    if(this.xmlHttpReq.readyState == 4){
                        if(this.xmlHttpReq.status == 200){
                            var result = this.xmlHttpReq.responseText;
                            if(this.success){
                                this.success(this.parseJSON(result));
                            }
                        }
                    }  
                },
                parseJSON:function(data){
                    var result;
                    if(typeof data!=="string"||!data ) {
                        result = null;
                    }else if(window.JSON && window.JSON.parse) {
                        result=window.JSON.parse(data);
                    }else {
                        result=(new Function( "return " + data))(); 
                    }
                    return result;
                }
            };              
            dataHandler.init({'reqUrl':'requestHandler.php','type':'get'});
            dataHandler.success = function(data){
                if(data.success){
                    alert('request successful! data from server: '+data.data[0].username);
                } else {
                    alert('request failed! error is: '+data.data)   
                }
            }
            //dataHandler.request();
            /********* v3 ajax request by json oo end *********/        

            /********* v2 ajax request by factory oo start *********/
            function DataHandler(options){
                this.reqUrl = options.reqUrl;
                this.type = options.type;
                this.success = null;
                this.fail = null;
                this.xmlHttpReq = null;
                this.init = function(){
                    if(window.ActiveXObject){
                        this.xmlHttpReq = new ActiveXObject("Microsoft.XMLHTTP");
                    }else if(window.XMLHttpRequest){
                        this.xmlHttpReq = new XMLHttpRequest();
                    }
                }
                this.request = function(){
                    self = this;
                    this.xmlHttpReq.onreadystatechange= function(){
                        self.requestCallBack();
                    }
                    this.xmlHttpReq.open(this.type, this.reqUrl, true);             
                    this.xmlHttpReq.send(null);
                }
                this.requestCallBack = function(){
                    if(this.xmlHttpReq.readyState == 4){
                        if(this.xmlHttpReq.status == 200){
                            var result = this.xmlHttpReq.responseText;
                            if(this.success){
                                this.success(this.parseJSON(result));
                            }
                        }
                    }  
                }
                this.parseJSON = function(data){
                    var result;
                    if(typeof data!=="string"||!data ) {
                        result = null;
                    }else if(window.JSON && window.JSON.parse) {
                        result=window.JSON.parse(data);
                    }else {
                        result=(new Function( "return " + data))(); 
                    }
                    return result;
                }
                this.test = function(){ 
                }
            }
            /** 这种方式的缺点*/
            var d1 = new DataHandler({'reqUrl':'requestHandler.php','type':'get'});
            var d2 = new DataHandler({'reqUrl':'requestHandler.php','type':'get'});
            //alert(d1.test==d2.test);       
            /********* v2 ajax request by factory oo end *********/     
        
        
            /********* v1 base ajax request start *********/ 
            function callRequest(){
                var xmlHttpReq = null; 
                if(window.ActiveXObject){
                    xmlHttpReq = new ActiveXObject("Microsoft.XMLHTTP");
                }else if(window.XMLHttpRequest){
                    xmlHttpReq = new XMLHttpRequest();
                }
        
                xmlHttpReq.onreadystatechange=requestCallBack;
                xmlHttpReq.open('get','requestHandler.php',true);
                xmlHttpReq.send(null);
        
                function requestCallBack(){
                    if(xmlHttpReq.readyState == 4){
                        if(xmlHttpReq.status == 200){
                            document.getElementById("resText").innerHTML = xmlHttpReq.responseText;
                        }
                    }  
                }            
            }
            /********* base ajax request end *********/ 
            
            function callRequest(){
                /**
                dataHandler.init({'reqUrl':'requestHandler.php','type':'get'});
                dataHandler.success = function(data){
                    if(data.success){
                        alert('request successful! data from server: '+data.data[0].username);
                    } else {
                        alert('request failed! error is: '+data.data)   
                    }
                }
                dataHandler.request();
                */
                var dataHandler = new DataHandler({'reqUrl':'requestHandler.php','type':'get'});
                dataHandler.init();    
                dataHandler.success = function(data){
                    if(data.success){
                        alert('request successful! data from server: '+data.data[0].username);
                    } else {
                        alert('request failed! error is: '+data.data)   
                    }
                }
                //dataHandler.request();  
                
                /** research jquery framewor */
                (function(arg){
                    alert(arg);
                    var par1 = 'v1', par2='v2';
                    viewsoft = function(){
                        
                    };
                    viewsoft.fn = viewsoft.prototype ={
                        constructor: viewsoft,
                        init:function() {
                        },
                        each:function(){
                            
                        }
                    };
                    // Give the init function the jQuery prototype for later instantiation
                    viewsoft.fn.init.prototype = viewsoft.fn;
                    viewsoft.extend = viewsoft.fn.extend = function() { }   
                })('test');
        </script>  
        
    </head>
    <body>

    </body>
    <input type="button" value="ajax request" onclick="callRequest();" />
    <div id="resText"></div>

</html>