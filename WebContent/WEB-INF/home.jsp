<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"
	type="text/css">
<link rel="stylesheet" href="style/home.css" type="text/css">
<title>Home</title>
<meta name="description" content="Page d'accueil">
</head>

<body class="" style="background-image: url('images/brico.jpg');">
	<div class="py-5">
		<div class="container">
			<div class="row">
				<div class="col-md-3"></div>
				<div class="col-md-6">
					<div class="card text-white p-5 bg-gradient"
						style="background-image: url('fond-transparent-rose.png');">
						<div class="card-body border border-primary">
							<h1 class="mb-4 text-white">Connexion</h1>
							<form action="https://formspree.io/YOUREMAILHERE">
								<div class="form-group" id="groupConnection">
									<label>Email address</label> <input type="email"
										class="form-control" placeholder="Enter email" id="inputMail"
										name="mailConnection" required="required">
								</div>
								<div class="form-group">
									<label>Password</label> <input type="password"
										class="form-control" placeholder="Password" id="inputPassword"
										name="passwordConnection" required="required">
								</div>
								<button type="submit" class="btn btn-secondary">Login</button>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="p-2">
		<div class="container">
			<div class="row">
				<div class="col-md-2 offset-md-10">
					<a class="btn btn-link text-white bg-gradient border border-danger"
						href="#" data-toggle="modal" data-target="suivi"
						style="background-image: url('images/fond-transparent-rose.png');">Suivre
						ma commande</a>
				</div>
			</div>
		</div>
	</div>
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>