## Desafio de Programação - Academia Capgemini 2022

[![made-with-java](https://img.shields.io/badge/Made%20with-Java-blue)](https://www.java.com/pt-BR/)
![license-MIT](https://img.shields.io/badge/license-MIT-green)

> Project Status: :heavy_check_mark: completed
### Topics

:small_blue_diamond: [Project Description](#Project-Description)

:small_blue_diamond: [Prerequisites](#Prerequisites)

:small_blue_diamond: [Installation](#installation) :small_blue_diamond: [JDK11](#JDK11) :small_blue_diamond:[VsCode](#VsCode)
         
:small_blue_diamond: [How to run the App](#How-to-run-the-App)

:small_blue_diamond: [License](#License)



## Project Description

<p align="justify">
   Este projeto refere-se a resolução do desafio de programação do processo seletivo da "Academia Capgemini 2022" realizado no período de 14 a 20 de fevereiro.
  
  This project refers to the resolution of the programming challenge of the selection process of the "Capgemini Academy 2022" held from February 14 to 20.
</p>

## Question 1

Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.

Write an algorithm that shows on the screen a ladder of size n using the * character and spaces. The base and height of the ladder must be equal to the value of n. The last line should not contain any space.

 ### Example:

Input:
```
n = 6
```
Output:
```
     *
    **
   ***
  ****
 *****
******
```
---
## Question 2

Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura.

Deborah typed a random string into the password field, but she's not sure if it's a strong password. To help Deborah, build an algorithm that says what is the minimum number of characters that should be added to any string that is considered safe.

### Example

Input:
```
Ya3
```
Output:
```
3
```
### Explication:
> Ela pode tornar a senha segura adicionando 3 caracteres, por exemplo, &ab, transformando a senha em Ya3&ab. 2 caracteres não são suficientes visto que a senha precisa ter um tamanho mínimo de 6 caracteres.
> She can make the password secure by adding 3 characters, for example, &ab, by turning the password into Ya3&ab. 2 characters are not enough since the password must have a minimum size of 6 characters.

---
## Question 3

Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.

Two words can be considered anagrams of themselves if the letters of one word can be relocated to form the other word. Given any string, develop an algorithm that finds the number of pairs of substrings that are anagrams.

### Example 1:

Input:
```
ovo
```
Output:
```
2
```
### Explication:
 > A lista de todos os anagramas pares são: [o, o], [ov, vo] que estão nas posições [[0], [2]], [[0, 1], [1, 2]] respectivamente. 
 > The list of all even the anagrams are: [o, o], [ov, vo] that are in positions [[0], [2]], [[0, 1], [1, 2]] respectively.

### Example 2:

Input:
```
ifailuhkqq
```
Output:
```
3
```
### Explication:
> A lista de todos os anagramas pares são: [i, i], [q, q] e [ifa, fai] que estão nas posições [[0], [3]], [[8],  [9]] e [[0, 1, 2], [1, 2, 3]].
> The list of all even anagrams are: [i, i], [q, q] and [ifa, fai] that are in positions [[0], [3]], [[8], [9]] and [[0, 1, 2], [1, 2, 3]].

---

## Prerequisites

The following technologies were used in the construction of the project:

- [Ubuntu 20.04.3 LTS][ubuntu]
- [JDK 11][JDK11]
- [Visual Studio Code version 1.64.2][VsCode]

---
Requirements and environment:

- [Vscode][vscode]
  - Extensions:
    - Extension Pack for Java
    - Dracula theme
    - Material icon
    
## Instalation
The instalation of Vscode used the command curl, therefore it is necessary to install it.

```
sudo apt install curl
```
### JDK11

```
sudo add-apt-repository ppa:openjdk-r/ppa
sudo apt-get update
sudo apt-get install openjdk-11-jdk

```
### VsCode

For 64 bits Operational System
```
sudo sh -c 'echo "deb [arch=amd64] https://packages.microsoft.com/repos/vscode stable main" > /etc/apt/sources.list.d/vscode.list'
```
Installing VsCode

Download and install the program repository key using the commands below
```
curl https://packages.microsoft.com/keys/microsoft.asc | gpg --dearmor > microsoft.gpg
sudo mv microsoft.gpg /etc/apt/trusted.gpg.d/microsoft.gpg
```
Update the package manager with the command
```
sudo apt-get update
```
Install the VsCode
```
sudo apt-get install code
```
 
## How-to-run-the-App :arrow_forward:

```bash

  # clone all the repository 
  
  git clone https://github.com/flaviojaf21/Desafio_Capgemini_2022.git

  # Access the directory

  # Run the command to compile the file -> javac questao1.java
                                           javac questao2.java
                                           javac questao3.java 

  # Run the command -> java questao1.java
                       java questao2.java
                       java questao3.java
  
  ```
  
## License

The [MIT License]() (MIT)

Copyright :copyright:2022 - Academia Capgemini

Made by Flavio Ferreira 👋🏽 [Contact!](https://www.linkedin.com/in/flaviojaf21/)

Reference of the project Academia Capgemini [^1]

Footnotes
=========

[^1]: https://docs.google.com/document/d/1fAzE01t6hEyg8JrbRo7vOA3K2W-NYisF/edit

[ubuntu]: https://ubuntu.com/
[JDK11]: https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html
[VsCode]: https://code.visualstudio.com/


