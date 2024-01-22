public class TypeNumber {
    private int number;

    public TypeNumber(int number) {
        this.number = number;
    }

     /*
    * Faça um algoritmo para receber um numberúmero qualquer 
    * e imprimir numbera tela se o numberúmero é 
    * par ou ímpar, positivo ou numberegativo
    */
    public String typeNumber (int number){
        if (number % 2 == 0 && (number > 0 || number == 0)){
            return number + " é par e positivo";
        } else if (number % 2 == 0 && number < 0){
            return number +" é par e negativo";
        } else if (number % 2 != 0 && number > 0){
            return number +" é ímpar e positivo";
        } else if (number % 2 != 0 && number < 0){
            return number + " é ímpar e negativo";
        }
        return null;
    }
    
}
