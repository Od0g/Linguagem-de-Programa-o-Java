Passagem de Parâmetros da Linha de Comando
Aplicações em Java permitem que se passem parâmetros através da linha de comando.
Os parâmetros são separados por espaço em branco. Para passar um parâmetro com
espaços em branco deve colocá-lo entre aspas duplas.
Os parâmetros são passados para as aplicações através do array de Strings do método
main. Através do método length pode-se verificar o número de parâmetros passados. O
acesso é feito indicando-se a posição no array, sempre iniciando em 0. O método length()
do parâmetro args[x], permite que se obtenha o tamanho da String passada para este
parâmetro. Segue um exemplo:
class AppParametro {
 public static void main (String[] args){
 System.out.println("Parametros:"+args[0]+""+args[1]+""+
args[2]);

 System.out.println("Tamanho terceiro parametro:"+
args[2].length());

 System.out.println("Quantidade Parametros:"+args.length);
 }
}
Caso o programa acima fosse executado com os seguintes parâmetros:
java AppParametro Daniela Claro “Menina bonita”
Os valores que seriam impressos na tela do DOS seriam :
Parametros:Daniela Claro Menina Bonita
Tamanho terceiro parametro:13
Quantidade Parametros:3 
