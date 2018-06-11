/**
 * 
 */

var view = "";

var validChoiceCanal = function validChoiceCanal(){
	$('input.radiocanal').each(function(t){
		if ($('input.radiocanal')[t].checked){
			view = $('input.radiocanal')[t].name;
		}
	});
}