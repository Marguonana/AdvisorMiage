/**
 * 
 */

var saveIndividu = function(){
	var newIndividu = {};
	var uniqueNumber = new Date().getTime();
	$('input.form-control').each(function(t){
		var name = $('input.form-control')[t].name;
		var value = $('input.form-control')[t].value;
		newIndividu[name] = value;
	});
	console.log(newIndividu);
	var myObjectName = newIndividu["nom"].concat(uniqueNumber);
	localStorage.setItem(myObjectName, JSON.stringify(newIndividu));
	alert('Sauvegarde de ' + myObjectName + ' OK !')
}