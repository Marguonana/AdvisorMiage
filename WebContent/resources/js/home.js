/**
 * 
 */
var dataPersonnes = function init(){
	var p = {
		    	"Benarab": {
		    		"id":"3",
					"nom" : "Benarab",
					"prenom" : "Lahlou",
					"AnneeNaiss" : "1995",
					"numRue" : "5",
					"libelle" : "avenue des champs",
					"codePostal": "75009",
					"ville":"Paris",
					"csp" : "maçon",
					"pub": ""
						
		    	},
			    "Darkaoui": {
			    	"id":"1",
					"nom" : "Darkaoui",
					"prenom" : "Fakih",
					"AnneeNaiss" : "1981",
					"numRue" : "122",
					"libelle" : "allee bovins",
					"codePostal": "77100",
					"ville":"Trauloing",
					"csp" : "plombier",
					"pub": ""
			    }
	};
		
}

function extractUrlParams(){	
	var t = location.search.substring(1).split('&');
	var f = [];
	for (var i=0; i<t.length; i++){
		var x = t[ i ].split('=');
		f[x[0]]=x[1];
	}
	return f;
}

function validConnexion(){
	if ( $('#inputMail')[0].value === "admin@fenouil.fr" && $('#inputPassword')[0].value === "fakih"){
		$('span#errorConnexion').hide();
		window.location.href = "pages/suiviCommande.xhtml";
	}else {
		$('span#errorConnexion').show();
	}
}

function lookingForData(nom){
	dataPersonnes.forEach(function(nameData){
		if (nameData === nom){
			return nameData;
		}
	});
	return "noDataFound";
}