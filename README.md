# Projeto de abstração de um banco digital utilizando boas práticas de POO.

O intuito desse projeto é aplicar os quatro pilares da programação orientada a objetos, os quais são:
* Abstração
* Encapsulamento
* Herança
* Polimorfismo

Nesse projeto, o conceito de ```abstração``` surge quando tentamos "simular" objetos (concretos ou não) da vida real, de forma virtual. 

No momento onde "escondemos" o acesso a atributos de métodos, das classes _Conta_, _ContaCorrente_ e _ContaPoupanca_, fazemos uso do pilar do ```encapsulamento```, prezando assim, uma boa prática no desenvolvimento orientado a objetos.

A fim de aproveitar o reuso de código nas classes _Conta_, _ContaCorrente_ e _ContaPoupanca_, fazemos uso do conceito de ```herança``` entre essas classes, além de também realizar ```associação``` entre agências, clientes, e bancos.

O ```polimorfismo``` surge quando atribuimos "várias formas" a classe _Conta_, ao utilizar da herança realizada entre _Conta_, _ContaCorrente_ e _ContaPoupanca_.

Foi também visto e aplicado o uso de interfaces e classes abstratas para permitir uma implementação mais limpa e padronizada.