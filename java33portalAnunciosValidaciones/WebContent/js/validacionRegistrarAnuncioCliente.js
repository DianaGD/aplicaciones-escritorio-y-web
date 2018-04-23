function validarFormularioRegistroAnuncioCliente(){
	alert("se ejecuta la funcion");
	var enviarForm = true;
	//obtener lo escrito por el usuario
	var campoTitulo = document.getElementsByName("campoTitulo")[0];
	var titulo = campoTitulo.value;
	alert("voy a validar: " + titulo);
	
	var campoPrecio = document.getElementsByName("campoPrecio")[0];
	var precio = campoPrecio.value;
	alert("voy a validar: " + precio);
	
	var campoDescripcion = document.getElementsByName("campoDescripcion")[0];
	var descripcion = campoDescripcion.value;
	alert("voy a validar: " + descripcion);
	
	var campoTelefono = document.getElementsByName("campoTelefono")[0];
	var telefono = campoTelefono.value;
	alert("voy a validar: " + telefono);
	
	var campoEmail= document.getElementsByName("campoEmail")[0];
	var email = campoEmail.value;
	alert("voy a validar: " + email);
	
	//comprobar que sea correcto
	//las expresiones regulares son vitales para realizar validaciones
	// ^ desde el principio
	// $ hasta el fin
	// [a-z] letras de la a a la z
	// {3,10} de 3 a 10 elementos
	// i insensitive para que se puedan introducir tambien mayusculas
	// \s permite espacios en blanco
	// αινσϊρ permite estos caracteres
	var expresionCampoTitulo = /^[a-zαινσϊρ\s]{3,10}$/i;
	if(expresionCampoTitulo.test(titulo)){
		alert("nombre ok");
	}else{
		alert("nombre incorrecto");
		enviarForm=false;
	}
	
	var expresionCampoPrecio = /^[0-9]{1,8}[.,]?[0-9]{0,2}$/;
	if(expresionCampoPrecio.test(precio)){
		alert("precio ok");
	}else{
		alert("precio incorrecto");
		enviarForm=false;
	}
	
	var expresionCampoDescripcion= /^[a-zαινσϊρ\s]{10,150}$/i;
	if(expresionCampoDescripcion.test(descripcion)){
		alert("descripcion ok");
	}else{
		alert("descripcion incorrecta");
		enviarForm=false;
	}
	
	//devolver true si todo esta bien
	//devolver false si hay algo mal
	return enviarForm; //si es true se envia el formulario
	
}//end function