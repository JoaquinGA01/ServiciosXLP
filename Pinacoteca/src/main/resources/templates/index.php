<?php
        if(isset($_REQUEST["btnSalduar"])){
	        if (isset($_POST['saludador']) && !empty($_POST['saludador']) ) {
	            // instancia de la clase SoapClient
		        $client = new SoapClient("https://pinacoteca-tis.herokuapp.com/ws/pinacoteca.wsdl");	
		        // definición y paso de parámetros
		        $parametros = array("nombre" => $_POST['Nombre'], "descripcion" => $_POST['Descripcion'], "fecha" => $_POST['Fecha'], "hora" => $_POST['Hora'], "costo" => $_POST['Costo'] );
		        $response = $client->__soapCall('AgregarEvento', array($parametros));
		        print "<h1>" . $response->{'respuesta'} . "</h1>";
    	    }
        }
?>