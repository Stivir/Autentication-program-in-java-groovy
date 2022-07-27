
 def n1, n2, n3, n4, n5,soma, contarp = 0 , impar= 0, num,  nome, nocio, id, ip, maior, menor
 Scanner T = new Scanner(System.in)
 2.times {
	 print "Usuario "
	 def usuario = T.next()
	 print "Digite o Codigo "
	 
	 def senha = T.next()
	 if(usuario =="Silva" && senha =="!@q") {
		 print "BemVindo "
		 println "Digite o seu nome"
		 
		  nome = T.next();
		 
		  println "Digite a sua Nacionalidade"
		  nocio = T.next();
		 
		  println "Digite a sua Idade"
		  id = T.nextInt();
		 
		  println "Digite a sua Provincia"
		  ip = T.next();
		  
		  
	 for(def i=1; i<=5; i++) {
		 
		 /*if(login.equals("Silva") && senha.equals("21")){
		 }else{
			 println("Login ou senha inválidos!");
			 T.close();
			 return println ("Scanner Closed.")
		 }*/
		 
		 println "Digite o " + i + "º número"
		 num = T.nextInt();
		 println "Adiciione um  valor ao primeiro pagamento"
		 u = T.nextInt()
		 
		 if (i ==1) {n1 = num}
		 if (i ==2) {n2 = num}
		 if (i ==3) {n3 = num}
		 if (i ==4) {n4 = num}
		 if (i ==5) {n5 = num}
		 
	 if ((num%2)==0) {
		 contarp++
		 
	 }
	 if((num%2)==1)  {
		 impar++
	 }
	 
	 if (num > maior) {
		 maior = num
	 }
	 
	 
	 
	 }
	 
	 
	 
	 
	  
	 n1 = n1 + u
	 n2 = n2 + u
	 n3 = n3 + u
	 n4 = n4 + u
	 n5 = n5 + u
	 println "Nome: " + nome
	 println "Nacionalidade: " + nocio
	 println "Idade: " + id
	 println "Provincia: " + ip
	 soma = n1  + n2 + n3 + n4 + n5
	 println "Numeros pares: " + contarp
	 println "Numeros impares: " + impar
	 println "Soma: " + soma
	 println "Divisao: " + soma/2
	 println "Media: " + soma/5
	 println "Primeiro Pagamento  " + n1
	 println "Segundo  Pagamento  " + n2
	 println "Terceiro Pagamento  " + n3
	 println "Quarto Pagamento  " + n4
	 println "Quinto Pagamento " + n5
	 println "Maior: " + maior
	 println "Media Arendondada " +Math.round(soma/5)
		 System.exit(0)
		 
	 }
	 else{
		 println "Incompativel"
	 }
 }
 println "Bloqueia"
 
 