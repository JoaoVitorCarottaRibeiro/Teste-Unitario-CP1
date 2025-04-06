O trabalho mostra a criação de testes unitários referente a uma classe denominada de Veículos que possui alguns métodos como:

- Calcular custo:

Calcula o custo a ser gasto com base na quantidade de dias de locação do veículo (usado como parâmetro). Além disso, ele faz uma verificação a mais sobre números iguais ou menores que 0.

- Desconto:

Calcula o desconto com base na quantidade de dias de locação de um veículo, onde possui 3 if´s. O primeiro aplica um desconto de 10% para veículos alugados de 7 a 9 dias, o segundo aplica um desconto de 15% para veículos alugados de 10 a 14 dias, e por fim, um último if aplicando um desconto de 20% para carros com uso de 15 dias ou mais.

- Multa por devolução:

Calcula se há multa em caso de ultrapassagem de dias com base em dois parêmetros, dias usados e quantidade de dias, uma vez que, a quantidade de dias confere a quantidade de dias alugados e os dias usados confere os dias realmente usados. Exemplificando, digamos que um usuaário aluga um carro por 10 dias, mas ele utiliza por 15, ele irá pagar a multa, que são 20 reais a mais por dia usado.

Temos a classe Main que realiza a parte dos inputs, realiza a instância da classe Veículo e retorna visualmente a parte dos valores a serem pagos.

Temos também a classe VeiculoTest que faz a verificação dos testes unitários. Para isso, utilizei o junity juntamente do @Test, que faz automaticamente a revisão se está tudo certo.
Para conferir se está tudo certo, fiz alguns métodos void sem retorno, como exemplo: Calculo com valores positivos, valores iguais a 0, testes de descontos com menos de 7 dias (não aplicando desconto) e testes de descontos com mais de 7 dias e testes que verificam se há multas ou não.
