<?php
	//descargar paquete xampp desde apachefriends.org
	//descargar notepad++ o sublime Text
	
	
	echo 'Hola Mundo !!!';
	
	
	class Cuenta{
		private $nro;
		private $moneda;
		private $saldo;
		
		public function depositar($s){
			$this->saldo+=$s;
		}
		
		public function extraer($s){
			if($this->saldo>$s){
				$this->saldo-=$s;
			}
		}
		
		public function imprimirSaldo(){
			echo '<br>'.$this->saldo;
		}
		
		public function getSaldo(){
			return $this->saldo;
		}
		
		public function setNro($n){
			$this->nro=$n;
		}
		
		public function getNro(){
			return $this->nro;
		}
		
		public function setMoneda($m){
			$this->moneda=$m;
		}
		
		public function getMoneda(){
			return $this->moneda;
		}
	}
	
	$cu1=new Cuenta();
	//Cuenta $cu1=new Cuenta();
	
	$cu1->setNro(1);
	$cu1->setMoneda("Pesos");
	$cu1->depositar(6000);
	$cu1->depositar(3000);
	// $cu1->imprimirSaldo();
	echo '<br> --- Cuenta 1 ---';
	echo '<br> Numero='.$cu1->getNro();
	echo '<br> Moneda='.$cu1->getMoneda();
	echo '<br> Saldo='.$cu1->getSaldo();
	
	class Cliente{
		private $nro;
		private $nombre;
		private $direccion;
		private $cuenta;
		
		public function __construct(){
			$this->cuenta=new Cuenta();
		}
		
		public function setNro($n){
			$this->nro=$n;
		}
		
		public function getNro(){
			return $this->nro;
		}
		
		public function setNombre($n){
			$this->nombre=$n;
		}
		
		public function getNombre(){
			return $this->nombre;
		}
		
		public function getCuenta(){
			return $this->cuenta;
		}
	}
	
	$c1=new Cliente();
	$c1->setNro(1);
	$c1->setNombre("Pedro");
	$c1->getCuenta()->setNro(2);
	$c1->getCuenta()->setMoneda("Pesos");
	$c1->getCuenta()->depositar(2000);
	
	
	
	echo '<br> --- Cliente 1 ---';
	echo '<br> Nro='.$c1->getNro();
	echo '<br> Nombre='.$c1->getNombre();
	echo '<br> Cuenta Nro='.$c1->getCuenta()->getNro();
	echo '<br> Saldo='.$c1->getCuenta()->getSaldo();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
?>