/**
 * 
 */

var displayTab = function(){
	var storage = window.localStorage;
  
	for (var key in storage) {
        var jobName= storage[key]); 
        console.log(jobName)
    }
}