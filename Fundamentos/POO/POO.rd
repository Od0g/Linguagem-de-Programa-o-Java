Conceitos principais de Orientação a Objetos 
    1.Objeto
    Um objeto é uma entidade que possui:
        * Estado: Representado pelos Atributos(variaveis).
        * Comportamento: Representado pelos métodos(funções).
        * Identidade: Uma referência unica no programa.

    Exemplo no mundo real:
        * Um carro é um objeto. Ele tem atributos como cor, modelo e velocidade, e comportamentos como acelerar, frear e buzinar.
        
    2.Classe
    A classse é como um MOLDE ou MODELO par criar objetos. Ela define os atributos e métodos que os objetos terão.
    
    Exemplo:

        "public class Carro{
            // Atributos 
            String cor; 
            String modelo;
            int velocidade;

            //Métodos
            public void acelerar(){
                System.out.prinln("O carro está acelerando!");
            }
        } ".
        
    * Um carro de classe é o Modelo, e um carro especifico (como um Fiat uno vermelho) é um objeto de classe.

    3.Encapsulamento
    O encapsulamento é o conceito de ocultar os detalhes internos de um objeto e permitir o acesso apenas por meio de métodos definidos. Isso melhorou a segurança e a modularidade do código.
    * Atributos são geralmente PRIVADOS(private) e acessados por métodos público(getters e setters).

    Exemplo:
        "public class Carro {
            private String cor; // Encapsulamento

            // Getter
            public string getCor() {
                return cor;

            }

            //Setter 
            public void setCor(String novaCor) {
                cor = novaCor
            }

        }".
    
    4.Herança 
    A herança permite que uma classe (subclasse) herde os atributos e métodos de outra classe(superclasse). Isso promove o reuso de código.

    Exemplo:
        "public class Veiculo {
            String tipo;

            public void mover() {
                System.out.println("O veiculo esté se movendo.");

            }
        }
        public class Carro extends Veiculo{
            int portas;

            public void buzinar() {
                System.out.println("Buzinando!");
            }
        }"

    * Carro herda de Veiculo e pode usar método mover().

    5.Polimformismo 
    Poliformismo significa "muitas formas".Em java, permite que mesm método ou objeto se comporte de maneira diferente do contexto.
    
    * SOBRECARGA DE MÈTODOS : Mesmods métodos com assinaturas diferentes.

    * SOBRESESCRITA DE MÉTODOS: Subclasse redefine o comporto d eum méodo da superclasse.

    Exemplo de sobrescrita:
        "public class Animal {
            public void emitirSom() {
                System.out.println("O animal faz um som.");
            }
        }
        
        public class Cachorro extends Animal{
            @Override
            puclic void emitirSom(){
                System.out.println("O cachorro late.");
            }
        }".
    
    6.Abstração
    A abstração é o processo de ocultar os detalhes complexos e mostar apeas as funcionalidades essenciais de um objeto. Em java, isso ser feito usando:
    
    * AULAS ABSTRADAS: Aulas que não podem ser instanciadas diretamente.

    * INTERFACES: Definem um contrato que as classes devem implementar.

    Exemplo de interface:
        "public interface Forma {
            doble calculaArea();
        }
        
        public class Circulo implements Forma {
            doble raio;

            public Circulo(double raio) {
                this.raio = raio;

            }
        
            @Override
            public doubble calcularArea() {
                return Math.PI * raio * raio;
            }
        }".

Vantagens da Orintação a Objetos
    1. Reuso de Código: Com herança e modularidade
    2. Facilidade de manutenção: Encapsulamento facilita alteração no código.
    3. Extencsinilidade: Adiciona novos recursos sem alterar o código existente.
    4. Representação intuitiva: Modelo de sistemas próximos ao mundo real.
