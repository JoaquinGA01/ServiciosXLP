<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Saludos</title>
</head>

<body>
    <div id="saludar" role="dialog">
        <form action="" method="get" name="formulario">
            <label for="xxx">nombre:</label>
            <input type="text" id="xxx" name="saludador">
            <button type="submit" name="btnSaludar">Saludar!!</button>
        </form>
    </div>

    <div id="buscarSaludos" role="dialog">
        <button type="submit" name="btnBuscar">Ver Saludos!!</button>
    </div>

    <div id="EliminarSaludo" role="dialog">
        <label for="xxx">id:</label>
        <input type="text" id="xxx" name="saludador">
            
        <button type="submit" name="btnEliminar">Eliminar Saludos!!</button>
    </div>

    <div id="ModificarSaludo" role="dialog">
        <label for="xxx">id:</label>
        <input type="text" id="xxx" name="saludador">
        <label for="xxx">nombre:</label>
        <input type="text" id="xxx" name="saludador">
        <button type="submit" name="btnModificar">Modificar Saludos!!</button>
    </div>
    
    
    <script>
        $('#saludar').modal('show');
    </script>
    <script>
        $('#buscarSaludos').modal('show');
    </script>
    <script>
        $('#EliminarSaludo').modal('show');
    </script>
    <script>
        $('#ModificarSaludo').modal('show');
    </script>

    <a href="#" data-toggle="modal" data-target="#saludar">Saludar</a>
    <a href="#" data-toggle="modal" data-target="#buscarSaludos">Buscar Saludo</a>
    <a href="#" data-toggle="modal" data-target="#EliminarSaludo">Modificar Saludo</a>
    <a href="#" data-toggle="modal" data-target="#ModificarSaludo">Eliminar Saludo</a>


    <?php
    if(isset($_REQUEST["btnSalduar"])){
	if (isset($_GET['saludador']) && !empty($_GET['saludador']) ) {
	    // instancia de la clase SoapClient
		$client = new SoapClient("http://192.168.0.190:8080/ws/saludos.wsdl");	
		// definición y paso de parámetros
		$parametros = array("nombre" => $_GET['saludador'] );
		$response = $client->__soapCall('saludar', array($parametros));
		print "<h1>" . $response->{'respuesta'} . "</h1>";
    	}
    }
    ?>
</body>
</html>