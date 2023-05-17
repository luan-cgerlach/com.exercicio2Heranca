Você foi contratado para desenvolver um sistema de gerenciamento de um estacionamento em um condomínio. 
O sistema precisa lidar com diferentes tipos de veículos, como carros e motos. Cada veículo possui informações
 como número da placa do veículo e modelo do veículo. Além disso, é necessário calcular o preço a ser aplicado
 a cada veículo, com base nos valores concedidos pelo condomínio pelo valor da vaga pernoite.

Sua tarefa é implementar a estrutura básica desse sistema utilizando classes abstratas em Java. 
Siga as especificações abaixo:

Primeiro, vamos definir a classe abstrata "Veiculo". Essa classe terá os atributos comuns a todos os veículos, 
como a placa (String), modelo (String), ano(int) e horasPermanecidas (double) , e terá um método abstrato para
 calcular o valor do estacionamento com base nas horas de permanência.

A classe Veículo deve ter um construtor que receba os valores da placa e modelo, e inicialize os atributos correspondentes.

Em seguida, crie as classe "Carro" com os seguintes atributos:
tipoDeCarro (enum) Ex: SUV, sedan, hatch…
quantidadeDeOcupantes (Int)

A classe Carro deve ter um construtor que receba esses valores e inicialize os atributos correspondentes.
 O custo por hora estacionado dos carros será de 0,10R$/hr.

Em seguida crie as classe "Moto" com os seguintes atributos:
cilindradas (double), horasPermanecidas (double) tipoDeMoto (enum) Ex: Custom, super sport, naked…
A classe Moto deve ter um construtor que receba esses valores e inicialize os atributos correspondentes. 
O custo por hora das motos será de 0,05R$/hr.

Na classe principal, vamos criar instâncias dos objetos "Carro" e "Moto", definindo suas características, 
como placa, modelo e outros atributos específicos de cada classe.

Em seguida, vamos chamar o método "calcularValorEstacionamento" para cada veículo, passando como parâmetro 
o número de horas de permanência. Esse método irá retornar o valor do estacionamento com base na lógica de 
cada tipo de veículo.

Por fim, deve-se exibir o valor do estacionamento para cada veículo na tela.