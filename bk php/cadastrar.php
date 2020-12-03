<?php

include "conexao.php";

	$nome = $_POST['nome_app'];
	$cpf = $_POST['cpf_app'];
	$rg = $_POST['rg_app'];
	$nascimento = $_POST['nascimento_app'];
	$cep = $_POST['cep_app'];
	$endereco = $_POST['endereco_app'];
	$numero = $_POST['numero_app'];
	$bairro = $_POST['bairro_app'];
	$municipio = $_POST['municipio_app'];
	$estado = $_POST['estado_app'];
	$complemento = $_POST['complemento_app'];
	$teleResidencia = $_POST['teleResidencia_app'];
	$teleCelular = $_POST['teleCelular_app'];
	$email = $_POST['email_app'];
	$senha = $_POST['senha_app'];

	$sql_verifica = "SELECT * FROM cadastro WHERE cpf = :CPF";
	$stmt = $pdo->prepare($sql_verifica);
	$stmt->bindParam(':CPF', $cpf);
	$stmt->execute();
	
	if($stmt->rowCount() > 0) {
		
		$retornoApp = array("CADASTRO"=>"CPF_ERRO");
	
	} else {
		
		$sql_insert = "INSERT INTO cadastro (nome, cpf, rg, nascimento, cep, endereco, numero, bairro, municipio, estado, complemento, teleResidencia, teleCelular, email, senha) VALUES (:NOME, :CPF, :RG, :NASCIMENTO, :CEP, :ENDERECO, :NUMERO, :BAIRRO, :MUNICIPIO, :ESTADO, :COMPLEMENTO, :TELERESIDENCIA, :TELECELULAR, :EMAIL, :SENHA);";
		$stmt = $pdo->prepare($sql_insert);
		
		$stmt->bindParam(':NOME', $nome);
		$stmt->bindParam(':CPF', $cpf);
		$stmt->bindParam(':RG', $rg);
		$stmt->bindParam(':NASCIMENTO', $nascimento);
		$stmt->bindParam(':CEP', $cep);
		$stmt->bindParam(':ENDERECO', $endereco);
		$stmt->bindParam(':NUMERO', $numero);
		$stmt->bindParam(':BAIRRO', $bairro);
		$stmt->bindParam(':MUNICIPIO', $municipio);
		$stmt->bindParam(':ESTADO', $estado);
		$stmt->bindParam(':COMPLEMENTO', $complemento);
		$stmt->bindParam(':TELERESIDENCIA', $teleResidencia);
		$stmt->bindParam(':TELECELULAR', $teleCelular);
		$stmt->bindParam(':EMAIL', $email);
		$stmt->bindParam(':SENHA', $senha);
		
		if($stmt->execute()) {
			$retornoApp = array("CADASTRO"=>"SUCESSO");
		} else {
			$retornoApp = array("CADASTRO"=>"ERRO");
		}
	}
	
	echo json_encode($retornoApp);

?>