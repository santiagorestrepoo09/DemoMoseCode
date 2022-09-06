Examen Técnico - MercadoLibre S.R.L

El sercivio esta hecho con spring boot, una api sencilla la cual responde a los requerimientos presentados. 

Ademas se adiciona el servicio a heroku para poder ser consultado, se podra visualizar. 

Para realizar este proyecto utilice java 11 y mvn spring-boot:run.
 
1. decodeBits2Morse
 
Entry

{
   "text" : "000000001101101100111000001111110001111110011111100000001110111111110111011100000001100011111100000111111001111110000000110000110111111110111011100000011011100000000000"
}

Output

{
    "code": 200,
    "message": ".... --- .-.. .- -- . .-.. .. "
}

Servicio 

  - https://morse-service.herokuapp.com/api/postDecodeBits2Morse
 
 
 2. translate2Human
 
Entry

{
   "text" : ".... --- .-.. .- -- . .-.. .."
}

Output

{
    "code": 200,
    "message": "HOLAMELI"
}

Servicio 

  - https://morse-service.herokuapp.com/api/postTranslate2Human
 
 
  2. postTranslate2Morse
 
Entry

{
   "text" : "HOLA MELI"
}

Output

{
    "code": 200,
    "message": ".... --- .-.. .-  -- . .-.. .. "
}

Servicio 

  -  https://morse-service.herokuapp.com/api/postTranslate2Morse
 
 
