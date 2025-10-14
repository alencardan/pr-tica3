int led1 = 11;
int led2 = 12;
int led3 = 13;

int valor1, valor2;

void setup(){
  pinMode (led1, OUTPUT);
  pinMode (led2, OUTPUT);
  pinMode (led3, OUTPUT);
  
  Serial.begin(9600);
  
  Serial.println("Digite o valor 1: ");
  while(Serial.available() == 0); //Esse laço de repetição fica esperando o usuário digitar algo
  valor1= Serial.parseInt(); //Lê o valor que foi digitado e converte para Interno.
  
  Serial.println("Digite o valor 2: ");
  while(Serial.available() == 0);
  valor2 = Serial.parseInt();
  
  
  //Local dos laços de repetição
  
  //Fim local dos laços de repetição
}

void loop() {
}